/*
 * Copyright 2017 User.
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

/**
 *
 * @author User
 */
@Entity
public class CommunityBasedDSD extends BaseEntity{
    
    @ManyToOne
    private Facility facility;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateCompleted;
    private String name;
    @Transient
    private String datec;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Transient
    private String start;
    @Transient
    private String end;
    
    private Long maleLessThanOne6;
    private Long femaleLessThanOne6;
    private Long maleOneToFour6;
    private Long femaleOneToFour6;
    private Long maleFiveToNine6;
    private Long femaleFiveToNine6;
    private Long maleTenToFourteen6;
    private Long femaleTenToFourteen6;
    private Long maleFifteenToNineteen6;
    private Long femaleFifteenToNineteen6;
    private Long maleTwentyToTwentyFour6;
    private Long femaleTwentyToTwentyFour6;
    private Long maleTwentyFiveToTwentyNine6;
    private Long femaleTwentyFiveToTwentyNine6;
    private Long maleThirtyToThirtyFour6;
    private Long femaleThirtyToThirtyFour6;
    private Long maleThirtyFiveToThirtyNine6;
    private Long femaleThirtyFiveToThirtyNine6;
    private Long maleFortyToFortyFour6;
    private Long femaleFortyToFortyFour6;
    private Long maleFortyFiveToFortyNine6;
    private Long femaleFortyFiveToFortyNine6;
    private Long maleFiftyPlus6;
    private Long femaleFiftyPlus6;
    
    private Long maleLessThanOne1;
    private Long femaleLessThanOne1;
    private Long maleOneToFour1;
    private Long femaleOneToFour1;
    private Long maleFiveToNine1;
    private Long femaleFiveToNine1;
    private Long maleTenToFourteen1;
    private Long femaleTenToFourteen1;
    private Long maleFifteenToNineteen1;
    private Long femaleFifteenToNineteen1;
    private Long maleTwentyToTwentyFour1;
    private Long femaleTwentyToTwentyFour1;
    private Long maleTwentyFiveToTwentyNine1;
    private Long femaleTwentyFiveToTwentyNine1;
    private Long maleThirtyToThirtyFour1;
    private Long femaleThirtyToThirtyFour1;
    private Long maleThirtyFiveToThirtyNine1;
    private Long femaleThirtyFiveToThirtyNine1;
    private Long maleFortyToFortyFour1;
    private Long femaleFortyToFortyFour1;
    private Long maleFortyFiveToFortyNine1;
    private Long femaleFortyFiveToFortyNine1;
    private Long maleFiftyPlus1;
    private Long femaleFiftyPlus1; 
    
    private Long maleLessThanOne2;
    private Long femaleLessThanOne2;
    private Long maleOneToFour2;
    private Long femaleOneToFour2;
    private Long maleFiveToNine2;
    private Long femaleFiveToNine2;
    private Long maleTenToFourteen2;
    private Long femaleTenToFourteen2;
    private Long maleFifteenToNineteen2;
    private Long femaleFifteenToNineteen2;
    private Long maleTwentyToTwentyFour2;
    private Long femaleTwentyToTwentyFour2;
    private Long maleTwentyFiveToTwentyNine2;
    private Long femaleTwentyFiveToTwentyNine2;
    private Long maleThirtyToThirtyFour2;
    private Long femaleThirtyToThirtyFour2;
    private Long maleThirtyFiveToThirtyNine2;
    private Long femaleThirtyFiveToThirtyNine2;
    private Long maleFortyToFortyFour2;
    private Long femaleFortyToFortyFour2;
    private Long maleFortyFiveToFortyNine2;
    private Long femaleFortyFiveToFortyNine2;
    private Long maleFiftyPlus2;
    private Long femaleFiftyPlus2;
    
    private Long maleLessThanOne3;
    private Long femaleLessThanOne3;
    private Long maleOneToFour3;
    private Long femaleOneToFour3;
    private Long maleFiveToNine3;
    private Long femaleFiveToNine3;
    private Long maleTenToFourteen3;
    private Long femaleTenToFourteen3;
    private Long maleFifteenToNineteen3;
    private Long femaleFifteenToNineteen3;
    private Long maleTwentyToTwentyFour3;
    private Long femaleTwentyToTwentyFour3;
    private Long maleTwentyFiveToTwentyNine3;
    private Long femaleTwentyFiveToTwentyNine3;
    private Long maleThirtyToThirtyFour3;
    private Long femaleThirtyToThirtyFour3;
    private Long maleThirtyFiveToThirtyNine3;
    private Long femaleThirtyFiveToThirtyNine3;
    private Long maleFortyToFortyFour3;
    private Long femaleFortyToFortyFour3;
    private Long maleFortyFiveToFortyNine3;
    private Long femaleFortyFiveToFortyNine3;
    private Long maleFiftyPlus3;
    private Long femaleFiftyPlus3;
    
    private Long maleLessThanOne4;
    private Long femaleLessThanOne4;
    private Long maleOneToFour4;
    private Long femaleOneToFour4;
    private Long maleFiveToNine4;
    private Long femaleFiveToNine4;
    private Long maleTenToFourteen4;
    private Long femaleTenToFourteen4;
    private Long maleFifteenToNineteen4;
    private Long femaleFifteenToNineteen4;
    private Long maleTwentyToTwentyFour4;
    private Long femaleTwentyToTwentyFour4;
    private Long maleTwentyFiveToTwentyNine4;
    private Long femaleTwentyFiveToTwentyNine4;
    private Long maleThirtyToThirtyFour4;
    private Long femaleThirtyToThirtyFour4;
    private Long maleThirtyFiveToThirtyNine4;
    private Long femaleThirtyFiveToThirtyNine4;
    private Long maleFortyToFortyFour4;
    private Long femaleFortyToFortyFour4;
    private Long maleFortyFiveToFortyNine4;
    private Long femaleFortyFiveToFortyNine4;
    private Long maleFiftyPlus4;
    private Long femaleFiftyPlus4;
    
    private Long maleLessThanOne5;
    private Long femaleLessThanOne5;
    private Long maleOneToFour5;
    private Long femaleOneToFour5;
    private Long maleFiveToNine5;
    private Long femaleFiveToNine5;
    private Long maleTenToFourteen5;
    private Long femaleTenToFourteen5;
    private Long maleFifteenToNineteen5;
    private Long femaleFifteenToNineteen5;
    private Long maleTwentyToTwentyFour5;
    private Long femaleTwentyToTwentyFour5;
    private Long maleTwentyFiveToTwentyNine5;
    private Long femaleTwentyFiveToTwentyNine5;
    private Long maleThirtyToThirtyFour5;
    private Long femaleThirtyToThirtyFour5;
    private Long maleThirtyFiveToThirtyNine5;
    private Long femaleThirtyFiveToThirtyNine5;
    private Long maleFortyToFortyFour5;
    private Long femaleFortyToFortyFour5;
    private Long maleFortyFiveToFortyNine5;
    private Long femaleFortyFiveToFortyNine5;
    private Long maleFiftyPlus5;
    private Long femaleFiftyPlus5;
    
    private Long maleLessThanOne7;
    private Long femaleLessThanOne7;
    private Long maleOneToFour7;
    private Long femaleOneToFour7;
    private Long maleFiveToNine7;
    private Long femaleFiveToNine7;
    private Long maleTenToFourteen7;
    private Long femaleTenToFourteen7;
    private Long maleFifteenToNineteen7;
    private Long femaleFifteenToNineteen7;
    private Long maleTwentyToTwentyFour7;
    private Long femaleTwentyToTwentyFour7;
    private Long maleTwentyFiveToTwentyNine7;
    private Long femaleTwentyFiveToTwentyNine7;
    private Long maleThirtyToThirtyFour7;
    private Long femaleThirtyToThirtyFour7;
    private Long maleThirtyFiveToThirtyNine7;
    private Long femaleThirtyFiveToThirtyNine7;
    private Long maleFortyToFortyFour7;
    private Long femaleFortyToFortyFour7;
    private Long maleFortyFiveToFortyNine7;
    private Long femaleFortyFiveToFortyNine7;
    private Long maleFiftyPlus7;
    private Long femaleFiftyPlus7;
    
