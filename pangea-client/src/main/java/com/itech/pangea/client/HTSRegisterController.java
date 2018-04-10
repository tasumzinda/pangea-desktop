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
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.itech.pangea.sqliteConnections.SQLiteQueries;
import com.itech.pangea.validations.Validate;
import com.jfoenix.controls.JFXSpinner;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
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
public class HTSRegisterController implements Initializable {

    
    
    @FXML
    private JFXComboBox facility;
    
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
    private JFXSpinner saveP;
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
    ObservableList<Gender> sex = FXCollections.observableArrayList(Gender.getItems());
    ObservableList<ReasonForHIVTest> res = FXCollections.observableArrayList(ReasonForHIVTest.values());
    ObservableList<HIVResult> hivRes = FXCollections.observableArrayList(HIVResult.values());
    ObservableList<HTSModel> htsM = FXCollections.observableArrayList(HTSModel.values());
    ObservableList<Test> tests = FXCollections.observableArrayList(Test.values());
    ObservableList<YesNo> yesno = FXCollections.observableArrayList(YesNo.values());
    ObservableList<ClientServices> clientSer = FXCollections.observableArrayList(ClientServices.values());
    ObservableList<Province> prov;
    ObservableList<District> dis;
    ObservableList fac;
    
    SqliteDatabaseHandler handle; 
    ResultSet rs;
    AnnotationConfigApplicationContext acac;
    User user;
    String conStatus;
    public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, String conStatus){
        this.user = user;
            this.acac = acac;
            this.conStatus = conStatus;
        try {
            
            SQLiteQueries liteQueries = new SQLiteQueries();
            List<String> list = liteQueries.getFacility(user.getId());
            fac = FXCollections.observableArrayList(list);
            facility.setItems(fac);
            }
        catch (SQLException ex) {
            Logger.getLogger(HTSRegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void onSelectedFinalResult(ActionEvent event){
        if(finalResult.getSelectionModel().isSelected(0)){
       inPreArt.setVisible(true);     
       dateRegisteredInPreArt.setVisible(true);
       initiatedArt.setVisible(true);
       dateInitiatedArt.setVisible(true);
       artNumber.setVisible(true);
        }
        else{
           inPreArt.setVisible(false);     
       dateRegisteredInPreArt.setVisible(false);
       initiatedArt.setVisible(false);
       dateInitiatedArt.setVisible(false);
       artNumber.setVisible(false); 
        }
    }
    @FXML
    private void onSelectedInPreArt(ActionEvent event){
        if(inPreArt.getSelectionModel().isSelected(0)){
            dateRegisteredInPreArt.setDisable(false);
        }
        else{
            dateRegisteredInPreArt.setDisable(true);
        }
    }
    @FXML
    private void onSelectedInitiatedArt(ActionEvent event){
        if(initiatedArt.getSelectionModel().isSelected(0)){
            dateInitiatedArt.setDisable(false);
        }
        else{
            dateInitiatedArt.setDisable(true);
        }
    }
    @FXML
    private void onSelectedTestingEntryStream(ActionEvent event){
         if(testingEntryStream.getSelectionModel().isSelected(2) ){
             other.setVisible(true);
             other.setDisable(false);
         }
         else{
             other.setDisable(true);
         }
    }
    @FXML
    private void clearHts(ActionEvent event){
        clearFields();
    }
    
    public void clearFields(){
        //province.getSelectionModel().clearSelection();
     //   district.getSelectionModel().clearSelection();
        facility.getSelectionModel().clearSelection();
        firstName.clear();
        lastName.clear();
        gender.getSelectionModel().clearSelection();
        age.clear();
        hivTestingSlipNum.clear();
        htsNumber.clear();
        time.getEditor().clear();
        time.setValue(null);
        date.getEditor().clear();
        date.setValue(null);
        htsModel.getSelectionModel().clearSelection();
        reasonForHivTesting.getSelectionModel().clearSelection();
        lactingWoman.getSelectionModel().clearSelection();
        testReTest.getSelectionModel().clearSelection();
        testingEntryStream.getSelectionModel().clearSelection();
        other.clear();
        finalResult.getSelectionModel().clearSelection();
        inPreArt.getSelectionModel().clearSelection();
        dateRegisteredInPreArt.getEditor().clear();
        dateRegisteredInPreArt.setValue(null);
        initiatedArt.getSelectionModel().clearSelection();
        dateInitiatedArt.getEditor().clear();
        dateInitiatedArt.setValue(null);
        artNumber.clear();
    }
    @FXML
    private void saveHts(ActionEvent e) throws SQLException{
         HTSRegisterForm hts = new HTSRegisterForm();
       
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
           
          
                  PlaceID placeID = new PlaceID();
                 
                  long disID = placeID.getDistrictIdFromFacility((String)facility.getSelectionModel().getSelectedItem());
                  long provID = placeID.getProvinceFromDistrict(disID);
                  int facID = placeID.getFacilityId((String)facility.getSelectionModel().getSelectedItem());
                    hts.setOiArtNumber(artNumber.getText()); 
                    hts.setFirstName(firstName.getText());
                    hts.setLastName(lastName.getText());
                    hts.setAge(Integer.parseInt(age.getText()));
                    hts.setGender(fGender);
                    hts.setCreatedBy(user);
                    hts.setModifiedBy(user);
           
           if(conStatus.equals("Online")){
           
                
                saveP.setVisible(true);
             Task<Void> tsave = new Task<Void>(){
                    @Override
                    protected Void call() throws Exception {
                        hts.setFacility(facilityService.get(Long.valueOf(facID)));
                        hts.setDistrict(districtService.get(disID));
                        hts.setProvince(provinceService.get(provID));
                        hTSRegisterFormService.save(hts); 
                        return null;
                    }
                };
                Thread thread = new Thread(tsave);
                thread.setDaemon(true);
                thread.start();  
                  tsave.setOnSucceeded((WorkerStateEvent ev) -> {
                      ev.consume();
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Success");
                  alert.setContentText("HTS Register Form Saved Successfully");
                  alert.showAndWait();
                  saveP.setVisible(false);
                  clearFields();
              });
              tsave.setOnFailed((WorkerStateEvent ev) -> {
                  ev.consume();
                   Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Error Encountered");
                  alert.setContentText("Connection Error: Try Again");
                  alert.showAndWait();
                  saveP.setVisible(false);

             });
               
             if(tsave.isDone()){
                saveP.setVisible(false); 
             }
            }
            else{
               String query = "Insert Into htsregister_form(active, deleted, uuid, version, age, card_number,"
                       + "date_of_initiation, entry_stream, final_result, first_name, gender, in_pre_art, initiated_on_art, last_name, m_date, m_time,"
                       + "oi_art_number, reason_forhivtest, registered_in_pre_art, test, created_by, modified_by, district, facility, province, date_client_registered_inart,"
                       + "htsmodel, hiv_testing_referral_slip_number, hts_number, pregnant_or_lactating_woman, test_if_pregnant_or_lactating_woman)"
                       + " Values('', '', '',"
                       + " '0',"
                       + " '"+Integer.parseInt(age.getText())+"',"
                       + " '"+hts.getHtsNumber()+"',"
                       + " '"+hts.getDateOfInitiation()+"',"
                       + " '"+hts.getEntryStream()+"',"
                       + " '"+fr+"',"
                       + " '"+ firstName.getText()+"',"
                       + " '"+hts.getGender().getCode()+"',"
                       + " '"+pa+"',"
                       + " '"+ia+"',"
                       + " '"+lastName.getText()+"',"
                       + " '"+hts.getmDate()+"',"
                       + " '"+hts.getmTime()+"',"
                       + " '"+hts.getOiArtNumber()+"',"
                       + " '"+rhiv+"',"
                       + " '"+hts.getRegisteredInPreArt()+"',"
                       + " '"+ht+"',"
                       + " '"+user.getId()+"',"
                       + " '"+user.getId()+"',"
                       + " '"+disID+"',"
                       + " '"+facID+"',"
                       + " '"+provID+"',"
                       + " '',"
                       + " '"+hm+"',"
                       + " '"+hts.getHivTestingReferralSlipNumber()+"',"
                       + " '"+hts.getHtsNumber()+"',"
                       + " '"+lw+"',"
                       + " '')";
               if(handle.execAction(query)){
                   Alert alert = new Alert(Alert.AlertType.INFORMATION);
                   alert.setTitle("Notification");
                   alert.setHeaderText("Success");
                   alert.setContentText("HTS Register Form Saved Successfully");
                   alert.showAndWait();
                   clearFields();
               }
                
            }
           
           
        }
    }
    
    public void saveonline(){
            
    }
    public void saveOffline(){
        
    }
    public boolean isInputValid(){
        Validate validate = new Validate();
        
       String errorMsg = "";
   
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
       if(!validate.validateNumber(age.getText())){
           age.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Invalid Age!\n";
       }
//     if(Integer.parseInt(age.getText().isEmpty() ? 0 : age.getText())>=100 ){
 //          age.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
 //          errorMsg += "Invalid Age[0-above]!\n";
  //    }
       if(gender.getSelectionModel().isEmpty()){
           gender.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Gender is required\n";
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
        gender.setItems(sex);
       reasonForHivTesting.setItems(res);
       finalResult.setItems(hivRes);
       htsModel.setItems(htsM);
       testReTest.setItems(tests);
       lactingWoman.setItems(yesno);
       testingEntryStream.setItems(clientSer);
       inPreArt.setItems(yesno);
       initiatedArt.setItems(yesno);
       inPreArt.getSelectionModel().select(1);
       initiatedArt.getSelectionModel().select(1);
       
    }    
}
