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
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.util.Gender;
import com.itech.pangea.business.domain.util.YesNo;

/**
 *
 * @author Tasu Muzinda
 */
@Entity
public class HTSEligibilityScreeningForm extends BaseEntity {

    private String firstName;
    private String lastName;
    private Integer cardNumber;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date mDate;
    @Transient
    private String dateC;
    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    @ManyToOne
    private Facility facility;
    private String mTime;
    private Gender gender;
    private Integer age;
    private YesNo eligibleForHIVTest;
    private YesNo willingToBeTestedToday;
    private String reasonForUnwillingnessToBeTested;
    private String reasonForIneligibilityForTesting;
    private String servicesBeingSought;
    private String screeningEntryStream;

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
    
    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getDateC() {
        return dateC;
    }

    public void setDateC(String dateC) {
        this.dateC = dateC;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
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

    public YesNo getEligibleForHIVTest() {
        return eligibleForHIVTest;
    }

    public void setEligibleForHIVTest(YesNo eligibleForHIVTest) {
        this.eligibleForHIVTest = eligibleForHIVTest;
    }

    public YesNo getWillingToBeTestedToday() {
        return willingToBeTestedToday;
    }

    public void setWillingToBeTestedToday(YesNo willingToBeTestedToday) {
        this.willingToBeTestedToday = willingToBeTestedToday;
    }

    public String getReasonForUnwillingnessToBeTested() {
        return reasonForUnwillingnessToBeTested;
    }

    public void setReasonForUnwillingnessToBeTested(String reasonForUnwillingnessToBeTested) {
        this.reasonForUnwillingnessToBeTested = reasonForUnwillingnessToBeTested;
    }

    public String getReasonForIneligibilityForTesting() {
        return reasonForIneligibilityForTesting;
    }

    public void setReasonForIneligibilityForTesting(String reasonForIneligibilityForTesting) {
        this.reasonForIneligibilityForTesting = reasonForIneligibilityForTesting;
    }

    public String getServicesBeingSought() {
        return servicesBeingSought;
    }

    public void setServicesBeingSought(String servicesBeingSought) {
        this.servicesBeingSought = servicesBeingSought;
    }

    public String getScreeningEntryStream() {
        return screeningEntryStream;
    }

    public void setScreeningEntryStream(String screeningEntryStream) {
        this.screeningEntryStream = screeningEntryStream;
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
    
    
}