    private Long maleLessThanOne8;
    private Long femaleLessThanOne8;
    private Long maleOneToFour8;
    private Long femaleOneToFour8;
    private Long maleFiveToNine8;
    private Long femaleFiveToNine8;
    private Long maleTenToFourteen8;
    private Long femaleTenToFourteen8;
    private Long maleFifteenToNineteen8;
    private Long femaleFifteenToNineteen8;
    private Long maleTwentyToTwentyFour8;
    private Long femaleTwentyToTwentyFour8;
    private Long maleTwentyFiveToTwentyNine8;
    private Long femaleTwentyFiveToTwentyNine8;
    private Long maleThirtyToThirtyFour8;
    private Long femaleThirtyToThirtyFour8;
    private Long maleThirtyFiveToThirtyNine8;
    private Long femaleThirtyFiveToThirtyNine8;
    private Long maleFortyToFortyFour8;
    private Long femaleFortyToFortyFour8;
    private Long maleFortyFiveToFortyNine8;
    private Long femaleFortyFiveToFortyNine8;
    private Long maleFiftyPlus8;
    private Long femaleFiftyPlus8;

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatec() {
        return datec;
    }

    public void setDatec(String datec) {
        this.datec = datec;
    }


    public Long getMaleLessThanOne1() {
        return maleLessThanOne1;
    }

    public void setMaleLessThanOne1(Long maleLessThanOne1) {
        this.maleLessThanOne1 = maleLessThanOne1;
    }

    public Long getFemaleLessThanOne1() {
        return femaleLessThanOne1;
    }

    public void setFemaleLessThanOne1(Long femaleLessThanOne1) {
        this.femaleLessThanOne1 = femaleLessThanOne1;
    }

    public Long getMaleOneToFour1() {
        return maleOneToFour1;
    }

    public void setMaleOneToFour1(Long maleOneToFour1) {
        this.maleOneToFour1 = maleOneToFour1;
    }

    public Long getFemaleOneToFour1() {
        return femaleOneToFour1;
    }

    public void setFemaleOneToFour1(Long femaleOneToFour1) {
        this.femaleOneToFour1 = femaleOneToFour1;
    }

    public Long getMaleFiveToNine1() {
        return maleFiveToNine1;
    }

    public void setMaleFiveToNine1(Long maleFiveToNine1) {
        this.maleFiveToNine1 = maleFiveToNine1;
    }

    public Long getFemaleFiveToNine1() {
        return femaleFiveToNine1;
    }

    public void setFemaleFiveToNine1(Long femaleFiveToNine1) {
        this.femaleFiveToNine1 = femaleFiveToNine1;
    }

    public Long getMaleTenToFourteen1() {
        return maleTenToFourteen1;
    }

    public void setMaleTenToFourteen1(Long maleTenToFourteen1) {
        this.maleTenToFourteen1 = maleTenToFourteen1;
    }

    public Long getFemaleTenToFourteen1() {
        return femaleTenToFourteen1;
    }

    public void setFemaleTenToFourteen1(Long femaleTenToFourteen1) {
        this.femaleTenToFourteen1 = femaleTenToFourteen1;
    }

    public Long getMaleFifteenToNineteen1() {
        return maleFifteenToNineteen1;
    }

    public void setMaleFifteenToNineteen1(Long maleFifteenToNineteen1) {
        this.maleFifteenToNineteen1 = maleFifteenToNineteen1;
    }

    public Long getFemaleFifteenToNineteen1() {
        return femaleFifteenToNineteen1;
    }

    public void setFemaleFifteenToNineteen1(Long femaleFifteenToNineteen1) {
        this.femaleFifteenToNineteen1 = femaleFifteenToNineteen1;
    }

    public Long getMaleTwentyToTwentyFour1() {
        return maleTwentyToTwentyFour1;
    }

    public void setMaleTwentyToTwentyFour1(Long maleTwentyToTwentyFour1) {
        this.maleTwentyToTwentyFour1 = maleTwentyToTwentyFour1;
    }

    public Long getFemaleTwentyToTwentyFour1() {
        return femaleTwentyToTwentyFour1;
    }

    public void setFemaleTwentyToTwentyFour1(Long femaleTwentyToTwentyFour1) {
        this.femaleTwentyToTwentyFour1 = femaleTwentyToTwentyFour1;
    }

    public Long getMaleFiftyPlus1() {
        return maleFiftyPlus1;
    }

    public void setMaleFiftyPlus1(Long maleFiftyPlus1) {
        this.maleFiftyPlus1 = maleFiftyPlus1;
    }

    public Long getFemaleFiftyPlus1() {
        return femaleFiftyPlus1;
    }

    public void setFemaleFiftyPlus1(Long femaleFiftyPlus1) {
        this.femaleFiftyPlus1 = femaleFiftyPlus1;
    }

    public Long getMaleLessThanOne2() {
        return maleLessThanOne2;
    }

    public void setMaleLessThanOne2(Long maleLessThanOne2) {
        this.maleLessThanOne2 = maleLessThanOne2;
    }

    public Long getFemaleLessThanOne2() {
        return femaleLessThanOne2;
    }

    public void setFemaleLessThanOne2(Long femaleLessThanOne2) {
        this.femaleLessThanOne2 = femaleLessThanOne2;
    }

    public Long getMaleOneToFour2() {
        return maleOneToFour2;
    }

    public void setMaleOneToFour2(Long maleOneToFour2) {
        this.maleOneToFour2 = maleOneToFour2;
    }

    public Long getFemaleOneToFour2() {
        return femaleOneToFour2;
    }

    public void setFemaleOneToFour2(Long femaleOneToFour2) {
        this.femaleOneToFour2 = femaleOneToFour2;
    }

    public Long getMaleFiveToNine2() {
        return maleFiveToNine2;
    }

    public void setMaleFiveToNine2(Long maleFiveToNine2) {
        this.maleFiveToNine2 = maleFiveToNine2;
    }

    public Long getFemaleFiveToNine2() {
        return femaleFiveToNine2;
    }

    public void setFemaleFiveToNine2(Long femaleFiveToNine2) {
        this.femaleFiveToNine2 = femaleFiveToNine2;
    }

    public Long getMaleTenToFourteen2() {
        return maleTenToFourteen2;
    }

    public void setMaleTenToFourteen2(Long maleTenToFourteen2) {
        this.maleTenToFourteen2 = maleTenToFourteen2;
    }

    public Long getFemaleTenToFourteen2() {
        return femaleTenToFourteen2;
    }

    public void setFemaleTenToFourteen2(Long femaleTenToFourteen2) {
        this.femaleTenToFourteen2 = femaleTenToFourteen2;
    }

    public Long getMaleFifteenToNineteen2() {
        return maleFifteenToNineteen2;
    }

    public void setMaleFifteenToNineteen2(Long maleFifteenToNineteen2) {
        this.maleFifteenToNineteen2 = maleFifteenToNineteen2;
    }

    public Long getFemaleFifteenToNineteen2() {
        return femaleFifteenToNineteen2;
    }

    public void setFemaleFifteenToNineteen2(Long femaleFifteenToNineteen2) {
        this.femaleFifteenToNineteen2 = femaleFifteenToNineteen2;
    }

    public Long getMaleTwentyToTwentyFour2() {
        return maleTwentyToTwentyFour2;
    }

    public void setMaleTwentyToTwentyFour2(Long maleTwentyToTwentyFour2) {
        this.maleTwentyToTwentyFour2 = maleTwentyToTwentyFour2;
    }

    public Long getFemaleTwentyToTwentyFour2() {
        return femaleTwentyToTwentyFour2;
    }

