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
import com.itech.pangea.business.util.DateUtil;
import com.itech.pangea.business.util.UUIDGen;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.itech.pangea.sqliteConfig.PlaceID;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.itech.pangea.sqliteConnections.SQLiteQueries;
import com.itech.pangea.utils.DateFunctions;
import com.itech.pangea.validations.Validate;
import com.jfoenix.controls.JFXSpinner;
import java.io.IOException;
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
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Modality;
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
public class IndexCaseTestingController implements Initializable {
    
    SqliteDatabaseHandler handle;
    ResultSet rs;
    
    @FXML
    private JFXComboBox facility;
    
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
    private JFXSpinner saveP;
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
    ObservableList<Province> prov;
    ObservableList<District> dis;
    ObservableList fac;
    ObservableList<YesNo> yesno = FXCollections.observableArrayList(YesNo.values());
    
    AnnotationConfigApplicationContext acac;
    User user;
    String conStatus = "Offline";
    
    public void setUserNCtx(User user, AnnotationConfigApplicationContext acac, String conStatus) {
        this.user = user;
        this.acac = acac;
        //this.conStatus = conStatus;
        try {
            
            SQLiteQueries liteQueries = new SQLiteQueries();
            List<String> list = liteQueries.getFacility(user.getId());
            fac = FXCollections.observableArrayList(list);
            facility.setItems(fac);
        } catch (SQLException ex) {
            Logger.getLogger(IndexCaseTestingController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String sequentialNumber(Integer facilityId) throws SQLException, ParseException {
        SQLiteQueries queries = new SQLiteQueries();
        Integer lastInserId = queries.findLastInsertByUserAndFacility(user.getId().intValue(), facilityId);
        String sequentialNumber = "";
        if (lastInserId == 0) {
            sequentialNumber = "001";
        } else {
            Date date = DateFunctions.convertToLocalDate(queries.getDateCreated(lastInserId));
            Date today = new Date();
            String stringToday = DateUtil.fmt.format(today);
            String stringCreated = DateUtil.fmt.format(date);
           
            if (stringToday.equals(stringCreated)) {
                String lastSequentialNumber = queries.getSequentialNumber(lastInserId);
                int lastIndex = lastSequentialNumber.lastIndexOf("0");
                String firstPart = lastSequentialNumber.substring(0, lastIndex + 1);
                String lastPart = lastSequentialNumber.substring(lastIndex + 1, lastSequentialNumber.length());
                Integer numSequentialNumber = Integer.valueOf(lastPart);
                numSequentialNumber++;
                sequentialNumber = firstPart + String.valueOf(numSequentialNumber);
            } else {
                sequentialNumber = "001";
            }
        }
        return sequentialNumber;
    }
    
    public String generateUUID(Integer facility, Date date, User user, String seqNumber) {
        return facility + UUIDGen.getDate(date) + user.getId() + seqNumber;
    }
    
    @FXML
    private void onSelectedInitiatedOnArt(ActionEvent event) {
        if (initiatedOnArt.getSelectionModel().isSelected(1)) {
            reasonForNotInitiated.setDisable(false);
        } else {
            reasonForNotInitiated.setDisable(true);
        }
    }    
    
    public Date convertDate(LocalDate localDate) {
        if (localDate == null) {
            return null;
        } else {
            Date dateCon = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            return dateCon;
        }
    }
    
    @FXML
    private void clearIct(ActionEvent e) {
        clearFields();
    }
    
    public void clearFields() {
        // province.getSelectionModel().clearSelection();
        // district.getSelectionModel().clearSelection();
        numOfIndex.clear();
        facility.getSelectionModel().clearSelection();
        firstName.clear();
        lastName.clear();
        dateDiagnosed.setValue(null);
        artNumber.clear();
        indexContactNum.clear();
        initiatedOnArt.getSelectionModel().clearSelection();
        reasonForNotInitiated.clear();
        doesTheClientConsent.getSelectionModel().clearSelection();
        
    }
    
    @FXML
    private void saveIndexCaseTesting(ActionEvent e) throws SQLException, ParseException {
        //  String agree = (String) doesTheClientConsent.getSelectionModel().getSelectedItem();
        
        if (isInputValid()) {
            
            IndexCaseTestingForm ictf = new IndexCaseTestingForm();
            
            ictf.setFirstNameOfIndex(firstName.getText());
            ictf.setLastNameOfIndex(lastName.getText());
            ictf.setSequentialNumberOfIndex(numOfIndex.getText());
            ictf.setDateIndexTestedOrDiagnosed(dateDiagnosed.getValue() == null ? null : convertDate(dateDiagnosed.getValue()));            
            ictf.setIndexOIARTNumber(artNumber.getText());            
            ictf.setIndexContactNumber(indexContactNum.getText().isEmpty()? null : Long.parseLong(indexContactNum.getText()));            
            ictf.setReasonForNotBeingInitiated(reasonForNotInitiated.getText());            
            ictf.setCreatedBy(user);
            ictf.setModifiedBy(user);
            int ioa = 11;
            int cf = 11;
            if (initiatedOnArt.getSelectionModel().isEmpty()) {
                ictf.setInitiatedOnART(null);                
            } else {
                ictf.setInitiatedOnART((YesNo) initiatedOnArt.getSelectionModel().getSelectedItem());                
                ioa = ictf.getInitiatedOnART().getCode();
            }
            if (doesTheClientConsent.getSelectionModel().isEmpty()) {
                ictf.setConsentForListedContacts(null);                
            } else {
                ictf.setConsentForListedContacts((YesNo) doesTheClientConsent.getSelectionModel().getSelectedItem());
                cf = ictf.getConsentForListedContacts().getCode();
            }
            
            PlaceID placeID = new PlaceID();
            
            long disID = placeID.getDistrictIdFromFacility((String) facility.getSelectionModel().getSelectedItem());
            long provID = placeID.getProvinceFromDistrict(disID);
            int facID = placeID.getFacilityId((String) facility.getSelectionModel().getSelectedItem());
            String seqNumber = sequentialNumber(facID);
            ictf.setSequentialNumber(seqNumber);
            ictf.setUuid(generateUUID(facID, new Date(), user, seqNumber));
            ictf.setDateCreated(new Date());
            SQLiteQueries qLiteQueries = new SQLiteQueries();
            ictf.setId(qLiteQueries.getMaxid());
           
            String query = "Insert Into index_case_testing_form(iid, active, date_created, deleted, uuid, version, sequential_number,  age, appointment_date_for_contact,"
                    + "call_outcome, consent_for_listed_contacts, contact_address, contact_tested_date,date_called,"
                    + " date_visited, enrolled_into_care, first_name_of_index, gender, hiv_result,"
                    + "index_contact_number, indexoiartnumber, initiated_onart, last_name_of_index, location_of_test, name_of_contact,"
                    + "preferred_place_for_contacts_to_be_tested, reason_for_not_being_initiated, relation_ship_to_index, visit_outcome,"
                    + "created_by, modified_by, district, facility, province, art_number, date_index_tested_or_diagnosed, hiv_status_entry,"
                    + " if_tested_date_contact_tested, onart, referral_slip_number, referral_slip_returned,"
                    + "second_appointment_date_for_contact,sequential_number_of_contacts, sequential_number_of_index, third_appointment_date_for_contact, stat)"
                    + " Values('0','',"
                    + " '"+ictf.getDateCreated()+"',"
                    + " '',"
                    + "'"+ictf.getUuid()+"',"
                    + " '',"
                    + " '"+ictf.getSequentialNumber()+"',"
                    + " '',"
                    + " '',"
                    + "'',"
                    + " '" + cf + "',"
                    + "'',"
                    + " '',"
                    + "'',"
                    + " '',"
                    + "'', "
                    + "'" + ictf.getFirstNameOfIndex() + "',"
                    + "'',"
                    + " '',"
                    + "'" + ictf.getIndexContactNumber() + "',"
                    + " '" + ictf.getIndexOIARTNumber() + "',"
                    + "'" + ioa + "',"
                    + " '" + ictf.getLastNameOfIndex() + "',"
                    + "'',"
                    + " '',"
                    + "'',"
                    + " '" + ictf.getReasonForNotBeingInitiated() + "',"
                    + "'',"
                    + " '',"
                    + " '" + user.getId() + "',"
                    + " '" + user.getId() + "',"
                    + " '" + disID + "',"
                    + " '" + facID + "',"
                    + " '" + provID + "',"
                    + " '',"
                    + " '" + ictf.getDateIndexTestedOrDiagnosed() + "',"
                    + " '',"
                    + " '',"
                    + " '',"
                    + " '',"
                    + " '',"
                    + " '',"
                    + " '',"
                    + " '" + ictf.getSequentialNumberOfIndex() + "',"
                    + " '', '0')";
            if (handle.execAction(query)) {
                
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Notification");
                alert.setHeaderText("Success");
                alert.setContentText("Index Case Testing Saved Successfully");
                alert.showAndWait();
                if (ictf.getConsentForListedContacts().equals(YesNo.YES)) {
                    clearFields();                    
                    callContactList(e, ictf);                    
                } else {
                    clearFields();                    
                }

                //   }
            }
        }
    }
    
    public void callContactList(ActionEvent ev, IndexCaseTestingForm indexC) {
        Stage stage = new Stage();
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/ContactList.fxml");
            Parent root = loader.load();
            Long indexId= 0L;
            ContactListController cl = (ContactListController) loader.getController();
            cl.setUserNCtx(user, acac, indexId ,conStatus, indexC);
            Scene scene = new Scene(root);            
            stage.setTitle("Contact list");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
            stage.setScene(scene);
            stage.setResizable(false);
            stage.showAndWait();
            //     ((Node)(ev.getSource())).getScene().getWindow().hide();
            
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isInputValid() {
        Validate validate = new Validate();
        String errorMsg = "";
        
        if (facility.getSelectionModel().isEmpty()) {
            facility.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
            errorMsg += "Select Facility\n";            
        }
        if (firstName.getText() == null || firstName.getText().isEmpty()) {
            firstName.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
            errorMsg += "First Name is required\n";
        }
        if (!validate.validateTextOnly(firstName.getText())) {
            firstName.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
            errorMsg += "Invalid FirstName[Text Only]!\n";
        }
        if (!validate.validateTextOnly(lastName.getText())) {
            lastName.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
            errorMsg += "Invalid LastName[Text Only]!\n";
        }
        /*
       if(!validate.validateNumber(artNumber.getText())){
           artNumber.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Invalid Index OI/Art Number!\n";
       }*/
        if (!indexContactNum.getText().isEmpty() && !validate.validateNumber(indexContactNum.getText())) {
            indexContactNum.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
            errorMsg += "Invalid Index Contact Number!\n";
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //  prov = FXCollections.observableArrayList(provinceService.getAll());
        // province.setItems(prov);
        doesTheClientConsent.setItems(yesno);
        initiatedOnArt.setItems(yesno);
        handle = SqliteDatabaseHandler.getInstance();
    }
    
}
