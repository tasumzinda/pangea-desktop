/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.MentorRole;
import com.itech.pangea.business.service.DistrictService;
import com.itech.pangea.business.service.FacilityService;
import com.itech.pangea.business.service.MentorService;
import com.itech.pangea.business.service.ProvinceService;
import com.itech.pangea.business.service.UserService;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.itech.pangea.sqliteConnections.SaveSqlite;
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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.annotation.Resource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * FXML Controller class
 *
 * @author Adminextends Presentation implements Observer
 */
@Component
public class LoginController implements Initializable {

    SqliteDatabaseHandler handle;
    AnnotationConfigApplicationContext acac;
    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField pwd;
   
    
    @FXML
    private JFXButton useBtn;
    @FXML
    private JFXButton testBtn;
    @FXML
    private JFXButton btnCancel;
    
   
    @FXML
    private Label lblOffline;
    @FXML
    private Label lblOnline;
    @FXML
    private Label stat;
    
   

    @FXML
    private JFXProgressBar progressBar;
    @FXML
    private JFXButton loginBtn;
    @FXML
    private Label logInfo;
    

    @Resource
    UserService userService;
    @Resource
    private MentorService mentorService;
    @Resource
    private DistrictService districtService;
    @Resource
    private FacilityService facilityService;
    @Resource
    private ProvinceService provinceService;
    
    Connection conn;
    private String conSta;
    private Boolean lOff;
    private Boolean lOn;
    public void setAcac(AnnotationConfigApplicationContext acac, Boolean onL, Boolean ofL, String st) {
   // public void setAcac(AnnotationConfigApplicationContext acac){
                this.acac = acac;
                this.conSta = st;
                this.lOff = ofL;
                this.lOn = onL;
                lblOnline.setVisible(onL);
                lblOffline.setVisible(ofL);
                stat.setText(st);
                System.err.println("+++++++++++++++++++++++++==");
                System.err.println(st + "  "+ onL + "  " + ofL);
                System.err.println("+++++++++++++++++++++++++==");
    }

    @FXML
    private void cancelMethod(ActionEvent event) {
        Platform.exit();
    }

    public void conStatus() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/itechdb";
        String user = "root";
        String pass ="";
      // String user = "itechadmin";
      // String pass = "itech2017";
      
