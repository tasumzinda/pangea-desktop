/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.service.IndexCaseTestingFormService;
import com.jfoenix.controls.JFXTextField;
import com.itech.pangea.properties.IndexCasingProperties;
import com.itech.pangea.sqliteConfig.SendData;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
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
public class IndexCasingListController implements Initializable {
    SqliteDatabaseHandler handler;
  
    @FXML
    private TableView<IndexCasingProperties> indexCasingTable;
     @FXML
    private TableColumn<IndexCasingProperties, Number> colId;
    @FXML
    private TableColumn<IndexCasingProperties, String> colFirstName;
    @FXML
    private TableColumn<IndexCasingProperties, String> colLastName;
    
    @FXML
    private TableColumn<IndexCasingProperties, String> colFacility;
    @FXML
    private JFXTextField search;
    //ObservableList <IndexCaseTestingForm> data2 = FXCollections.observableArrayList();
    ObservableList data = FXCollections.observableArrayList();
    FilteredList<IndexCasingProperties> filteredData = new FilteredList<>(data, e ->true);
    
    @Resource
    private IndexCaseTestingFormService indexCaseTestingFormService;
    
    List<IndexCaseTestingForm> list = new ArrayList<>();
    
    @FXML
    private void searchTextEntered(KeyEvent event){
        search.textProperty().addListener((observableValue, ov, nv)->{
            filteredData.setPredicate((Predicate<? super IndexCasingProperties>)htsp->{
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
        SortedList<IndexCasingProperties> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(indexCasingTable.comparatorProperty());
        indexCasingTable.setItems(sortedData);
    }
   
    AnnotationConfigApplicationContext acac;
    User user;
    String conStatus;
    public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, String conStatus) {
        this.user = user;
        this.acac = acac;
        this.conStatus = conStatus;
        if(conStatus.equals("Online")){
            getIctListOnline();
        }
        else{
            getIctListOffLine();
        }
    }
     @FXML
    private void selectedIct(MouseEvent event){
        IndexCasingProperties ictS = (IndexCasingProperties)indexCasingTable.getSelectionModel().getSelectedItem();
        Stage stage = new Stage();
        String callIct = "callIct";
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/OptionButtons.fxml");
            Parent root = loader.load();
            
            OptionButtonsController optionButtonsController = (OptionButtonsController)loader.getController();
            optionButtonsController.setUserNCtx(user, acac, ictS.getId(), callIct, conStatus);
            Scene scene = new Scene(root); 
            stage.setTitle("ID::"+ ictS.getId() +" | Edit/Delete | " + ictS.getFirstName());
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
    public void getIctListOnline(){         
          data.clear();
        list = indexCaseTestingFormService.getAll(); 
        for(IndexCaseTestingForm dt : list){               
                data.add(new IndexCasingProperties(dt.getId(), dt.getFirstNameOfIndex(), dt.getLastNameOfIndex(), dt.getFacility()==null ? "" : dt.getFacility().toString()));  
        }
         
         indexCasingTable.setItems(data);     
         colId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        colFirstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        colLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        colFacility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
    }
     public void getIctListOffLine(){  
         data.clear();
         SendData sd = new SendData();
         String query = "Select * From index_case_testing_form";
         ResultSet rs = handler.execQuery(query);
        try {
            while(rs.next()){
                data.add(new IndexCasingProperties(rs.getLong("id"), rs.getString("first_name_of_index"), rs.getString("last_name_of_index"), sd.getByIdFacility(rs.getLong("facility")).toString()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(IndexCasingListController.class.getName()).log(Level.SEVERE, null, ex);
        }
         indexCasingTable.setItems(data);     
         colId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        colFirstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        colLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        colFacility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
     }
   
}
