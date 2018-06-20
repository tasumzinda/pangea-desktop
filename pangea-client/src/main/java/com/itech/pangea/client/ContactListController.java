/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.Gender;
import com.itech.pangea.business.domain.util.HIVResult;
import com.itech.pangea.business.domain.util.HTSModel;
import com.itech.pangea.business.domain.util.ReasonForHIVTest;
import com.itech.pangea.business.domain.util.ReasonForIneligibilityForTesting;
import com.itech.pangea.business.domain.util.Relationship;
import com.itech.pangea.business.domain.util.YesNo;
import com.itech.pangea.business.service.ContactService;
import com.itech.pangea.repo.ContactRepo;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.itech.pangea.utils.DateFunctions;
import com.itech.pangea.validations.Validate;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javax.annotation.Resource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * FXML Controller class
 *
 * @author Roy
 */
@Component
public class ContactListController implements Initializable {
    SqliteDatabaseHandler handle;
    @FXML
    private JFXComboBox preferredPlaceForContactsToBeTested;
    @FXML
    private JFXDatePicker appointmentDateForContact;
    @FXML
    private JFXDatePicker secondAppointmentDateForContact;
    @FXML
    private JFXDatePicker thirdAppointmentDateForContact;
    @FXML
    private JFXTextField nameOfContact;
   
    //@FXML
   // private JFXComboBox relationship;
    @FXML
    private JFXComboBox relationShipToIndex;
    @FXML
    private JFXTextField relationshipOther;
    @FXML
    private JFXTextField age;
    @FXML
    private JFXComboBox gender;
    @FXML
    private JFXTextField contactAddress;
     @FXML
    private JFXSpinner saveP;
      
    /*
    @FXML
    private JFXDatePicker dateCalled;
    @FXML
    private JFXComboBox callOutcome;
    @FXML
    private JFXDatePicker dateVisited;
    @FXML
    private JFXComboBox visitOutcome;*/
    @FXML
    private JFXDatePicker contactTestedDate;
    @FXML
    private JFXComboBox locationOfTest;
    @FXML
    private JFXComboBox hivResult;
    @FXML
    private JFXComboBox enrolledIntoCare;
    @FXML
    private JFXTextField sequentialNumberOfContacts;
    @FXML
    private JFXTextField referralSlipNumber;
    @FXML
    private JFXComboBox hivStatusEntry;
   
  
    @FXML
    private JFXDatePicker ifTestedDateContactTested;
    @FXML
    private JFXComboBox onART;
    @FXML
    private JFXTextField artNumber;
    @FXML
    private JFXComboBox referralSlipReturned;
     
    ObservableList sex = FXCollections.observableArrayList(Gender.getItems());
    ObservableList res = FXCollections.observableArrayList(ReasonForHIVTest.values());
    ObservableList hivRes = FXCollections.observableArrayList(HIVResult.values());
    ObservableList htsM = FXCollections.observableArrayList(HTSModel.values());
    ObservableList yesno = FXCollections.observableArrayList(YesNo.values());
    ObservableList rel = FXCollections.observableArrayList(Relationship.values());
    ObservableList rf = FXCollections.observableArrayList(ReasonForIneligibilityForTesting.values());
   
