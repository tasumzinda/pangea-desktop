/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.YesNo;
import com.itech.pangea.business.service.DistrictService;
import com.itech.pangea.business.service.FacilityService;
import com.itech.pangea.business.service.IndexCaseTestingFormService;
import com.itech.pangea.business.service.ProvinceService;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.itech.pangea.sqliteConfig.PlaceID;
import com.itech.pangea.sqliteConfig.SendData;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.itech.pangea.sqliteConnections.SQLiteQueries;
import com.itech.pangea.utils.DateFunctions;
import com.itech.pangea.validations.Validate;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
 * @author kanaz
 */
@Component
public class EditIndexCaseController implements Initializable {

     SqliteDatabaseHandler handle;
      ResultSet rs;
    
    @FXML
    private JFXComboBox facility;
    
    @FXML
    private JFXButton cancelBtn;
    @FXML
    private JFXTextField numOfIndex;
    @FXML
    private JFXTextField firstName;
    @FXML
    private JFXTextField lastName;
    @FXML
    private JFXDatePicker dateDiagnosed; 
    @FXML
    private JFXTextField artNumber;
     @FXML
    private JFXTextField indexContactNum;
    
     @FXML
    private JFXComboBox initiatedOnArt;
     @FXML
    private JFXTextField reasonForNotInitiated;
     @FXML
    private JFXComboBox doesTheClientConsent;
     
    @Resource
    private ProvinceService provinceService;
    @Resource
    private DistrictService districtService;
    @Resource
    private FacilityService facilityService;
    
    @Resource
    private IndexCaseTestingFormService indexCaseTestingFormService;
    ObservableList prov;
    ObservableList dis;
    ObservableList fac;
    ObservableList<YesNo> yesno = FXCollections.observableArrayList(YesNo.values());
    
    IndexCaseTestingForm ictf;
    
    AnnotationConfigApplicationContext acac;
    User user;
    String conStatus;
    
