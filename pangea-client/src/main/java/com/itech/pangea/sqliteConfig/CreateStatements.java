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

/**
 *
 * @author Admin
 */
public class CreateStatements {
    public void createUsers(String ip) throws ClassNotFoundException{
        executeSql();
       /*
        Connection con  = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            String driverName = "com.mysql.jdbc.Driver";
                Class.forName(driverName);
                
                String jdbcUrl = "jdbc:mysql://"+ip+":3306/trackerdb";
                String user = "roy";
                String pass = "kanaz1994";             
                con = DriverManager.getConnection(jdbcUrl, user, pass);
                
            
            stmt = con.createStatement();
            rs = stmt.executeQuery("show create table province");
             if(rs.next()) {
       //System.out.println("Table Name: "+rs.getString(1));
      System.out.println("SQL Code:::: "+rs.getString(2));
                 String userSql = rs.getString(2);
                
                 
              }
           rs.close();
           stmt.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        
        }
        */
    }

    public void executeSql() throws ClassNotFoundException{
        
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:trackerdb.db";
        
        
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery("Select * From User");
                while(rs.next()){
                    String name = rs.getString("user_name");
                    System.out.println(name);
                }
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
    }
}

