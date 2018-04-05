/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConnections;

import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class SaveSqlite {
    SqliteDatabaseHandler handler;

    public SaveSqlite() {
       handler = SqliteDatabaseHandler.getInstance();
    }
    public void createUser(User user) throws SQLException{
        if(!checkUserExists(user)){
        String query = "Insert into user(uid, active, date_created, date_modified, deleted, uuid, version, first_name,"
                + " last_name, password, user_name, created_by, modified_by, user_level, district, province) "
                + "Values('"+user.getId()+"',"
                + "'"+user.getActive()+"', "
                + "'"+user.getDateCreated()+"', "
                + "'"+user.getDateModified()+"',"
                + "'"+user.getDeleted()+"',"
                + "'"+user.getUuid()+"',"
                + "'"+user.getVersion()+"',"
                + "'"+user.getFirstName()+"',"
                + "'"+user.getLastName()+"',"
                + "'"+user.getPassword()+"',"
                + "'"+user.getUserName()+"',"
                + "'',"
                + "'',"
                + "'"+user.getUserLevel()+"',"
                + " '"+user.getDistrict()+"', "
                + "'"+user.getProvince()+"')";
        if(handler.execAction(query)){
            System.out.println(query);
        }
        }
    }
    public Boolean checkUserExists(User user) throws SQLException{
        
        String query = "Select user_name From user where user_name ='"+user.getUserName()+"'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
            return true;
        }
        return false;
    }
    /*
    public void saveFacility(Facility f) throws SQLException{
        if(!checkFacilityExists(f.getId())){
        String query = "Insert into Facility(fid, active, date_created, date_modified, deleted, uuid, version, description,"
                + "name, facility_code, facility_location, facility_owner, facility_type, created_by, modified_by, district,"
                + "contact_email, contact_mobile_number, contact_name, facility_ownership, datim_name, dhis_name, latitude, longitude) "
                + "Values('"+f.getId()+"',"
                + " '"+f.getActive()+"',"
                + "'"+f.getDateCreated()+"',"
                + " '"+f.getDateModified()+"',"
                + "'"+f.getDeleted()+"',"
                + " '"+f.getUuid()+"',"
                + "'"+f.getVersion()+"',"
                + " '"+f.getDescription()+"',"
                + "'"+f.getName()+"',"
                + " '"+f.getFacilityCode()+"',"
                + "'"+f.getFacilityLocation()+"',"
                + " '',"
                + "'"+f.getFacilityType()+"',"
                + " '',"
                + "'',"
                + " '"+f.getDistrict().getId()+"',"
                + "'"+f.getContactEmail()+"',"
                + " '"+f.getContactMobileNumber()+"',"
                + "'"+f.getContactName()+"',"
                + " '"+f.getFacilityOwnership()+"',"
                + "'"+f.getDatimName()+"',"
                + " '"+f.getDhisName()+"',"
                + "'"+f.getLatitude()+"', "
                + "'"+f.getLongitude()+"')";
       if(handler.execAction(query)) {
           System.out.println(query);
       }
        }
    }*/
    public void saveFacility(Facility f) throws SQLException{
            if(!checkFacilityExists(f.getId())){
            Connection con = handler.connect();
            String query = "Insert into Facility(fid, active, date_created, date_modified, deleted, uuid, version, description,"
                    + "name, facility_code, facility_location, facility_type, district,"
                    + "contact_email, contact_mobile_number, contact_name, facility_ownership, datim_name, dhis_name, latitude, longitude) "
                    + "Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
             try {
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setLong(1, f.getId());
            ps.setString(2, f.getActive().toString());
            ps.setString(3, f.getDateCreated() == null ? "" : f.getDateCreated().toString());
            ps.setString(4, f.getDateModified() == null ? "" : f.getDateModified().toString());
            ps.setString(5, f.getDeleted() == null ? "" : f.getDeleted().toString());
            ps.setString(6, f.getUuid());
            ps.setLong(7, f.getVersion());
            ps.setString(8, f.getDescription());
            ps.setString(9, f.getName());
            ps.setString(10,f.getFacilityCode());
            ps.setString(11, f.getFacilityLocation() == null ? "" : f.getFacilityLocation().toString());
            
            ps.setString(12, f.getFacilityType() == null ? "" : f.getFacilityType().toString());
            ps.setLong(13, f.getDistrict().getId());
            ps.setString(14, f.getContactEmail() == null ? "" : f.getContactEmail());
            ps.setString(15, f.getContactMobileNumber() == null ? "" : f.getContactMobileNumber());
            ps.setString(16, f.getContactName() == null ? "" : f.getContactName());
            ps.setString(17, f.getFacilityOwnership() == null ? "" : f.getFacilityOwnership().toString());
            ps.setString(18, f.getDatimName() == null ? "": f.getDatimName());
            ps.setString(19, f.getDhisName() == null ? "" : f.getDhisName());
            ps.setDouble(20, f.getLatitude() == null ? 0.0 : f.getLatitude());
            ps.setDouble(21, f.getLongitude()==null ? 0.0 : f.getLongitude());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
        }
            }   
    }
    public Boolean checkFacilityExists(Long fid) throws SQLException{
        String query = "Select fid From Facility where fid ='"+fid+"'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
            return true;
        }
        return false;
    }
    public void saveProvince(Province p) throws SQLException{
        if(!checkProvinceExists(p.getId())){
        String query = "Insert into Province(pid, active, date_created, date_modified,"
                + " deleted, uuid, version, description, name, created_by, modified_by)"
                + " Values('"+p.getId()+"',"
                + " '"+p.getActive()+"',"
                + "'"+p.getDateCreated()+"',"
                + " '"+p.getDateModified()+"',"
                + "'"+p.getDeleted()+"',"
                + " '"+p.getUuid()+"',"
                + "'"+p.getVersion()+"',"
                + " '"+p.getDescription()+"',"
                + " '"+p.getName()+"',"
                + " '',"
                + " '')";
        if(handler.execAction(query)){
           System.out.println(query);
        }
        }
    }
    public Boolean checkProvinceExists(Long pid) throws SQLException{
        String query = "Select pid From Province where pid ='"+pid+"'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
            return true;
        }
        return false;
    }
    public void saveDistrict(District d) throws SQLException{
        if(!checkDistrictExists(d.getId())){
            String query = "Insert into District(did, active, date_created, date_modified,"
                + " deleted, uuid, version, description, name, created_by, modified_by, province)"
                + " Values('"+d.getId()+"',"
                + " '"+d.getActive()+"',"
                + " '"+d.getDateCreated()+"',"
                + " '"+d.getDateModified()+"',"
                + " '"+d.getDeleted()+"',"
                + " '"+d.getUuid()+"',"
                + " '"+d.getVersion()+"',"
                + " '"+d.getDescription()+"',"
                + " '"+d.getName()+"',"
                + " '',"
                + " '',"
                + " '"+d.getProvince().getId()+"')";
        if(handler.execAction(query)){
           System.out.println(query);
        }
        }
    }
    public Boolean checkDistrictExists(Long did) throws SQLException{
        String query = "Select did From District where did ='"+did+"'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
            return true;
        }
        return false;
    }
    public void saveMentor(Mentor m){
        
    }
}