    public void setFemaleTwentyToTwentyFour2(Long femaleTwentyToTwentyFour2) {
        this.femaleTwentyToTwentyFour2 = femaleTwentyToTwentyFour2;
    }

    public Long getMaleFiftyPlus2() {
        return maleFiftyPlus2;
    }

    public void setMaleFiftyPlus2(Long maleFiftyPlus2) {
        this.maleFiftyPlus2 = maleFiftyPlus2;
    }

    public Long getFemaleFiftyPlus2() {
        return femaleFiftyPlus2;
    }

    public void setFemaleFiftyPlus2(Long femaleFiftyPlus2) {
        this.femaleFiftyPlus2 = femaleFiftyPlus2;
    }

    public Long getMaleLessThanOne3() {
        return maleLessThanOne3;
    }

    public void setMaleLessThanOne3(Long maleLessThanOne3) {
        this.maleLessThanOne3 = maleLessThanOne3;
    }

    public Long getFemaleLessThanOne3() {
        return femaleLessThanOne3;
    }

    public void setFemaleLessThanOne3(Long femaleLessThanOne3) {
        this.femaleLessThanOne3 = femaleLessThanOne3;
    }

    public Long getMaleOneToFour3() {
        return maleOneToFour3;
    }

    public void setMaleOneToFour3(Long maleOneToFour3) {
        this.maleOneToFour3 = maleOneToFour3;
    }

    public Long getFemaleOneToFour3() {
        return femaleOneToFour3;
    }

    public void setFemaleOneToFour3(Long femaleOneToFour3) {
        this.femaleOneToFour3 = femaleOneToFour3;
    }

    public Long getMaleFiveToNine3() {
        return maleFiveToNine3;
    }

    public void setMaleFiveToNine3(Long maleFiveToNine3) {
        this.maleFiveToNine3 = maleFiveToNine3;
    }

    public Long getFemaleFiveToNine3() {
        return femaleFiveToNine3;
    }

    public void setFemaleFiveToNine3(Long femaleFiveToNine3) {
        this.femaleFiveToNine3 = femaleFiveToNine3;
    }

    public Long getMaleTenToFourteen3() {
        return maleTenToFourteen3;
    }

    public void setMaleTenToFourteen3(Long maleTenToFourteen3) {
        this.maleTenToFourteen3 = maleTenToFourteen3;
    }

    public Long getFemaleTenToFourteen3() {
        return femaleTenToFourteen3;
    }

    public void setFemaleTenToFourteen3(Long femaleTenToFourteen3) {
        this.femaleTenToFourteen3 = femaleTenToFourteen3;
    }

    public Long getMaleFifteenToNineteen3() {
        return maleFifteenToNineteen3;
    }

    public void setMaleFifteenToNineteen3(Long maleFifteenToNineteen3) {
        this.maleFifteenToNineteen3 = maleFifteenToNineteen3;
    }

    public Long getFemaleFifteenToNineteen3() {
        return femaleFifteenToNineteen3;
    }

    public void setFemaleFifteenToNineteen3(Long femaleFifteenToNineteen3) {
        this.femaleFifteenToNineteen3 = femaleFifteenToNineteen3;
    }

    public Long getMaleTwentyToTwentyFour3() {
        return maleTwentyToTwentyFour3;
    }

    public void setMaleTwentyToTwentyFour3(Long maleTwentyToTwentyFour3) {
        this.maleTwentyToTwentyFour3 = maleTwentyToTwentyFour3;
    }

    public Long getFemaleTwentyToTwentyFour3() {
        return femaleTwentyToTwentyFour3;
    }

    public void setFemaleTwentyToTwentyFour3(Long femaleTwentyToTwentyFour3) {
        this.femaleTwentyToTwentyFour3 = femaleTwentyToTwentyFour3;
    }

    public Long getMaleFiftyPlus3() {
        return maleFiftyPlus3;
    }

    public void setMaleFiftyPlus3(Long maleFiftyPlus3) {
        this.maleFiftyPlus3 = maleFiftyPlus3;
    }

    public Long getFemaleFiftyPlus3() {
        return femaleFiftyPlus3;
    }

    public void setFemaleFiftyPlus3(Long femaleFiftyPlus3) {
        this.femaleFiftyPlus3 = femaleFiftyPlus3;
    }

    public Long getMaleLessThanOne4() {
        return maleLessThanOne4;
    }

    public void setMaleLessThanOne4(Long maleLessThanOne4) {
        this.maleLessThanOne4 = maleLessThanOne4;
    }

    public Long getFemaleLessThanOne4() {
        return femaleLessThanOne4;
    }

    public void setFemaleLessThanOne4(Long femaleLessThanOne4) {
        this.femaleLessThanOne4 = femaleLessThanOne4;
    }

    public Long getMaleOneToFour4() {
        return maleOneToFour4;
    }

    public void setMaleOneToFour4(Long maleOneToFour4) {
        this.maleOneToFour4 = maleOneToFour4;
    }

    public Long getFemaleOneToFour4() {
        return femaleOneToFour4;
    }

    public void setFemaleOneToFour4(Long femaleOneToFour4) {
        this.femaleOneToFour4 = femaleOneToFour4;
    }

    public Long getMaleFiveToNine4() {
        return maleFiveToNine4;
    }

    public void setMaleFiveToNine4(Long maleFiveToNine4) {
        this.maleFiveToNine4 = maleFiveToNine4;
    }

    public Long getFemaleFiveToNine4() {
        return femaleFiveToNine4;
    }

    public void setFemaleFiveToNine4(Long femaleFiveToNine4) {
        this.femaleFiveToNine4 = femaleFiveToNine4;
    }

    public Long getMaleTenToFourteen4() {
        return maleTenToFourteen4;
    }

    public void setMaleTenToFourteen4(Long maleTenToFourteen4) {
        this.maleTenToFourteen4 = maleTenToFourteen4;
    }

    public Long getFemaleTenToFourteen4() {
        return femaleTenToFourteen4;
    }

    public void setFemaleTenToFourteen4(Long femaleTenToFourteen4) {
        this.femaleTenToFourteen4 = femaleTenToFourteen4;
    }

    public Long getMaleFifteenToNineteen4() {
        return maleFifteenToNineteen4;
    }

    public void setMaleFifteenToNineteen4(Long maleFifteenToNineteen4) {
        this.maleFifteenToNineteen4 = maleFifteenToNineteen4;
    }

    public Long getFemaleFifteenToNineteen4() {
        return femaleFifteenToNineteen4;
    }

    public void setFemaleFifteenToNineteen4(Long femaleFifteenToNineteen4) {
        this.femaleFifteenToNineteen4 = femaleFifteenToNineteen4;
    }

    public Long getMaleTwentyToTwentyFour4() {
        return maleTwentyToTwentyFour4;
    }

    public void setMaleTwentyToTwentyFour4(Long maleTwentyToTwentyFour4) {
        this.maleTwentyToTwentyFour4 = maleTwentyToTwentyFour4;
    }

    public Long getFemaleTwentyToTwentyFour4() {
        return femaleTwentyToTwentyFour4;
    }

    public void setFemaleTwentyToTwentyFour4(Long femaleTwentyToTwentyFour4) {
        this.femaleTwentyToTwentyFour4 = femaleTwentyToTwentyFour4;
    }

    public Long getMaleFiftyPlus4() {
        return maleFiftyPlus4;
    }

    public void setMaleFiftyPlus4(Long maleFiftyPlus4) {
        this.maleFiftyPlus4 = maleFiftyPlus4;
    }

    public Long getFemaleFiftyPlus4() {
        return femaleFiftyPlus4;
    }

    public void setFemaleFiftyPlus4(Long femaleFiftyPlus4) {
        this.femaleFiftyPlus4 = femaleFiftyPlus4;
    }

    public Long getMaleLessThanOne5() {
        return maleLessThanOne5;
    }

    public void setMaleLessThanOne5(Long maleLessThanOne5) {
        this.maleLessThanOne5 = maleLessThanOne5;
    }

