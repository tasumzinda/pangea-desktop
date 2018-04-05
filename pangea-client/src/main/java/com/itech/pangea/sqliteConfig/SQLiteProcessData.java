/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConfig;

import com.google.gson.Gson;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

/**
 *
 * @author Admin
 */
public class SQLiteProcessData {
  
    
    
    
    
    
    
/**
     * Send and receive any changes made for tables included in synchronization
     * @param subscriberId id of subscriber
     * @param serverUrl
     * @throws Exception
     */
    public void synchronizeSubscriber(String subscriberId, String serverUrl) throws Exception {
        sendLocalChanges(subscriberId, serverUrl);
        clearChangesMarker();

        List<String> tables = null;
        String url = "jdbc:sqlite:kanaz.db";
        Class.forName("org.sqlite.JDBC");
        Connection con  = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            tables = new ArrayList<String>();
           // db = openOrCreateDatabase(_dbFileName, null);
            
             con = DriverManager.getConnection(url);
             stmt = con.createStatement();
             rs = stmt.executeQuery("select tbl_Name from sqlite_master where type='table' and tbl_Name != 'android_metadata'");
            
            
            while (rs.next()){
                tables.add(rs.getString(0));
            }
        }
        finally {
            if(rs != null && !rs.isClosed()){
                rs.close();
            }
            if(con != null && !con.isClosed()){
                con.close();
            }
        }

