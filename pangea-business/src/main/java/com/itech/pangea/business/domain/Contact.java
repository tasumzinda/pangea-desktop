/*
 * Copyright 2018 tasu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.itech.pangea.business.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.util.CallOutcome;
import com.itech.pangea.business.domain.util.Gender;
import com.itech.pangea.business.domain.util.HIVResult;
import com.itech.pangea.business.domain.util.HTSModel;
import com.itech.pangea.business.domain.util.ReasonForIneligibilityForTesting;
import com.itech.pangea.business.domain.util.Relationship;
import com.itech.pangea.business.domain.util.YesNo;

/**
 *
 * @author Tasu Muzinda
 */
@Entity
public class Contact extends BaseEntity{
    private HTSModel preferredPlaceForContactsToBeTested;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date appointmentDateForContact;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date secondAppointmentDateForContact;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date thirdAppointmentDateForContact;
    private String nameOfContact;
    @Transient
    private Relationship relationship;
    private String relationShipToIndex;
    private Long sequentialNumber;
    @Transient
    private String relationshipOther;
    private Integer age;
    private Gender gender;
    private String contactAddress;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateCalled;
    @Enumerated
    private CallOutcome callOutcome;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateVisited;
    @Enumerated
    private CallOutcome visitOutcome;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date contactTestedDate;
    @Enumerated
    private HTSModel locationOfTest;
    @Enumerated
    private HIVResult hivResult;
    private YesNo enrolledIntoCare;
    private Integer sequentialNumberOfContacts;
    private String referralSlipNumber;
    @Enumerated
    private ReasonForIneligibilityForTesting hivStatusEntry;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ifTestedDateContactTested;
    @Enumerated
    private YesNo onART;
    private String artNumber;
    @Enumerated
    private YesNo referralSlipReturned;
    @ManyToOne
    private IndexCaseTestingForm indexCaseTestingForm;
    @Transient
    private Long index;
    
    public HTSModel getPreferredPlaceForContactsToBeTested() {
        return preferredPlaceForContactsToBeTested;
    }

    public void setPreferredPlaceForContactsToBeTested(HTSModel preferredPlaceForContactsToBeTested) {
        this.preferredPlaceForContactsToBeTested = preferredPlaceForContactsToBeTested;
    }
    
    public Date getAppointmentDateForContact() {
        return appointmentDateForContact;
    }

    public void setAppointmentDateForContact(Date appointmentDateForContact) {
        this.appointmentDateForContact = appointmentDateForContact;
    }

    public String getNameOfContact() {
        return nameOfContact;
    }

    public void setNameOfContact(String nameOfContact) {
        this.nameOfContact = nameOfContact;
    }

    public String getRelationShipToIndex() {
        return relationShipToIndex;
    }

    public void setRelationShipToIndex(String relationShipToIndex) {
        this.relationShipToIndex = relationShipToIndex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Date getDateCalled() {
        return dateCalled;
    }

    public void setDateCalled(Date dateCalled) {
        this.dateCalled = dateCalled;
    }

    public Date getDateVisited() {
        return dateVisited;
    }

    public void setDateVisited(Date dateVisited) {
        this.dateVisited = dateVisited;
    }

    public CallOutcome getCallOutcome() {
        return callOutcome;
    }

    public void setCallOutcome(CallOutcome callOutcome) {
        this.callOutcome = callOutcome;
    }

    public CallOutcome getVisitOutcome() {
        return visitOutcome;
    }

    public void setVisitOutcome(CallOutcome visitOutcome) {
        this.visitOutcome = visitOutcome;
    }
    
    public Date getContactTestedDate() {
        return contactTestedDate;
    }

    public void setContactTestedDate(Date contactTestedDate) {
        this.contactTestedDate = contactTestedDate;
    }

    public HTSModel getLocationOfTest() {
        return locationOfTest;
    }

    public void setLocationOfTest(HTSModel locationOfTest) {
        this.locationOfTest = locationOfTest;
    }

    public HIVResult getHivResult() {
        return hivResult;
    }

    public void setHivResult(HIVResult hivResult) {
        this.hivResult = hivResult;
    }
    
    public YesNo getEnrolledIntoCare() {
        return enrolledIntoCare;
    }

    public void setEnrolledIntoCare(YesNo enrolledIntoCare) {
        this.enrolledIntoCare = enrolledIntoCare;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public String getRelationshipOther() {
        return relationshipOther;
    }

    public void setRelationshipOther(String relationshipOther) {
        this.relationshipOther = relationshipOther;
    }

    public Date getSecondAppointmentDateForContact() {
        return secondAppointmentDateForContact;
    }

    public void setSecondAppointmentDateForContact(Date secondAppointmentDateForContact) {
        this.secondAppointmentDateForContact = secondAppointmentDateForContact;
    }

    public Date getThirdAppointmentDateForContact() {
        return thirdAppointmentDateForContact;
    }

    public void setThirdAppointmentDateForContact(Date thirdAppointmentDateForContact) {
        this.thirdAppointmentDateForContact = thirdAppointmentDateForContact;
    }

    public Integer getSequentialNumberOfContacts() {
        return sequentialNumberOfContacts;
    }

    public void setSequentialNumberOfContacts(Integer sequentialNumberOfContacts) {
        this.sequentialNumberOfContacts = sequentialNumberOfContacts;
    }

    public String getReferralSlipNumber() {
        return referralSlipNumber;
    }

    public void setReferralSlipNumber(String referralSlipNumber) {
        this.referralSlipNumber = referralSlipNumber;
    }

    public ReasonForIneligibilityForTesting getHivStatusEntry() {
        return hivStatusEntry;
    }

    public void setHivStatusEntry(ReasonForIneligibilityForTesting hivStatusEntry) {
        this.hivStatusEntry = hivStatusEntry;
    }

    public Date getIfTestedDateContactTested() {
        return ifTestedDateContactTested;
    }

    public void setIfTestedDateContactTested(Date ifTestedDateContactTested) {
        this.ifTestedDateContactTested = ifTestedDateContactTested;
    }

    public YesNo getOnART() {
        return onART;
    }

    public void setOnART(YesNo onART) {
        this.onART = onART;
    }

    public String getArtNumber() {
        return artNumber;
    }

    public void setArtNumber(String artNumber) {
        this.artNumber = artNumber;
    }

    public YesNo getReferralSlipReturned() {
        return referralSlipReturned;
    }

    public void setReferralSlipReturned(YesNo referralSlipReturned) {
        this.referralSlipReturned = referralSlipReturned;
    }

    public IndexCaseTestingForm getIndexCaseTestingForm() {
        return indexCaseTestingForm;
    }

    public void setIndexCaseTestingForm(IndexCaseTestingForm indexCaseTestingForm) {
        this.indexCaseTestingForm = indexCaseTestingForm;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Long getSequentialNumber() {
        return sequentialNumber;
    }

    public void setSequentialNumber(Long sequentialNumber) {
        this.sequentialNumber = sequentialNumber;
    }
    
}
