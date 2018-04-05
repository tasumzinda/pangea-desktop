/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.CallOutcome;
import com.itech.pangea.business.service.DefaulterTrackingFormService;
import com.itech.pangea.business.service.DistrictService;
import com.itech.pangea.business.service.FacilityService;
import com.itech.pangea.business.service.ProvinceService;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.itech.pangea.sqliteConfig.PlaceID;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.itech.pangea.sqliteConnections.SQLiteQueries;
import com.itech.pangea.validations.Validate;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javax.annotation.Resource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * FXML Controller class
 *
 * @author Admin
 */
@Component
public class DefaulterTrackingFormController implements Initializable {
    
    
    
    @FXML
    private JFXComboBox facility;
    
    
    @FXML
    private JFXTextField firstName;
    @FXML
    private JFXTextField lastName;
     @FXML
    private JFXTextField contactDetails;
    @FXML
    private JFXTextField physicalAddress;
    @FXML
    private JFXTextField artNumber;
    
    @FXML
    private JFXDatePicker dateArtInitiation;
    @FXML
    private JFXDatePicker dateReview;
    @FXML
    private JFXDatePicker dateAppDeemedDefaul;
    
    @FXML
    private JFXDatePicker dateOfCall1; 
    @FXML
    private JFXComboBox call1Outcome; 
    @FXML
    private JFXDatePicker date1AppDateIfFound;
    
    @FXML
    private JFXDatePicker dateOfCall2;
    @FXML
    private JFXComboBox call2Outcome;
     @FXML
    private JFXDatePicker date2AppDateIfFound;

    @FXML
    private JFXDatePicker dateOfCall3;
    @FXML
    private JFXComboBox call3Outcome;
    @FXML
    private JFXDatePicker date3AppDateIfFound;
    
    @FXML
    private JFXDatePicker dateVisitDone;
    @FXML
    private JFXComboBox visitOutcome;
    @FXML
    private JFXDatePicker dateVisit;
    @FXML
    private JFXComboBox finalOutcome;
    @FXML
    private JFXDatePicker dateClientVisited;
     
    @Resource
    private ProvinceService provinceService;
    @Resource
    private DistrictService districtService;
    @Resource
    private FacilityService facilityService;
    ObservableList<Province> prov;
    ObservableList<District> dis;
    ObservableList fac;
    
    SqliteDatabaseHandler handle; 
    ObservableList<CallOutcome> callOutComeValues = FXCollections.observableArrayList(CallOutcome.values());
    
