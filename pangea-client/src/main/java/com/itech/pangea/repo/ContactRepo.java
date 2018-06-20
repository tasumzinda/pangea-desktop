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
public class ContactRepo {
    public SqliteDatabaseHandler handle;

        public ContactRepo() {
            handle = SqliteDatabaseHandler.getInstance();
        }
        public Integer findLastInsertByUserAndFacility(Integer userId, Integer facilityId) throws SQLException{
                    String query = "Select max(id) from contact where created_by='"+ userId + "' and facility='" + facilityId +"'";
                    ResultSet rs  = handle.execQuery(query);
                    int id = 0;
                    while(rs.next()){
                        id = rs.getInt(1);
                    }
                    return id;
                }
                
             /*   public  Integer getSequentialNumber(Integer formId) throws SQLException{
                    String query = "Select sequential_number from contact where id='"+ formId +"'";
                    ResultSet rs  = handle.execQuery(query);
                    int number = 0;
                    while(rs.next()){
                        number = rs.getInt(1);
                    }
                    return number;
                }*/
                 public  String getSequentialNumberofInde(Integer formId) throws SQLException{
                    String query = "Select sequential_number from index_case_testing_form where id='"+ formId +"'";
                    ResultSet rs  = handle.execQuery(query);
                    String seqNum = "";
                    while(rs.next()){
                        seqNum = rs.getString(1);
                    }
                    return seqNum;
                }
                 public  String getUuidofIndex(Integer formId) throws SQLException{
                    String query = "Select uuid from index_case_testing_form where id='"+ formId +"'";
                    ResultSet rs  = handle.execQuery(query);
                    String uuid = "";
                    while(rs.next()){
                        uuid = rs.getString(1);
                    }
                    return uuid;
                }
                  public Integer getLastInsertIdByIndex(Integer indexCaseId) throws SQLException{
                     String query = "Select max(id) from contact where index_case_testing_form='"+ indexCaseId + "'";
                    ResultSet rs  = handle.execQuery(query);
                    int id = 0;
                    while(rs.next()){
                        id = rs.getInt(1);
                    }
                    return id;
                }
                  public  Integer sequentialNumber(Integer lastContactId) throws SQLException{
                      String query = "Select sequential_number from contact where id='"+ lastContactId +"'";
                       ResultSet rs  = handle.execQuery(query);
                        int seqNum = 0;
                        while(rs.next()){
                            seqNum = rs.getInt(1)+1;
                            
                        }
                        return seqNum;
                      
                  }
}
