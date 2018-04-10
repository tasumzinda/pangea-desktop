package com.itech.pangea.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.HTSRegisterForm;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.util.MentorRole;
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
import com.itech.pangea.sqliteConfig.SendData;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
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
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
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
public class HomeController implements Initializable {

    SqliteDatabaseHandler handler;
    AnnotationConfigApplicationContext acac;
    User user;
    ResultSet rs;
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
    private static String conStat;
    private static Boolean lOff;
    private static Boolean lOn;
    Mentor mentor;
    public void setUserNCtx(User user, Mentor mentor, AnnotationConfigApplicationContext acac, String conStatus) throws SQLException, ParseException {
        this.user = user;
        this.mentor = mentor;
        this.acac = acac;
        this.conStatus = conStatus;
        

        menuBtn.setText(user.getDisplayName());
        if (conStatus.equals("Online")) {
            onLine.setVisible(true);           
            processSendDataTransction(conStatus);           
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
            htsController.setUserNCtx(user, acac, conStatus);
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
            deController.setUserNCtx(user, acac, conStatus);
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
            indexController.setUserNCtx(user, acac, conStatus);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void htsRegisterTable(ActionEvent event) {
        iconLhts.setVisible(true);
        iconLdtf.setVisible(false);
        iconLict.setVisible(false);
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/HtSTable.fxml");
            AnchorPane root = loader.load();
            HtSTableController htsTableController = (HtSTableController) loader.getController();
            htsTableController.setUserNCtx(user, mentor, acac, conStatus);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void defaulterTable(ActionEvent event) {
        iconLhts.setVisible(false);
        iconLdtf.setVisible(true);
        iconLict.setVisible(false);
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/DefaulterList.fxml");
            AnchorPane root = loader.load();
            DefaulterListController defaulterListController = (DefaulterListController) loader.getController();
            defaulterListController.setUserNCtx(user, acac, conStatus);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void indexCasingListTable(ActionEvent event) {
        iconLhts.setVisible(false);
        iconLdtf.setVisible(false);
        iconLict.setVisible(true);
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/IndexCasingList.fxml");
            AnchorPane root = loader.load();
            IndexCasingListController indexCasingListController = (IndexCasingListController) loader.getController();
            indexCasingListController.setUserNCtx(user, acac, conStatus);
            mainLayout.setCenter(root);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void logout(ActionEvent event) {
       conStatus();
        Stage stage = new Stage();
        Stage thisStage = (Stage) menuBtn.getScene().getWindow();
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/Login.fxml");
            Parent root = loader.load();

            LoginController loginController = (LoginController) loader.getController();
            loginController.setAcac(acac, lOn, lOff, conStat);
           // loginController.setAcac(acac);
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
    private void syncDatabase(ActionEvent event) throws SQLException, ParseException {
        sendHtsForm(conStatus);
        sendDtfForm(conStatus);
        sendIctForm(conStatus);

    }

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        handler = SqliteDatabaseHandler.getInstance();
    }

    public void sendHtsForm(String status) throws SQLException, ParseException {
        System.out.println(status);
        if (status.equals("Online")) {
            SendData sendData = new SendData();
            List<Long> ids = sendData.htsIds();
            if (ids.isEmpty()) {
                return;
            }

            for (Long id : ids) {
                HTSRegisterForm hts;
                hts = sendData.htsFormQuery(id);
                System.err.println("******************************");
                System.err.println("District::" + hts.getDistrict().getId());
                System.err.println("******************************");
                hts.setFacility(facilityService.get(hts.getFacility().getId()));
                hts.setDistrict(districtService.get(hts.getDistrict().getId()));
                hts.setProvince(provinceService.get(hts.getProvince().getId()));
                hTSRegisterFormService.save(hts);

            }
            String query = "Delete From htsregister_form";
            if (handler.execAction(query)) {
                notification.setVisible(true);
            }

        }
    }

    public void sendDtfForm(String status) throws SQLException, ParseException {

        if (status.equals("Online")) {
            SendData sendData = new SendData();
            List<Long> idz = sendData.dtfIds();
            if (idz.isEmpty()) {
                return;
            }
            for (Long id : idz) {
                DefaulterTrackingForm dtf;
                dtf = sendData.dtfFormQuery(id);
                dtf.setDistrict(districtService.get(dtf.getDistrict().getId()));
                dtf.setFacility(facilityService.get(dtf.getFacility().getId()));  
                dtf.setProvince(provinceService.get(dtf.getProvince().getId()));
                defaulterTrackingFormService.save(dtf);
            }
            String query = "Delete From defaulter_tracking_form";
            if (handler.execAction(query)) {
                notification.setVisible(true);
            }
        }
    }

    public void sendIctForm(String status) throws SQLException, ParseException {
        System.out.println(status);
        if (status.equals("Online")) {
            SendData sendData = new SendData();
            List<Long> idict = sendData.ictIds();
            if (idict.isEmpty()) {
                return;
            }
            for (Long id : idict) {
                IndexCaseTestingForm ict;
                ict = sendData.ictFormQuery(id);
                ict.setDistrict(districtService.get(ict.getDistrict().getId()));
                ict.setFacility(facilityService.get(ict.getFacility().getId()));  
                ict.setProvince(provinceService.get(ict.getProvince().getId()));
                ict.setCreatedBy(userService.get(ict.getCreatedBy().getId()));
                ict.setModifiedBy(userService.get(ict.getModifiedBy().getId()));
                IndexCaseTestingForm idxForContact = indexCaseTestingFormService.save(ict);
                List<Long> listC = sendData.allContactsOfThisIndex(id);               
                if(!listC.isEmpty()){
                    for(Long idForContact : listC){
                        
                        Contact contact;
                        contact = sendData.contactFormQuery(idForContact, id);
                        contact.setCreatedBy(userService.get(ict.getCreatedBy().getId()));
                        contact.setModifiedBy(userService.get(ict.getModifiedBy().getId()));
                        contact.setIndexCaseTestingForm(idxForContact);
                        contactService.save(contact);                      
                       String qu = "Delete from contact where id='"+idForContact+"'";
                        handler.execAction(qu);
                    }
                }
              String query = "Delete From index_case_testing_form where id='"+id+"'"; 
              
              handler.execAction(query);
            }      
                notification.setVisible(true);         
        }
    }
    public void conStatus() {
       try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
            String jdbcUrl = "jdbc:mysql://localhost:3306/itechdb";
            String usern = "root";
            String pass ="";
           //String usern = "itechadmin";
           //String pass = "itech2017";
           Connection con = DriverManager.getConnection(jdbcUrl, usern, pass);
           if (con != null) {
               
               lOn = true;
               lOff = false;
               conStat = "Online";
               
           } else if (con == null) {
               lOn = false;
               lOff = true;
               conStat = "Offline";
               
           }
       } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
               lOn = false;
               lOff = true;
               conStat = "Offline";
           Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
       } 
    } 
    public void processSendDataTransction(String st){
        Task<Void> taskProcess = new Task<Void>(){
            @Override
            protected Void call() throws Exception {
                sendHtsForm(st);
                sendDtfForm(st);
                sendIctForm(st);
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

}
