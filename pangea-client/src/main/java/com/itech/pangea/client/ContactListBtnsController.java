/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.User;
import com.jfoenix.controls.JFXButton;
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
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * FXML Controller class
 *
 * @author user
 */
@Component
public class ContactListBtnsController implements Initializable {

    
    @FXML
    private JFXButton addBtn;
    @FXML
    private JFXButton listBtn;
    
    AnnotationConfigApplicationContext acac;
    Long id;
    User user;
    String consent;
    String conStatus;
    IndexCaseTestingForm idx;
    public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, Long id,String consent,IndexCaseTestingForm idx, String conStatus) {
        this.user = user;
        this.acac = acac;
        this.id = id;
        this.idx = idx;
        this.consent = consent;
        this.conStatus = conStatus;
        if(consent.equalsIgnoreCase("Yes")){
            addBtn.setDisable(false);
            listBtn.setDisable(false);
        }
        
}
    
   
    @FXML
    private void editButton(ActionEvent event){
        Stage stage = new Stage();
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/EditIndexCase.fxml");
            Parent root = loader.load();
            
            EditIndexCaseController eIct = (EditIndexCaseController)loader.getController();
            eIct .setUserNCtx(user, acac, id, conStatus);
            stage.initModality(Modality.APPLICATION_MODAL);
            Scene scene = new Scene(root); 
            stage.setTitle("Edit Index Casing Form");
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
            stage.setScene(scene);
            stage.setResizable(false);
            
            stage.showAndWait();
           
           
        } catch (IOException ex) {
            Logger.getLogger(ContactListBtnsController.class.getName()).log(Level.SEVERE, null, ex);
        }
         ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    @FXML
    private void deleteButton(ActionEvent event){
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    @FXML
    private void addButton(ActionEvent event){
       
        Stage stage = new Stage();
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/ContactList.fxml");
            Parent root = loader.load();
            
            ContactListController cl = ( ContactListController)loader.getController();
            cl.setUserNCtx(user, acac, conStatus, idx);
            Scene scene = new Scene(root); 
            stage.setTitle("Contact list");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
            stage.setScene(scene);
            stage.setResizable(false);
            stage.showAndWait();
           
        } catch (IOException ex) {
            Logger.getLogger(ContactListBtnsController.class.getName()).log(Level.SEVERE, null, ex);
        }
         ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    @FXML
    private void listButton(ActionEvent event){
        Stage stage = new Stage();
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/ListContacts.fxml");
            Parent root = loader.load();
            
            ListContactsController cl = (ListContactsController)loader.getController();
            cl.setUserNCtx(user, acac, conStatus, idx);
            Scene scene = new Scene(root); 
            stage.setTitle("Contact list");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
            stage.setScene(scene);
            stage.setResizable(false);
            stage.showAndWait();
           
        } catch (IOException ex) {
            Logger.getLogger(ContactListBtnsController.class.getName()).log(Level.SEVERE, null, ex);
        }
         ((Node)(event.getSource())).getScene().getWindow().hide();
    }



 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
