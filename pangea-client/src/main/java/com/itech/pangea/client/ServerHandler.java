/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.concurrent.Task;

/**
 *
 * @author user
 */
public class ServerHandler extends Task<Connection>{
    @Override
    protected Connection call() throws Exception {
         Connection co = null;
        try {
           
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String jdbcUrl = "jdbc:mysql://192.168.1.203:3306/itechdb?useSSL=false";
             String user = "itechadmin";
             String pass = "itech2017";
         //  String user = "root";
         //  String pass = "";                  
           co = DriverManager.getConnection(jdbcUrl, user, pass);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            System.err.println(":::::::::::::::Error Connection::::::::::::::");
            return co;           
        }
       return co;
         
        }
    }
    
