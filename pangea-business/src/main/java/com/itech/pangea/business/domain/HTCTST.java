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
 * @author Tasu Muzinda
 */
@Entity
public class HTCTST extends BaseEntity{
    
    @ManyToOne
    private Period period;
    @ManyToOne
    private Facility facility;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateCompleted;
    private String name;
    private Long numerator;
    private Long pitcPositiveLessThan5;
    private Long pitcNegativeLessThan5;
    private Long malnutritionNegativeLessThan5;
    private Long malnutritionPositiveLessThan5;
    
    private Long maleLessThanOne;
    private Long femaleLessThanOne;
    private Long maleOneToFour;
    private Long femaleOneToFour;
    private Long maleFiveToNine;
    private Long femaleFiveToNine;
    private Long maleTenToFourteen;
    private Long femaleTenToFourteen;
    private Long maleFifteenToNineteen;
    private Long femaleFifteenToNineteen;
    private Long maleTwentyToTwentyFour;
    private Long femaleTwentyToTwentyFour;
    private Long maleTwentyFiveToTwentyNine;
    private Long femaleTwentyFiveToTwentyNine;
    private Long maleThirtyToThirtyFour;
    private Long femaleThirtyToThirtyFour;
    private Long maleThirtyFiveToThirtyNine;
    private Long femaleThirtyFiveToThirtyNine;
    private Long maleFortyToFortyFour;
    private Long femaleFortyToFortyFour;
    private Long maleFortyFiveToFortyNine;
    private Long femaleFortyFiveToFortyNine;
    private Long maleFiftyPlus;
    private Long femaleFiftyPlus;
    
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
    
    
    @Transient
    private String datec;

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

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

    public Long getNumerator() {
        return numerator;
    }

    public void setNumerator(Long numerator) {
        this.numerator = numerator;
    }

    public Long getPitcPositiveLessThan5() {
        return pitcPositiveLessThan5;
    }

    public void setPitcPositiveLessThan5(Long pitcPositiveLessThan5) {
        this.pitcPositiveLessThan5 = pitcPositiveLessThan5;
    }

    public Long getPitcNegativeLessThan5() {
        return pitcNegativeLessThan5;
    }

    public void setPitcNegativeLessThan5(Long pitcNegativeLessThan5) {
        this.pitcNegativeLessThan5 = pitcNegativeLessThan5;
    }

    public Long getMalnutritionNegativeLessThan5() {
        return malnutritionNegativeLessThan5;
    }

    public void setMalnutritionNegativeLessThan5(Long malnutritionNegativeLessThan5) {
        this.malnutritionNegativeLessThan5 = malnutritionNegativeLessThan5;
    }

    public Long getMalnutritionPositiveLessThan5() {
        return malnutritionPositiveLessThan5;
    }

    public void setMalnutritionPositiveLessThan5(Long malnutritionPositiveLessThan5) {
        this.malnutritionPositiveLessThan5 = malnutritionPositiveLessThan5;
    }

    public Long getMaleLessThanOne() {
        return maleLessThanOne;
    }

    public void setMaleLessThanOne(Long maleLessThanOne) {
        this.maleLessThanOne = maleLessThanOne;
    }

    public Long getFemaleLessThanOne() {
        return femaleLessThanOne;
    }

    public void setFemaleLessThanOne(Long femaleLessThanOne) {
        this.femaleLessThanOne = femaleLessThanOne;
    }

    public Long getMaleOneToFour() {
        return maleOneToFour;
    }

    public void setMaleOneToFour(Long maleOneToFour) {
        this.maleOneToFour = maleOneToFour;
    }

    public Long getFemaleOneToFour() {
        return femaleOneToFour;
    }

    public void setFemaleOneToFour(Long femaleOneToFour) {
        this.femaleOneToFour = femaleOneToFour;
    }

    public Long getMaleFiveToNine() {
        return maleFiveToNine;
    }

    public void setMaleFiveToNine(Long maleFiveToNine) {
        this.maleFiveToNine = maleFiveToNine;
    }

    public Long getFemaleFiveToNine() {
        return femaleFiveToNine;
    }

    public void setFemaleFiveToNine(Long femaleFiveToNine) {
        this.femaleFiveToNine = femaleFiveToNine;
    }

    public Long getMaleTenToFourteen() {
        return maleTenToFourteen;
    }

    public void setMaleTenToFourteen(Long maleTenToFourteen) {
        this.maleTenToFourteen = maleTenToFourteen;
    }

    public Long getFemaleTenToFourteen() {
        return femaleTenToFourteen;
    }

    public void setFemaleTenToFourteen(Long femaleTenToFourteen) {
        this.femaleTenToFourteen = femaleTenToFourteen;
    }

    public Long getMaleFifteenToNineteen() {
        return maleFifteenToNineteen;
    }

