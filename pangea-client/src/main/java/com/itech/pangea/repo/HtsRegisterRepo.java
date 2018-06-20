/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.repo;

import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class HtsRegisterRepo {
     public  SqliteDatabaseHandler handle;

    public HtsRegisterRepo() {
        handle = SqliteDatabaseHandler.getInstance();
    }
    
      public  Integer findLastInsertByUserAndFacility(Integer userId, Integer facilityId) throws SQLException{
                    String query = "Select max(id) from htsregister_form where created_by='"+ userId + "' and facility='" + facilityId +"'";
                    ResultSet rs  = handle.execQuery(query);
                    int id = 0;
                    while(rs.next()){
                        id = rs.getInt(1);
                    }
                    return id;
                }
                
                public  String getSequentialNumber(Integer formId) throws SQLException{
                    String query = "Select sequential_number from htsregister_form where id='"+ formId +"'";
                    ResultSet rs  = handle.execQuery(query);
                    String number = "";
                    while(rs.next()){
                        number = rs.getString(1);
                    }
                    return number;
                }
                
                public  String getDateCreated(Integer formId) throws SQLException{
                    String query = "Select date_created from htsregister_form where id='"+ formId +"'";
                    ResultSet rs  = handle.execQuery(query);
                    String number = "";
                    while(rs.next()){
                        number = rs.getString(1);
                    }
                    return number;
                }
               
    
}
