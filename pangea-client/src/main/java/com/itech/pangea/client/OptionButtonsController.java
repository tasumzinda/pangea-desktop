/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.domain.HTSRegisterForm;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.service.DefaulterTrackingFormService;
import com.itech.pangea.business.service.HTSRegisterFormService;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
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
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Modality;
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
public class OptionButtonsController implements Initializable {
    SqliteDatabaseHandler handler;
    @Resource
    private HTSRegisterFormService hTSRegisterFormService;
    @Resource
    private DefaulterTrackingFormService defaulterTrackingFormService;
    
    AnnotationConfigApplicationContext acac;
    Long id;
    User user;
    String controllerType;
    String conStatus = "Offline";
    public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, Long id, String controllerType, String conStatus) {
        this.user = user;
        this.acac = acac;
        this.id = id;
        this.controllerType = controllerType;
      //  this.conStatus = conStatus;
       
    }
    @FXML
    private void editButton(ActionEvent event){
        if(controllerType.equals("callHts")){
            callEditHts(event);
        }
        else{
            callEditDefaulter(event);
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
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
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
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
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
        ((Node)(event.getSource())).getScene().getWindow().hide();
        System.err.println("===========================");
         System.err.println(id);
          System.err.println("===========================");
         if(controllerType.equals("callHts")){
           /* if(conStatus.equals("Online")){
                Alert al = new Alert(Alert.AlertType.CONFIRMATION);
                al.setTitle("Delete Dialog");
                al.setHeaderText("Delete HTS");
                al.setContentText("Are You Sure?");
                Optional<ButtonType> action = al.showAndWait();
                if(action.get() == ButtonType.OK){
                     HTSRegisterForm hts = hTSRegisterFormService.get(id);
                     hTSRegisterFormService.delete(hts);
                     Alert a = new Alert(Alert.AlertType.INFORMATION);
                        a.setTitle("Notification");
                        a.setHeaderText("Success");
                        a.setContentText("Delete Successfully");
                        a.showAndWait();
                }
            }
            else{*/
                deleteHts();
        //    }
        }
         else{
             if(conStatus.equals("Online")){
                Alert al = new Alert(Alert.AlertType.CONFIRMATION);
                al.setTitle("Delete Dialog");
                al.setHeaderText("Delete Defaulter");
                al.setContentText("Are You Sure?");
                Optional<ButtonType> action = al.showAndWait();
                if(action.get() == ButtonType.OK){
                      DefaulterTrackingForm dtf = defaulterTrackingFormService.get(id);
                      defaulterTrackingFormService.delete(dtf);
                      Alert a = new Alert(Alert.AlertType.INFORMATION);
                            a.setTitle("Notification");
                            a.setHeaderText("Success");
                            a.setContentText("Delete Successfully");
                            a.showAndWait();
                }
            }
             else{
                  deleteDefaulter();
             }
         }
    }
    public void deleteHts(){
        String query = "Delete From htsregister_form where id='"+id+"'";
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Dialog");
        alert.setHeaderText("Delete HTS");
        alert.setContentText("Are You Sure?");
        Optional<ButtonType> action = alert.showAndWait();
        if(action.get() == ButtonType.OK){
          if(handler.execAction(query)){
               Alert a = new Alert(Alert.AlertType.INFORMATION);
                  a.setTitle("Notification");
                  a.setHeaderText("Success");
                  a.setContentText("Delete Successfully");
                  a.showAndWait();
          }
        }
        
    }
    public void deleteDefaulter(){
        String query = "Delete From defaulter_tracking_form where id='"+id+"'";
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Dialog");
        alert.setHeaderText("Delete Defaulter");
        alert.setContentText("Are You Sure?");
        Optional<ButtonType> action = alert.showAndWait();
        if(action.get() == ButtonType.OK){
          if(handler.execAction(query)){
               Alert a = new Alert(Alert.AlertType.INFORMATION);
                  a.setTitle("Notification");
                  a.setHeaderText("Success");
                  a.setContentText("Delete Successfully");
                  a.showAndWait();
          }
        }
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        handler = SqliteDatabaseHandler.getInstance();
    }    
    
}