    public Long getFemaleLessThanOne5() {
        return femaleLessThanOne5;
    }

    public void setFemaleLessThanOne5(Long femaleLessThanOne5) {
        this.femaleLessThanOne5 = femaleLessThanOne5;
    }

    public Long getMaleOneToFour5() {
        return maleOneToFour5;
    }

    public void setMaleOneToFour5(Long maleOneToFour5) {
        this.maleOneToFour5 = maleOneToFour5;
    }

    public Long getFemaleOneToFour5() {
        return femaleOneToFour5;
    }

    public void setFemaleOneToFour5(Long femaleOneToFour5) {
        this.femaleOneToFour5 = femaleOneToFour5;
    }

    public Long getMaleFiveToNine5() {
        return maleFiveToNine5;
    }

    public void setMaleFiveToNine5(Long maleFiveToNine5) {
        this.maleFiveToNine5 = maleFiveToNine5;
    }

    public Long getFemaleFiveToNine5() {
        return femaleFiveToNine5;
    }

    public void setFemaleFiveToNine5(Long femaleFiveToNine5) {
        this.femaleFiveToNine5 = femaleFiveToNine5;
    }

    public Long getMaleTenToFourteen5() {
        return maleTenToFourteen5;
    }

    public void setMaleTenToFourteen5(Long maleTenToFourteen5) {
        this.maleTenToFourteen5 = maleTenToFourteen5;
    }

    public Long getFemaleTenToFourteen5() {
        return femaleTenToFourteen5;
    }

    public void setFemaleTenToFourteen5(Long femaleTenToFourteen5) {
        this.femaleTenToFourteen5 = femaleTenToFourteen5;
    }

    public Long getMaleFifteenToNineteen5() {
        return maleFifteenToNineteen5;
    }

    public void setMaleFifteenToNineteen5(Long maleFifteenToNineteen5) {
        this.maleFifteenToNineteen5 = maleFifteenToNineteen5;
    }

    public Long getFemaleFifteenToNineteen5() {
        return femaleFifteenToNineteen5;
    }

    public void setFemaleFifteenToNineteen5(Long femaleFifteenToNineteen5) {
        this.femaleFifteenToNineteen5 = femaleFifteenToNineteen5;
    }

    public Long getMaleTwentyToTwentyFour5() {
        return maleTwentyToTwentyFour5;
    }

    public void setMaleTwentyToTwentyFour5(Long maleTwentyToTwentyFour5) {
        this.maleTwentyToTwentyFour5 = maleTwentyToTwentyFour5;
    }

    public Long getFemaleTwentyToTwentyFour5() {
        return femaleTwentyToTwentyFour5;
    }

    public void setFemaleTwentyToTwentyFour5(Long femaleTwentyToTwentyFour5) {
        this.femaleTwentyToTwentyFour5 = femaleTwentyToTwentyFour5;
    }

    public Long getMaleFiftyPlus5() {
        return maleFiftyPlus5;
    }

    public void setMaleFiftyPlus5(Long maleFiftyPlus5) {
        this.maleFiftyPlus5 = maleFiftyPlus5;
    }

    public Long getFemaleFiftyPlus5() {
        return femaleFiftyPlus5;
    }

    public void setFemaleFiftyPlus5(Long femaleFiftyPlus5) {
        this.femaleFiftyPlus5 = femaleFiftyPlus5;
    }

    public Long getMaleLessThanOne6() {
        return maleLessThanOne6;
    }

    public void setMaleLessThanOne6(Long maleLessThanOne6) {
        this.maleLessThanOne6 = maleLessThanOne6;
    }

    public Long getFemaleLessThanOne6() {
        return femaleLessThanOne6;
    }

    public void setFemaleLessThanOne6(Long femaleLessThanOne6) {
        this.femaleLessThanOne6 = femaleLessThanOne6;
    }

    public Long getMaleOneToFour6() {
        return maleOneToFour6;
    }

    public void setMaleOneToFour6(Long maleOneToFour6) {
        this.maleOneToFour6 = maleOneToFour6;
    }

    public Long getFemaleOneToFour6() {
        return femaleOneToFour6;
    }

    public void setFemaleOneToFour6(Long femaleOneToFour6) {
        this.femaleOneToFour6 = femaleOneToFour6;
    }

    public Long getMaleFiveToNine6() {
        return maleFiveToNine6;
    }

    public void setMaleFiveToNine6(Long maleFiveToNine6) {
        this.maleFiveToNine6 = maleFiveToNine6;
    }

    public Long getFemaleFiveToNine6() {
        return femaleFiveToNine6;
    }

    public void setFemaleFiveToNine6(Long femaleFiveToNine6) {
        this.femaleFiveToNine6 = femaleFiveToNine6;
    }

    public Long getMaleTenToFourteen6() {
        return maleTenToFourteen6;
    }

    public void setMaleTenToFourteen6(Long maleTenToFourteen6) {
        this.maleTenToFourteen6 = maleTenToFourteen6;
    }

    public Long getFemaleTenToFourteen6() {
        return femaleTenToFourteen6;
    }

    public void setFemaleTenToFourteen6(Long femaleTenToFourteen6) {
        this.femaleTenToFourteen6 = femaleTenToFourteen6;
    }

    public Long getMaleFifteenToNineteen6() {
        return maleFifteenToNineteen6;
    }

    public void setMaleFifteenToNineteen6(Long maleFifteenToNineteen6) {
        this.maleFifteenToNineteen6 = maleFifteenToNineteen6;
    }

    public Long getFemaleFifteenToNineteen6() {
        return femaleFifteenToNineteen6;
    }

    public void setFemaleFifteenToNineteen6(Long femaleFifteenToNineteen6) {
        this.femaleFifteenToNineteen6 = femaleFifteenToNineteen6;
    }

    public Long getMaleTwentyToTwentyFour6() {
        return maleTwentyToTwentyFour6;
    }

    public void setMaleTwentyToTwentyFour6(Long maleTwentyToTwentyFour6) {
        this.maleTwentyToTwentyFour6 = maleTwentyToTwentyFour6;
    }

    public Long getFemaleTwentyToTwentyFour6() {
        return femaleTwentyToTwentyFour6;
    }

    public void setFemaleTwentyToTwentyFour6(Long femaleTwentyToTwentyFour6) {
        this.femaleTwentyToTwentyFour6 = femaleTwentyToTwentyFour6;
    }

    public Long getMaleFiftyPlus6() {
        return maleFiftyPlus6;
    }

    public void setMaleFiftyPlus6(Long maleFiftyPlus6) {
        this.maleFiftyPlus6 = maleFiftyPlus6;
    }

    public Long getFemaleFiftyPlus6() {
        return femaleFiftyPlus6;
    }

