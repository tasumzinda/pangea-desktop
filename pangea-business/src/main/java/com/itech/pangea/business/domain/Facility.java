/*
 * Copyright 2014 Judge Muzinda.
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

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.itech.pangea.business.domain.util.FacilityLocation;
import com.itech.pangea.business.util.DateUtil;

/**
 *
 * @author Judge Muzinda
 */
@Entity
@Table(name = "facility")
public class Facility extends BaseName {
    private static final long serialVersionUID = 1L;
    @ManyToOne
    private District district;
    @ManyToOne
    private FacilityOwnership facilityOwnership;
    @ManyToOne
    private FacilityType facilityType;
    @Enumerated
    private FacilityLocation facilityLocation;
    private String facilityCode;
    private String contactName;
    private String contactMobileNumber;
    private String contactEmail;
    private String datimName;
    private String dhisName;
    private Double longitude;
    private Double latitude;
    @Transient
    private Province province;
    @Transient
    private String contactDetails;
    
    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public FacilityOwnership getFacilityOwnership() {
        return facilityOwnership;
    }

    public void setFacilityOwnership(FacilityOwnership facilityOwnership) {
        this.facilityOwnership = facilityOwnership;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public FacilityLocation getFacilityLocation() {
        return facilityLocation;
    }

    public void setFacilityLocation(FacilityLocation facilityLocation) {
        this.facilityLocation = facilityLocation;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobileNumber() {
        return contactMobileNumber;
    }

    public void setContactMobileNumber(String contactMobileNumber) {
        this.contactMobileNumber = contactMobileNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public String getDatimName() {
        return datimName;
    }

    public void setDatimName(String datimName) {
        this.datimName = datimName;
    }

    public String getDhisName() {
        return dhisName;
    }

    public void setDhisName(String dhisName) {
        this.dhisName = dhisName;
    }

    public Double getLongitude() {
        return longitude != null ? DateUtil.round(longitude, 4) : null;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude != null ? DateUtil.round(latitude, 4) : null;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getContactDetails() {
        return contactName+" "+contactMobileNumber;
    }

}