        for(String tableName : tables){
            getRemoteChangesForTable(subscriberId, tableName, serverUrl);
        }
    }    
    
   

    
    
    
    
    /**
     * Send local changes to webservice
     * @param subscriberId id of subscriber
     * @throws Exception
     */
    private void sendLocalChanges(String subscriberId, String serverUrl) throws Exception {
        String query;
        String url = "jdbc:sqlite:kanaz.db";
        Class.forName("org.sqlite.JDBC");
        Connection con  = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<String> tables = new ArrayList<String>();
        StringBuilder builder = new StringBuilder();

        try {
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();

            
            query = "select tbl_Name from sqlite_master where type='table' and sql like '%RowId%'  and tbl_Name != 'android_metadata';";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                tables.add(rs.getString(0));
            }
            rs.close();

            builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?><SyncData xmlns=\"urn:sync-schema\">");

            for (String tableName : tables) {
                if (!tableName.equalsIgnoreCase("MergeDelete")) {
                    builder.append(String.format("<tab n=\"%1$s\">", tableName));

                    builder.append("<ins>");
                    query = String.format("select * from %1$s where RowId is null;", tableName);
                    rs = stmt.executeQuery(query);
                    
                    while (rs.next()) {
                        builder.append("<r>");
                        for (int i = 0; i < rs.getFetchSize(); i++) {
                           // if (!cursor.getColumnName(i).equalsIgnoreCase("MergeUpdate")) {
                            if(!rs.getString(i).equalsIgnoreCase("MergeUpdate")){
                                builder.append(
                                        String.format("<%1$s><![CDATA[%2$s]]></%1$s>",
                                               // rs.getColumnName(i),
                                                rs.getString(i),
                                                rs.getString(i)));
                            }
                        }
                        builder.append("</r>");
                    }
                    rs.close();
                    builder.append("</ins>");

                    builder.append("<upd>");
                    query = String.format("select * from %1$s where MergeUpdate > 0 and RowId is not null;", tableName);
                   rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        builder.append("<r>");
                        for (int i = 0; i < rs.getFetchSize(); i++) {
                            if (!rs.getString(i).equalsIgnoreCase("MergeUpdate")) {
                                builder.append(String.format("<%1$s><![CDATA[%2$s]]></%1$s>",
                                                rs.getString(i),
                                                rs.getString(i)));
                            }
                        }
                        builder.append("</r>");
                    }
                    rs.close();
                    builder.append("</upd>");

                    builder.append("</tab>");
                }
            }

            builder.append("<delete>");
            query = String.format("select TableId,RowId from MergeDelete;");
              rs = stmt.executeQuery(query);
            while (rs.next()) {
                builder.append(
                        String.format("<r><tb>%1$s</tb><id>%2$s</id></r>",
                                rs.getString(0),
                                rs.getString(1)));
            }
            rs.close();
            builder.append("</delete>");

            builder.append("</SyncData>");
        }
        finally {
            if(rs != null && !rs.isClosed()){
                rs.close();
            }
            if(con != null && !con.isClosed()){
                con.close();
            }
        }

        HttpURLConnection connection = null;
        InputStream resultStream = null;
        String resultString = null;

        String requestUrl = String.format("%s/Send", serverUrl);
        JSONObject inputObject = new JSONObject();

        try {
            inputObject.put("subscriber", subscriberId);
            inputObject.put("content", builder.toString());
            inputObject.put("version", "3");
            byte[] requestBytes = inputObject.toString().getBytes("UTF-8");

            connection = (HttpURLConnection) new URL(requestUrl).openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("Content-Length", Integer.toString(requestBytes.length));

            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.write(requestBytes);
            wr.flush();
            wr.close();

            int status = connection.getResponseCode();

            switch (status){
                case HttpURLConnection.HTTP_OK:
                    resultStream = connection.getInputStream();
                    resultString = IOUtils.toString(resultStream, "UTF-8");
                    break;
                case HttpURLConnection.HTTP_NO_CONTENT:
                    break;
                default:
                    resultStream = connection.getErrorStream();
                    resultString = IOUtils.toString(resultStream, "UTF-8");
                    throw new Exception(resultString);
            }
        }
        finally {
            if (resultStream != null) {
                try {
                    resultStream.close();
                } catch (IOException e) { }
            }
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

     
    /**
     * Clear updated & deleted records marker
     */
    private void clearChangesMarker() throws SQLException{
        String query;
         List<String> tables = new ArrayList<String>();
        String url = "jdbc:sqlite:kanaz.db";
        
        Connection con  = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
           
            query = "select tbl_Name from sqlite_master where type='table' and sql like '%RowId%';";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                tables.add(rs.getString(0));
            }
            rs.close();

            
            for(String tableName : tables){
                if(tableName.equalsIgnoreCase("MergeIdentity")) {
                 stmt.executeUpdate(String.format("update MergeIdentity set MergeUpdate=0 where MergeUpdate > 0;"));
                }

                if(!tableName.equalsIgnoreCase("MergeDelete") && !tableName.equalsIgnoreCase("MergeIdentity")) {
                    String updTriggerSQL = null;
                 
                    query = String.format("select sql from sqlite_master where type='trigger' and name like 'trMergeUpdate_%1$s'", tableName);
                    rs = stmt.executeQuery(query);
                    if(rs.next()){
                        updTriggerSQL = rs.getString(0);
                    }
                    rs.close();
                
                    if(updTriggerSQL != null){
                         stmt.executeUpdate(String.format("drop trigger trMergeUpdate_%1$s;", tableName));
                         stmt.executeUpdate(String.format("update %1$s set MergeUpdate=0 where MergeUpdate > 0;", tableName));
                         stmt.executeUpdate(updTriggerSQL);
                    }
                }
            }

             stmt.executeUpdate("delete from MergeDelete");
            //db.setTransactionSuccessful();
        }
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLiteProcessData.class.getName()).log(Level.SEVERE, null, ex);
        }        finally {
            if(rs != null && !rs.isClosed()){
                rs.close();
            }
            if(con != null && !con.isClosed()){
                
                con.close();
            }
        }
    }
    
    
    
/**
 * Add table to synchronization
 * @param tableName table name
 * @param serverUrl
 * @throws Exception
 */
public void addSynchrnizedTable(String tableName, String serverUrl) throws Exception {
    HttpURLConnection connection = null;
    InputStream resultStream = null;
    String resultString = null;

    String requestUrl = String.format("%s/AddTable/%s", serverUrl, tableName);

    try {
        connection = (HttpURLConnection) new URL(requestUrl).openConnection();

        int status = connection.getResponseCode();

        switch (status){
            case HttpURLConnection.HTTP_OK:
                resultStream = connection.getInputStream();
                resultString = IOUtils.toString(resultStream, "UTF-8");
                break;
            default:
                resultStream = connection.getErrorStream();
                resultString = IOUtils.toString(resultStream, "UTF-8");
                throw new Exception(resultString);
        }
    }
    finally {
        if (resultStream != null) {
            try {
                resultStream.close();
            } catch (IOException e) {
            }
        }
        if (connection != null) {
            connection.disconnect();
        }
    }
}


