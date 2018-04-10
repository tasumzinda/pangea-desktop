/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.service.DefaulterTrackingFormService;
import com.jfoenix.controls.JFXTextField;
import com.itech.pangea.properties.DefaulterProperties;
import com.itech.pangea.sqliteConfig.SendData;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.jfoenix.controls.JFXProgressBar;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
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
public class DefaulterListController implements Initializable {

    SqliteDatabaseHandler handler;
    @FXML
    private TableView<DefaulterProperties> defaulterListTable;
    @FXML
    private TableColumn<DefaulterProperties, Number> colId;
    @FXML
    private TableColumn<DefaulterProperties, String> colFirstName;
    @FXML
    private TableColumn<DefaulterProperties, String> colLastName;
    @FXML
    private JFXProgressBar loadingBar;
    @FXML
    private TableColumn<DefaulterProperties, String> colFacility;
    @FXML
    private JFXTextField search;
    ObservableList dataD = FXCollections.observableArrayList();
    FilteredList<DefaulterProperties> filteredData = new FilteredList<>(dataD, e ->true);
    
    @Resource
    private DefaulterTrackingFormService defaulterTrackingFormService;
    
    List<DefaulterTrackingForm> listD = new ArrayList<>();
    
    @FXML
    private void searchTextEntered(KeyEvent event){
        System.err.println("+++++++++++++++++++++++++");
        System.err.println("Key Shifted");
        System.err.println("+++++++++++++++++++++++++");
        
        search.textProperty().addListener((observableValue, ov, nv)->{
            filteredData.setPredicate((Predicate<? super DefaulterProperties>)htsp->{
                if(nv == null || nv.isEmpty()){
                    return true;
                }
                String lowerCaseFilter = nv.toLowerCase();
                if(htsp.getFirstName().contains(nv)){
                    return true;
                }
                else if(htsp.getFirstName().toLowerCase().contains(lowerCaseFilter)){
                    return true;
                }
                else if(htsp.getFacility().toLowerCase().contains(lowerCaseFilter)){
                    return true;
                }
                return false;
});
        });
        SortedList<DefaulterProperties> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(defaulterListTable.comparatorProperty());
        defaulterListTable.setItems(sortedData);
    }
   
    AnnotationConfigApplicationContext acac;
    User user;
    String conStatus;
    public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, String conStatus) {
        this.user = user;
        this.acac = acac;
        this.conStatus = conStatus;
        if(conStatus.equals("Online")){
            getListOnlineD();
        }
        else{
            try {
                getListOfflineD();
            } catch (SQLException ex) {
                Logger.getLogger(DefaulterListController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    @FXML
    private void selectedDefaulter(MouseEvent event){
        DefaulterProperties dtf = (DefaulterProperties)defaulterListTable.getSelectionModel().getSelectedItem();
        Stage stage = new Stage();
        String callDefaulter = "callDefaulter";
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/OptionButtons.fxml");
            Parent root = loader.load();
            
            OptionButtonsController optionButtonsController = (OptionButtonsController)loader.getController();
            optionButtonsController.setUserNCtx(user, acac, dtf.getId(), callDefaulter, conStatus);
            Scene scene = new Scene(root); 
            stage.setTitle("ID::"+ dtf.getId() +" | Edit/Delete | " + dtf.getFirstName());
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
            //((Node)(event.getSource())).getScene().getWindow().hide();
           
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         handler = SqliteDatabaseHandler.getInstance();
       
    } 
  
    public void getListOnlineD(){
        dataD.clear();
              loadingBar.setVisible(true);
                 Task<List> task = new Task<List>(){
                     @Override
                     protected List call() throws Exception {
                          return defaulterTrackingFormService.findByUser(user); 
                     }                    
                 };
         task.setOnSucceeded((WorkerStateEvent e) -> {
        listD = task.getValue();
        for(DefaulterTrackingForm dt : listD){     
            if(dt.getActive()){
                dataD.add(new DefaulterProperties(dt.getId(), dt.getFirstNameOfIndex(), dt.getLastNameOfIndex(), dt.getFacility()==null ? "" : dt.getFacility().toString()));
            }
        }
        Platform.runLater(() -> { 
             defaulterListTable.setItems(dataD);
             loadingBar.setVisible(false);
         });
        });
        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start(); 
         
         
        colId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        colFirstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        colLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());     
        colFacility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
    }
    public void getListOfflineD() throws SQLException{
        dataD.clear();
        SendData sd = new SendData();
        String query = "Select * From defaulter_tracking_form";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
            dataD.add(new DefaulterProperties(
                    rs.getLong("id"),
                    rs.getString("first_name_of_index"),
                    rs.getString("last_name_of_index"),
                    sd.getByIdFacility(rs.getLong("facility")).toString()
            ));
        }
       defaulterListTable.setItems(dataD); 
        colId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        colFirstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        colLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());        
        colFacility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
    }
}
