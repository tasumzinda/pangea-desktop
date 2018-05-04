/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.YesNo;
import com.itech.pangea.business.service.IndexCaseTestingFormService;
import com.jfoenix.controls.JFXTextField;
import com.itech.pangea.properties.IndexCasingProperties;
import com.itech.pangea.sqliteConfig.SendData;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.itech.pangea.utils.ConvertItems;
import com.jfoenix.controls.JFXProgressBar;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
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
    private TableColumn<IndexCasingProperties, String> colContactlist;
    @FXML
    private JFXProgressBar loadingBar;
    @FXML
    private TableColumn<IndexCasingProperties, String> colFacility;
    @FXML
    private JFXTextField search;
    //ObservableList <IndexCaseTestingForm> data2 = FXCollections.observableArrayList();
    ObservableList data = FXCollections.observableArrayList();
    FilteredList<IndexCasingProperties> filteredDat = new FilteredList<>(data, e ->true);
    
    @Resource
    private IndexCaseTestingFormService indexCaseTestingFormService;
    
    
    
    @FXML
    private void searchTextEntered(KeyEvent event){
        search.textProperty().addListener((observableValue, ov, nv)->{
            filteredDat.setPredicate((Predicate<? super IndexCasingProperties>)idx->{
                if(nv == null || nv.isEmpty()){
                    return true;
                }
                String lowerCaseFilter = nv.toLowerCase();
                if(idx.getFirstName().contains(nv)){
                    return true;
                }
                else if(idx.getFirstName().toLowerCase().contains(lowerCaseFilter)){
                    return true;
                }
           /////     else if(idx.getFacility().toLowerCase().contains(lowerCaseFilter)){
            //        return true;
            //    }
                return false;
               });
        });
        SortedList<IndexCasingProperties> sortedData = new SortedList<>(filteredDat);
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
   
    public IndexCaseTestingForm getById(Long i) throws SQLException, ParseException{
        IndexCaseTestingForm idx = new IndexCaseTestingForm();
        ConvertItems ci = new ConvertItems();
        SendData sd = new SendData();
         String query = "Select * From index_case_testing_form where id='"+i+"'";
            ResultSet rs = handler.execQuery(query);
      
            while(rs.next()){
                idx.setId(i);
                 idx.setFirstNameOfIndex(rs.getString("first_name_of_index"));
            idx.setLastNameOfIndex(rs.getString("last_name_of_index"));
            idx.setSequentialNumberOfIndex(rs.getString("sequential_number_of_index"));
            idx.setDateIndexTestedOrDiagnosed(sd.convertString(rs.getString("date_index_tested_or_diagnosed")));
            idx.setIndexOIARTNumber(rs.getString("indexoiartnumber"));
            idx.setIndexContactNumber(rs.getLong("index_contact_number"));
            idx.setInitiatedOnART(ci.yesNo(rs.getInt("initiated_onart")));
            idx.setReasonForNotBeingInitiated(rs.getString("reason_for_not_being_initiated"));
            idx.setConsentForListedContacts(ci.yesNo(rs.getInt("consent_for_listed_contacts")));
            Province prov = sd.getByIdProvince(rs.getLong("province"));
            idx.setProvince(prov);
            District dis = sd.getByIdDistrict(rs.getLong("district"));
            idx.setDistrict(dis);
            Facility fac = sd.getByIdFacility(rs.getLong("facility"));
            idx.setFacility(fac);
            }
        return idx;
    }
    
    @FXML
    private void refreshList(ActionEvent event) throws SQLException{
        getIctListOffLine();
    }
    
     IndexCaseTestingForm dataIndex;
     @FXML
    private void selectedIct(MouseEvent event){
        IndexCasingProperties ictS = (IndexCasingProperties)indexCasingTable.getSelectionModel().getSelectedItem();
        if(conStatus.equals("Online")){
            dataIndex = indexCaseTestingFormService.get(ictS.getId());
        }
        else{
            try {
                dataIndex = getById(ictS.getId());
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(IndexCasingListController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Stage stage = new Stage();
       // String callIct = "callIct";
        try {
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/ContactListBtns.fxml");
            Parent root = loader.load();
            
            ContactListBtnsController contactListBtnsController = (ContactListBtnsController)loader.getController();
            contactListBtnsController.setUserNCtx(user, acac, ictS.getId(), ictS.getContactList(),dataIndex, conStatus);
            Scene scene = new Scene(root); 
            stage.setTitle("ID::"+ ictS.getId() +" | Edit/Delete/Add Contact/Contact List | " + ictS.getFirstName());
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
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
               loadingBar.setVisible(true);
                 Task<List> task = new Task<List>(){
                     @Override
                     protected List<IndexCaseTestingForm> call() throws Exception {
                         return indexCaseTestingFormService.findByUser(user);
           
                     }                    
                 };
         task.setOnSucceeded((WorkerStateEvent e) -> {
            List<IndexCaseTestingForm> list = task.getValue();
           
          for(IndexCaseTestingForm dt : list){  
            
                data.add(new IndexCasingProperties(dt.getId(), dt.getFirstNameOfIndex(),
                        dt.getLastNameOfIndex(),
                        dt.getConsentForListedContacts()==null ? "" : dt.getConsentForListedContacts().getName(),
                        dt.getFacility()==null ? "" : dt.getFacility().toString()));  
        }
          Platform.runLater(() -> { 
         indexCasingTable.setItems(data);
         colId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
         colFirstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
         colLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
         colContactlist.setCellValueFactory(cellData -> cellData.getValue().contactListProperty());
         colFacility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
         loadingBar.setVisible(false);
          });
        });
         task.setOnFailed((event) -> {
             Platform.runLater(() -> { 
             loadingBar.setVisible(false);
         });
         });
        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start(); 
        
    }
     public void getIctListOffLine(){  
         data.clear();
         SendData sd = new SendData();
         String query = "Select * From index_case_testing_form";
         ResultSet rs = handler.execQuery(query);
        try {
            while(rs.next()){
                data.add(new IndexCasingProperties(rs.getLong("id"),
                        rs.getString("first_name_of_index"),
                        rs.getString("last_name_of_index"),
                        YesNo.get(rs.getInt("consent_for_listed_contacts")).getName(),
                        sd.getByIdFacility(rs.getLong("facility")).toString()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(IndexCasingListController.class.getName()).log(Level.SEVERE, null, ex);
        }
         indexCasingTable.setItems(data);     
         colId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        colFirstName.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        colLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        colContactlist.setCellValueFactory(cellData -> cellData.getValue().contactListProperty());
        colFacility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
     }
   
}