    public void setFemaleFiftyPlus6(Long femaleFiftyPlus6) {
        this.femaleFiftyPlus6 = femaleFiftyPlus6;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Long getMaleTwentyFiveToTwentyNine6() {
        return maleTwentyFiveToTwentyNine6;
    }

    public void setMaleTwentyFiveToTwentyNine6(Long maleTwentyFiveToTwentyNine6) {
        this.maleTwentyFiveToTwentyNine6 = maleTwentyFiveToTwentyNine6;
    }

    public Long getFemaleTwentyFiveToTwentyNine6() {
        return femaleTwentyFiveToTwentyNine6;
    }

    public void setFemaleTwentyFiveToTwentyNine6(Long femaleTwentyFiveToTwentyNine6) {
        this.femaleTwentyFiveToTwentyNine6 = femaleTwentyFiveToTwentyNine6;
    }

    public Long getMaleThirtyToThirtyFour6() {
        return maleThirtyToThirtyFour6;
    }

    public void setMaleThirtyToThirtyFour6(Long maleThirtyToThirtyFour6) {
        this.maleThirtyToThirtyFour6 = maleThirtyToThirtyFour6;
    }

    public Long getFemaleThirtyToThirtyFour6() {
        return femaleThirtyToThirtyFour6;
    }

    public void setFemaleThirtyToThirtyFour6(Long femaleThirtyToThirtyFour6) {
        this.femaleThirtyToThirtyFour6 = femaleThirtyToThirtyFour6;
    }

    public Long getMaleThirtyFiveToThirtyNine6() {
        return maleThirtyFiveToThirtyNine6;
    }

    public void setMaleThirtyFiveToThirtyNine6(Long maleThirtyFiveToThirtyNine6) {
        this.maleThirtyFiveToThirtyNine6 = maleThirtyFiveToThirtyNine6;
    }

    public Long getFemaleThirtyFiveToThirtyNine6() {
        return femaleThirtyFiveToThirtyNine6;
    }

    public void setFemaleThirtyFiveToThirtyNine6(Long femaleThirtyFiveToThirtyNine6) {
        this.femaleThirtyFiveToThirtyNine6 = femaleThirtyFiveToThirtyNine6;
    }

    public Long getMaleFortyToFortyFour6() {
        return maleFortyToFortyFour6;
    }

    public void setMaleFortyToFortyFour6(Long maleFortyToFortyFour6) {
        this.maleFortyToFortyFour6 = maleFortyToFortyFour6;
    }

    public Long getFemaleFortyToFortyFour6() {
        return femaleFortyToFortyFour6;
    }

    public void setFemaleFortyToFortyFour6(Long femaleFortyToFortyFour6) {
        this.femaleFortyToFortyFour6 = femaleFortyToFortyFour6;
    }

    public Long getMaleFortyFiveToFortyNine6() {
        return maleFortyFiveToFortyNine6;
    }

    public void setMaleFortyFiveToFortyNine6(Long maleFortyFiveToFortyNine6) {
        this.maleFortyFiveToFortyNine6 = maleFortyFiveToFortyNine6;
    }

    public Long getFemaleFortyFiveToFortyNine6() {
        return femaleFortyFiveToFortyNine6;
    }

    public void setFemaleFortyFiveToFortyNine6(Long femaleFortyFiveToFortyNine6) {
        this.femaleFortyFiveToFortyNine6 = femaleFortyFiveToFortyNine6;
    }

    public Long getMaleTwentyFiveToTwentyNine1() {
        return maleTwentyFiveToTwentyNine1;
    }

    public void setMaleTwentyFiveToTwentyNine1(Long maleTwentyFiveToTwentyNine1) {
        this.maleTwentyFiveToTwentyNine1 = maleTwentyFiveToTwentyNine1;
    }

    public Long getFemaleTwentyFiveToTwentyNine1() {
        return femaleTwentyFiveToTwentyNine1;
    }

    public void setFemaleTwentyFiveToTwentyNine1(Long femaleTwentyFiveToTwentyNine1) {
        this.femaleTwentyFiveToTwentyNine1 = femaleTwentyFiveToTwentyNine1;
    }

    public Long getMaleThirtyToThirtyFour1() {
        return maleThirtyToThirtyFour1;
    }

    public void setMaleThirtyToThirtyFour1(Long maleThirtyToThirtyFour1) {
        this.maleThirtyToThirtyFour1 = maleThirtyToThirtyFour1;
    }

    public Long getFemaleThirtyToThirtyFour1() {
        return femaleThirtyToThirtyFour1;
    }

    public void setFemaleThirtyToThirtyFour1(Long femaleThirtyToThirtyFour1) {
        this.femaleThirtyToThirtyFour1 = femaleThirtyToThirtyFour1;
    }

    public Long getMaleThirtyFiveToThirtyNine1() {
        return maleThirtyFiveToThirtyNine1;
    }

    public void setMaleThirtyFiveToThirtyNine1(Long maleThirtyFiveToThirtyNine1) {
        this.maleThirtyFiveToThirtyNine1 = maleThirtyFiveToThirtyNine1;
    }

    public Long getFemaleThirtyFiveToThirtyNine1() {
        return femaleThirtyFiveToThirtyNine1;
    }

    public void setFemaleThirtyFiveToThirtyNine1(Long femaleThirtyFiveToThirtyNine1) {
        this.femaleThirtyFiveToThirtyNine1 = femaleThirtyFiveToThirtyNine1;
    }

    public Long getMaleFortyToFortyFour1() {
        return maleFortyToFortyFour1;
    }

    public void setMaleFortyToFortyFour1(Long maleFortyToFortyFour1) {
        this.maleFortyToFortyFour1 = maleFortyToFortyFour1;
    }

    public Long getFemaleFortyToFortyFour1() {
        return femaleFortyToFortyFour1;
    }

    public void setFemaleFortyToFortyFour1(Long femaleFortyToFortyFour1) {
        this.femaleFortyToFortyFour1 = femaleFortyToFortyFour1;
    }

    public Long getMaleFortyFiveToFortyNine1() {
        return maleFortyFiveToFortyNine1;
    }

    public void setMaleFortyFiveToFortyNine1(Long maleFortyFiveToFortyNine1) {
        this.maleFortyFiveToFortyNine1 = maleFortyFiveToFortyNine1;
    }

    public Long getFemaleFortyFiveToFortyNine1() {
        return femaleFortyFiveToFortyNine1;
    }

    public void setFemaleFortyFiveToFortyNine1(Long femaleFortyFiveToFortyNine1) {
        this.femaleFortyFiveToFortyNine1 = femaleFortyFiveToFortyNine1;
    }

    public Long getMaleTwentyFiveToTwentyNine2() {
        return maleTwentyFiveToTwentyNine2;
    }

    public void setMaleTwentyFiveToTwentyNine2(Long maleTwentyFiveToTwentyNine2) {
        this.maleTwentyFiveToTwentyNine2 = maleTwentyFiveToTwentyNine2;
    }

    public Long getFemaleTwentyFiveToTwentyNine2() {
        return femaleTwentyFiveToTwentyNine2;
    }

    public void setFemaleTwentyFiveToTwentyNine2(Long femaleTwentyFiveToTwentyNine2) {
        this.femaleTwentyFiveToTwentyNine2 = femaleTwentyFiveToTwentyNine2;
    }

    public Long getMaleThirtyToThirtyFour2() {
        return maleThirtyToThirtyFour2;
    }

    public void setMaleThirtyToThirtyFour2(Long maleThirtyToThirtyFour2) {
        this.maleThirtyToThirtyFour2 = maleThirtyToThirtyFour2;
    }

    public Long getFemaleThirtyToThirtyFour2() {
        return femaleThirtyToThirtyFour2;
    }

    public void setFemaleThirtyToThirtyFour2(Long femaleThirtyToThirtyFour2) {
        this.femaleThirtyToThirtyFour2 = femaleThirtyToThirtyFour2;
    }

    public Long getMaleThirtyFiveToThirtyNine2() {
        return maleThirtyFiveToThirtyNine2;
    }

    public void setMaleThirtyFiveToThirtyNine2(Long maleThirtyFiveToThirtyNine2) {
        this.maleThirtyFiveToThirtyNine2 = maleThirtyFiveToThirtyNine2;
    }

    public Long getFemaleThirtyFiveToThirtyNine2() {
        return femaleThirtyFiveToThirtyNine2;
    }

    public void setFemaleThirtyFiveToThirtyNine2(Long femaleThirtyFiveToThirtyNine2) {
        this.femaleThirtyFiveToThirtyNine2 = femaleThirtyFiveToThirtyNine2;
    }

    public Long getMaleFortyToFortyFour2() {
        return maleFortyToFortyFour2;
    }

    public void setMaleFortyToFortyFour2(Long maleFortyToFortyFour2) {
        this.maleFortyToFortyFour2 = maleFortyToFortyFour2;
    }

    public Long getFemaleFortyToFortyFour2() {
        return femaleFortyToFortyFour2;
    }

    public void setFemaleFortyToFortyFour2(Long femaleFortyToFortyFour2) {
        this.femaleFortyToFortyFour2 = femaleFortyToFortyFour2;
    }

    public Long getMaleFortyFiveToFortyNine2() {
        return maleFortyFiveToFortyNine2;
    }

    public void setMaleFortyFiveToFortyNine2(Long maleFortyFiveToFortyNine2) {
        this.maleFortyFiveToFortyNine2 = maleFortyFiveToFortyNine2;
    }

    public Long getFemaleFortyFiveToFortyNine2() {
        return femaleFortyFiveToFortyNine2;
    }

    public void setFemaleFortyFiveToFortyNine2(Long femaleFortyFiveToFortyNine2) {
        this.femaleFortyFiveToFortyNine2 = femaleFortyFiveToFortyNine2;
    }

    public Long getMaleTwentyFiveToTwentyNine3() {
        return maleTwentyFiveToTwentyNine3;
    }

    public void setMaleTwentyFiveToTwentyNine3(Long maleTwentyFiveToTwentyNine3) {
        this.maleTwentyFiveToTwentyNine3 = maleTwentyFiveToTwentyNine3;
    }

    public Long getFemaleTwentyFiveToTwentyNine3() {
        return femaleTwentyFiveToTwentyNine3;
    }

    public void setFemaleTwentyFiveToTwentyNine3(Long femaleTwentyFiveToTwentyNine3) {
        this.femaleTwentyFiveToTwentyNine3 = femaleTwentyFiveToTwentyNine3;
    }

    public Long getMaleThirtyToThirtyFour3() {
        return maleThirtyToThirtyFour3;
    }

    public void setMaleThirtyToThirtyFour3(Long maleThirtyToThirtyFour3) {
        this.maleThirtyToThirtyFour3 = maleThirtyToThirtyFour3;
    }

    public Long getFemaleThirtyToThirtyFour3() {
        return femaleThirtyToThirtyFour3;
    }

    public void setFemaleThirtyToThirtyFour3(Long femaleThirtyToThirtyFour3) {
        this.femaleThirtyToThirtyFour3 = femaleThirtyToThirtyFour3;
    }

    public Long getMaleThirtyFiveToThirtyNine3() {
        return maleThirtyFiveToThirtyNine3;
    }

    public void setMaleThirtyFiveToThirtyNine3(Long maleThirtyFiveToThirtyNine3) {
        this.maleThirtyFiveToThirtyNine3 = maleThirtyFiveToThirtyNine3;
    }

    public Long getFemaleThirtyFiveToThirtyNine3() {
        return femaleThirtyFiveToThirtyNine3;
    }

    public void setFemaleThirtyFiveToThirtyNine3(Long femaleThirtyFiveToThirtyNine3) {
        this.femaleThirtyFiveToThirtyNine3 = femaleThirtyFiveToThirtyNine3;
    }

    public Long getMaleFortyToFortyFour3() {
        return maleFortyToFortyFour3;
    }

    public void setMaleFortyToFortyFour3(Long maleFortyToFortyFour3) {
        this.maleFortyToFortyFour3 = maleFortyToFortyFour3;
    }

    public Long getFemaleFortyToFortyFour3() {
        return femaleFortyToFortyFour3;
    }

    public void setFemaleFortyToFortyFour3(Long femaleFortyToFortyFour3) {
        this.femaleFortyToFortyFour3 = femaleFortyToFortyFour3;
    }

    public Long getMaleFortyFiveToFortyNine3() {
        return maleFortyFiveToFortyNine3;
    }

    public void setMaleFortyFiveToFortyNine3(Long maleFortyFiveToFortyNine3) {
        this.maleFortyFiveToFortyNine3 = maleFortyFiveToFortyNine3;
    }

    public Long getFemaleFortyFiveToFortyNine3() {
        return femaleFortyFiveToFortyNine3;
    }

    public void setFemaleFortyFiveToFortyNine3(Long femaleFortyFiveToFortyNine3) {
        this.femaleFortyFiveToFortyNine3 = femaleFortyFiveToFortyNine3;
    }

    public Long getMaleTwentyFiveToTwentyNine4() {
        return maleTwentyFiveToTwentyNine4;
    }

    public void setMaleTwentyFiveToTwentyNine4(Long maleTwentyFiveToTwentyNine4) {
        this.maleTwentyFiveToTwentyNine4 = maleTwentyFiveToTwentyNine4;
    }

    public Long getFemaleTwentyFiveToTwentyNine4() {
        return femaleTwentyFiveToTwentyNine4;
    }

    public void setFemaleTwentyFiveToTwentyNine4(Long femaleTwentyFiveToTwentyNine4) {
        this.femaleTwentyFiveToTwentyNine4 = femaleTwentyFiveToTwentyNine4;
    }

    public Long getMaleThirtyToThirtyFour4() {
        return maleThirtyToThirtyFour4;
    }

    public void setMaleThirtyToThirtyFour4(Long maleThirtyToThirtyFour4) {
        this.maleThirtyToThirtyFour4 = maleThirtyToThirtyFour4;
    }

    public Long getFemaleThirtyToThirtyFour4() {
        return femaleThirtyToThirtyFour4;
    }

    public void setFemaleThirtyToThirtyFour4(Long femaleThirtyToThirtyFour4) {
        this.femaleThirtyToThirtyFour4 = femaleThirtyToThirtyFour4;
    }

    public Long getMaleThirtyFiveToThirtyNine4() {
        return maleThirtyFiveToThirtyNine4;
    }

    public void setMaleThirtyFiveToThirtyNine4(Long maleThirtyFiveToThirtyNine4) {
        this.maleThirtyFiveToThirtyNine4 = maleThirtyFiveToThirtyNine4;
    }

    public Long getFemaleThirtyFiveToThirtyNine4() {
        return femaleThirtyFiveToThirtyNine4;
    }

    public void setFemaleThirtyFiveToThirtyNine4(Long femaleThirtyFiveToThirtyNine4) {
        this.femaleThirtyFiveToThirtyNine4 = femaleThirtyFiveToThirtyNine4;
    }

    public Long getMaleFortyToFortyFour4() {
        return maleFortyToFortyFour4;
    }

    public void setMaleFortyToFortyFour4(Long maleFortyToFortyFour4) {
        this.maleFortyToFortyFour4 = maleFortyToFortyFour4;
    }

    public Long getFemaleFortyToFortyFour4() {
        return femaleFortyToFortyFour4;
    }

    public void setFemaleFortyToFortyFour4(Long femaleFortyToFortyFour4) {
        this.femaleFortyToFortyFour4 = femaleFortyToFortyFour4;
    }

    public Long getMaleFortyFiveToFortyNine4() {
        return maleFortyFiveToFortyNine4;
    }

    public void setMaleFortyFiveToFortyNine4(Long maleFortyFiveToFortyNine4) {
        this.maleFortyFiveToFortyNine4 = maleFortyFiveToFortyNine4;
    }

    public Long getFemaleFortyFiveToFortyNine4() {
        return femaleFortyFiveToFortyNine4;
    }

    public void setFemaleFortyFiveToFortyNine4(Long femaleFortyFiveToFortyNine4) {
        this.femaleFortyFiveToFortyNine4 = femaleFortyFiveToFortyNine4;
    }

    public Long getMaleTwentyFiveToTwentyNine5() {
        return maleTwentyFiveToTwentyNine5;
    }

    public void setMaleTwentyFiveToTwentyNine5(Long maleTwentyFiveToTwentyNine5) {
        this.maleTwentyFiveToTwentyNine5 = maleTwentyFiveToTwentyNine5;
    }

    public Long getFemaleTwentyFiveToTwentyNine5() {
        return femaleTwentyFiveToTwentyNine5;
    }

    public void setFemaleTwentyFiveToTwentyNine5(Long femaleTwentyFiveToTwentyNine5) {
        this.femaleTwentyFiveToTwentyNine5 = femaleTwentyFiveToTwentyNine5;
    }

    public Long getMaleThirtyToThirtyFour5() {
        return maleThirtyToThirtyFour5;
    }

    public void setMaleThirtyToThirtyFour5(Long maleThirtyToThirtyFour5) {
        this.maleThirtyToThirtyFour5 = maleThirtyToThirtyFour5;
    }

    public Long getFemaleThirtyToThirtyFour5() {
        return femaleThirtyToThirtyFour5;
    }

    public void setFemaleThirtyToThirtyFour5(Long femaleThirtyToThirtyFour5) {
        this.femaleThirtyToThirtyFour5 = femaleThirtyToThirtyFour5;
    }

    public Long getMaleThirtyFiveToThirtyNine5() {
        return maleThirtyFiveToThirtyNine5;
    }

    public void setMaleThirtyFiveToThirtyNine5(Long maleThirtyFiveToThirtyNine5) {
        this.maleThirtyFiveToThirtyNine5 = maleThirtyFiveToThirtyNine5;
    }

    public Long getFemaleThirtyFiveToThirtyNine5() {
        return femaleThirtyFiveToThirtyNine5;
    }

    public void setFemaleThirtyFiveToThirtyNine5(Long femaleThirtyFiveToThirtyNine5) {
        this.femaleThirtyFiveToThirtyNine5 = femaleThirtyFiveToThirtyNine5;
    }

    public Long getMaleFortyToFortyFour5() {
        return maleFortyToFortyFour5;
    }

    public void setMaleFortyToFortyFour5(Long maleFortyToFortyFour5) {
        this.maleFortyToFortyFour5 = maleFortyToFortyFour5;
    }

    public Long getFemaleFortyToFortyFour5() {
        return femaleFortyToFortyFour5;
    }

    public void setFemaleFortyToFortyFour5(Long femaleFortyToFortyFour5) {
        this.femaleFortyToFortyFour5 = femaleFortyToFortyFour5;
    }

    public Long getMaleFortyFiveToFortyNine5() {
        return maleFortyFiveToFortyNine5;
    }

    public void setMaleFortyFiveToFortyNine5(Long maleFortyFiveToFortyNine5) {
        this.maleFortyFiveToFortyNine5 = maleFortyFiveToFortyNine5;
    }

    public Long getFemaleFortyFiveToFortyNine5() {
        return femaleFortyFiveToFortyNine5;
    }

    public void setFemaleFortyFiveToFortyNine5(Long femaleFortyFiveToFortyNine5) {
        this.femaleFortyFiveToFortyNine5 = femaleFortyFiveToFortyNine5;
    }

    public Long getMaleLessThanOne7() {
        return maleLessThanOne7;
    }

    public void setMaleLessThanOne7(Long maleLessThanOne7) {
        this.maleLessThanOne7 = maleLessThanOne7;
    }

    public Long getFemaleLessThanOne7() {
        return femaleLessThanOne7;
    }

    public void setFemaleLessThanOne7(Long femaleLessThanOne7) {
        this.femaleLessThanOne7 = femaleLessThanOne7;
    }

    public Long getMaleOneToFour7() {
        return maleOneToFour7;
    }

    public void setMaleOneToFour7(Long maleOneToFour7) {
        this.maleOneToFour7 = maleOneToFour7;
    }

    public Long getFemaleOneToFour7() {
        return femaleOneToFour7;
    }

    public void setFemaleOneToFour7(Long femaleOneToFour7) {
        this.femaleOneToFour7 = femaleOneToFour7;
    }

    public Long getMaleFiveToNine7() {
        return maleFiveToNine7;
    }

    public void setMaleFiveToNine7(Long maleFiveToNine7) {
        this.maleFiveToNine7 = maleFiveToNine7;
    }

    public Long getFemaleFiveToNine7() {
        return femaleFiveToNine7;
    }

    public void setFemaleFiveToNine7(Long femaleFiveToNine7) {
        this.femaleFiveToNine7 = femaleFiveToNine7;
    }

    public Long getMaleTenToFourteen7() {
        return maleTenToFourteen7;
    }

    public void setMaleTenToFourteen7(Long maleTenToFourteen7) {
        this.maleTenToFourteen7 = maleTenToFourteen7;
    }

    public Long getFemaleTenToFourteen7() {
        return femaleTenToFourteen7;
    }

    public void setFemaleTenToFourteen7(Long femaleTenToFourteen7) {
        this.femaleTenToFourteen7 = femaleTenToFourteen7;
    }

    public Long getMaleFifteenToNineteen7() {
        return maleFifteenToNineteen7;
    }

    public void setMaleFifteenToNineteen7(Long maleFifteenToNineteen7) {
        this.maleFifteenToNineteen7 = maleFifteenToNineteen7;
    }

    public Long getFemaleFifteenToNineteen7() {
        return femaleFifteenToNineteen7;
    }

    public void setFemaleFifteenToNineteen7(Long femaleFifteenToNineteen7) {
        this.femaleFifteenToNineteen7 = femaleFifteenToNineteen7;
    }

    public Long getMaleTwentyToTwentyFour7() {
        return maleTwentyToTwentyFour7;
    }

    public void setMaleTwentyToTwentyFour7(Long maleTwentyToTwentyFour7) {
        this.maleTwentyToTwentyFour7 = maleTwentyToTwentyFour7;
    }

    public Long getFemaleTwentyToTwentyFour7() {
        return femaleTwentyToTwentyFour7;
    }

    public void setFemaleTwentyToTwentyFour7(Long femaleTwentyToTwentyFour7) {
        this.femaleTwentyToTwentyFour7 = femaleTwentyToTwentyFour7;
    }

    public Long getMaleTwentyFiveToTwentyNine7() {
        return maleTwentyFiveToTwentyNine7;
    }

    public void setMaleTwentyFiveToTwentyNine7(Long maleTwentyFiveToTwentyNine7) {
        this.maleTwentyFiveToTwentyNine7 = maleTwentyFiveToTwentyNine7;
    }

    public Long getFemaleTwentyFiveToTwentyNine7() {
        return femaleTwentyFiveToTwentyNine7;
    }

    public void setFemaleTwentyFiveToTwentyNine7(Long femaleTwentyFiveToTwentyNine7) {
        this.femaleTwentyFiveToTwentyNine7 = femaleTwentyFiveToTwentyNine7;
    }

    public Long getMaleThirtyToThirtyFour7() {
        return maleThirtyToThirtyFour7;
    }

    public void setMaleThirtyToThirtyFour7(Long maleThirtyToThirtyFour7) {
        this.maleThirtyToThirtyFour7 = maleThirtyToThirtyFour7;
    }

    public Long getFemaleThirtyToThirtyFour7() {
        return femaleThirtyToThirtyFour7;
    }

    public void setFemaleThirtyToThirtyFour7(Long femaleThirtyToThirtyFour7) {
        this.femaleThirtyToThirtyFour7 = femaleThirtyToThirtyFour7;
    }

    public Long getMaleThirtyFiveToThirtyNine7() {
        return maleThirtyFiveToThirtyNine7;
    }

    public void setMaleThirtyFiveToThirtyNine7(Long maleThirtyFiveToThirtyNine7) {
        this.maleThirtyFiveToThirtyNine7 = maleThirtyFiveToThirtyNine7;
    }

    public Long getFemaleThirtyFiveToThirtyNine7() {
        return femaleThirtyFiveToThirtyNine7;
    }

    public void setFemaleThirtyFiveToThirtyNine7(Long femaleThirtyFiveToThirtyNine7) {
        this.femaleThirtyFiveToThirtyNine7 = femaleThirtyFiveToThirtyNine7;
    }

    public Long getMaleFortyToFortyFour7() {
        return maleFortyToFortyFour7;
    }

    public void setMaleFortyToFortyFour7(Long maleFortyToFortyFour7) {
        this.maleFortyToFortyFour7 = maleFortyToFortyFour7;
    }

    public Long getFemaleFortyToFortyFour7() {
        return femaleFortyToFortyFour7;
    }

    public void setFemaleFortyToFortyFour7(Long femaleFortyToFortyFour7) {
        this.femaleFortyToFortyFour7 = femaleFortyToFortyFour7;
    }

    public Long getMaleFortyFiveToFortyNine7() {
        return maleFortyFiveToFortyNine7;
    }

    public void setMaleFortyFiveToFortyNine7(Long maleFortyFiveToFortyNine7) {
        this.maleFortyFiveToFortyNine7 = maleFortyFiveToFortyNine7;
    }

    public Long getFemaleFortyFiveToFortyNine7() {
        return femaleFortyFiveToFortyNine7;
    }

    public void setFemaleFortyFiveToFortyNine7(Long femaleFortyFiveToFortyNine7) {
        this.femaleFortyFiveToFortyNine7 = femaleFortyFiveToFortyNine7;
    }

    public Long getMaleFiftyPlus7() {
        return maleFiftyPlus7;
    }

    public void setMaleFiftyPlus7(Long maleFiftyPlus7) {
        this.maleFiftyPlus7 = maleFiftyPlus7;
    }

    public Long getFemaleFiftyPlus7() {
        return femaleFiftyPlus7;
    }

    public void setFemaleFiftyPlus7(Long femaleFiftyPlus7) {
        this.femaleFiftyPlus7 = femaleFiftyPlus7;
    }

    public Long getMaleLessThanOne8() {
        return maleLessThanOne8;
    }

    public void setMaleLessThanOne8(Long maleLessThanOne8) {
        this.maleLessThanOne8 = maleLessThanOne8;
    }

    public Long getFemaleLessThanOne8() {
        return femaleLessThanOne8;
    }

    public void setFemaleLessThanOne8(Long femaleLessThanOne8) {
        this.femaleLessThanOne8 = femaleLessThanOne8;
    }

    public Long getMaleOneToFour8() {
        return maleOneToFour8;
    }

    public void setMaleOneToFour8(Long maleOneToFour8) {
        this.maleOneToFour8 = maleOneToFour8;
    }

    public Long getFemaleOneToFour8() {
        return femaleOneToFour8;
    }

    public void setFemaleOneToFour8(Long femaleOneToFour8) {
        this.femaleOneToFour8 = femaleOneToFour8;
    }

    public Long getMaleFiveToNine8() {
        return maleFiveToNine8;
    }

    public void setMaleFiveToNine8(Long maleFiveToNine8) {
        this.maleFiveToNine8 = maleFiveToNine8;
    }

    public Long getFemaleFiveToNine8() {
        return femaleFiveToNine8;
    }

    public void setFemaleFiveToNine8(Long femaleFiveToNine8) {
        this.femaleFiveToNine8 = femaleFiveToNine8;
    }

    public Long getMaleTenToFourteen8() {
        return maleTenToFourteen8;
    }

    public void setMaleTenToFourteen8(Long maleTenToFourteen8) {
        this.maleTenToFourteen8 = maleTenToFourteen8;
    }

    public Long getFemaleTenToFourteen8() {
        return femaleTenToFourteen8;
    }

    public void setFemaleTenToFourteen8(Long femaleTenToFourteen8) {
        this.femaleTenToFourteen8 = femaleTenToFourteen8;
    }

    public Long getMaleFifteenToNineteen8() {
        return maleFifteenToNineteen8;
    }

    public void setMaleFifteenToNineteen8(Long maleFifteenToNineteen8) {
        this.maleFifteenToNineteen8 = maleFifteenToNineteen8;
    }

    public Long getFemaleFifteenToNineteen8() {
        return femaleFifteenToNineteen8;
    }

    public void setFemaleFifteenToNineteen8(Long femaleFifteenToNineteen8) {
        this.femaleFifteenToNineteen8 = femaleFifteenToNineteen8;
    }

    public Long getMaleTwentyToTwentyFour8() {
        return maleTwentyToTwentyFour8;
    }

    public void setMaleTwentyToTwentyFour8(Long maleTwentyToTwentyFour8) {
        this.maleTwentyToTwentyFour8 = maleTwentyToTwentyFour8;
    }

    public Long getFemaleTwentyToTwentyFour8() {
        return femaleTwentyToTwentyFour8;
    }

    public void setFemaleTwentyToTwentyFour8(Long femaleTwentyToTwentyFour8) {
        this.femaleTwentyToTwentyFour8 = femaleTwentyToTwentyFour8;
    }

    public Long getMaleTwentyFiveToTwentyNine8() {
        return maleTwentyFiveToTwentyNine8;
    }

    public void setMaleTwentyFiveToTwentyNine8(Long maleTwentyFiveToTwentyNine8) {
        this.maleTwentyFiveToTwentyNine8 = maleTwentyFiveToTwentyNine8;
    }

    public Long getFemaleTwentyFiveToTwentyNine8() {
        return femaleTwentyFiveToTwentyNine8;
    }

    public void setFemaleTwentyFiveToTwentyNine8(Long femaleTwentyFiveToTwentyNine8) {
        this.femaleTwentyFiveToTwentyNine8 = femaleTwentyFiveToTwentyNine8;
    }

    public Long getMaleThirtyToThirtyFour8() {
        return maleThirtyToThirtyFour8;
    }

    public void setMaleThirtyToThirtyFour8(Long maleThirtyToThirtyFour8) {
        this.maleThirtyToThirtyFour8 = maleThirtyToThirtyFour8;
    }

    public Long getFemaleThirtyToThirtyFour8() {
        return femaleThirtyToThirtyFour8;
    }

    public void setFemaleThirtyToThirtyFour8(Long femaleThirtyToThirtyFour8) {
        this.femaleThirtyToThirtyFour8 = femaleThirtyToThirtyFour8;
    }

    public Long getMaleThirtyFiveToThirtyNine8() {
        return maleThirtyFiveToThirtyNine8;
    }

    public void setMaleThirtyFiveToThirtyNine8(Long maleThirtyFiveToThirtyNine8) {
        this.maleThirtyFiveToThirtyNine8 = maleThirtyFiveToThirtyNine8;
    }

    public Long getFemaleThirtyFiveToThirtyNine8() {
        return femaleThirtyFiveToThirtyNine8;
    }

    public void setFemaleThirtyFiveToThirtyNine8(Long femaleThirtyFiveToThirtyNine8) {
        this.femaleThirtyFiveToThirtyNine8 = femaleThirtyFiveToThirtyNine8;
    }

    public Long getMaleFortyToFortyFour8() {
        return maleFortyToFortyFour8;
    }

    public void setMaleFortyToFortyFour8(Long maleFortyToFortyFour8) {
        this.maleFortyToFortyFour8 = maleFortyToFortyFour8;
    }

    public Long getFemaleFortyToFortyFour8() {
        return femaleFortyToFortyFour8;
    }

    public void setFemaleFortyToFortyFour8(Long femaleFortyToFortyFour8) {
        this.femaleFortyToFortyFour8 = femaleFortyToFortyFour8;
    }

    public Long getMaleFortyFiveToFortyNine8() {
        return maleFortyFiveToFortyNine8;
    }

    public void setMaleFortyFiveToFortyNine8(Long maleFortyFiveToFortyNine8) {
        this.maleFortyFiveToFortyNine8 = maleFortyFiveToFortyNine8;
    }

    public Long getFemaleFortyFiveToFortyNine8() {
        return femaleFortyFiveToFortyNine8;
    }

    public void setFemaleFortyFiveToFortyNine8(Long femaleFortyFiveToFortyNine8) {
        this.femaleFortyFiveToFortyNine8 = femaleFortyFiveToFortyNine8;
    }

    public Long getMaleFiftyPlus8() {
        return maleFiftyPlus8;
    }

    public void setMaleFiftyPlus8(Long maleFiftyPlus8) {
        this.maleFiftyPlus8 = maleFiftyPlus8;
    }

    public Long getFemaleFiftyPlus8() {
        return femaleFiftyPlus8;
    }

    public void setFemaleFiftyPlus8(Long femaleFiftyPlus8) {
        this.femaleFiftyPlus8 = femaleFiftyPlus8;
    }
    
    
}
