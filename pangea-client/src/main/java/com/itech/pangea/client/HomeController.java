package com.itech.pangea.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.service.ContactService;
import com.itech.pangea.business.service.DefaulterTrackingFormService;
import com.itech.pangea.business.service.DistrictService;
import com.itech.pangea.business.service.FacilityService;
import com.itech.pangea.business.service.HTSRegisterFormService;
import com.itech.pangea.business.service.IndexCaseTestingFormService;
import com.itech.pangea.business.service.MentorService;
import com.itech.pangea.business.service.ProvinceService;
import com.itech.pangea.business.service.UserService;
import com.jfoenix.controls.JFXProgressBar;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.itech.pangea.sqliteConnections.UpdateNewRecords;
import com.itech.pangea.utils.AppRestart;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSpinner;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.annotation.Resource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * FXML Controller class
 *
 * @author Admin
 */
@Component
public class HomeController implements Initializable {

    SqliteDatabaseHandler handler;
    AnnotationConfigApplicationContext acac;
    User user;
    ResultSet rs;
    @FXML
    private Label totalNewRecords;
    @FXML
    private JFXSpinner syncSpinner;
    
   
    @FXML
    private MenuButton menuBtn;
    @FXML
    private Label onLine;
    @FXML
    private Label offLine;
    @FXML
    private Label notification;
    @FXML
    private BorderPane mainLayout;
    @FXML
    private JFXProgressBar fxmlProgressBar;
    @FXML
    private VBox acc;
    @FXML
    private FontAwesomeIconView iconHts;
    @FXML
    private FontAwesomeIconView iconDtf;
    @FXML
    private FontAwesomeIconView iconIct;
    @FXML
    private FontAwesomeIconView iconLhts;
    @FXML
    private FontAwesomeIconView iconLdtf;
    @FXML
    private FontAwesomeIconView iconLict;
    @FXML
    private FontAwesomeIconView  iconList;
    @FXML
    private JFXButton syncBtn;
   
    @Resource
    private HTSRegisterFormService hTSRegisterFormService;
    @Resource
    private DefaulterTrackingFormService defaulterTrackingFormService;
    @Resource
    private IndexCaseTestingFormService indexCaseTestingFormService;
    @Resource
    private MentorService mentorService;
    @Resource
    private DistrictService districtService; 
    @Resource
    private FacilityService facilityService;
    @Resource
    private ProvinceService provinceService;
    @Resource
    private UserService userService;
    @Resource
    private ContactService contactService;

    String conStatus;
    String statusOffline = "Offline";
  //  private static String conStat;
    private static Boolean lOff;
    private static Boolean lOn;
    Mentor mentor;
    public void setUserNCtx(User user, Mentor mentor, AnnotationConfigApplicationContext acac, String conStatus) throws SQLException, ParseException {
        this.user = user;
        this.mentor = mentor;
        this.acac = acac;
        this.conStatus = conStatus;
        menuBtn.setText(user.getDisplayName().toUpperCase());
        if (conStatus.equals("Online")) {
            onLine.setVisible(true);           
            
        } else {
            offLine.setVisible(true);
        }
    }

    @FXML
    private void viewHts(ActionEvent event) throws IOException {
        iconHts.setVisible(true);
        iconDtf.setVisible(false);
        iconIct.setVisible(false);
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/HTSRegister.fxml");
            AnchorPane root = loader.load();
            HTSRegisterController htsController = (HTSRegisterController) loader.getController();
            htsController.setUserNCtx(user, acac, statusOffline);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // loadFxml("/fxml/HTSRegister.fxml"); 
    }