/**
 * Get changes for table from remote server for specific subscriber
 * @param subscriberId id of subscriber
 * @param tableName table name
 * @param serverUrl api Url
 * @throws Exception
 */
public void getRemoteChangesForTable(String subscriberId, String tableName, String serverUrl) throws Exception {
    HttpURLConnection connection = null;
    InputStream resultStream = null;
    String resultString = null;

    String requestUrl = String.format("%s/Sync/%s/%s", serverUrl, subscriberId, tableName);

    try {
        connection = (HttpURLConnection) new URL(requestUrl).openConnection();

        int status = connection.getResponseCode();

        switch (status){
            case HttpURLConnection.HTTP_OK:
                resultStream = connection.getInputStream();
                resultString = IOUtils.toString(resultStream, "UTF-8");
                break;
            default:
                resultStream = connection.getErrorStream();
                resultString = IOUtils.toString(resultStream, "UTF-8");
                throw new Exception(resultString);
        }
    }
    finally {
        if (resultStream != null) {
            try {
                resultStream.close();
            } catch (IOException e) {
            }
        }
        if (connection != null) {
            connection.disconnect();
        }
    }

    SQLiteSyncData[] syncDatas = new Gson().fromJson(resultString, SQLiteSyncData[].class);
    String url = "jdbc:sqlite:kanaz.db";
    Class.forName("org.sqlite.JDBC");
    Connection con = DriverManager.getConnection(url);
    
    for(SQLiteSyncData syncData : syncDatas){
        if(syncData.SyncId > 0) {
            

            try{
              
                
             // con.setAutoCommit(false);
                Statement stmt = con.createStatement();
                

                if(syncData.TriggerInsertDrop.length() > 0){                    
                    stmt.executeUpdate(syncData.TriggerInsertDrop);
                }
                if(syncData.TriggerUpdateDrop.length() > 0){
                    stmt.executeUpdate(syncData.TriggerUpdateDrop);
                   
                }
                if(syncData.TriggerDeleteDrop.length() > 0){
                    stmt.executeUpdate(syncData.TriggerDeleteDrop);
                   
                }

                SQLiteSyncDataRecord[] records = syncData.getSQLiteSyncDataRecords();

                for(SQLiteSyncDataRecord record : records){
                    switch (record.Action){
                        case 1:
                            stmt.executeUpdate(syncData.QueryInsert, record.Columns);
                            break;
                        case 2:
                            stmt.executeUpdate(syncData.QueryUpdate, record.Columns);
                            break;
                        case 3:
                            stmt.executeUpdate(syncData.QueryDelete + "?", record.Columns);
                            break;
                    }
                }

                if(syncData.TriggerInsert.length() > 0){
                    stmt.executeUpdate(syncData.TriggerInsert);
                }
                if(syncData.TriggerUpdate.length() > 0){
                    stmt.executeUpdate(syncData.TriggerUpdate);
                }
                if(syncData.TriggerDelete.length() > 0){
                    stmt.executeUpdate(syncData.TriggerDelete);
                }
                con.commit();
                //stmt.setTransactionSuccessful();
            }
            catch(SQLException e){
                   //  con.rollback();
                   System.out.println(e);
                  }
          //  finally {
                //con.close();
           //     }
            }

           commitSynchronization(syncData.SyncId, serverUrl);
        }
    }


/**
 * Send info to remote server about successful single table synchronization
 * @param syncId id of synchronization
 * @throws Exception
 */
private void commitSynchronization(int syncId, String serverUrl) throws Exception {
    HttpURLConnection connection = null;
    InputStream resultStream = null;
    String resultString = null;

    String requestUrl = String.format("%s/CommitSync/%s", serverUrl, syncId);

    try {
        connection = (HttpURLConnection) new URL(requestUrl).openConnection();

        int status = connection.getResponseCode();

        switch (status){
            case HttpURLConnection.HTTP_OK:
                resultStream = connection.getInputStream();
                resultString = IOUtils.toString(resultStream, "UTF-8");
                break;
            default:
                resultStream = connection.getErrorStream();
                resultString = IOUtils.toString(resultStream, "UTF-8");
                throw new Exception(resultString);
        }
    }
    finally {
        if (resultStream != null) {
            try {
                resultStream.close();
            } catch (IOException e) {
            }
        }
        if (connection != null) {
            connection.disconnect();
        }
    }
}
}
    