    Long id;
    public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, Long id, String conStatus) {
         
             this.user = user;
             this.acac = acac;
             this.id = id;
             this.conStatus = conStatus;
             try {
             SQLiteQueries liteQueries = new SQLiteQueries();
             List<String> list = liteQueries.getFacility(user.getId());
             fac = FXCollections.observableArrayList(list);
             facility.setItems(fac);
         } catch (SQLException ex) {
             Logger.getLogger(EditIndexCaseController.class.getName()).log(Level.SEVERE, null, ex);
         }
             if(conStatus.equals("Online")){
                editOnline(id);
            }
            else{
                try {
                    editOffline(id);
                } catch (SQLException | ParseException ex) {
                    Logger.getLogger(EditDefaulterTrackingFormController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
       
    }
    public void editOffline(Long id) throws ParseException, SQLException{
        SendData sd = new SendData();
        ictf = sd.ictFormQuery(id);
        facility.getSelectionModel().select(ictf.getFacility().toString());
        numOfIndex.setText(ictf.getSequentialNumberOfIndex());
        firstName.setText(ictf.getFirstNameOfIndex());
        lastName.setText(ictf.getLastNameOfIndex());
        artNumber.setText(ictf.getIndexOIARTNumber());
        indexContactNum.setText(ictf.getIndexContactNumber());
        initiatedOnArt.getSelectionModel().select(ictf.getInitiatedOnART());
        doesTheClientConsent.getSelectionModel().select(ictf.getConsentForListedContacts());
        reasonForNotInitiated.setText(ictf.getReasonForNotBeingInitiated());
        dateDiagnosed.setValue(ictf.getDateIndexTestedOrDiagnosed() == null ? null : DateFunctions.localDate(ictf.getDateIndexTestedOrDiagnosed()));
         if(initiatedOnArt.getSelectionModel().isSelected(1)){
            reasonForNotInitiated.setDisable(false);
        }
    }
    public void editOnline(Long id){
       
        ictf = indexCaseTestingFormService.get(id);
        
        facility.getSelectionModel().select(ictf.getFacility() == null ? "" :ictf.getFacility().toString());
        numOfIndex.setText(ictf.getSequentialNumberOfIndex());
        firstName.setText(ictf.getFirstNameOfIndex());
        lastName.setText(ictf.getLastNameOfIndex());
        artNumber.setText(ictf.getIndexOIARTNumber());
        indexContactNum.setText(ictf.getIndexContactNumber());
        initiatedOnArt.getSelectionModel().select(ictf.getInitiatedOnART());
        doesTheClientConsent.getSelectionModel().select(ictf.getConsentForListedContacts());
        dateDiagnosed.setValue(ictf.getDateIndexTestedOrDiagnosed() == null ? null : LocalDate.parse(ictf.getDateIndexTestedOrDiagnosed().toString()));
        reasonForNotInitiated.setText(ictf.getReasonForNotBeingInitiated());
        if(initiatedOnArt.getSelectionModel().isSelected(1)){
            reasonForNotInitiated.setDisable(false);
        }
    }
    @FXML
     private void closeScreen(ActionEvent e){
           Stage stage = (Stage) cancelBtn.getScene().getWindow();
           stage.close();
     }
   
    @FXML
    private void updateIct(ActionEvent event) throws SQLException{
        updateDtfForm(id, conStatus);
    }
    @FXML
    private void onSelectedInitiatedOnArt(ActionEvent event){
        if(initiatedOnArt.getSelectionModel().isSelected(1)){
            reasonForNotInitiated.setDisable(false);
        }
        else{
            reasonForNotInitiated.setDisable(true);
            reasonForNotInitiated.clear();
        }
    }  
    
    public boolean isInputValid(){
       String errorMsg = "";
       Validate validate = new Validate();
       if(facility.getSelectionModel().isEmpty()){
           facility.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Select Facility\n";         
       }
       if(firstName.getText() == null || firstName.getText().isEmpty()){
          firstName.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "First Name is required\n";
       }
       if(!validate.validateTextOnly(firstName.getText())){
           firstName.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Invalid FirstName[Text Only]!\n";
       }
       if(!validate.validateTextOnly(lastName.getText())){
           lastName.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Invalid LastName[Text Only]!\n";
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
        doesTheClientConsent.setItems(yesno);
        initiatedOnArt.setItems(yesno);
        
    }   
   IndexCaseTestingForm ict; 
    public void updateDtfForm(Long id, String conStatus) throws SQLException{
         
         if(conStatus.equals("Online")){
             ict = indexCaseTestingFormService.get(id);
         }
         else{
             ict = new IndexCaseTestingForm();
         }
         
           if(isInputValid()){
                ict.setFirstNameOfIndex(firstName.getText());
                ict.setLastNameOfIndex(lastName.getText());
                ict.setSequentialNumberOfIndex(numOfIndex.getText());
                ict.setDateIndexTestedOrDiagnosed(convertDate(dateDiagnosed.getValue()));
                
                if(artNumber.getText().isEmpty()){
                   ict.setIndexOIARTNumber(null); 
                }
                else{
                    ict.setIndexOIARTNumber(artNumber.getText());
                      
                }
               if(indexContactNum.getText().isEmpty()){
                 ict.setIndexContactNumber(null);  
               }
               else{
                  ict.setIndexContactNumber(indexContactNum.getText());
               }
                ict.setReasonForNotBeingInitiated(reasonForNotInitiated.getText());
                
                int ioa = 11;
                int cf = 11;
            if(initiatedOnArt.getSelectionModel().isEmpty()){
              ict.setInitiatedOnART(null);            
                   }
            else{
               ict.setInitiatedOnART((YesNo) initiatedOnArt.getSelectionModel().getSelectedItem()); 
               ioa = ict.getInitiatedOnART().getCode();
            }
                 if(doesTheClientConsent.getSelectionModel().isEmpty()){
               ict.setConsentForListedContacts(null);            
                   }
            else{
               ict.setConsentForListedContacts((YesNo) doesTheClientConsent.getSelectionModel().getSelectedItem());
               cf = ict.getConsentForListedContacts().getCode();
            }
                
              PlaceID placeID = new PlaceID();
                 
                  long disID = placeID.getDistrictIdFromFacility((String)facility.getSelectionModel().getSelectedItem());
                  long provID = placeID.getProvinceFromDistrict(disID);
                   int facID = placeID.getFacilityId((String)facility.getSelectionModel().getSelectedItem());  
             if(conStatus.equals("Online")){
                 indexCaseTestingFormService.save(ict);
                 ictf.setFacility(facilityService.get(Long.valueOf(facID)));
                ictf.setDistrict(districtService.get(disID));
                ictf.setProvince(provinceService.get(provID));
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Notification");
                alert.setHeaderText("Success");
                alert.setContentText("Index Case Form updated successfully");
                alert.showAndWait();
               }
               else{
                 String query = "Update index_case_testing_form set "
                         + "consent_for_listed_contacts = '"+cf+"',"
                         + "first_name_of_index ='"+ict.getFirstNameOfIndex()+"',"
                         + "index_contact_number = '"+ict.getIndexContactNumber()+"',"
                         + "indexoiartnumber = '"+ict.getIndexOIARTNumber()+"',"
                         + "initiated_onart = '"+ioa+"',"
                         + "last_name_of_index= '"+ict.getLastNameOfIndex()+"',"
                         + "reason_for_not_being_initiated = '"+ict.getReasonForNotBeingInitiated()+"',"
                         + "district = '"+disID+"',"
                         + " facility = '"+facID+"',"
                         + " province = '"+provID+"', "
                         
                         + " date_index_tested_or_diagnosed = '"+ict.getDateIndexTestedOrDiagnosed()+"',"
                         + "sequential_number_of_index = '"+ict.getSequentialNumberOfIndex()+"'";
                 if(handle.execAction(query)){
                     System.err.println(query);
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
                     alert.setTitle("Notification");
                     alert.setHeaderText("Success");
                     alert.setContentText("Index Case Testing Updated Successfully");
                     alert.showAndWait();
                 }

               }
        }
    }
    public Date convertDate(LocalDate localDate){
        if(localDate == null){
            return null;
        }
        else{
        Date dateCon = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return dateCon;
    }
    }
}
