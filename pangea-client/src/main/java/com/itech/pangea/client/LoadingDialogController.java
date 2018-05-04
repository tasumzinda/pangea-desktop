package com.itech.pangea.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.domain.HTSRegisterForm;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.service.ContactService;
import com.itech.pangea.business.service.DefaulterTrackingFormService;
import com.itech.pangea.business.service.DistrictService;
import com.itech.pangea.business.service.FacilityService;
import com.itech.pangea.business.service.HTSRegisterFormService;
import com.itech.pangea.business.service.IndexCaseTestingFormService;
import com.itech.pangea.business.service.MentorService;
import com.itech.pangea.business.service.ProvinceService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.sqliteConfig.ContactLogic;
import com.itech.pangea.sqliteConfig.ReceiveData;
import com.itech.pangea.sqliteConfig.SendData;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.jfoenix.controls.JFXProgressBar;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * FXML Controller class
 *
 * @author user
 */
@Component
public class LoadingDialogController implements Initializable {
    SqliteDatabaseHandler handler;
    
    @FXML
    private JFXProgressBar loadingBar;
    @Resource
    private HTSRegisterFormService hTSRegisterFormService;
    @Resource
    private DefaulterTrackingFormService defaulterTrackingFormService;
    @Resource
    private IndexCaseTestingFormService indexCaseTestingFormService;
    @Resource
    private MentorService mentorService;
    @Resource
    private DistrictService districtService; 
    @Resource
    private FacilityService facilityService;
    @Resource
    private ProvinceService provinceService;
    @Resource
    private UserService userService;
    @Resource
    private ContactService contactService;
    String conStatus;
    User user;
     public void sendHtsForm(String status) throws SQLException, ParseException {
        System.out.println(status);
        if (status.equals("Online")) {
            SendData sendData = new SendData();
            List<Long> ids = sendData.htsIds();
            if (ids.isEmpty()) {
                return;
            }
               
            for (Long id : ids) {
                    HTSRegisterForm hts;
                    hts = sendData.htsFormQuery(id, "send");
                  
                  
                     hts.setFacility(facilityService.get(hts.getFacility().getId()));
                     hts.setDistrict(districtService.get(hts.getDistrict().getId()));
                     hts.setProvince(provinceService.get(hts.getProvince().getId()));
                     hts.setCreatedBy(userService.get(hts.getCreatedBy().getId()));
                     hts.setModifiedBy(userService.get(hts.getModifiedBy().getId()));
                     hTSRegisterFormService.save(hts);
          
            }
            String query = "Delete From htsregister_form";
            if (handler.execAction(query)) {
               /************Notification Here****/
            }

        }
    }
     public void sendDtfForm(String status) throws SQLException, ParseException {

        if (status.equals("Online")) {
            SendData sendData = new SendData();
            List<Long> idz = sendData.dtfIds();
            if (idz.isEmpty()) {
                return;
            }
            for (Long id : idz) {
                DefaulterTrackingForm dtf;
                dtf = sendData.dtfFormQuery(id, "send");               
                        dtf.setDistrict(districtService.get(dtf.getDistrict().getId()));
                        dtf.setFacility(facilityService.get(dtf.getFacility().getId()));  
                        dtf.setProvince(provinceService.get(dtf.getProvince().getId()));
                        dtf.setCreatedBy(userService.get(dtf.getCreatedBy().getId()));
                        dtf.setModifiedBy(userService.get(dtf.getModifiedBy().getId()));
                        defaulterTrackingFormService.save(dtf);                
            }
            String query = "Delete From defaulter_tracking_form";
            if (handler.execAction(query)) {
            //    notification.setVisible(true);
            }
        }
    }
     public void sendIctForm(String status) throws SQLException, ParseException {
        System.out.println(status);
        if (status.equals("Online")) {
            SendData sendData = new SendData();
            List<Long> idict = sendData.ictIds();
            if (idict.isEmpty()) {
                return;
            }
            for (Long id : idict) {
                IndexCaseTestingForm ict;
                ict = sendData.ictFormQuery(id, "send");
                
                        if(ict.getId()==0){
                        ict.setDistrict(districtService.get(ict.getDistrict().getId()));
                        ict.setFacility(facilityService.get(ict.getFacility().getId()));  
                        ict.setProvince(provinceService.get(ict.getProvince().getId()));
                        ict.setCreatedBy(userService.get(ict.getCreatedBy().getId()));
                        ict.setModifiedBy(userService.get(ict.getModifiedBy().getId()));
                        IndexCaseTestingForm idxForContact = indexCaseTestingFormService.save(ict);
                        List<Long> listC = sendData.allContactsOfThisIndex(id);               
                          if(!listC.isEmpty()){
                                for(Long idForContact : listC){
                        
                                    Contact contact;
                                    contact = sendData.contactFormQuery(idForContact, id);
                                    
                                    contact.setCreatedBy(userService.get(ict.getCreatedBy().getId()));
                                    contact.setModifiedBy(userService.get(ict.getModifiedBy().getId()));
                                    contact.setIndexCaseTestingForm(idxForContact);
                                    contactService.save(contact);                                   
                                    String qu = "Delete from contact where id='"+idForContact+"'";
                                    handler.execAction(qu);
                                }
                             }
                        }
                        else{
                        IndexCaseTestingForm ictU = indexCaseTestingFormService.get(ict.getId());
                        ictU.setFirstNameOfIndex(ict.getFirstNameOfIndex());
                        ictU.setLastNameOfIndex(ict.getLastNameOfIndex());
                        ictU.setSequentialNumberOfIndex(ict.getSequentialNumberOfIndex());
                        ictU.setDateIndexTestedOrDiagnosed(ict.getDateIndexTestedOrDiagnosed());                        
                        ictU.setIndexOIARTNumber(ict.getIndexOIARTNumber());           
                        ictU.setIndexContactNumber(ict.getIndexContactNumber());              
                        ictU.setReasonForNotBeingInitiated(ict.getReasonForNotBeingInitiated()); 
                        ictU.setInitiatedOnART(ict.getInitiatedOnART());
                        ictU.setConsentForListedContacts(ict.getConsentForListedContacts());
                        ictU.setDistrict(districtService.get(ict.getDistrict().getId()));
                        ictU.setFacility(facilityService.get(ict.getFacility().getId()));  
                        ictU.setProvince(provinceService.get(ict.getProvince().getId()));
                        indexCaseTestingFormService.save(ictU);
                } 
              String query = "Delete From index_case_testing_form where id='"+id+"'";               
              handler.execAction(query);
            }      
                //notification.setVisible(true);         
        }
    }
   
