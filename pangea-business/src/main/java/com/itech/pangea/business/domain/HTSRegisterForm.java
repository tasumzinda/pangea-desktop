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
import com.itech.pangea.business.domain.util.ClientServices;
import com.itech.pangea.business.domain.util.Gender;
import com.itech.pangea.business.domain.util.HIVResult;
import com.itech.pangea.business.domain.util.HTSModel;
import com.itech.pangea.business.domain.util.ReasonForHIVTest;
import com.itech.pangea.business.domain.util.Test;
import com.itech.pangea.business.domain.util.YesNo;
import javax.persistence.CascadeType;

/**
 *
 * @author Tasu Muzinda
 */
@Entity
public class HTSRegisterForm extends BaseEstaForm{
    
    private String firstName;
    private String lastName;
    private String htsNumber;
    private String hivTestingReferralSlipNumber;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date mDate;
    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    private String mTime;
    @Enumerated
    private Gender gender;
    private Integer age;
    @Enumerated
    private ReasonForHIVTest reasonForHIVTest;
    @Enumerated
    private Test test;
    @Enumerated
    private HIVResult finalResult;
    @Transient
    private ClientServices clientServices;
    private String entryStream;
    @Transient
    private String other1;
    @Enumerated
    private YesNo inPreArt;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date registeredInPreArt;
    @Enumerated
    private YesNo initiatedOnArt;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfInitiation;
    private String oiArtNumber;
    @Enumerated
    private HTSModel hTSModel;
    private YesNo pregnantOrLactatingWoman;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHtsNumber() {
        return htsNumber;
    }

    public void setHtsNumber(String htsNumber) {
        this.htsNumber = htsNumber;
    }

    public String getHivTestingReferralSlipNumber() {
        return hivTestingReferralSlipNumber;
    }

    public void setHivTestingReferralSlipNumber(String hivTestingReferralSlipNumber) {
        this.hivTestingReferralSlipNumber = hivTestingReferralSlipNumber;
    }
    
    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ReasonForHIVTest getReasonForHIVTest() {
        return reasonForHIVTest;
    }

    public void setReasonForHIVTest(ReasonForHIVTest reasonForHIVTest) {
        this.reasonForHIVTest = reasonForHIVTest;
    }

    public String getEntryStream() {
        return entryStream;
    }

    public void setEntryStream(String entryStream) {
        this.entryStream = entryStream;
    }

    public YesNo getInPreArt() {
        return inPreArt;
    }

    public void setInPreArt(YesNo inPreArt) {
        this.inPreArt = inPreArt;
    }

    public Date getRegisteredInPreArt() {
        return registeredInPreArt;
    }

    public void setRegisteredInPreArt(Date registeredInPreArt) {
        this.registeredInPreArt = registeredInPreArt;
    }

    public YesNo getInitiatedOnArt() {
        return initiatedOnArt;
    }

    public void setInitiatedOnArt(YesNo initiatedOnArt) {
        this.initiatedOnArt = initiatedOnArt;
    }

    public Date getDateOfInitiation() {
        return dateOfInitiation;
    }

    public void setDateOfInitiation(Date dateOfInitiation) {
        this.dateOfInitiation = dateOfInitiation;
    }

    public String getOiArtNumber() {
        return oiArtNumber;
    }

    public void setOiArtNumber(String oiArtNumber) {
        this.oiArtNumber = oiArtNumber;
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

    public HIVResult getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(HIVResult finalResult) {
        this.finalResult = finalResult;
    }
    
    public ClientServices getClientServices() {
        return clientServices;
    }

    public void setClientServices(ClientServices clientServices) {
        this.clientServices = clientServices;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public HTSModel gethTSModel() {
        return hTSModel;
    }

    public void sethTSModel(HTSModel hTSModel) {
        this.hTSModel = hTSModel;
    }

    public YesNo getPregnantOrLactatingWoman() {
        return pregnantOrLactatingWoman;
    }

    public void setPregnantOrLactatingWoman(YesNo pregnantOrLactatingWoman) {
        this.pregnantOrLactatingWoman = pregnantOrLactatingWoman;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
