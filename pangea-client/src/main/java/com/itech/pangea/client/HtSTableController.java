package com.itech.pangea.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itech.pangea.business.domain.HTSRegisterForm;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.Gender;
import com.itech.pangea.business.service.HTSRegisterFormService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;
import com.jfoenix.controls.JFXTextField;
import com.itech.pangea.properties.HtsListProperties;
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
public class HtSTableController implements Initializable {

    SqliteDatabaseHandler handler;
    @FXML
    private TableView<HtsListProperties> htsTable;
    @FXML
    private TableColumn<HtsListProperties, Number> colId;
    @FXML
    private TableColumn<HtsListProperties, String> colFirstName;
    @FXML
    private TableColumn<HtsListProperties, String> colLastName;
    @FXML
    private TableColumn<HtsListProperties, Number> colAge;
    @FXML
    private TableColumn<HtsListProperties, String> colGender;
    @FXML
    private TableColumn<HtsListProperties, String> colFacility;
    @FXML
    private JFXProgressBar loadingBar;
    @FXML
    private JFXTextField search;
   // ObservableList <HTSRegisterForm> daa2 = FXCollections.observableArrayList();
    ObservableList dataH = FXCollections.observableArrayList();
    FilteredList<HtsListProperties> filteredData = new FilteredList<>(dataH, e ->true);
    
    @Resource
    private HTSRegisterFormService hTSRegisterFormService;
    
    List<HTSRegisterForm> listH = new ArrayList<>();
    AnnotationConfigApplicationContext acac;
    User user;
    Mentor mentor;
    String conStatus;
    public void setUserNCtx(User user, Mentor mentor, AnnotationConfigApplicationContext acac, String conStatus) {
        this.user = user;
        this.acac = acac;
        this.conStatus = conStatus;
        this.mentor = mentor;
        if(conStatus.equals("Online")){
        getHtsList();
        colId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        colFirstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        colLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        colAge.setCellValueFactory(cellData->cellData.getValue().ageProperty());
        colGender.setCellValueFactory(cellData -> cellData.getValue().genderProperty());
        colFacility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
        }
        else{
            
            try {  
                getListOffline();
            } catch (SQLException ex) {
                Logger.getLogger(HtSTableController.class.getName()).log(Level.SEVERE, null, ex);
            }
          colId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        colFirstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        colLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        colAge.setCellValueFactory(cellData->cellData.getValue().ageProperty());
        colGender.setCellValueFactory(cellData -> cellData.getValue().genderProperty());
        colFacility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
        }
       
    }
    @FXML
    private void searchTextEntered(KeyEvent event){
        search.textProperty().addListener((observableValue, ov, nv)->{
            filteredData.setPredicate((Predicate<? super HtsListProperties>)htsp->{
                if(nv == null || nv.isEmpty()){
                    return true;
                }
                String lowerCaseFilter = nv.toLowerCase();
                if(htsp.getFirstName().contains(nv)){
                    return true;
                }
                if(htsp.getFirstName().toLowerCase().contains(lowerCaseFilter)){
                    return true;
                }
                else if(htsp.getFacility().toLowerCase().contains(lowerCaseFilter)){
                    return true;
                }
                return false;
});
        });
        SortedList<HtsListProperties> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(htsTable.comparatorProperty());
        htsTable.setItems(sortedData);
    }
    @FXML
    private void selectedHTS(MouseEvent event){
        HtsListProperties htsp = (HtsListProperties)htsTable.getSelectionModel().getSelectedItem();
        Stage stage = new Stage();
        String callHts = "callHts";
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/OptionButtons.fxml");
            Parent root = loader.load();
            
            OptionButtonsController optionButtonsController = (OptionButtonsController)loader.getController();
            optionButtonsController.setUserNCtx(user, acac, htsp.getId(), callHts, conStatus);
            Scene scene = new Scene(root); 
            stage.setTitle("ID::"+ htsp.getId() +" | Edit/Delete | " + htsp.getFirstName());
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
    public void getHtsList(){         
                 dataH.clear();
                 loadingBar.setVisible(true);
                 Task<List> task = new Task<List>(){
                     @Override
                     protected List call() throws Exception {
                         return hTSRegisterFormService.findByUser(user);
                     }                    
                 };
            
        task.setOnSucceeded((WorkerStateEvent e) -> {
            listH = task.getValue();
        for(HTSRegisterForm hts : listH){   
                if(hts.getActive()){
                dataH.add(new HtsListProperties(hts.getId(), hts.getFirstName(), hts.getLastName(), hts.getAge(), hts.getGender().toString(), hts.getFacility() == null ? "" : hts.getFacility().toString())); 
                }
        }  
        Platform.runLater(() -> {
        htsTable.setItems(dataH);
        loadingBar.setVisible(false);
        });
        });
        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();
    }
    public void getListOffline() throws SQLException{
        SendData sd = new SendData();
        dataH.clear();
        String query = "Select * From htsregister_form";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
            dataH.add(new HtsListProperties(
                    rs.getLong("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getInt("age"),
                    Gender.get(rs.getInt("gender")).getName(),
                    sd.getByIdFacility(rs.getLong("facility")).toString()
            ));
        }
        htsTable.setItems(dataH);
    }
   
}
