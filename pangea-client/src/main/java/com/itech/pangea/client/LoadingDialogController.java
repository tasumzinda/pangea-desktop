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
                    if( hts.getId()==0){
                        hts.setId(null);
                     hts.setFacility(facilityService.get(hts.getFacility().getId()));
                     hts.setDistrict(districtService.get(hts.getDistrict().getId()));
                     hts.setProvince(provinceService.get(hts.getProvince().getId()));
                     hts.setCreatedBy(userService.get(hts.getCreatedBy().getId()));
                     hts.setModifiedBy(userService.get(hts.getModifiedBy().getId()));
                     HTSRegisterForm form = hTSRegisterFormService.save(hts);
                     String query = "Update htsregister_form set hid='"+form.getId()+"', stat='2' where id='"+id+"'";
                     handler.execAction(query);
                    }
                    else{
                         HTSRegisterForm htsU = hTSRegisterFormService.get(hts.getId());
                         if(htsU!=null){
                            htsU.setEntryStream(hts.getEntryStream());
                            htsU.sethTSModel(hts.gethTSModel());
                            htsU.setTest(hts.getTest());
                            htsU.setReasonForHIVTest(hts.getReasonForHIVTest());
                            htsU.setPregnantOrLactatingWoman(hts.getPregnantOrLactatingWoman());
                            htsU.setmDate(hts.getmDate());
                            htsU.setRegisteredInPreArt(hts.getRegisteredInPreArt());  
                            htsU.setDateOfInitiation(hts.getDateOfInitiation());
                            htsU.setRegisteredInPreArt(hts.getRegisteredInPreArt());
                            htsU.setHivTestingReferralSlipNumber(hts.getHivTestingReferralSlipNumber());
                            htsU.setmTime(hts.getmTime());
                            htsU.setFinalResult(hts.getFinalResult());
                            htsU.setInPreArt(hts.getInPreArt());
                            htsU.setInitiatedOnArt(hts.getInitiatedOnArt());
                            htsU.setOiArtNumber(hts.getOiArtNumber()); 
                            htsU.setFirstName(hts.getFirstName());
                            htsU.setLastName(hts.getLastName());
                            htsU.setAge(hts.getAge());
                            htsU.setGender(hts.getGender());
                            htsU.setFacility(facilityService.get(hts.getFacility().getId()));
                            htsU.setDistrict(districtService.get(hts.getDistrict().getId()));
                            htsU.setProvince(provinceService.get(hts.getProvince().getId()));
                            hTSRegisterFormService.save(htsU);
                            String query = "Update htsregister_form set stat='2' where id='"+id+"'";
                            handler.execAction(query);
                    }
                    }     
            }
          // String query = "Delete From htsregister_form";
           
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
                 if( dtf.getId()==0){
                        dtf.setId(null);
                        dtf.setDistrict(districtService.get(dtf.getDistrict().getId()));
                        dtf.setFacility(facilityService.get(dtf.getFacility().getId()));  
                        dtf.setProvince(provinceService.get(dtf.getProvince().getId()));
                        dtf.setCreatedBy(userService.get(dtf.getCreatedBy().getId()));
                        dtf.setModifiedBy(userService.get(dtf.getModifiedBy().getId()));
                        DefaulterTrackingForm form = defaulterTrackingFormService.save(dtf); 
                        String query = "Update defaulter_tracking_form set did='"+form.getId()+"', stat='2' where id='"+id+"'";
                        handler.execAction(query);
                 }
                 else{
                     DefaulterTrackingForm dtfU = defaulterTrackingFormService.get(dtf.getId());
                          if(dtfU !=null){
                            dtfU.setFirstNameOfIndex(dtf.getFirstNameOfIndex());
                            dtfU.setLastNameOfIndex(dtf.getLastNameOfIndex());
                            dtfU.setPhysicalAddress(dtf.getPhysicalAddress());
                            dtfU.setContactDetails(dtf.getContactDetails());
                            dtfU.setoIARTNumber(dtf.getoIARTNumber());
                            dtfU.setDateArtInitiation(dtf.getDateArtInitiation());
                            dtfU.setReviewDate(dtf.getReviewDate());
                            dtfU.setAppointmentDeemedDefaulter(dtf.getAppointmentDeemedDefaulter()); 
                            dtfU.setDateOfCall1(dtf.getDateOfCall1());
                            dtfU.setDateOfCall2(dtf.getDateOfCall2());
                            dtfU.setDateOfCall3(dtf.getDateOfCall3());
                            dtfU.setAppointmentDateIfLinkedToCare(dtf.getAppointmentDateIfLinkedToCare());
                            dtfU.setAppointmentDateIfLinkedToCare1(dtf.getAppointmentDateIfLinkedToCare1());
                            dtfU.setAppointmentDateIfLinkedToCare2(dtf.getAppointmentDateIfLinkedToCare2());
                            dtfU.setAppointmentDateIfLinkedToCare3(dtf.getAppointmentDateIfLinkedToCare3());
                            dtfU.setDateOfVisit(dtf.getDateOfVisit());
                            dtfU.setDateClientVisitedFacility(dtf.getDateClientVisitedFacility());
                            dtfU.setCall1Outcome(dtf.getCall1Outcome());
                            dtfU.setCall2Outcome(dtf.getCall2Outcome());
                            dtfU.setCall3Outcome(dtf.getCall3Outcome());
                            dtfU.setVisitOutcome(dtf.getVisitOutcome());
                            dtfU.setFinalOutcome(dtf.getFinalOutcome());
                            dtfU.setDistrict(districtService.get(dtf.getDistrict().getId()));
                            dtfU.setFacility(facilityService.get(dtf.getFacility().getId()));  
                            dtfU.setProvince(provinceService.get(dtf.getProvince().getId()));
                            defaulterTrackingFormService.save(dtfU);
                            String query = "Update defaulter_tracking_form set stat='2' where id='"+id+"'";
                             handler.execAction(query);
                          }
                 }
            }
           
        }
    }
     public void sendIctForm(String status) throws SQLException, ParseException {
        System.out.println(status);
       
            SendData sendData = new SendData();
            List<Long> idict = sendData.ictIds();
            if (idict.isEmpty()) {
                return;
            }
            for (Long id : idict) {
               
                IndexCaseTestingForm ict;
                ict = sendData.ictFormQuery(id, "send");
                
                        if(ict.getId()==0){
                            ict.setId(null);
                        ict.setDistrict(districtService.get(ict.getDistrict().getId()));
                        ict.setFacility(facilityService.get(ict.getFacility().getId()));  
                        ict.setProvince(provinceService.get(ict.getProvince().getId()));
                        ict.setCreatedBy(userService.get(ict.getCreatedBy().getId()));
                        ict.setModifiedBy(userService.get(ict.getModifiedBy().getId()));
                        IndexCaseTestingForm idxForContact = indexCaseTestingFormService.save(ict);
                        String query = "Update index_case_testing_form set iid='"+idxForContact.getId()+"', stat='2' where id='"+id+"'";
                        handler.execAction(query);
                        List<Long> listC = sendData.allContactsOfThisIndex(id);               
                          if(!listC.isEmpty()){
                                for(Long idForContact : listC){
                                    Contact contact = sendData.contactFormQuery(idForContact, id);                                    
                                    contact.setCreatedBy(userService.get(ict.getCreatedBy().getId()));
                                    contact.setModifiedBy(userService.get(ict.getModifiedBy().getId()));
                                    contact.setIndexCaseTestingForm(idxForContact);
                                    Contact contact1 = contactService.save(contact);                                   
                                    String queryc = "Update contact set cid='"+contact1.getId()+"', index_case_testing_form='"+idxForContact.getId()+"', stat='2' where id='"+id+"'";
                                    handler.execAction(queryc);
                                }
                             }
                        }
                        else{
                            
                        IndexCaseTestingForm ictU = indexCaseTestingFormService.get(ict.getId());
                        if(ictU!=null){
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
                        String query = "Update index_case_testing_form set stat='2' where id='"+id+"'";
                        handler.execAction(query);
                        }
                } 
             
             
                //notification.setVisible(true);         
        }
    }
    public void updateCallVisitStatus() throws SQLException, ParseException{
       SendData sendData = new SendData();
       List<Long> listNewCon = sendData.allContactsForUpdate();
       if(!listNewCon.isEmpty()){
           for(Long id : listNewCon){
               Contact c = sendData.contactFormQueryUpdate(id);
               
               Contact contact = contactService.get(c.getId());
               contact.setDateVisited(c.getDateVisited());
               contact.setVisitOutcome(c.getVisitOutcome());
               contact.setDateCalled(c.getDateCalled());
               contact.setCallOutcome(c.getCallOutcome());
               contactService.save(contact);
               String queryc = "Update contact set stat='2' where id='"+id+"'";
               handler.execAction(queryc);
               
           }
       }
    }
      public void newContactsOfexistingIndex() throws SQLException, ParseException{
         SendData sendData = new SendData();
         ContactLogic cl = new ContactLogic();
         List<Long> listNewCon = sendData.allContactsNewWithExistingindex();  
        
         if(!listNewCon.isEmpty()){
             for(Long idForCon : listNewCon){
                 
                 long indexId = cl.getIndexid( idForCon);
                
                 if(indexId!=0){  
                    IndexCaseTestingForm form = indexCaseTestingFormService.get(indexId);
                    Contact contact = sendData.contactFormQuery(idForCon, indexId);
                    contact.setCreatedBy(userService.get(contact.getCreatedBy().getId()));
                    contact.setModifiedBy(userService.get(contact.getModifiedBy().getId()));
                    contact.setIndexCaseTestingForm(form);
                    Contact c = contactService.save(contact);
                    String queryc = "Update contact set cid='"+c.getId()+"', index_case_testing_form='"+form.getId()+"', stat='2' where id='"+idForCon+"'";
                    handler.execAction(queryc);
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
                updateCallVisitStatus();
               // syncIndex();
               // syncContact();
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
                  taskProcess.getException().printStackTrace(System.err);
                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Error Encountered");
                  alert.setContentText("Failed to Update:\nCheck Internet Connection");
                  alert.showAndWait();
                   Platform.runLater(() -> {
                Stage stage = (Stage) loadingBar.getScene().getWindow();
                stage.close();
            });
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
