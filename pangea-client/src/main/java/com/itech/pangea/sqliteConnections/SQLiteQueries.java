/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConnections;

import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanaz
 */
public class SQLiteQueries {
    
      SqliteDatabaseHandler handle;

    public SQLiteQueries() {
        handle = SqliteDatabaseHandler.getInstance();
    }
    public List getProvinces() throws SQLException{
        List listP = new ArrayList<>();
        String query = "Select name From Province";
                ResultSet rs = handle.execQuery(query);
                
                while(rs.next()){
                    String provin = rs.getString(1);             
                    listP.add(provin);                 
                }
                System.out.println(listP);
                return listP;
    }
    public List<String> getDistrict() throws SQLException{
        List<String> listD = new ArrayList<>();
        String query = "Select name From District";
                ResultSet rs = handle.execQuery(query);
                
                while(rs.next()){
                    String dis = rs.getString(1);
                     
                    listD.add(dis);
                    
                }
                return listD;
    }
    public List<String> getFacility() throws SQLException{
        List<String> listF = new ArrayList<>();
        String query = "Select name From Facility";
                ResultSet rs = handle.execQuery(query);               
                while(rs.next()){
                    String fac = rs.getString(1);                     
                    listF.add(fac);                   
                }
                return listF;
    }
    
   /* public Long getDistrictIdOfFacility(int fid){
        String query = "Select did From District where did";
    }*/
}