    @Resource
    private DefaulterTrackingFormService defaulterTrackingFormService;
    
    
    AnnotationConfigApplicationContext acac;
    User user;
    String conStatus;
    ResultSet rs;
    public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, String conStatus) {
        
            this.user = user;
            this.acac = acac;
            this.conStatus = conStatus;
            try{
            SQLiteQueries liteQueries = new SQLiteQueries();
            List<String> list = liteQueries.getFacility();
            fac = FXCollections.observableArrayList(list);
            facility.setItems(fac);
        } catch (SQLException ex) {
            Logger.getLogger(DefaulterTrackingFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    public void clearFields(){
       // province.getSelectionModel().clearSelection();
        //district.getSelectionModel().clearSelection();
        facility.getSelectionModel().clearSelection();
        firstName.clear();
        lastName.clear();
        contactDetails.clear();
        physicalAddress.clear();
        dateArtInitiation.getEditor().clear();
        dateArtInitiation.setValue(null);
        dateReview.setValue(null);
        dateAppDeemedDefaul.setValue(null);
        dateOfCall1.setValue(null);
        dateOfCall2.setValue(null);
        dateOfCall3.setValue(null);
        call1Outcome.getSelectionModel().clearSelection();
        call2Outcome.getSelectionModel().clearSelection();
        call3Outcome.getSelectionModel().clearSelection();
       date1AppDateIfFound.setValue(null);
        date2AppDateIfFound.setValue(null);
         date3AppDateIfFound.setValue(null);
        dateVisitDone.setValue(null);
        visitOutcome.getSelectionModel().clearSelection();
        dateVisit.setValue(null);
        finalOutcome.getSelectionModel().clearSelection();
        dateClientVisited.setValue(null);
        
        
        artNumber.clear();
    }
     
    @FXML
    private void clearD(ActionEvent e){
        clearFields();
    }
    
    public Date convertDate(LocalDate localDate){
        Date dateCon = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return dateCon;
    }
    @FXML
    private void saveDefaulterTrackingForm(ActionEvent e){
         
         DefaulterTrackingForm dtf = new DefaulterTrackingForm();
         if(isInputValid()){
            
          
          
          dtf.setFirstNameOfIndex(firstName.getText());
          dtf.setLastNameOfIndex(lastName.getText());
          dtf.setPhysicalAddress(physicalAddress.getText());
          dtf.setContactDetails(contactDetails.getText());
         dtf.setoIARTNumber(artNumber.getText());
         //dtf.setoIARTNumber(null);
          if(dateArtInitiation.getValue() == null){
               dtf.setDateArtInitiation(null);
          }
          else{
              LocalDate pickerDate = dateArtInitiation.getValue();
              Date dateArt = Date.from(pickerDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
              dtf.setDateArtInitiation(dateArt);
          }
          
          
          if(dateReview.getValue() == null){
               dtf.setReviewDate(null);
          }
          else{
              dtf.setReviewDate(convertDate(dateReview.getValue()));
          }
          
         /* if(dateAppDeemedDefaul.getValue() == null){
              dtf.setAppointmentDeemedDefaulter(null);
          }
          else{
              dtf.setAppointmentDeemedDefaulter(convertDate(dateAppDeemedDefaul.getValue()));  
          }*/
          if(dateAppDeemedDefaul.getValue() == null){
               dtf.setAppointmentDeemedDefaulter(null); 
          }
          else{
              LocalDate pickerD = dateAppDeemedDefaul.getValue();
              Date dee = Date.from(pickerD.atStartOfDay(ZoneId.systemDefault()).toInstant());
              dtf.setDateArtInitiation(dee);
          }
          if(dateOfCall1.getValue() == null){
              dtf.setDateOfCall1(null);
          }
          else{
              dtf.setDateOfCall1(convertDate(dateOfCall1.getValue()));
          }
          
       
          
          if(date1AppDateIfFound.getValue() == null){
              dtf.setAppointmentDateIfLinkedToCare1(null);
          }
          else{
              dtf.setAppointmentDateIfLinkedToCare1(convertDate(date1AppDateIfFound.getValue()));
          }
          
          if(dateOfCall2.getValue() == null){
               dtf.setDateOfCall2(null);
          }
          else{
              dtf.setDateOfCall2(convertDate(dateOfCall2.getValue()));
          }
          
           
          if(date2AppDateIfFound.getValue() == null){
              dtf.setAppointmentDateIfLinkedToCare2(null);
          }else{
              dtf.setAppointmentDateIfLinkedToCare2(convertDate(date2AppDateIfFound.getValue()));
          }
          
          if(dateOfCall3.getValue() == null){
             dtf.setDateOfCall3(null); 
          }else{
              dtf.setDateOfCall3(convertDate(dateOfCall3.getValue()));
          }
          
          
          if(date3AppDateIfFound.getValue()==null){
              dtf.setAppointmentDateIfLinkedToCare3(null);
          }else{
              dtf.setAppointmentDateIfLinkedToCare3(convertDate(date3AppDateIfFound.getValue()));
          }
          
          if(dateVisitDone.getValue() == null){
              dtf.setDateOfVisit(null);
          }else{
              dtf.setDateOfVisit(convertDate(dateVisitDone.getValue()));
          }
          
          
          if(dateVisit.getValue() == null){
              dtf.setAppointmentDateIfLinkedToCare(null);
          }else{
              dtf.setAppointmentDateIfLinkedToCare(convertDate(dateVisit.getValue()));
          }
          
         
          if(dateClientVisited.getValue() == null){
              dtf.setDateClientVisitedFacility(null);
          }else{
              dtf.setDateClientVisitedFacility(convertDate(dateClientVisited.getValue()));
          }
          int call1 = 11;
          int call2 = 11;
          int call3 = 11;
          int vist = 11;
          int fo = 11;
           if(call1Outcome.getSelectionModel().isEmpty()){
              dtf.setCall1Outcome(null);
               
            }
            else{
                 dtf.setCall1Outcome((CallOutcome) call1Outcome.getSelectionModel().getSelectedItem());
                 call1 = dtf.getCall1Outcome().getCode();
            }
           if(call2Outcome.getSelectionModel().isEmpty()){
              dtf.setCall2Outcome(null);
               
            }
            else{
                 dtf.setCall2Outcome((CallOutcome) call2Outcome.getSelectionModel().getSelectedItem());
                 call2 = dtf.getCall2Outcome().getCode();
            }
           if(call3Outcome.getSelectionModel().isEmpty()){
              dtf.setCall3Outcome(null);
               
            }
            else{
                 dtf.setCall3Outcome((CallOutcome) call3Outcome.getSelectionModel().getSelectedItem()); 
                 call3 = dtf.getCall3Outcome().getCode();
            }
           if(visitOutcome.getSelectionModel().isEmpty()){
              dtf.setVisitOutcome(null);
               
            }
            else{
                 dtf.setVisitOutcome((CallOutcome) visitOutcome.getSelectionModel().getSelectedItem());
                 vist = dtf.getVisitOutcome().getCode();
            }
           if(finalOutcome.getSelectionModel().isEmpty()){
              dtf.setFinalOutcome(null);
               
            }
            else{
              
                 dtf.setFinalOutcome((CallOutcome) finalOutcome.getSelectionModel().getSelectedItem());
                 fo = dtf.getFinalOutcome().getCode();
            }
          
         
          
          
         
          
          
          if(conStatus.equals("Online")){
         // Province fprovince = (Province)province.getSelectionModel().getSelectedItem();
         // District fDistrict = (District)district.getSelectionModel().getSelectedItem();
          Facility fFacility = (Facility)facility.getSelectionModel().getSelectedItem();
          //dtf.setProvince(fprovince);
          //dtf.setDistrict(fDistrict);
          dtf.setFacility(fFacility);
          defaulterTrackingFormService.save(dtf);
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
           alert.setTitle("Notification");
           alert.setHeaderText("Success");
           alert.setContentText("HTS Register Form Saved Successfully");
           alert.showAndWait();
           clearFields();
          }
          else{
              try {
                  PlaceID placeID = new PlaceID();
                 // int provID = placeID.getProvinceId((String)province.getSelectionModel().getSelectedItem());
                  //int disID = placeID.getDistrictId((String)district.getSelectionModel().getSelectedItem());
                  long disID = placeID.getDistrictIdFromFacility((String)facility.getSelectionModel().getSelectedItem());
                  long provID = placeID.getProvinceFromDistrict(disID);
                  int facID = placeID.getFacilityId((String)facility.getSelectionModel().getSelectedItem());
                  
                  String query = " Insert Into defaulter_tracking_form(active, deleted, uuid, version, appointment_date_if_linked_back_to_care, appointment_date_if_linked_to_care,"
                          + "appointment_date_if_linked_to_care1, appointment_deemed_defaulter, call1outcome, call2outcome, call3outcome, contact_details, "
                          + "date_art_initiation, date_client_visited_facility, date_of_call1, date_of_call2, date_of_call3, date_of_visit, date_visit_done, first_name_of_index,"
                          + "last_name_of_index, oiartnumber, physical_address, reason_for_tracking, review_date, visit_done_outcome, visit_outcome, district, facility, province,"
                          + "appointment_date_if_linked_to_care2, appointment_date_if_linked_to_care3, final_outcome)"
                          + " Values('', '','','0',"
                          + "'"+dtf.getAppointmentDateIfLinkedToCare()+"',"
                          + "'"+dtf.getAppointmentDateIfLinkedToCare()+"',"
                          + "'"+dtf.getAppointmentDateIfLinkedToCare1()+"',"
                          + "'"+dtf.getAppointmentDeemedDefaulter()+"',"
                          + "'"+call1+"',"
                          + "'"+call2+"',"
                          + "'"+call3+"',"
                          + "'"+dtf.getContactDetails()+"','"+dtf.getDateArtInitiation()+"',"
                          + "'"+dtf.getDateClientVisitedFacility()+"',"
                          + "'"+dtf.getDateOfCall1()+"',"
                          + "'"+dtf.getDateOfCall2()+"',"
                          + "'"+dtf.getDateOfCall3()+"',"
                          + "'"+dtf.getDateOfVisit()+"',"
                          + "'"+dtf.getDateOfVisit()+"',"
                          + "'"+dtf.getFirstNameOfIndex()+"',"
                          + "'"+dtf.getLastNameOfIndex()+"',"
                          + "'"+dtf.getoIARTNumber()+"',"
                          + "'"+dtf.getPhysicalAddress()+"',"
                          + "'','"+dtf.getReviewDate()+"',"
                          + "'"+vist+"',"
                          + "'"+vist+"',"
                          + "'"+disID+"',"
                          + "'"+facID +"',"
                          + "'"+provID+"',"
                          + "'"+dtf.getAppointmentDateIfLinkedToCare2()+"',"
                          + "'"+dtf.getAppointmentDateIfLinkedToCare3()+"',"
                          + "'"+fo+"')";
                         if(handle.execAction(query)){
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Notification");
                        alert.setHeaderText("Success");
                        alert.setContentText("Defaulter Tracking Form Saved Successfully");
                        alert.showAndWait();
                        clearFields();
                    }
              } catch (SQLException ex) {
                  Logger.getLogger(DefaulterTrackingFormController.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        }
    }

    public boolean isInputValid(){
        
       String errorMsg = "";
       /*
       if(!validate.validateNumber(artNumber.getText())){
           artNumber.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Invalid Art Number!\n";
       }*/
       if(facility.getSelectionModel().isEmpty()){
           facility.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Select Facility\n";         
       }
       if(firstName.getText() == null || firstName.getText().isEmpty()){
          firstName.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "First Name is required\n";
       }
       if(lastName.getText() == null || lastName.getText().isEmpty()){
           lastName.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Last Name is required\n";
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        handle = SqliteDatabaseHandler.getInstance();
       // prov = FXCollections.observableArrayList(provinceService.getAll());
       // province.setItems(prov);
        call1Outcome.setItems(callOutComeValues);
        call2Outcome.setItems(callOutComeValues);
        call3Outcome.setItems(callOutComeValues);
        visitOutcome.setItems(callOutComeValues);
        finalOutcome.setItems(callOutComeValues);
    }    
    
}
