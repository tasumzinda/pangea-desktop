/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConfig;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kanaz
 */
public class PlaceID {
    SqliteDatabaseHandler handler;
    ResultSet rs;
    //private Object prov;

    public PlaceID() {
        handler = SqliteDatabaseHandler.getInstance();
    }
    public Integer getProvinceId(String province) throws SQLException{
        String query = "Select id From Province where name='"+province+"'";
        rs = handler.execQuery(query);
        if(rs.next()){
            int id = rs.getInt(1);
            return id;
        }
        
        return null;
    }
    public Integer getDistrictId(String district) throws SQLException{
        String query = "Select id From District where name='"+district+"'";
        rs = handler.execQuery(query);
        if(rs.next()){
            int id = rs.getInt(1);
            return id;
        }
        
        return null;
    }
    public Integer getFacilityId(String facility) throws SQLException{
        String query = "Select fid From Facility where name='"+facility+"'";
        rs = handler.execQuery(query);
        if(rs.next()){
            int id = rs.getInt(1);
            return id;
        }
        
        return null;
    }
     
    public Long getDistrictIdFromFacility(String name) throws SQLException{
        
        String query = "Select district From Facility where name = '"+name+"'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
           Long did = rs.getLong(1);
           return did;
        }
        return null;
    }
    public Long getProvinceFromDistrict(Long did) throws SQLException{
        String query = "Select province From District where did = '"+did+"'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
            Long provId = rs.getLong(1);
            return provId;
        }
        return null;
    }
    
}
