/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.properties;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author user
 */
public class ContactListProperties {

    private final StringProperty nameOfContact;
    private final StringProperty facility;
   private final LongProperty cid;
    

    public ContactListProperties(long cid, String nameOfContact, String facility) {
        this.cid = new SimpleLongProperty(cid);
        this.nameOfContact   = new SimpleStringProperty(nameOfContact);
        this.facility = new SimpleStringProperty(facility);
        
    }
    

    public long getCid() {
        return cid.get();
    }

    public void setCid(long value) {
        cid.set(value);
    }

    public LongProperty cidProperty() {
        return cid;
    }


    public String getNameOfContact() {
        return nameOfContact.get();
    }

    public void setNameOfContact(String value) {
        nameOfContact.set(value);
    }

    public StringProperty nameOfContactProperty() {
        return nameOfContact;
    }
    

    public String getFacility() {
        return facility.get();
    }

    public void setFacility(String value) {
        facility.set(value);
    }

    public StringProperty facilityProperty() {
        return facility;
    }
    
}
