/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.Alert;

/**
 *
 * @author kanaz
 */
public class SqliteDatabaseHandler {
    private static SqliteDatabaseHandler handler = null;
    private static Connection conn = null;
    private static Statement stmt = null;
    
    private SqliteDatabaseHandler(){
        createConnection();
        
    }
    private void createConnection(){
         try{
            Class.forName("org.sqlite.JDBC").newInstance();        
         conn = DriverManager.getConnection("jdbc:sqlite::resource:trackerdb.db");
         // conn = DriverManager.getConnection("jdbc:sqlite:trackerdb.db");
          if(conn!=null){
              System.err.println("********************************");
               System.err.println("Connection Successfull");
               System.err.println("********************************");
          }
          else{
              System.err.println("********************************");
               System.err.println("Connection Error");
               System.err.println("********************************");
          }
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
       
        }
    }
    public Connection connect() {
        return conn;
    }
    
    public static SqliteDatabaseHandler getInstance(){
        if(handler == null){
            handler = new SqliteDatabaseHandler();
        }
        return handler;
    }
    
    public boolean execAction(String qu){
        try{
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        }
        catch(SQLException ex){
            ex.printStackTrace();
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setTitle("Notification");
           alert.setHeaderText("Error Executing Query");
           alert.setContentText(ex.getMessage());
           alert.showAndWait();
            return false;
        }
        finally{}
    }
    public ResultSet execQuery(String query){         
        ResultSet result;
        try{
            stmt = conn.createStatement();
            result = stmt.executeQuery(query);
        }
        catch(Exception ex){
           ex.printStackTrace(); 
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setTitle("Notification");
           alert.setHeaderText("Error Executing Select Statement");
           alert.setContentText(ex.getMessage());
           alert.showAndWait();
           return null;
        }
        finally{}
        return result;
    }
}
