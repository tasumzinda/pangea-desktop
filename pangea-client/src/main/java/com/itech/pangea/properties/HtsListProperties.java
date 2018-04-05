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
 * @author Admin
 */
public class HtsListProperties {
    private final LongProperty id;
     private final StringProperty firstName;
    private final StringProperty lastName;
   private final IntegerProperty age;
      private final StringProperty gender;
    private final StringProperty facility;

    public HtsListProperties(Long id, String firstName, String lastName, Integer age,  String gender, String facility) {
         this.id = new SimpleLongProperty(id);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.gender = new SimpleStringProperty(gender);
        this.age = new SimpleIntegerProperty(age);
        this.facility = new SimpleStringProperty(facility);
    }
    

    public long getId() {
        return id.get();
    }

    public void setId(long value) {
        id.set(value);
    }

    public LongProperty idProperty() {
        return id;
    }
    
     public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String value) {
        firstName.set(value);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }
    

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String value) {
        lastName.set(value);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }
     public String getGender() {
        return gender.get();
    }

    public void setGender(String value) {
        gender.set(value);
    }

    public StringProperty genderProperty() {
        return gender;
    }
    

    public int getAge() {
        return age.get();
    }

    public void setAge(int value) {
        age.set(value);
    }

    public IntegerProperty ageProperty() {
        return age;
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
   /* private final StringProperty htsNumber;
    private final StringProperty hivTestingReferralSlipNumber;
    private final StringProperty mDate;
    
   //private final StringProperty province;
    //private final StringProperty district;
    private final StringProperty mTime;
   
   
    private final StringProperty reasonForHIVTest;
    private final StringProperty test;
    private final StringProperty finalResult; 
    private final StringProperty clientServices;
    private final StringProperty entryStream;
    private final StringProperty other1;
    private final StringProperty inPreArt;  
    private final StringProperty registeredInPreArt;
    private final StringProperty initiatedOnArt;  
    private final StringProperty dateOfInitiation;
    private final StringProperty oiArtNumber;
    private final StringProperty hTSModel;
    private final StringProperty pregnantOrLactatingWoman;
   

    public HtsListProperties(String firstName, String lastName, String htsNumber, String hivTestingReferralSlipNumber,
            String mDate, String facility,  String mTime, String gender, Integer age,
            String reasonForHIVTest, String test, String finalResult, String clientServices, String entryStream,
            String other1, String inPreArt, String registeredInPreArt, String initiatedOnArt, String dateOfInitiation,
            String oiArtNumber, String hTSModel, String pregnantOrLactatingWoman) {
        
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.htsNumber = new SimpleStringProperty(htsNumber);
        this.hivTestingReferralSlipNumber = new SimpleStringProperty(hivTestingReferralSlipNumber);
        this.mDate = new SimpleStringProperty(mDate);
        this.facility = new SimpleStringProperty(facility);
        //this.province = new SimpleStringProperty(province);
        //this.district = new SimpleStringProperty(district);
        this.mTime = new SimpleStringProperty(mTime);
        this.gender = new SimpleStringProperty(gender);
        this.age = new SimpleIntegerProperty(age);
        this.reasonForHIVTest = new SimpleStringProperty(reasonForHIVTest);
        this.test = new SimpleStringProperty(test);
        this.finalResult = new SimpleStringProperty(finalResult);
        this.clientServices = new SimpleStringProperty(clientServices);
        this.entryStream = new SimpleStringProperty(entryStream);
        this.other1 = new SimpleStringProperty(other1);
        this.inPreArt = new SimpleStringProperty(inPreArt);
        this.registeredInPreArt = new SimpleStringProperty(registeredInPreArt);
        this.initiatedOnArt = new SimpleStringProperty(initiatedOnArt);
        this.dateOfInitiation = new SimpleStringProperty(dateOfInitiation);
        this.oiArtNumber = new SimpleStringProperty(oiArtNumber);
        this.hTSModel = new SimpleStringProperty(hTSModel);
        this.pregnantOrLactatingWoman = new SimpleStringProperty(pregnantOrLactatingWoman);
    }
    

   

    public String getHtsNumber() {
        return htsNumber.get();
    }

    public void setHtsNumber(String value) {
        htsNumber.set(value);
    }

    public StringProperty htsNumberProperty() {
        return htsNumber;
    }
   

    public String getHivTestingReferralSlipNumber() {
        return hivTestingReferralSlipNumber.get();
    }

    public void setHivTestingReferralSlipNumber(String value) {
        hivTestingReferralSlipNumber.set(value);
    }

    public StringProperty hivTestingReferralSlipNumberProperty() {
        return hivTestingReferralSlipNumber;
    }
    

    public String getmDate() {
        return mDate.get();
    }

    public void setmDate(String value) {
        mDate.set(value);
    }

    public StringProperty mDateProperty() {
        return mDate;
    }
    

    
   

    public String getProvince() {
        return province.get();
    }

    public void setProvince(String value) {
        province.set(value);
    }

    public StringProperty provinceProperty() {
        return province;
    }
    

    public String getDistrict() {
        return district.get();
    }

    public void setDistrict(String value) {
        district.set(value);
    }

    public StringProperty districtProperty() {
        return district;
    }
   

    public String getmTime() {
        return mTime.get();
    }

    public void setmTime(String value) {
        mTime.set(value);
    }

    public StringProperty mTimeProperty() {
        return mTime;
    }
   

   

    public String getReasonForHIVTest() {
        return reasonForHIVTest.get();
    }

    public void setReasonForHIVTest(String value) {
        reasonForHIVTest.set(value);
    }

    public StringProperty reasonForHIVTestProperty() {
        return reasonForHIVTest;
    }
    

    public String getTest() {
        return test.get();
    }

    public void setTest(String value) {
        test.set(value);
    }

    public StringProperty testProperty() {
        return test;
    }
    

    public String getFinalResult() {
        return finalResult.get();
    }

    public void setFinalResult(String value) {
        finalResult.set(value);
    }

    public StringProperty finalResultProperty() {
        return finalResult;
    }
    

    public String getClientServices() {
        return clientServices.get();
    }

    public void setClientServices(String value) {
        clientServices.set(value);
    }

    public StringProperty clientServicesProperty() {
        return clientServices;
    }
    

    public String getEntryStream() {
        return entryStream.get();
    }

    public void setEntryStream(String value) {
        entryStream.set(value);
    }

    public StringProperty entryStreamProperty() {
        return entryStream;
    }
    

    public String getOther1() {
        return other1.get();
    }

    public void setOther1(String value) {
        other1.set(value);
    }

    public StringProperty other1Property() {
        return other1;
    }
    

    public String getInPreArt() {
        return inPreArt.get();
    }

    public void setInPreArt(String value) {
        inPreArt.set(value);
    }

    public StringProperty inPreArtProperty() {
        return inPreArt;
    }
    

    public String getRegisteredInPreArt() {
        return registeredInPreArt.get();
    }

    public void setRegisteredInPreArt(String value) {
        registeredInPreArt.set(value);
    }

    public StringProperty registeredInPreArtProperty() {
        return registeredInPreArt;
    }
   

    public String getInitiatedOnArt() {
        return initiatedOnArt.get();
    }

    public void setInitiatedOnArt(String value) {
        initiatedOnArt.set(value);
    }

    public StringProperty initiatedOnArtProperty() {
        return initiatedOnArt;
    }
    

    public String getDateOfInitiation() {
        return dateOfInitiation.get();
    }

    public void setDateOfInitiation(String value) {
        dateOfInitiation.set(value);
    }

    public StringProperty dateOfInitiationProperty() {
        return dateOfInitiation;
    }
    

    public String getOiArtNumber() {
        return oiArtNumber.get();
    }

    public void setOiArtNumber(String value) {
        oiArtNumber.set(value);
    }

    public StringProperty oiArtNumberProperty() {
        return oiArtNumber;
    }
    

    public String gethTSModel() {
        return hTSModel.get();
    }

    public void sethTSModel(String value) {
        hTSModel.set(value);
    }

    public StringProperty hTSModelProperty() {
        return hTSModel;
    }
   

    public String getPregnantOrLactatingWoman() {
        return pregnantOrLactatingWoman.get();
    }

    public void setPregnantOrLactatingWoman(String value) {
        pregnantOrLactatingWoman.set(value);
    }

    public StringProperty pregnantOrLactatingWomanProperty() {
        return pregnantOrLactatingWoman;
    }
   */
}
