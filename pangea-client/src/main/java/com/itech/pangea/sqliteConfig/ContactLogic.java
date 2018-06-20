/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConfig;

import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.utils.ConvertItems;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author user
 */
public class ContactLogic {
    SqliteDatabaseHandler handler;
    public ContactLogic() {
        handler = SqliteDatabaseHandler.getInstance();
    }
    public Date convertString(String curDate) throws ParseException {
        if (curDate.equals("null") || curDate.isEmpty()) {
            return null;
        } else {
            DateFormat dateFormat = new SimpleDateFormat(
                    "EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
            Date date = dateFormat.parse(curDate);
            return date;
        }

    }
    public Long getIndexid(long id) throws SQLException{
        long indexId = 0L;
        String query = "Select index_case_testing_form From contact where id = '"+id+"' and cid='0' and stat='0'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
            indexId = rs.getLong(1);
        }
        return indexId;
    }
  /*  public long getRealIndexId(long indexId) throws SQLException{
        long iid = 0L;
        String query = "Select iid From index_case_testing_form where iid = '"+indexId+"' and iid<>'0'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
            iid = rs.getLong(1);
        }
        return iid;
        
    } */
     public User createdby(long id){
        User user = new User();
        user.setId(id);
        return user;
    }
    public User modifiedby(long id){
        User user = new User();
        user.setId(id);
        return user;
    }
    public Province getByIdProvince(Long id) throws SQLException {
        Province pp = new Province();

        String query = "Select * From Province where pid='" + id + "'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            pp.setId(rs.getLong("pid"));
            pp.setActive(null);
            pp.setDateCreated(null);
            pp.setDateModified(null);
            pp.setDeleted(Boolean.FALSE);
            pp.setUuid(null);
            pp.setVersion(null);
            pp.setDescription(rs.getString("description"));
            pp.setName(rs.getString("name"));
            pp.setCreatedBy(null);
            pp.setModifiedBy(null);
        }

        return pp;
    }

    public District getByIdDistrict(Long id) throws SQLException {
        District pp = new District();
        String query = "Select * From District where did='" + id + "'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            pp.setId(rs.getLong("did"));

            pp.setActive(null);
            pp.setDateCreated(null);
            pp.setDateModified(null);
            pp.setDeleted(Boolean.FALSE);
            pp.setUuid(null);
            pp.setVersion(null);
            pp.setDescription(rs.getString("description"));
            pp.setName(rs.getString("name"));
            pp.setCreatedBy(null);
            pp.setModifiedBy(null);
            pp.setProvince(null);

        }
        return pp;
    }

    public Facility getByIdFacility(Long id) throws SQLException {
        Facility pp = new Facility();
        String query = "Select * From Facility where fid='" + id + "'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            pp.setId(rs.getLong("fid"));
            pp.setActive(null);
            pp.setDateCreated(null);
            pp.setDateModified(null);
            pp.setDeleted(Boolean.FALSE);
            pp.setUuid(null);
            pp.setVersion(null);
            pp.setDescription(rs.getString("description"));
            pp.setName(rs.getString("name"));
            pp.setCreatedBy(null);
            pp.setModifiedBy(null);
            pp.setProvince(null);
        }
        return pp;
    }
}
