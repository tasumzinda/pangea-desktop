package com.itech.pangea.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.service.ContactService;
import com.itech.pangea.business.service.IndexCaseTestingFormService;
import com.itech.pangea.properties.AllContactListProperties;
import com.itech.pangea.sqliteConfig.SendData;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
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
 * @author user
 */
@Component
public class AllContactListController implements Initializable {
    SqliteDatabaseHandler handler;
    @FXML
    private TableView<AllContactListProperties> tblContactList;
    @FXML
    private TableColumn<AllContactListProperties, Number> cid;
    @FXML
    private TableColumn<AllContactListProperties, String> nameOfIndex;
    @FXML
    private TableColumn<AllContactListProperties, String> nameOfContact;
    @FXML
    private TableColumn<AllContactListProperties, String> facility;
    @FXML
    private JFXTextField search;
    @FXML
    private JFXProgressBar loadingProgress;
    @Resource
    private ContactService contactService; 
    ObservableList dataH = FXCollections.observableArrayList();
    FilteredList<AllContactListProperties> filteredData = new FilteredList<>(dataH, e ->true);
    
    AnnotationConfigApplicationContext acac;
    User user;
    String conStatus;
   
    Contact con;
    @Resource
    private IndexCaseTestingFormService indexCaseTestingFormService;
    public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, String conStatus) {
        this.user = user;
        this.acac = acac;
        this.conStatus = conStatus;
  /*      if(conStatus.equals("Online")){
            getListonline();
        }
        else{*/
            try { 
                getListOffline();
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(AllContactListController.class.getName()).log(Level.SEVERE, null, ex);
            }
       // }
       
     }
    
    @FXML
    private void searchTextEntered(KeyEvent event){
        search.textProperty().addListener((observableValue, ov, nv)->{
            filteredData.setPredicate((Predicate<? super AllContactListProperties>)allCL->{
                if(nv == null || nv.isEmpty()){
                    return true;
                }
                String lowerCaseFilter = nv.toLowerCase();
                if(allCL.getNameOfIndex().contains(nv)){
                    return true;
                }
                if(allCL.getNameOfIndex().toLowerCase().contains(lowerCaseFilter)){
                    return true;
                }
                else if(allCL.getNameOfContact().toLowerCase().contains(lowerCaseFilter)){
                    return true;
                }
                return false;
             });
        });
        SortedList<AllContactListProperties> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tblContactList.comparatorProperty());
        tblContactList.setItems(sortedData);
    }
    @FXML
    private void refreshList(ActionEvent event) throws SQLException, ParseException{
        getListOffline();
    }
    
    @FXML
    private void selectedContact(MouseEvent event){
        AllContactListProperties cp = (AllContactListProperties)tblContactList.getSelectionModel().getSelectedItem();
        if(conStatus.equals("Online")){
            con = contactService.get(cp.getCid());
        }
        else{
            con = getContactById(cp.getCid());
        }
        try {
            Stage stage = new Stage();
            FXMLLoader loader = acac.getBean(FXMLLoaderProvider.class).getLoader("/fxml/ContactListDialog.fxml");
            Parent root = loader.load();
            
            ContactListDialogController contactListDialogController = (ContactListDialogController)loader.getController();
            contactListDialogController.setUserNCtx(user, acac, conStatus, con);
            Scene scene = new Scene(root); 
            stage.setTitle("ID::"+ con.getId() +" | Call/Visit | " + con.getNameOfContact());
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
           
           
        } catch (IOException ex) {
            Logger.getLogger(AllContactListController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     public Contact getContactById(long id){
        Contact myContact = new Contact();
        IndexCaseTestingForm in = new IndexCaseTestingForm();
        try {
               
                String query = "Select * From contact where id = '"+id+"' and active='true'";
                ResultSet rs = handler.execQuery(query);
                while(rs.next()){
                    myContact.setId(rs.getLong("id"));
                    myContact.setNameOfContact(rs.getString("name_of_contact"));
                    in.setId(rs.getLong("index_case_testing_form"));
                    myContact.setIndexCaseTestingForm(in);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AllContactListController.class.getName()).log(Level.SEVERE, null, ex);
            }
        return myContact;
        
    }
     public void getListonline(){
        dataH.clear();
        loadingProgress.setVisible(true);
            Task<List> task = new Task<List>(){
            @Override
            protected List call() throws Exception {
                return contactService.getAll();
            }
        };
        task.setOnSucceeded((WorkerStateEvent e) -> {
             List<Contact> lis = task.getValue();
              for(Contact c : lis){
                    dataH.add(new AllContactListProperties(c.getId(),
                    getNameOfIndexFromIndexCasingFormOnline(c.getIndexCaseTestingForm().getId()),
                    c.getNameOfContact(),
                    getFacilityOnline(c.getIndexCaseTestingForm().getId())));
             }
              tblContactList.setItems(dataH);
        cid.setCellValueFactory(cellData -> cellData.getValue().cidProperty());
        nameOfIndex.setCellValueFactory(cellData -> cellData.getValue().nameOfIndexProperty());
        nameOfContact.setCellValueFactory(cellData -> cellData.getValue().nameOfContactProperty());       
        facility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
        loadingProgress.setVisible(false);
        });
         task.setOnFailed((event) -> {
            
             loadingProgress.setVisible(false);
         });
        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();             
      
    }
    public void getListOffline() throws SQLException, ParseException{
        dataH.clear();
      String query  = "Select * From contact where active='true'";
       ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
           
           dataH.add(new AllContactListProperties(
                   rs.getLong("id"),
                   getNameOfIndexFromIndexCasingFormOffline(rs.getLong("index_case_testing_form")),
                   rs.getString("name_of_contact"),
                   getFacilityOffline(rs.getLong("index_case_testing_form")))
                );           
           }
        tblContactList.setItems(dataH);
        cid.setCellValueFactory(cellData -> cellData.getValue().cidProperty());
        nameOfIndex.setCellValueFactory(cellData -> cellData.getValue().nameOfIndexProperty());
        nameOfContact.setCellValueFactory(cellData -> cellData.getValue().nameOfContactProperty());
        facility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
    }
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        handler = SqliteDatabaseHandler.getInstance();
    }    
    
    public String getNameOfIndexFromIndexCasingFormOnline(Long id){
        IndexCaseTestingForm idex = indexCaseTestingFormService.get(id);
        String nameOfIndexX = idex.getFirstNameOfIndex() + " " + idex.getLastNameOfIndex();
        return nameOfIndexX;
    }
    public String getNameOfIndexFromIndexCasingFormOffline(Long id) throws SQLException, ParseException{
        SendData sd = new SendData();
        IndexCaseTestingForm idx = sd.ictFormQuery(id, "edit");       
        String nameOfIndexX = idx.getFirstNameOfIndex() + " " + idx.getLastNameOfIndex();
        return nameOfIndexX;
    }
    public String getFacilityOnline(Long id){
        IndexCaseTestingForm idex = indexCaseTestingFormService.get(id);
        String facilityId = idex.getFacility().getName();
        return facilityId;
    }
     public String getFacilityOffline(Long id) throws SQLException, ParseException{
        SendData sd = new SendData();
        IndexCaseTestingForm idx = sd.ictFormQuery(id, "edit");   
        String fac = idx.getFacility().getName();
        return fac;
    }
    
}