      public void newContactsOfexistingIndex() throws SQLException, ParseException{
         SendData sendData = new SendData();
         ContactLogic cl = new ContactLogic();
         List<Long> listNewCon = sendData.allContactsNewWithExistingindex();  
         System.err.println("&&&&&&&&&&&");
         System.err.println("ListNewCon:: "+listNewCon);
         System.err.println("&&&&&&&&&&&");
         if(!listNewCon.isEmpty()){
             for(Long idForCon : listNewCon){
                 System.err.println("&&&&&&&&&&&");
                 System.err.println("ID For Contact :: "+idForCon);
                 System.err.println("&&&&&&&&&&&");
                 long indexId = cl.getIndexid( idForCon);
                 long realIndexid = cl.getRealIndexId(indexId);
                 System.err.println("&&&&&&&&&&&");
                 System.err.println("Real index:: "+realIndexid);
                 System.err.println("&&&&&&&&&&&");
                 if(realIndexid!=0){  
                    IndexCaseTestingForm form = indexCaseTestingFormService.get(realIndexid);
                    System.err.println("&&&&&&&&&&&");
                   System.err.println("Real index data:: "+form.getFirstNameOfIndex());
                   System.err.println("&&&&&&&&&&&");
                    Contact contact;
                    contact = sendData.contactFormQuery(idForCon, indexId);
                    contact.setCreatedBy(userService.get(contact.getCreatedBy().getId()));
                    contact.setModifiedBy(userService.get(contact.getModifiedBy().getId()));
                    contact.setIndexCaseTestingForm(form);
                    contactService.save(contact);
                    String qu = "Delete from contact where id='"+idForCon+"'";
                    if(handler.execAction(qu)){
                       // notification.setVisible(true);
                    }
                 }
                
             }
         }
    }
      
      public void syncIndex() throws SQLException{
        String query = "Delete From index_case_testing_form";
       // String sqlsequenc = "Delete From sqlite_sequence";
         String sqlsequence = "Delete From sqlite_sequence where name = 'index_case_testing_form'";        
         handler.execAction(sqlsequence);
        if(handler.execAction(query) ){
           List<IndexCaseTestingForm> index = indexCaseTestingFormService.findByUser(user); 
           ReceiveData rd = new ReceiveData();
           for(IndexCaseTestingForm idx  : index){
               idx.setCreatedBy(user);
               idx.setModifiedBy(user);
               rd.saveIndexCaseTest(idx);
           }
                   
        }
    }
    public void syncContact() throws SQLException{
        String query = "Delete From contact";
        String sqlsequence = "Delete From sqlite_sequence where name = 'contact'";        
        handler.execAction(sqlsequence);
        if(handler.execAction(query)){
            List<Contact> co = contactService.findByUser(user);
             ReceiveData rd = new ReceiveData();
           for(Contact contac  : co){
               contac.setCreatedBy(user);
               contac.setModifiedBy(user);
               rd.saveContact(contac);
           }
        }
    }
    public void processSendDataTransction(String st) throws Exception{
       Task<Void> taskProcess = new Task<Void>(){
           @Override
         protected Void call() throws Exception {
                sendHtsForm(st);
                sendDtfForm(st);
                sendIctForm(st);
                newContactsOfexistingIndex();
                syncIndex();
             return null;
           }
        
         };
        taskProcess.setOnSucceeded((WorkerStateEvent e) -> {
            Platform.runLater(() -> {
                Stage stage = (Stage) loadingBar.getScene().getWindow();
                stage.close();
            });
            
        });
        taskProcess.setOnFailed((WorkerStateEvent e) -> {
            
                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Error Encountered");
                  alert.setContentText("Failed to Update:\nCheck Internet Connection");
                  alert.showAndWait();
        });
        Thread thread = new Thread(taskProcess);
        thread.setDaemon(true);
        thread.start();
    }
    
    
     public void setUserNConStatus(User user, String conStatus) throws Exception{
            this.user = user;
            this.conStatus = conStatus;
            processSendDataTransction(conStatus);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                handler = SqliteDatabaseHandler.getInstance();
                
    }    
    
}
