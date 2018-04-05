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
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.util.CallOutcome;
import javax.persistence.CascadeType;

/**
 *
 * @author Tasu Muzinda
 */
@Entity
public class DefaulterTrackingForm extends BaseEntity{
    private String firstNameOfIndex;
    private String lastNameOfIndex;
    private String physicalAddress;
    private String contactDetails;
    //private Integer oIARTNumber;
    private String oIARTNumber;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateArtInitiation;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date reviewDate;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date appointmentDeemedDefaulter;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfCall1;
    @Enumerated
    private CallOutcome call1Outcome;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date appointmentDateIfLinkedToCare;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfCall2;
    @Enumerated
    private CallOutcome call2Outcome;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date appointmentDateIfLinkedToCare2;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfCall3;
    @Enumerated
    private CallOutcome call3Outcome;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date appointmentDateIfLinkedToCare3;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfVisit;
    @Enumerated
    private CallOutcome visitOutcome;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date appointmentDateIfLinkedToCare1;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateClientVisitedFacility;
    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    @Enumerated
    private CallOutcome finalOutcome;

    public String getFirstNameOfIndex() {
        return firstNameOfIndex;
    }

    public void setFirstNameOfIndex(String firstNameOfIndex) {
        this.firstNameOfIndex = firstNameOfIndex;
    }

    public String getLastNameOfIndex() {
        return lastNameOfIndex;
    }

    public void setLastNameOfIndex(String lastNameOfIndex) {
        this.lastNameOfIndex = lastNameOfIndex;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getoIARTNumber() {
        return oIARTNumber;
    }

    public void setoIARTNumber(String oIARTNumber) {
        this.oIARTNumber = oIARTNumber;
    }
    
/*
    public Integer getoIARTNumber() {
        return oIARTNumber;
    }

    public void setoIARTNumber(Integer oIARTNumber) {
        this.oIARTNumber = oIARTNumber;
    }
*/
    public Date getDateArtInitiation() {
        return dateArtInitiation;
    }

    public void setDateArtInitiation(Date dateArtInitiation) {
        this.dateArtInitiation = dateArtInitiation;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public Date getAppointmentDeemedDefaulter() {
        return appointmentDeemedDefaulter;
    }

    public void setAppointmentDeemedDefaulter(Date appointmentDeemedDefaulter) {
        this.appointmentDeemedDefaulter = appointmentDeemedDefaulter;
    }

    public Date getDateOfCall1() {
        return dateOfCall1;
    }

    public void setDateOfCall1(Date dateOfCall1) {
        this.dateOfCall1 = dateOfCall1;
    }

    public Date getAppointmentDateIfLinkedToCare() {
        return appointmentDateIfLinkedToCare;
    }

    public void setAppointmentDateIfLinkedToCare(Date appointmentDateIfLinkedToCare) {
        this.appointmentDateIfLinkedToCare = appointmentDateIfLinkedToCare;
    }

    public Date getDateOfCall2() {
        return dateOfCall2;
    }

    public void setDateOfCall2(Date dateOfCall2) {
        this.dateOfCall2 = dateOfCall2;
    }

    public Date getDateOfCall3() {
        return dateOfCall3;
    }

    public void setDateOfCall3(Date dateOfCall3) {
        this.dateOfCall3 = dateOfCall3;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public Date getAppointmentDateIfLinkedToCare1() {
        return appointmentDateIfLinkedToCare1;
    }

    public void setAppointmentDateIfLinkedToCare1(Date appointmentDateIfLinkedToCare1) {
        this.appointmentDateIfLinkedToCare1 = appointmentDateIfLinkedToCare1;
    }

    public Date getDateClientVisitedFacility() {
        return dateClientVisitedFacility;
    }

    public void setDateClientVisitedFacility(Date dateClientVisitedFacility) {
        this.dateClientVisitedFacility = dateClientVisitedFacility;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public CallOutcome getCall1Outcome() {
        return call1Outcome;
    }

    public void setCall1Outcome(CallOutcome call1Outcome) {
        this.call1Outcome = call1Outcome;
    }

    public CallOutcome getCall2Outcome() {
        return call2Outcome;
    }

    public void setCall2Outcome(CallOutcome call2Outcome) {
        this.call2Outcome = call2Outcome;
    }

    public CallOutcome getCall3Outcome() {
        return call3Outcome;
    }

    public void setCall3Outcome(CallOutcome call3Outcome) {
        this.call3Outcome = call3Outcome;
    }

    public CallOutcome getVisitOutcome() {
        return visitOutcome;
    }

    public void setVisitOutcome(CallOutcome visitOutcome) {
        this.visitOutcome = visitOutcome;
    }

    public Date getAppointmentDateIfLinkedToCare2() {
        return appointmentDateIfLinkedToCare2;
    }

    public void setAppointmentDateIfLinkedToCare2(Date appointmentDateIfLinkedToCare2) {
        this.appointmentDateIfLinkedToCare2 = appointmentDateIfLinkedToCare2;
    }

    public Date getAppointmentDateIfLinkedToCare3() {
        return appointmentDateIfLinkedToCare3;
    }

    public void setAppointmentDateIfLinkedToCare3(Date appointmentDateIfLinkedToCare3) {
        this.appointmentDateIfLinkedToCare3 = appointmentDateIfLinkedToCare3;
    }

    public CallOutcome getFinalOutcome() {
        return finalOutcome;
    }

    public void setFinalOutcome(CallOutcome finalOutcome) {
        this.finalOutcome = finalOutcome;
    }
    
    
}
