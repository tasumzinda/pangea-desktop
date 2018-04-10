/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.HTSRegisterForm;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.ClientServices;
import com.itech.pangea.business.domain.util.Gender;
import com.itech.pangea.business.domain.util.HIVResult;
import com.itech.pangea.business.domain.util.HTSModel;
import com.itech.pangea.business.domain.util.ReasonForHIVTest;
import com.itech.pangea.business.domain.util.Test;
import com.itech.pangea.business.domain.util.YesNo;
import com.itech.pangea.business.service.DistrictService;
import com.itech.pangea.business.service.FacilityService;
import com.itech.pangea.business.service.HTSRegisterFormService;
import com.itech.pangea.business.service.ProvinceService;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import com.itech.pangea.sqliteConfig.PlaceID;
import com.itech.pangea.sqliteConfig.SendData;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.itech.pangea.sqliteConnections.SQLiteQueries;
import com.itech.pangea.utils.DateFunctions;
import com.itech.pangea.utils.StringUtilis;
import com.itech.pangea.validations.Validate;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javax.annotation.Resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * FXML Controller class
 *
 * @author Admin
 */
@Component
public class EditHtsRegisterController implements Initializable {
    SqliteDatabaseHandler sqlite;
   
    @FXML
    private JFXComboBox facility;
    @FXML
    private JFXButton cancelBtn;
    @FXML
    private JFXTextField firstName;
    @FXML
    private JFXTextField lastName;
    @FXML
    private JFXComboBox gender;
    @FXML
    private JFXTextField age;
    @FXML
    private JFXTextField hivTestingSlipNum;
    @FXML
    private JFXTextField htsNumber;

    @FXML
    private JFXTimePicker time;
    @FXML
    private JFXDatePicker date;
    @FXML
    private JFXComboBox htsModel;
    @FXML
    private JFXComboBox reasonForHivTesting;
    @FXML
    private JFXComboBox lactingWoman;
    @FXML
    private JFXComboBox testReTest;

    @FXML
    private JFXComboBox testingEntryStream;
    @FXML
    private JFXTextField other;

    @FXML
    private JFXComboBox finalResult;
    @FXML
    private JFXComboBox inPreArt;
    @FXML
    private JFXDatePicker dateRegisteredInPreArt;
    @FXML
    private JFXComboBox initiatedArt;
    @FXML
    private JFXDatePicker dateInitiatedArt;

    @FXML
    private JFXTextField artNumber;

    @Resource
    private ProvinceService provinceService;
    @Resource
    private DistrictService districtService;
    @Resource
    private FacilityService facilityService;
    @Resource
    private HTSRegisterFormService hTSRegisterFormService;
    HTSRegisterForm htsById = new HTSRegisterForm();
    ObservableList sex = FXCollections.observableArrayList(Gender.getItems());
    ObservableList res = FXCollections.observableArrayList(ReasonForHIVTest.values());
    ObservableList hivRes = FXCollections.observableArrayList(HIVResult.values());
    ObservableList htsM = FXCollections.observableArrayList(HTSModel.values());
    ObservableList tests = FXCollections.observableArrayList(Test.values());
    ObservableList yesno = FXCollections.observableArrayList(YesNo.values());
    ObservableList clientSer = FXCollections.observableArrayList(ClientServices.values());
    ObservableList prov;
    ObservableList dis;
    ObservableList fac;

    AnnotationConfigApplicationContext acac;
    Long id;
    User user;
    FXMLLoader loader;
    String conStatus;
    ResultSet rs;