    @FXML
    private void viewDefaulterTrForm(ActionEvent event) {
        iconDtf.setVisible(true);
        iconHts.setVisible(false);
        iconIct.setVisible(false);
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/DefaulterTrackingForm.fxml");
            AnchorPane root = loader.load();
            DefaulterTrackingFormController deController = (DefaulterTrackingFormController) loader.getController();
            deController.setUserNCtx(user, acac, statusOffline);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    private void viewIndexCasingForm(ActionEvent event) {
        iconDtf.setVisible(false);
        iconHts.setVisible(false);
        iconIct.setVisible(true);
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/IndexCaseTesting.fxml");
            AnchorPane root = loader.load();
            IndexCaseTestingController indexController = (IndexCaseTestingController) loader.getController();
            indexController.setUserNCtx(user, acac, statusOffline);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
           
           @FXML
           private void syncAction(ActionEvent event){
                if(conStatus.equals("Offline")){
                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Error Encountered");
                  alert.setContentText("Network Unavailable");
                  alert.showAndWait(); 
               }
                else if(Integer.parseInt(totalNewRecords.getText())<=0){
                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Error Encountered");
                  alert.setContentText("Nothing To Sync");
                  alert.showAndWait();
               }
              
               else{
               syncBtn.setDisable(true);
               syncSpinner.setVisible(true);
               
               Task<AnnotationConfigApplicationContext> taskProcess = new Task<AnnotationConfigApplicationContext>(){
                   @Override
                   protected AnnotationConfigApplicationContext call() throws Exception {
                       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);     
                       return ctx;
                    }
                 };
                 taskProcess.setOnSucceeded((WorkerStateEvent e) -> {
                     
                     Platform.runLater(() -> {
                         syncSpinner.setVisible(false);
                         
                   try {                               
                        Stage stage = new Stage();
                        AnnotationConfigApplicationContext ctx = taskProcess.getValue();
                        FXMLLoader loader = ctx.getBean(FXMLLoaderProvider.class).getLoader("/fxml/LoadingDialog.fxml");
                        Parent root = loader.load();
                        LoadingDialogController  loadingDialog = (LoadingDialogController)loader.getController();
                        loadingDialog.setUserNConStatus(user, conStatus);
                        Scene scene = new Scene(root);
                        stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
                        stage.setTitle("ITECH");
                        stage.setScene(scene);
                        stage.setResizable(false);
                        stage.initStyle(StageStyle.UNDECORATED);
                        stage.showAndWait();
                               
                    } catch (IOException ex) {
                        Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
                    }    catch (Exception ex) {
                             Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
                         }
                   Platform.runLater(() -> {
                        syncSpinner.setVisible(false);
                        syncBtn.setDisable(false);
                         });
                  
                     });
                 });
                 taskProcess.setOnFailed((WorkerStateEvent e) -> {
                          syncBtn.setDisable(false);  
                  });
                Thread thread = new Thread(taskProcess);
                thread.setDaemon(true);
                thread.start();
                    
           }
           }

    @FXML
    private void htsRegisterTable(ActionEvent event) {
        iconLhts.setVisible(true);
        iconLdtf.setVisible(false);
        iconLict.setVisible(false);
        iconList.setVisible(false);
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/HtSTable.fxml");
            AnchorPane root = loader.load();
            HtSTableController htsTableController = (HtSTableController) loader.getController();
            htsTableController.setUserNCtx(user, mentor, acac, statusOffline);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void defaulterTable(ActionEvent event) {
        iconList.setVisible(false);
        iconLhts.setVisible(false);
        iconLdtf.setVisible(true);
        iconLict.setVisible(false);
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/DefaulterList.fxml");
            AnchorPane root = loader.load();
            DefaulterListController defaulterListController = (DefaulterListController) loader.getController();
            defaulterListController.setUserNCtx(user, acac, statusOffline);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void indexCasingListTable(ActionEvent event) {
        iconList.setVisible(false);
        iconLhts.setVisible(false);
        iconLdtf.setVisible(false);
        iconLict.setVisible(true);
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/IndexCasingList.fxml");
            AnchorPane root = loader.load();
            IndexCasingListController indexCasingListController = (IndexCasingListController) loader.getController();
            indexCasingListController.setUserNCtx(user, acac, statusOffline);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @FXML
    private void viewContactList(ActionEvent event){
         iconList.setVisible(true);
         iconLhts.setVisible(false);
         iconLdtf.setVisible(false);
         iconLict.setVisible(false);
         try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/AllContactList.fxml");
            AnchorPane root = loader.load();
            AllContactListController allListController = (AllContactListController) loader.getController();
            allListController.setUserNCtx(user, acac, statusOffline);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void logout(ActionEvent event) {
      // conStatus();
        Stage stage = new Stage();
        Stage thisStage = (Stage) menuBtn.getScene().getWindow();
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/Login.fxml");
            Parent root = loader.load();

            LoginController loginController = (LoginController) loader.getController();
            loginController.setAcac(acac, lOn, lOff, conStatus);
            Scene scene = new Scene(root);
            stage.setTitle("ITECH");
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
            stage.setScene(scene);
            stage.show();
            thisStage.close();

        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void exitApp(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

    
    
    @FXML
    private void onMouseEnt(MouseEvent e){
        //countNewRecords();
        if(conStatus.equals("Offline")){
        countNewRecords();
        checkConnectionOnline();
        }
        else{
        countNewRecords();    
        conStatus();
        }
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        handler = SqliteDatabaseHandler.getInstance();
        countNewRecords();
    }


   
   
   /*
    public void processSendDataTransction(String st) throws Exception{
       Task<Void> taskProcess = new Task<Void>(){
           @Override
         protected Void call() throws Exception {
                sendHtsForm(st);
                sendDtfForm(st);
                sendIctForm(st);
                newContactsOfexistingIndex();
                  syncIndex();
                  syncContact();
            //    syncHts();
            //   syncDefaulter();
            //    syncIndex();
            //    syncContact();
     
             return null;
           }
        
         };
        taskProcess.setOnSucceeded((WorkerStateEvent e) -> {
            
        });
        taskProcess.setOnFailed((WorkerStateEvent e) -> {
            
                  Alert alert = new Alert(Alert.AlertType.ERROR);
                  alert.setTitle("Notification");
                  alert.setHeaderText("Error Encountered");
                  alert.setContentText("Failed to Update:\nCheck Internet Connection");
                  alert.showAndWait();
        });
        Thread thread = new Thread(taskProcess);
        thread.setDaemon(true);
        thread.start();
    }
    */
    public void countNewRecords(){ 
        acc.setDisable(true);
        Task<Integer> t = new UpdateNewRecords();
        t.setOnSucceeded((event) -> {
              int tot = t.getValue();             
              totalNewRecords.setText(String.valueOf(tot));
              acc.setDisable(false);
        });
        t.setOnFailed((event) -> {
            acc.setDisable(false);
        });
        new Thread(t).start();
    }
    
    public void conStatus() {
        
        Task<Connection> tas = new ServerHandler();
        
        tas.setOnSucceeded((event) -> {
            Connection con = tas.getValue();
            
                 if (con != null) {           
                    lOn = true;
                    lOff = false;
                    conStatus = "Online";    
                    onLine.setVisible(true); 
                    offLine.setVisible(false);
                   }
                 else{
                    lOn = false;
                    lOff = true;
                    conStatus = "Offline";      
                    offLine.setVisible(true);
                    onLine.setVisible(false); 
                   }
                  acc.setDisable(false);
          });
        tas.setOnFailed((event) -> {
                    lOn = false;
                    lOff = true;
                    conStatus = "Offline";   
                    offLine.setVisible(true);
                    onLine.setVisible(false); 
                    acc.setDisable(false);
        });   
        new Thread(tas).start();
       
    } 
    public void checkConnectionOnline(){
        acc.setDisable(true);
        Task<Connection> tas = new ServerHandler();
        
        tas.setOnSucceeded((event) -> {           
        Connection con = tas.getValue();
        if(con!=null){
                   // lOn = false;
                    lOn = true;
                    lOff = false;
                    conStatus = "Online";    
                    onLine.setVisible(true); 
                    offLine.setVisible(false);
                /* if(Integer.parseInt(totalNewRecords.getText())>0){
                   conStatus = "Offline";  
                  Alert al = new Alert(Alert.AlertType.CONFIRMATION);
                    al.setTitle("Notification");
                    al.setHeaderText("Network Connection Available");
                    al.setContentText("Restart Application");
                    Optional<ButtonType> action = al.showAndWait();
                    if(action.get() == ButtonType.OK){
                       try {
                    
                                 AppRestart.restartApplication();
                       }
                        catch (IOException ex) {
                           Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
                       }
      }  
        }*/
        }
        else{
                    lOn = false;
                    lOff = true;
                    conStatus = "Offline";      
                    offLine.setVisible(true);
                    onLine.setVisible(false); 
        }
        acc.setDisable(false);
        });
        
        new Thread(tas).start();
       
    }

}