        Task<Connection> task = new Task<Connection>() {
            @Override
            protected Connection call() throws Exception {
                return (Connection) DriverManager.getConnection(jdbcUrl, user, pass);
            }
        };
        task.setOnSucceeded((WorkerStateEvent e) -> {
            
            Connection con = task.getValue();
            if (con != null) {
              
                lblOnline.setVisible(true);
                lblOffline.setVisible(false);
                stat.setText("Online");

            } else if (con == null) {
                
                lblOffline.setVisible(true);
                lblOnline.setVisible(false);
                stat.setText("Offline");
            }
        });
        task.setOnFailed((WorkerStateEvent e) -> {
      
            lblOffline.setVisible(true);
            lblOnline.setVisible(false);
            stat.setText("Offline");
        });

        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();
    }

    @FXML
    private void LoginPressed(ActionEvent event) {
        //conn = SqliteConnect.sqlConnect();
        if (username.getText().isEmpty() || pwd.getText().isEmpty()) {
            logInfo.setText("Fill Required Fields!!!");
            return;
        }
        if (stat.getText().equals("Online")) {
            onlineLogin(event);
        } else {
            offlineLogin(event);
        }

    }

    public void onlineLogin(ActionEvent event) {
        progressBar.setVisible(true);
        loginBtn.setDisable(true);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        Task<User> task = new Task<User>() {
            @Override
            protected User call() throws Exception {
               User user = userService.findByUserName(username.getText());
                String savedPassword = user.getPassword();
                String enteredPassword = pwd.getText();
                if (encoder.matches(enteredPassword, savedPassword)) {
                    return userService.findByUserName(username.getText());
                }
                return null;
            }
        };
        task.setOnSucceeded((WorkerStateEvent e) -> {
            loginBtn.setDisable(true);
            User user = task.getValue();

            if (user == null) {
                progressBar.setVisible(false);
                loginBtn.setDisable(false);
                logInfo.setText("Incorrect Username/Password");

            } else {
                logInfo.setStyle("-fx-text-fill: #276696");
                logInfo.setText("Login Successful, wait a moment....");

                try {
                    SaveSqlite saveSqlite = new SaveSqlite();
                    saveSqlite.createUser(user);
                   
                    Mentor mentor = mentorService.getByEmail(user.getUserName());
                    if(mentor == null){
                       loadFxml("/fxml/Home.fxml", user, mentor); 
                    }
                    else{
                    List<Facility> facilitys = getFacilities(mentor.getId());
                    List<Province> p = provinceService.getAll();
                    List<District> d = districtService.getAll();
                    if(facilitys == null){
                        for(Province pr : p){
                        saveSqlite.saveProvince(pr);
                              }
                        for(District di : d){
                        saveSqlite.saveDistrict(di);
                        }
                      loadFxml("/fxml/Home.fxml", user, mentor);
                    }else{                       
                        for(Province pr : p){
                        saveSqlite.saveProvince(pr);
                              }
                         for(District di : d){
                        saveSqlite.saveDistrict(di);
                        }
                         for (Facility f : facilitys) {          
                            saveSqlite.saveFacility(f, user.getId());          
                          }
                      loadFxml("/fxml/Home.fxml", user, mentor);
                    }
                    
                   
                    
                    }
                } catch (ParseException | SQLException ex) {
                    logInfo.setText("Error Encounted...");
                    progressBar.setVisible(false);
                    loginBtn.setDisable(false);
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                } 
                progressBar.setVisible(false);
                loginBtn.setDisable(false);

                ((Node) (event.getSource())).getScene().getWindow().hide();
            }
        });
        task.setOnFailed((WorkerStateEvent e) -> {
            progressBar.setVisible(false);
            loginBtn.setDisable(false);
            logInfo.setText("Connection Error");
        });
        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();
            progressBar.setVisible(false);
            loginBtn.setDisable(false);
    }

    public void offlineLogin(ActionEvent event) {
        progressBar.setVisible(true);
        loginBtn.setDisable(true);
         BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String query = "Select * From user where user_name='" + username.getText() + "'";
        Task<ResultSet> task = new Task<ResultSet>() {
            @Override
            protected ResultSet call() throws Exception {
               ResultSet rrs =  handle.execQuery(query);
                while(rrs.next()) {
                String savedPassword = rrs.getString("password");
                String enteredPassword = pwd.getText();
                 if (encoder.matches(enteredPassword, savedPassword)) {
                    return handle.execQuery(query); 
                 }   
                }
               return null;
            }
        };
        
        task.setOnSucceeded((WorkerStateEvent e) -> {
            User user = new User();
            Mentor mentor = new Mentor();
            boolean flag = false;
            try {
                ResultSet rs = task.getValue();
                if (rs == null) {
                    progressBar.setVisible(false);
                    loginBtn.setDisable(false);
                    logInfo.setText("Incorrect Username/Password");
                    return;
                } else {
                    while (rs.next()) {
                        long userid = rs.getLong("uid");
                        String firstname = rs.getString("first_name");
                        String lastname = rs.getString("last_name");
                        //int userLevel = rs.getInt("user_level");
                        user.setId(userid);
                        user.setFirstName(firstname);
                        user.setLastName(lastname);

                        loadFxml("/fxml/Home.fxml", user, mentor);
                        progressBar.setVisible(false);
                        loginBtn.setDisable(false);
                        flag = true;
                       ((Node) (event.getSource())).getScene().getWindow().hide();
                      
                    }
                }

            } catch (ParseException | SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (!flag) {
                progressBar.setVisible(false);
                loginBtn.setDisable(false);
                logInfo.setText("Incorrect Username/Password");
            }
        });

        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();

    }

    public void loadFxml(String url, User user, Mentor mentor) throws SQLException, ParseException {
        Stage primaryStage = new Stage(StageStyle.DECORATED);

        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader(url);
            Parent root = loader.load();

            Scene scene = new Scene(root);
            primaryStage.setTitle("ITECH");
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
            primaryStage.setScene(scene);
            HomeController homeC = (HomeController) loader.getController();
            homeC.setUserNCtx(user, mentor, acac, stat.getText());
            primaryStage.show();

        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // conStatus();
        handle = SqliteDatabaseHandler.getInstance();
      
    }

    

    public List<Facility> getFacilities(Long id) {
        
        Mentor mentor = mentorService.get(id);
        if (mentor.getMentorRole() != null && mentor.getMentorRole().equals(MentorRole.NATIONAL)) {
            return facilityService.getAll();
        } else if (mentor.getMentorRole() != null && mentor.getMentorRole().equals(MentorRole.PROVINCIAL)) {
            return facilityService.getByProvince(mentor.getProvince());
        }
        return facilityService.getByMentorAndDistrict(mentor);
            
       
    }

}
