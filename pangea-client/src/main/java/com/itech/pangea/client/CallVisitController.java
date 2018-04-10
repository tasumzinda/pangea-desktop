/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.CallOutcome;
import com.itech.pangea.business.service.ContactService;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.itech.pangea.utils.DateFunctions;
import com.itech.pangea.validations.Validate;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import java.net.URL;
import java.sql.SQLException;
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
 * @author user
 */
@Component
public class CallVisitController implements Initializable {
     SqliteDatabaseHandler handler;
    @FXML
    private JFXButton cancelCallBtn;
    @FXML
    private JFXDatePicker dateCalled;
    @FXML
    private JFXComboBox callOutcome;
    @FXML
    private JFXButton cancelVisitBtn;
    @FXML
    private JFXDatePicker dateVisited;
    @FXML
    private JFXComboBox visitOutcome;
    @Resource
    private ContactService contactService;
    ObservableList callOutComeValues = FXCollections.observableArrayList(CallOutcome.values());
    ObservableList callOutComeV = FXCollections.observableArrayList(CallOutcome.values());
    AnnotationConfigApplicationContext acac;
    User user;
    String conStatus;
    Contact contact;
    Contact updateCon;
    Contact updateCall;
    String callvist;
    public void setUserNCtx(User user, AnnotationConfigApplicationContext acac, String callVisit, String conStatus, Contact contact) {
        this.user = user;
        this.acac = acac;
        this.conStatus = conStatus;
        this.contact = contact;
        this.callvist = callVisit;
        if(callVisit.equals("callCalled")){
            callOutcome.setItems(callOutComeValues);           
        }
        else{        
            visitOutcome.setItems(callOutComeV);
        }
    }
    
    @FXML
    private void  saveCallButton(ActionEvent event){
        if(isInputValidCall()){
        if(conStatus.equals("Online")){
            updateCall = contactService.get(contact.getId());
            updateCall.setDateCalled(dateCalled.getValue()==null ? null : DateFunctions.convertDate(dateCalled.getValue()));
            updateCall.setCallOutcome(callOutcome.getSelectionModel().isEmpty() ? null : (CallOutcome)callOutcome.getSelectionModel().getSelectedItem());
            contactService.save(updateCon);
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Success");
                  alert.setContentText("Visit Created Successfully");
                  alert.showAndWait();
        }
        else{
            try {
                updateCallForm();
            } catch (SQLException ex) {
                Logger.getLogger(CallVisitController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    @FXML
    private void  cancelCallButton(ActionEvent event){
        Stage stage = (Stage)cancelCallBtn.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void  saveVisitButton(ActionEvent event){
        if(isInputValidVisit()){
        if(conStatus.equals("Online")){
          updateCon = contactService.get(contact.getId());
          updateCon.setDateVisited(dateVisited.getValue() == null ? null : DateFunctions.convertDate(dateVisited.getValue()));
          updateCon.setVisitOutcome(visitOutcome.getSelectionModel().isEmpty() ? null : (CallOutcome) visitOutcome.getSelectionModel().getSelectedItem());
          contactService.save(updateCon);
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Success");
                  alert.setContentText("Visit Created Successfully");
                  alert.showAndWait();
        }
        else{
            try {
                updateVisitForm();
            } catch (SQLException ex) {
                Logger.getLogger(CallVisitController.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        }
        
    }
    
    public void updateCallForm() throws SQLException{
        int i;
        if(callOutcome.getSelectionModel().isEmpty()){
            i = 11;
        }
        else{
            CallOutcome cal = (CallOutcome) callOutcome.getSelectionModel().getSelectedItem();
            i = cal.getCode();
        }
        String dat = DateFunctions.convertDate(dateCalled.getValue()).toString();
        String query = "Update contact set call_outcome='"+i+"', date_called = '"+dat+"' where id = '"+contact.getId()+"'";
        if(handler.execAction(query)){
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Success");
                  alert.setContentText("Call Created Successfully");
                  alert.showAndWait();
        }
    }
    public void updateVisitForm() throws SQLException{
        int i;
        if(visitOutcome.getSelectionModel().isEmpty()){
            i = 11;
        }
        else{
            CallOutcome cal = (CallOutcome) visitOutcome.getSelectionModel().getSelectedItem();
            i = cal.getCode();
        }
        String dat = DateFunctions.convertDate(dateVisited.getValue()).toString();
        String query = "Update contact set date_visited = '"+dat+"', visit_outcome='"+i+"' where id = '"+contact.getId()+"'";
        if(handler.execAction(query)){
                  Alert alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Success");
                  alert.setContentText("visit Created Successfully");
                  alert.showAndWait();
        }
    }
    
    @FXML
    private void  cancelVisitButton(ActionEvent event){
        Stage stage = (Stage)cancelVisitBtn.getScene().getWindow();
        stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        handler = SqliteDatabaseHandler.getInstance();
        
        
        
    }    
    public boolean isInputValidCall(){
        
       String errorMsg = "";
       if(dateCalled.getEditor().getText().isEmpty()){
          dateCalled.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Date Called required!\n";         
       }
   
       if(callOutcome.getSelectionModel().isEmpty()){
          callOutcome.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Select Call Outcome\n";         
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
    public boolean isInputValidVisit(){
        
       String errorMsg = "";
       if(dateVisited.getEditor().getText().isEmpty()){
          dateVisited.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Date Visited Required!\n";         
       }
   
       if(visitOutcome.getSelectionModel().isEmpty()){
          visitOutcome.setStyle("-jfx-focus-color: #FF6347; -jfx-unfocus-color: #FF6347");
           errorMsg += "Select Visit Outcome\n";         
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
