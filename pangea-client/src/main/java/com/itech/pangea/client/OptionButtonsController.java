/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * FXML Controller class
 *
 * @author kanaz
 */
@Component
public class OptionButtonsController implements Initializable {

    
    AnnotationConfigApplicationContext acac;
    Long id;
    User user;
    String controllerType;
    String conStatus;
    public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, Long id, String controllerType, String conStatus) {
        this.user = user;
        this.acac = acac;
        this.id = id;
        this.controllerType = controllerType;
        this.conStatus = conStatus;
       
    }
    @FXML
    private void editButton(ActionEvent event){
        if(controllerType.equals("callHts")){
            callEditHts(event);
        }
        else if(controllerType.equals("callDefaulter")){
            callEditDefaulter(event);
        }
        else{
            callEditIndex(event);
        }
    }
    public void callEditHts(ActionEvent event){
        System.out.println(conStatus);
        Stage stage = new Stage();
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/EditHtsRegister.fxml");
            Parent root = loader.load();
            
            EditHtsRegisterController editHtsRegisterController = (EditHtsRegisterController)loader.getController();
            editHtsRegisterController.setUserNCtx(user, acac, id, conStatus);
            Scene scene = new Scene(root); 
            stage.setTitle("Edit HTS Register");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.showAndWait();
            ((Node)(event.getSource())).getScene().getWindow().hide();
           
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void callEditDefaulter(ActionEvent event){
        Stage stage = new Stage();
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/EditDefaulterTrackingForm.fxml");
            Parent root = loader.load();
            
            EditDefaulterTrackingFormController edtfc = (EditDefaulterTrackingFormController)loader.getController();
            edtfc.setUserNCtx(user, acac, id, conStatus);
            Scene scene = new Scene(root); 
            stage.setTitle("Edit Defaulter Tracking Form");
            stage.initModality(Modality.APPLICATION_MODAL);
           
            stage.setScene(scene);
            stage.setResizable(false);
            stage.showAndWait();
            ((Node)(event.getSource())).getScene().getWindow().hide();
           
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void callEditIndex(ActionEvent event){
        Stage stage = new Stage();
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/EditIndexCase.fxml");
            Parent root = loader.load();
            
            EditIndexCaseController eIct = (EditIndexCaseController)loader.getController();
            eIct .setUserNCtx(user, acac, id, conStatus);
            stage.initModality(Modality.APPLICATION_MODAL);
            Scene scene = new Scene(root); 
            stage.setTitle("Edit Index Casing Form");
            stage.setScene(scene);
            stage.setResizable(false);
            
            stage.showAndWait();
            ((Node)(event.getSource())).getScene().getWindow().hide();
           
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void deleteButton(ActionEvent event){
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
