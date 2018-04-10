/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.service.ContactService;
import com.itech.pangea.properties.ContactListProperties;
import com.itech.pangea.sqliteConfig.SqliteDatabaseHandler;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
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
public class ListContactsController implements Initializable {
    SqliteDatabaseHandler handler;
    @FXML
    private Label nameOfIndex;
    @FXML
    private JFXButton btnClose;
    
    @FXML
    private TableView<ContactListProperties> tblContactList;
    @FXML
    private TableColumn<ContactListProperties, Number> cid;
    @FXML
    private TableColumn<ContactListProperties, String> nameOfContact;
    @FXML
    private TableColumn<ContactListProperties, String> facility;
    @Resource
     private ContactService contactService;       
    ObservableList dataH = FXCollections.observableArrayList();
    AnnotationConfigApplicationContext acac;
    User user;
    String conStatus;
    IndexCaseTestingForm idx;
    public void setUserNCtx(User user,  AnnotationConfigApplicationContext acac, String conStatus, IndexCaseTestingForm idx) {
        this.user = user;
        this.acac = acac;
        this.idx = idx;
        this.conStatus = conStatus;
        nameOfIndex.setText(idx.getFirstNameOfIndex() + " " + idx.getLastNameOfIndex());
        String fac = idx.getFacility()==null ? "" : idx.getFacility().toString();
        if(conStatus.equals("Online")){
            getListonline(fac);
        }
        else{
            try { 
                getListOffline(fac);
            } catch (SQLException ex) {
                Logger.getLogger(ListContactsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
     }
    @FXML
    private void closeButton(ActionEvent e){
        Stage stage = (Stage) btnClose.getScene().getWindow();
           stage.close();
    }
    Contact con;
    @FXML
    private void selectedContact(MouseEvent event){
        ContactListProperties cp = (ContactListProperties)tblContactList.getSelectionModel().getSelectedItem();
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
            Logger.getLogger(ListContactsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public Contact getContactById(long id){
        Contact myContact = new Contact();
        IndexCaseTestingForm in = new IndexCaseTestingForm();
        try {
               
                String query = "Select * From contact where id = '"+id+"'";
                ResultSet rs = handler.execQuery(query);
                while(rs.next()){
                    myContact.setId(rs.getLong("id"));
                    myContact.setNameOfContact(rs.getString("name_of_contact"));
                    in.setId(rs.getLong("index_case_testing_form"));
                    myContact.setIndexCaseTestingForm(in);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ListContactsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        return myContact;
        
    }
    public void getListonline(String fac){
        dataH.clear();
        List<Contact> lis = contactService.getByIndex(idx);
       
        for(Contact c : lis){
            dataH.add(new ContactListProperties(c.getId(), c.getNameOfContact(), fac));
        }
        tblContactList.setItems(dataH);
        cid.setCellValueFactory(cellData -> cellData.getValue().cidProperty());
        nameOfContact.setCellValueFactory(cellData -> cellData.getValue().nameOfContactProperty());
        facility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
    }
    public void getListOffline(String fac) throws SQLException{
        dataH.clear();
       String query  = "Select * From contact where index_case_testing_form = '"+idx.getId()+"'";
       ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
           dataH.add(new ContactListProperties(
                   rs.getLong("id"),
                   rs.getString("name_of_contact"), fac));
            
        }
       tblContactList.setItems(dataH);
        cid.setCellValueFactory(cellData -> cellData.getValue().cidProperty());
        nameOfContact.setCellValueFactory(cellData -> cellData.getValue().nameOfContactProperty());
        facility.setCellValueFactory(cellData -> cellData.getValue().facilityProperty());
    }
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        handler = SqliteDatabaseHandler.getInstance();
    }    
    
}
