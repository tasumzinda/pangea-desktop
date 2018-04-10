package com.itech.pangea.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itech.pangea.business.domain.Contact;
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
public class ContactListDialogController implements Initializable {

    
    
    
    
    

    
    AnnotationConfigApplicationContext acac;
    User user;
    String conStatus;
    Contact contact;
    public void setUserNCtx(User user, AnnotationConfigApplicationContext acac, String conStatus, Contact contact) {
        this.user = user;
        this.acac = acac;
        this.conStatus = conStatus;
        this.contact = contact;
    }
    @FXML
    private void  callButton(ActionEvent event){
        String call = "callCalled";
        try {
            Stage stage = new Stage();
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/CallDialog.fxml");
            Parent root = loader.load();
            
            CallVisitController callVisitController = (CallVisitController)loader.getController();
            callVisitController.setUserNCtx(user, acac, call, conStatus, contact);
            Scene scene = new Scene(root); 
            stage.setTitle("ID::"+ contact.getId() +" | Create Call For : " + contact.getNameOfContact());
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
           
           
        } catch (IOException ex) {
            Logger.getLogger(ContactListDialogController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    @FXML
    private void  visitButton(ActionEvent event){
        String visit = "visitCalled";
        try {
            Stage stage = new Stage();
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/VisitDialog.fxml");
            Parent root = loader.load();
            
            CallVisitController cVisitController = (CallVisitController)loader.getController();
            cVisitController.setUserNCtx(user, acac, visit, conStatus, contact);
            Scene scene = new Scene(root); 
            stage.setTitle("ID::"+ contact.getId() +" | Create Visit For : " + contact.getNameOfContact());
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
           
           
        } catch (IOException ex) {
            Logger.getLogger(ContactListDialogController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