    @Resource
    private ContactService contactService;
    AnnotationConfigApplicationContext acac;
    Long indexId;
    User user;
    String conStatus;
    IndexCaseTestingForm indexCaseId;
     public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, Long indexId, String conStatus, IndexCaseTestingForm indexCaseId){
        this.user = user;
        this.acac = acac;
        this.conStatus = conStatus;
        this.indexCaseId = indexCaseId;
        this.indexId = indexId;
     }
    @FXML
    private void onRelSel(ActionEvent e){
       if(relationShipToIndex.getSelectionModel().isSelected(3)){
           relationshipOther.setDisable(false);
       }
       else{
           relationshipOther.setDisable(true);
       }
   }
   @FXML
    private void onHivStat(ActionEvent e){
       if(!hivStatusEntry.getSelectionModel().isSelected(2)){
           ifTestedDateContactTested.setDisable(false);
       }
       else{
           ifTestedDateContactTested.setDisable(true);
       }
   }
    @FXML
    private void onEnrolled(ActionEvent e){
       if(enrolledIntoCare.getSelectionModel().isSelected(0)){
           artNumber.setDisable(false);
       }
       else{
          artNumber.setDisable(true); 
       }
   }
    @FXML
    private void clearPressed(ActionEvent ev){
       Stage stage = (Stage) appointmentDateForContact.getScene().getWindow();
       stage.close();  
    }
    @FXML
    private void saveContactList(ActionEvent ev) throws SQLException{
       Contact c = new Contact();
       if(isInputValid()){
           c.setNameOfContact(nameOfContact.getText());
           c.setAge(age.getText().isEmpty() ? null : Integer.parseInt(age.getText()));
           c.setGender(gender.getSelectionModel().isEmpty() ? null : (Gender) gender.getSelectionModel().getSelectedItem());
           c.setContactAddress(contactAddress.getText());
           c.setRelationShipToIndex(relationShipToIndex.getSelectionModel().isEmpty() ? null : relationShipToIndex.getSelectionModel().getSelectedItem().toString());
           c.setRelationshipOther(relationshipOther.getText());
           c.setReferralSlipNumber(referralSlipNumber.getText());
           c.setHivStatusEntry((ReasonForIneligibilityForTesting) hivStatusEntry.getSelectionModel().getSelectedItem());
           c.setIfTestedDateContactTested(ifTestedDateContactTested.getValue() == null ? null : DateFunctions.convertDate(ifTestedDateContactTested.getValue()));
           c.setPreferredPlaceForContactsToBeTested((HTSModel) preferredPlaceForContactsToBeTested.getSelectionModel().getSelectedItem());
           c.setAppointmentDateForContact(appointmentDateForContact.getValue() == null ? null : DateFunctions.convertDate(appointmentDateForContact.getValue()));
           c.setSecondAppointmentDateForContact(secondAppointmentDateForContact.getValue() == null ? null : DateFunctions.convertDate(secondAppointmentDateForContact.getValue()));
           c.setThirdAppointmentDateForContact(thirdAppointmentDateForContact.getValue() == null ? null : DateFunctions.convertDate(thirdAppointmentDateForContact.getValue()));
           c.setSequentialNumberOfContacts(sequentialNumberOfContacts.getText().isEmpty() ? null : Integer.parseInt(sequentialNumberOfContacts.getText()));
           c.setContactTestedDate(contactTestedDate.getValue()==null ? null : DateFunctions.convertDate(contactTestedDate.getValue()));
           c.setLocationOfTest((HTSModel) locationOfTest.getSelectionModel().getSelectedItem());
           c.setHivResult((HIVResult) hivResult.getSelectionModel().getSelectedItem());
           c.setEnrolledIntoCare(enrolledIntoCare.getSelectionModel().isEmpty() ? null :(YesNo) enrolledIntoCare.getSelectionModel().getSelectedItem());
           c.setOnART((YesNo) onART.getSelectionModel().getSelectedItem());
           c.setReferralSlipReturned((YesNo) referralSlipReturned.getSelectionModel().getSelectedItem());
           c.setIndexCaseTestingForm(indexCaseId);
           c.setCreatedBy(user);
           c.setModifiedBy(user);
          /*    if(conStatus.equals("Online")){
                    saveP.setVisible(true);
             Task<Void> tsave = new Task<Void>(){
                    @Override
                    protected Void call() throws Exception {
                       
                        contactService.save(c);
                        return null;
                    }
                };
                Thread thread = new Thread(tsave);
                thread.setDaemon(true);
                thread.start();  
                  tsave.setOnSucceeded((WorkerStateEvent e) -> {
                      ev.consume();
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Success");
                  alert.setContentText("Contact Saved Successfully");
                  alert.showAndWait();
                  saveP.setVisible(false);
                  clearFields();
              });
              tsave.setOnFailed((WorkerStateEvent e) -> {
                  ev.consume();
                   Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Error Encountered");
                  alert.setContentText("Connection Error:\n Check Internet Connection");
                  alert.showAndWait();
                  saveP.setVisible(false);

             });
               
              }
              else{*/
                 
                 int eic;
                 int gen;
                 int hr;
                 int hse;
                 int lot;
                 int oa;
                 int pp;
                 int rs;
               
                 if(enrolledIntoCare.getSelectionModel().isEmpty()){
                     eic = 11;
                 }
                 else{
                     eic = c.getEnrolledIntoCare().getCode();
                 }
                 if(gender.getSelectionModel().isEmpty()){
                     gen = 11;
                 }
                 else{
                     gen = c.getGender().getCode();
                 }
                 if(hivResult.getSelectionModel().isEmpty()){
                     hr = 11;
                 }
                 else{
                     hr = c.getHivResult().getCode();
                 }
                 if(hivStatusEntry.getSelectionModel().isEmpty()){
                     hse = 11;
                 }
                 else{
                     hse = c.getHivStatusEntry().getCode();
                 }
                 if(locationOfTest.getSelectionModel().isEmpty()){
                     lot = 11;
                 }
                 else{
                     lot = c.getHivResult()==null? 11 : c.getHivResult().getCode();
                 }
                 if(onART.getSelectionModel().isEmpty()){
                     oa = 11;
                 }
                 else{
                     oa = c.getOnART().getCode();
                 }
                 if(preferredPlaceForContactsToBeTested.getSelectionModel().isEmpty()){
                     pp = 11;
                 }
                 else{
                     pp = c.getPreferredPlaceForContactsToBeTested().getCode();
                 }  
                 if(referralSlipReturned.getSelectionModel().isEmpty()){
                     rs = 11;
                 }
                 else{
                     rs = c.getReferralSlipReturned().getCode();
                 }
                 ContactRepo contactRepo = new  ContactRepo();
                 int id = contactRepo.getLastInsertIdByIndex(c.getIndexCaseTestingForm().getId().intValue());
                 
                 Long indexID;
                     if(indexId!=0){
                        indexID = indexId; 
                     }
                     else{
                         indexID = c.getIndexCaseTestingForm().getId();
                     }
                 
                 if(id!=0){
                     
                     Integer seqNum = contactRepo.sequentialNumber(id);
                     c.setSequentialNumber(seqNum.longValue());
                     
                     c.setUuid(contactRepo.getUuidofIndex(indexID.intValue())+""+c.getSequentialNumber());
                 }
                 else{
                    
                     Integer sequentialNumber = 1;
                     c.setSequentialNumber(sequentialNumber.longValue());
                     c.setUuid(contactRepo.getUuidofIndex(indexID.intValue())+""+c.getSequentialNumber());
                     
                 }
                 
                 
                 String query = "Insert Into Contact(cid, active, deleted, uuid, version, sequential_number, age, appointment_date_for_contact, art_number,"
                         + "call_outcome, contact_address, contact_tested_date, date_called, date_visited, enrolled_into_care, gender,"
                         + "hiv_result, hiv_status_entry, if_tested_date_contact_tested, location_of_test, name_of_contact, onart,"
                         + "preferred_place_for_contacts_to_be_tested, referral_slip_number, referral_slip_returned, relation_ship_to_index,"
                         + "second_appointment_date_for_contact, sequential_number_of_contacts, third_appointment_date_for_contact, visit_outcome,"
                         + "created_by, modified_by, index_case_testing_form, stat) Values('0', 'true', '', '"+c.getUuid()+"', '0', '"+c.getSequentialNumber()+"',"
                         + "'"+c.getAge()+"',"
                         + "'"+c.getAppointmentDateForContact()+"',"
                         + "'"+c.getArtNumber()+"',"
                         + "'11',"
                         + "'"+c.getContactAddress()+"',"
                         + "'"+c.getContactTestedDate()+"',"
                         + "'"+c.getDateCalled()+"',"
                         + "'"+c.getDateVisited()+"',"
                         + "'"+eic+"',"
                         + "'"+gen+"',"
                         + "'"+hr+"',"
                         + "'"+hse+"',"
                         + "'"+c.getIfTestedDateContactTested()+"',"
                         + "'"+lot+"',"
                         + "'"+c.getNameOfContact()+"',"
                         + "'"+oa+"',"
                         + "'"+pp+"',"
                         + "'"+c.getReferralSlipNumber()+"',"
                         + "'"+rs+"',"
                         + "'"+c.getRelationShipToIndex()+"',"
                         + "'"+c.getSecondAppointmentDateForContact()+"',"
                         + "'"+c.getSequentialNumberOfContacts()+"',"
                         + "'"+c.getThirdAppointmentDateForContact()+"',"
                         + "'11',"
                         + "'"+user.getId()+"',"
                         + "'"+user.getId()+"',"
                         + "'"+c.getIndexCaseTestingForm().getId()+"','0')"; 
                 if(handle.execAction(query)){
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Success");
                  alert.setContentText("Contact Saved Successfully");
                  alert.showAndWait();
                  clearFields();
                 }
              }
           
     //  }
    }
    public void clearFields(){
       preferredPlaceForContactsToBeTested.getSelectionModel().clearSelection();
       appointmentDateForContact.setValue(null);
       secondAppointmentDateForContact.setValue(null);
       thirdAppointmentDateForContact.setValue(null);
       nameOfContact.clear();
       relationShipToIndex.getSelectionModel().clearSelection();
       relationshipOther.clear();
       age.clear();
       gender.getSelectionModel().clearSelection();
       contactAddress.clear();
       contactTestedDate.setValue(null);
       locationOfTest.getSelectionModel().clearSelection();
       hivResult.getSelectionModel().clearSelection();
       enrolledIntoCare.getSelectionModel().clearSelection();
       sequentialNumberOfContacts.clear();
       referralSlipNumber.clear();
       referralSlipReturned.getSelectionModel().clearSelection();
       hivStatusEntry.getSelectionModel().clearSelection();
       ifTestedDateContactTested.setValue(null);
       onART.getSelectionModel().clearSelection();
       artNumber.clear();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        handle = SqliteDatabaseHandler.getInstance();
        gender.setItems(sex);
        relationShipToIndex.setItems(rel);
        hivStatusEntry.setItems(rf);
        preferredPlaceForContactsToBeTested.setItems(htsM);
        locationOfTest.setItems(htsM);
        hivResult.setItems(hivRes);
        enrolledIntoCare.setItems(yesno);
        onART.setItems(yesno);
        referralSlipReturned.setItems(yesno);
        
    }    

    private boolean isInputValid() {
        Validate validate = new Validate();
        
       String errorMsg = "";
        if(nameOfContact.getText() == null || nameOfContact.getText().isEmpty()){
          nameOfContact.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Name of Contact is Required\n";
       }
        if(!validate.validateFullname(nameOfContact.getText())){
           nameOfContact.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Invalid Name Of Contact!\nPlease Try [Xxxxxx Xxxxxx] format.\n";
       }
        if(!age.getText().isEmpty() && !validate.validateNumber(age.getText())){
            age.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
            errorMsg += "Age is Invalid!!!\n";
       }
        if(gender.getSelectionModel().isEmpty()){
            gender.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Gender Required.\n"; 
        }
       
        if(!validate.validateNumber(sequentialNumberOfContacts.getText())){
            sequentialNumberOfContacts.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
            errorMsg += "Sequential Number required[Only Number]\n";
       }
         if(errorMsg.isEmpty()){
           return true;
       }
       else{
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setTitle("Invalid Fields");
           alert.setHeaderText("Please Correct Invalid Fields");
           alert.setContentText(errorMsg);
           alert.showAndWait();
           return false;
       }    
    }
    
    
}
