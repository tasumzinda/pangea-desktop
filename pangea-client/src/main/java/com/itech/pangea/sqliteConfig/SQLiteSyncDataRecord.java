/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConfig;

import javafx.scene.Cursor;

/**
 *
 * @author Admin
 */
public class SQLiteSyncDataRecord {
    
    public int Action;
        public String[] Columns;

        public SQLiteSyncDataRecord(int action, String[] columns){
            Action = action;
            Columns = columns;
        }
    }
    

