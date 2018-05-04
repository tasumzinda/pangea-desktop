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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.util.YesNo;
import javax.persistence.CascadeType;

/**
 *
 * @author Tasu Muzinda
 */
@Entity
public class IndexCaseTestingForm extends BaseEntity{
   // (cascade = {CascadeType.ALL})
   @ManyToOne
    private Facility facility;
   @ManyToOne
    private Province province;
   @ManyToOne
    private District district;
   
   
    private String firstNameOfIndex;
    private String lastNameOfIndex;
    //private Integer indexOIARTNumber;
    private String indexOIARTNumber;
    private YesNo initiatedOnART;
    private String reasonForNotBeingInitiated;
    private YesNo consentForListedContacts;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateIndexTestedOrDiagnosed;
    private String sequentialNumberOfIndex;
    private Long indexContactNumber;
   // private String indexContactNumber;

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

    public String getIndexOIARTNumber() {
        return indexOIARTNumber;
    }

    public void setIndexOIARTNumber(String indexOIARTNumber) {
        this.indexOIARTNumber = indexOIARTNumber;
    }

    /*public Integer getIndexOIARTNumber() {
        return indexOIARTNumber;
    }

    public void setIndexOIARTNumber(Integer indexOIARTNumber) {
        this.indexOIARTNumber = indexOIARTNumber;
    }
*/
    public YesNo getInitiatedOnART() {
        return initiatedOnART;
    }

    public void setInitiatedOnART(YesNo initiatedOnART) {
        this.initiatedOnART = initiatedOnART;
    }

    public String getReasonForNotBeingInitiated() {
        return reasonForNotBeingInitiated;
    }

    public void setReasonForNotBeingInitiated(String reasonForNotBeingInitiated) {
        this.reasonForNotBeingInitiated = reasonForNotBeingInitiated;
    }

    public YesNo getConsentForListedContacts() {
        return consentForListedContacts;
    }

    public void setConsentForListedContacts(YesNo consentForListedContacts) {
        this.consentForListedContacts = consentForListedContacts;
    }

    public Date getDateIndexTestedOrDiagnosed() {
        return dateIndexTestedOrDiagnosed;
    }

    public void setDateIndexTestedOrDiagnosed(Date dateIndexTestedOrDiagnosed) {
        this.dateIndexTestedOrDiagnosed = dateIndexTestedOrDiagnosed;
    }

    public String getSequentialNumberOfIndex() {
        return sequentialNumberOfIndex;
    }

    public void setSequentialNumberOfIndex(String sequentialNumberOfIndex) {
        this.sequentialNumberOfIndex = sequentialNumberOfIndex;
    }

    public Long getIndexContactNumber() {
        return indexContactNumber;
    }

    public void setIndexContactNumber(Long indexContactNumber) {
        this.indexContactNumber = indexContactNumber;
    }

   
    
}