    public void setMaleFifteenToNineteen(Long maleFifteenToNineteen) {
        this.maleFifteenToNineteen = maleFifteenToNineteen;
    }

    public Long getFemaleFifteenToNineteen() {
        return femaleFifteenToNineteen;
    }

    public void setFemaleFifteenToNineteen(Long femaleFifteenToNineteen) {
        this.femaleFifteenToNineteen = femaleFifteenToNineteen;
    }

    public Long getMaleTwentyToTwentyFour() {
        return maleTwentyToTwentyFour;
    }

    public void setMaleTwentyToTwentyFour(Long maleTwentyToTwentyFour) {
        this.maleTwentyToTwentyFour = maleTwentyToTwentyFour;
    }

    public Long getFemaleTwentyToTwentyFour() {
        return femaleTwentyToTwentyFour;
    }

    public void setFemaleTwentyToTwentyFour(Long femaleTwentyToTwentyFour) {
        this.femaleTwentyToTwentyFour = femaleTwentyToTwentyFour;
    }

    public Long getMaleTwentyFiveToTwentyNine() {
        return maleTwentyFiveToTwentyNine;
    }

    public void setMaleTwentyFiveToTwentyNine(Long maleTwentyFiveToTwentyNine) {
        this.maleTwentyFiveToTwentyNine = maleTwentyFiveToTwentyNine;
    }

    public Long getFemaleTwentyFiveToTwentyNine() {
        return femaleTwentyFiveToTwentyNine;
    }

    public void setFemaleTwentyFiveToTwentyNine(Long femaleTwentyFiveToTwentyNine) {
        this.femaleTwentyFiveToTwentyNine = femaleTwentyFiveToTwentyNine;
    }

    public Long getMaleThirtyToThirtyFour() {
        return maleThirtyToThirtyFour;
    }

    public void setMaleThirtyToThirtyFour(Long maleThirtyToThirtyFour) {
        this.maleThirtyToThirtyFour = maleThirtyToThirtyFour;
    }

    public Long getFemaleThirtyToThirtyFour() {
        return femaleThirtyToThirtyFour;
    }

    public void setFemaleThirtyToThirtyFour(Long femaleThirtyToThirtyFour) {
        this.femaleThirtyToThirtyFour = femaleThirtyToThirtyFour;
    }

    public Long getMaleThirtyFiveToThirtyNine() {
        return maleThirtyFiveToThirtyNine;
    }

    public void setMaleThirtyFiveToThirtyNine(Long maleThirtyFiveToThirtyNine) {
        this.maleThirtyFiveToThirtyNine = maleThirtyFiveToThirtyNine;
    }

    public Long getFemaleThirtyFiveToThirtyNine() {
        return femaleThirtyFiveToThirtyNine;
    }

    public void setFemaleThirtyFiveToThirtyNine(Long femaleThirtyFiveToThirtyNine) {
        this.femaleThirtyFiveToThirtyNine = femaleThirtyFiveToThirtyNine;
    }

    public Long getMaleFortyToFortyFour() {
        return maleFortyToFortyFour;
    }

    public void setMaleFortyToFortyFour(Long maleFortyToFortyFour) {
        this.maleFortyToFortyFour = maleFortyToFortyFour;
    }

    public Long getFemaleFortyToFortyFour() {
        return femaleFortyToFortyFour;
    }

    public void setFemaleFortyToFortyFour(Long femaleFortyToFortyFour) {
        this.femaleFortyToFortyFour = femaleFortyToFortyFour;
    }

    public Long getMaleFortyFiveToFortyNine() {
        return maleFortyFiveToFortyNine;
    }

    public void setMaleFortyFiveToFortyNine(Long maleFortyFiveToFortyNine) {
        this.maleFortyFiveToFortyNine = maleFortyFiveToFortyNine;
    }

    public Long getFemaleFortyFiveToFortyNine() {
        return femaleFortyFiveToFortyNine;
    }

    public void setFemaleFortyFiveToFortyNine(Long femaleFortyFiveToFortyNine) {
        this.femaleFortyFiveToFortyNine = femaleFortyFiveToFortyNine;
    }

    public Long getMaleFiftyPlus() {
        return maleFiftyPlus;
    }

    public void setMaleFiftyPlus(Long maleFiftyPlus) {
        this.maleFiftyPlus = maleFiftyPlus;
    }

    public Long getFemaleFiftyPlus() {
        return femaleFiftyPlus;
    }

    public void setFemaleFiftyPlus(Long femaleFiftyPlus) {
        this.femaleFiftyPlus = femaleFiftyPlus;
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

    public String getDatec() {
        return datec;
    }

    public void setDatec(String datec) {
        this.datec = datec;
    }

    
    
    
}