    public void setUserNCtx(User user, AnnotationConfigApplicationContext acac, Long id, String conStatus){
       
            this.user = user;
            this.acac = acac;
            this.id = id;
            this.conStatus = conStatus;
            
        gender.setItems(sex);
        reasonForHivTesting.setItems(res);
        finalResult.setItems(hivRes);
        htsModel.setItems(htsM);
        testReTest.setItems(tests);
        lactingWoman.setItems(yesno);
        testingEntryStream.setItems(clientSer);
        inPreArt.setItems(yesno);
        initiatedArt.setItems(yesno);
        
            try {
            SQLiteQueries liteQueries = new SQLiteQueries();
            List<String> list = liteQueries.getFacility(user.getId());
            fac = FXCollections.observableArrayList(list);
            facility.setItems(fac);
        } catch (SQLException ex) {
            Logger.getLogger(EditHtsRegisterController.class.getName()).log(Level.SEVERE, null, ex);
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
    public void  editOnline(Long id){
        htsById = hTSRegisterFormService.get(id);
       
         String entryStream;
        if(htsById.getEntryStream()== null || htsById.getEntryStream().equals("null")){
            entryStream = "OTHER"; 
        }
        else{
            entryStream = htsById.getEntryStream();
        }
        int i = ClientServices.valueOf(entryStream).getCode();
        int entry = i-1;
        facility.getSelectionModel().select(htsById.getFacility() == null ? "" : htsById.getFacility().toString());
        firstName.setText(htsById.getFirstName());
        lastName.setText(htsById.getLastName());
        gender.getSelectionModel().select(htsById.getGender());
        age.setText(htsById.getAge().toString());
        testingEntryStream.getSelectionModel().select(entry);
        hivTestingSlipNum.setText(htsById.getHivTestingReferralSlipNumber());
        htsNumber.setText(htsById.getHtsNumber());
        time.setValue(htsById.getmTime()== null ? null : LocalTime.parse(StringUtilis.timeString(htsById.getmTime())));
        date.setValue(htsById.getmDate() == null ? null : LocalDate.parse(htsById.getmDate().toString()));
        dateInitiatedArt.setValue(htsById.getDateOfInitiation() == null ? null : LocalDate.parse(htsById.getDateOfInitiation().toString()));
        dateRegisteredInPreArt.setValue(htsById.getRegisteredInPreArt() == null ? null : LocalDate.parse(htsById.getRegisteredInPreArt().toString()));
        
        htsModel.getSelectionModel().select(htsById.gethTSModel());
        reasonForHivTesting.getSelectionModel().select(htsById.getReasonForHIVTest());
        lactingWoman.getSelectionModel().select(htsById.getPregnantOrLactatingWoman());
        testReTest.getSelectionModel().select(htsById.getTest());     
        other.setText(htsById.getOther1());
        finalResult.getSelectionModel().select(htsById.getFinalResult());
        inPreArt.getSelectionModel().select(htsById.getInPreArt());
        initiatedArt.getSelectionModel().select(htsById.getInitiatedOnArt());
        artNumber.setText(htsById.getOiArtNumber());
        if (testingEntryStream.getSelectionModel().isSelected(2)) {
            other.setVisible(true);
            other.setDisable(false);
        } 
        if (finalResult.getSelectionModel().isSelected(0)) {
            inPreArt.setVisible(true);
            dateRegisteredInPreArt.setVisible(true);
            initiatedArt.setVisible(true);
            dateInitiatedArt.setVisible(true);     
            artNumber.setVisible(true);
        } 
        if (inPreArt.getSelectionModel().isSelected(0)) {
            dateRegisteredInPreArt.setDisable(false);
        }
        if (initiatedArt.getSelectionModel().isSelected(0)) {
            dateInitiatedArt.setDisable(false);
        }
        
        
    }
    
    public void editOffline(Long id) throws SQLException, ParseException{
        SendData sd = new SendData();
        htsById = sd.htsFormQuery(id);
        
        
        String entryStream;
        if(htsById.getEntryStream().equals("null")){
            entryStream = "OTHER"; 
        }
        else{
            entryStream = htsById.getEntryStream();
        }
        int i = ClientServices.valueOf(entryStream).getCode();
        int entry = i-1; 
        testingEntryStream.getSelectionModel().select(entry);
        
        facility.getSelectionModel().select(htsById.getFacility().toString());
        firstName.setText(htsById.getFirstName());
        lastName.setText(htsById.getLastName());
        gender.getSelectionModel().select(htsById.getGender());
        age.setText(htsById.getAge().toString());
        hivTestingSlipNum.setText(htsById.getHivTestingReferralSlipNumber());
        htsNumber.setText(htsById.getHtsNumber());
        time.setValue(htsById.getmTime()== null ? null : LocalTime.parse(htsById.getmTime()));        
        date.setValue(htsById.getmDate() == null ? null : DateFunctions.localDate(htsById.getmDate()));
        dateInitiatedArt.setValue(htsById.getDateOfInitiation() == null ? null : DateFunctions.localDate(htsById.getDateOfInitiation()));
        dateRegisteredInPreArt.setValue(htsById.getRegisteredInPreArt() == null ? null : DateFunctions.localDate(htsById.getRegisteredInPreArt()));
       
        htsModel.getSelectionModel().select(htsById.gethTSModel());
        reasonForHivTesting.getSelectionModel().select(htsById.getReasonForHIVTest());
        lactingWoman.getSelectionModel().select(htsById.getPregnantOrLactatingWoman());
        testReTest.getSelectionModel().select(htsById.getTest());
       
        other.setText(htsById.getOther1());
        finalResult.getSelectionModel().select(htsById.getFinalResult());
        inPreArt.getSelectionModel().select(htsById.getInPreArt());
        initiatedArt.getSelectionModel().select(htsById.getInitiatedOnArt());
        artNumber.setText(htsById.getOiArtNumber());
        
        
        
       
        if (testingEntryStream.getSelectionModel().isSelected(2)) {
            other.setVisible(true);
            other.setDisable(false);
        } 
        if (finalResult.getSelectionModel().isSelected(0)) {
            inPreArt.setVisible(true);
            dateRegisteredInPreArt.setVisible(true);
            initiatedArt.setVisible(true);
            dateInitiatedArt.setVisible(true);     
            artNumber.setVisible(true);
        } 
        if (inPreArt.getSelectionModel().isSelected(0)) {
            dateRegisteredInPreArt.setDisable(false);
        }
        if (initiatedArt.getSelectionModel().isSelected(0)) {
            dateInitiatedArt.setDisable(false);
        }
    }
    @FXML
     private void closeScreen(ActionEvent e){
           Stage stage = (Stage) cancelBtn.getScene().getWindow();
           stage.close();
     }
    

    @FXML
    private void onSelectedFinalResult(ActionEvent event) {
        if (finalResult.getSelectionModel().isSelected(0)) {
            inPreArt.setVisible(true);
            dateRegisteredInPreArt.setVisible(true);
            initiatedArt.setVisible(true);
            dateInitiatedArt.setVisible(true);
            artNumber.setVisible(true);
        } else {
            inPreArt.getSelectionModel().select(1);
            initiatedArt.getSelectionModel().select(1);
            inPreArt.setVisible(false);
            dateRegisteredInPreArt.setVisible(false);
            initiatedArt.setVisible(false);
            dateInitiatedArt.setVisible(false);
            artNumber.setVisible(false);
            dateRegisteredInPreArt.setValue(null);
            dateInitiatedArt.setValue(null);
            
        }
    }

    @FXML
    private void onSelectedInPreArt(ActionEvent event) {
        if (inPreArt.getSelectionModel().isSelected(0)) {
            dateRegisteredInPreArt.setDisable(false);
        } else {
            dateRegisteredInPreArt.setDisable(true);
            dateRegisteredInPreArt.setValue(null);
        }
    }

    @FXML
    private void onSelectedInitiatedArt(ActionEvent event) {
        if (initiatedArt.getSelectionModel().isSelected(0)) {
            dateInitiatedArt.setDisable(false);
        } else {
            dateInitiatedArt.setDisable(true);
           dateInitiatedArt.setValue(null);
        }
    }

    @FXML
    private void onSelectedTestingEntryStream(ActionEvent event) {
        if (testingEntryStream.getSelectionModel().isSelected(2)) {
            other.setVisible(true);
            other.setDisable(false);
        } else {
            other.setDisable(true);
            other.clear();
        }
    }

    @FXML
    private void updateHts(ActionEvent e) throws SQLException {
        updateHtsForm(id, conStatus);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         sqlite = SqliteDatabaseHandler.getInstance();
      // Platform.runLater(() -> {
        
        //inPreArt.getSelectionModel().select(1);
        //initiatedArt.getSelectionModel().select(1);
      // });
    }

    public boolean isInputValid() {
        String errorMsg = "";
        Validate validate = new Validate();
        if (facility.getSelectionModel().isEmpty()) {
            facility.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
            errorMsg += "Select Facility\n";
        }
        if (firstName.getText() == null || firstName.getText().isEmpty()) {
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
        if (lastName.getText() == null || lastName.getText().isEmpty()) {
            lastName.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
            errorMsg += "Last Name is required\n";
        }
        if (errorMsg.isEmpty()) {
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please Correct Invalid Fields");
            alert.setContentText(errorMsg);
            alert.showAndWait();
            return false;
        }
    }
     HTSRegisterForm hts;
    public void updateHtsForm(Long id, String conStatus) throws SQLException{
       
        if(conStatus.equals("Online")){
            hts = hTSRegisterFormService.get(id);
        }
        else{
            hts  = new HTSRegisterForm();
        }
        hts.setId(id);
         int hm = 11; //11 means null
         String ht;
         int rhiv = 11;
         int lw = 11;
         String fr;
         int pa = 11;
         int ia = 11;
        if(isInputValid()){
                  
           Gender fGender = (Gender)gender.getSelectionModel().getSelectedItem();
            
            if(testingEntryStream.getSelectionModel().isEmpty()){
                hts.setClientServices(null);
                hts.setEntryStream(null);
            }
            else{
             ClientServices fcs = (ClientServices)testingEntryStream.getSelectionModel().getSelectedItem();
             hts.setClientServices(fcs);
             hts.setEntryStream(testingEntryStream.getSelectionModel().getSelectedItem().toString());
            
            }
            if(htsModel.getSelectionModel().isEmpty()){
               hts.sethTSModel(null);               
            }
            else{
                HTSModel fHtsModel = (HTSModel)htsModel.getSelectionModel().getSelectedItem(); 
                  hts.sethTSModel(fHtsModel);
                  hm = hts.gethTSModel().getCode();
            }
            if(testReTest.getSelectionModel().isEmpty()){
                ht = "null";
                hts.setTest(null);
            }
            else{
                Test fTest = (Test)testReTest.getSelectionModel().getSelectedItem();
                hts.setTest(fTest);
                ht = hts.getTest().getCode().toString();
            }
            if(reasonForHivTesting.getSelectionModel().isEmpty()){
              
                hts.setReasonForHIVTest(null);
            }
            else{
                ReasonForHIVTest fReason = (ReasonForHIVTest)reasonForHivTesting.getSelectionModel().getSelectedItem();
                hts.setReasonForHIVTest(fReason);
                rhiv = hts.getReasonForHIVTest().getCode();
            }
            if(lactingWoman.getSelectionModel().isEmpty()){
                hts.setPregnantOrLactatingWoman(null);
                
            }
            else{
            YesNo fYesNo = (YesNo)lactingWoman.getSelectionModel().getSelectedItem();
            hts.setPregnantOrLactatingWoman(fYesNo);
            lw = hts.getPregnantOrLactatingWoman().getCode();
            }
            if(date.getValue()==null){
                hts.setmDate(null); 
            }
            else{
               LocalDate pickerDate = date.getValue();
               Date mdate = Date.from(pickerDate.atStartOfDay(ZoneId.systemDefault()).toInstant()); 
                hts.setmDate(mdate);
            }
            if(dateRegisteredInPreArt.getValue()==null){
                 hts.setRegisteredInPreArt(null);
            }else{
                LocalDate dateReg = dateRegisteredInPreArt.getValue();
                Date mDateR = Date.from(dateReg.atStartOfDay(ZoneId.systemDefault()).toInstant());
                hts.setRegisteredInPreArt(mDateR);
            }
            if(dateInitiatedArt.getValue()==null){
                hts.setDateOfInitiation(null);
                
            }else{
               LocalDate dateIn =dateInitiatedArt.getValue();
               Date mDateIn = Date.from(dateIn.atStartOfDay(ZoneId.systemDefault()).toInstant()); 
               hts.setDateOfInitiation(mDateIn);
            }
            if(dateRegisteredInPreArt.getValue()==null){
                hts.setRegisteredInPreArt(null);
            }
            else{
                Date ria = DateFunctions.convertDate(dateRegisteredInPreArt.getValue());
                hts.setRegisteredInPreArt(ria);
            }
               
           hts.setHivTestingReferralSlipNumber(hivTestingSlipNum.getText());
           
           hts.setOther1(other.getText());
           hts.setHtsNumber(htsNumber.getText());
           if(time.getValue() == null){
               hts.setmTime(null);
           }
           else{
               hts.setmTime(time.getValue().toString());
           }
           
           if(finalResult.getSelectionModel().isEmpty()){
               fr = "null";
               hts.setFinalResult(null);
           }
           else{
               
               hts.setFinalResult((HIVResult)finalResult.getSelectionModel().getSelectedItem());
               fr = hts.getFinalResult().getCode().toString();
           }
           if(inPreArt.getSelectionModel().isEmpty()){
           
               hts.setInPreArt(null);
           }
           else{
               hts.setInPreArt((YesNo)inPreArt.getSelectionModel().getSelectedItem());
               pa = hts.getInPreArt().getCode();
           }
           if(initiatedArt.getSelectionModel().isEmpty()){
               
               hts.setInitiatedOnArt(null);
                       
           }
           else{
                hts.setInitiatedOnArt((YesNo)initiatedArt.getSelectionModel().getSelectedItem());
                ia = hts.getInitiatedOnArt().getCode();
           }
           
          
           
           hts.setOiArtNumber(artNumber.getText()); 
           hts.setFirstName(firstName.getText());
           hts.setLastName(lastName.getText());
           hts.setAge(Integer.parseInt(age.getText()));
           hts.setGender(fGender);
           
                    PlaceID placeID = new PlaceID();
                    long disID = placeID.getDistrictIdFromFacility((String)facility.getSelectionModel().getSelectedItem());
                    long provID = placeID.getProvinceFromDistrict(disID);
                    int facID = placeID.getFacilityId((String)facility.getSelectionModel().getSelectedItem());
           if(conStatus.equals("Online")){
                hts.setFacility(facilityService.get(Long.valueOf(facID)));
                hts.setDistrict(districtService.get(disID));
                hts.setProvince(provinceService.get(provID));
               hTSRegisterFormService.save(hts);
              Alert alert = new Alert(Alert.AlertType.INFORMATION);
              alert.setTitle("Notification");
              alert.setHeaderText("Update Successfull");
              alert.setContentText("HTS Register Form");
              alert.showAndWait();
            }
            else{
               String query = "Update htsregister_form set "
                       + "age = '"+Integer.parseInt(age.getText())+"',"
                       + " card_number = '"+hts.getHtsNumber()+"',"
                       + "date_of_initiation = '"+hts.getDateOfInitiation()+"',"
                       + " entry_stream = '"+hts.getEntryStream()+"',"
                       + " final_result = '"+fr+"',"
                       + " first_name = '"+firstName.getText()+"',"
                       + " gender = '"+fGender.getCode()+"',"
                       + " in_pre_art = '"+pa+"',"
                       + " initiated_on_art = '"+ia+"',"
                       + " last_name = '"+lastName.getText()+"',"
                       + " m_date = '"+hts.getmDate()+"',"
                       + " m_time = '"+hts.getmTime()+"',"
                       + "oi_art_number = '"+hts.getOiArtNumber()+"',"
                       + " reason_forhivtest = '"+rhiv+"',"
                       + " registered_in_pre_art = '"+hts.getRegisteredInPreArt()+"',"
                       + " test = '"+ht+"',"
                       + " district = '"+disID+"',"
                       + " facility = '"+facID+"',"
                       + " province = '"+provID+"',"
                       + "htsmodel = '"+hm+"',"
                       + " hiv_testing_referral_slip_number = '"+hts.getHivTestingReferralSlipNumber()+"',"
                       + " hts_number = '"+hts.getHtsNumber()+"',"
                       + " pregnant_or_lactating_woman = '"+lw+"' WHERE id = '"+id+"'";
               if(sqlite.execAction(query)){
                   Alert alert = new Alert(Alert.AlertType.INFORMATION);
                   alert.setTitle("Notification");
                   alert.setHeaderText("Success");
                   alert.setContentText("HTS Register Form Updated Successfully");
                   alert.showAndWait();
               }
                
            }
        }
    }
}
