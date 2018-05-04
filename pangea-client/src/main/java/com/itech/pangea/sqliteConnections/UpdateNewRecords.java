/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConnections;

import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import javafx.concurrent.Task;

/**
 *
 * @author user
 */
public class UpdateNewRecords extends Task<Integer>{
    SqliteDatabaseHandler handle;
    SQLiteQueries liteQueries;
    public UpdateNewRecords() {
         handle = SqliteDatabaseHandler.getInstance();
    }
    
     
    @Override
    protected Integer call() throws Exception {
       liteQueries = new SQLiteQueries();
       int hts = liteQueries.countHts();
       int def = liteQueries.countDe();
       int ind = liteQueries.countIndex();
       int contacts = liteQueries.countContacts();
       int total = hts + def + ind + contacts;
      // String msg = String.valueOf(total);
      //  updateMessage(msg);
       return total;
    }  
}

