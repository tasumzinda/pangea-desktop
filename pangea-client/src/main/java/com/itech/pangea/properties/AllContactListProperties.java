/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.properties;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author user
 */
public class AllContactListProperties {
    
    private final StringProperty nameOfContact;
    private final StringProperty facility;
    private final LongProperty cid;
    private final StringProperty nameOfIndex;
    

    public AllContactListProperties(long cid, String nameOfIndex, String nameOfContact, String facility) {
        this.cid = new SimpleLongProperty(cid);
        this.nameOfIndex = new SimpleStringProperty(nameOfIndex);
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
    

    public String getNameOfIndex() {
        return nameOfIndex.get();
    }

    public void setNameOfIndex(String value) {
        nameOfIndex.set(value);
    }

    public StringProperty nameOfIndexProperty() {
        return nameOfIndex;
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
