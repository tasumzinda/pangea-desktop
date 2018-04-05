/*
 * Copyright 2015 Judge Muzinda.
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

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import org.codehaus.jackson.annotate.JsonIgnore;
import com.itech.pangea.business.domain.util.Gender;
import com.itech.pangea.business.domain.util.MentorRole;

/**
 *
 * @author Judge Muzinda
 */
@Entity
public class Mentor extends BaseEntity {
    
    private String firstName;
    private String lastName;
    private String middleName;
    @Enumerated
    private Gender gender;
    private String email = "";
    private String mobileNumber;
    private String nationalId;
    private String workStation;
    @ManyToOne
    private Designation designation;
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(name = "mentor_district", joinColumns = {
        @JoinColumn(name = "mentor_id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "district_id", nullable = false)})
    @JsonIgnore
    private Set<District> districts = new HashSet<>();
    @ManyToMany(mappedBy = "mentors")
    @JsonIgnore
    private Set<Visit> visits = new HashSet<>();
    @Enumerated
    private com.itech.pangea.business.domain.util.MentorRole mentorRole;
    @Transient
    private String name;
    @Transient
    private Province province;
    @Transient
    private String userName;
    @Transient
    private String fullName;

    public Mentor() {
    }

    public Mentor(String firstName, String lastName, String middleName, Gender gender, String mobileNumber, String nationalId, MentorRole mentorRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.nationalId = nationalId;
        this.mentorRole = mentorRole;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return lastName+" "+firstName+" ("+getMentorRole().getName()+" )";
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public MentorRole getMentorRole() {
        return mentorRole;
    }

    public void setMentorRole(MentorRole mentorRole) {
        this.mentorRole = mentorRole;
    }

    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public String getFullName() {
        return lastName+" "+firstName.substring(0, 1);
    }

    public String getUserName() {
        String first = firstName.length() >=1 ? firstName.substring(0, 1) : "";
        String last = lastName.length() >=1 ? lastName.substring(0, 1) : "";
        String user_name = firstName+first+last+"@itech.co.zw";
        return user_name.toLowerCase();
    }
    
}