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

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Tasu Muzinda
 */
@Entity
public class MRF_HTSTST extends BaseEntity{
    
    @ManyToOne
    private Period period;
    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    private Long maleLessThanTwoMonths;
    private Long femaleLessThanTwoMonths;
    private Long maleTwoToTwelveMonths;
    private Long femaleTwoToTwelveMonths;
    private Long maleThirteenToTwentyFourMonths;
    private Long femaleThirteenToTwentyFourMonths;
    private Long maleTwentyFiveToFiftyNineMonths;
    private Long femaleTwentyFiveToFiftyNineMonths;
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
    private Long maleThirtyToFortyNine1;
    private Long femaleThirtyToFortyNine1;
    private Long maleFiftyPlus1;
    private Long femaleFiftyPlus1;
    private Long maleLessThanTwoMonths2;
    private Long femaleLessThanTwoMonths2;
    private Long maleTwoToTwelveMonths2;
    private Long femaleTwoToTwelveMonths2;
    private Long maleThirteenToTwentyFourMonths2;
    private Long femaleThirteenToTwentyFourMonths2;
    private Long maleTwentyFiveToFiftyNineMonths2;
    private Long femaleTwentyFiveToFiftyNineMonths2;
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
    private Long maleThirtyToFortyNine2;
    private Long femaleThirtyToFortyNine2;
    private Long maleFiftyPlus2;
    private Long femaleFiftyPlus2;
    private Long maleLessThanFifteen;
    private Long femaleLessThanFifteen;
    private Long maleFifteenToNineteen3;
    private Long femaleFifteenToNineteen3;
    private Long maleTwentyToTwentyFour3;
    private Long femaleTwentyToTwentyFour3;
    private Long maleTwentyFiveToTwentyNine3;
    private Long femaleTwentyFiveToTwentyNine3;
    private Long maleThirtyToFortyNine3;
    private Long femaleThirtyToFortyNine3;
    private Long maleFiftyPlus3;
    private Long femaleFiftyPlus3;
    private Long maleLessThanFifteen1;
    private Long femaleLessThanFifteen1;
    private Long maleFifteenToNineteen4;
    private Long femaleFifteenToNineteen4;
    private Long maleTwentyToTwentyFour4;
    private Long femaleTwentyToTwentyFour4;
    private Long maleTwentyFiveToTwentyNine4;
    private Long femaleTwentyFiveToTwentyNine4;
    private Long maleThirtyToFortyNine4;
    private Long femaleThirtyToFortyNine4;
    private Long maleFiftyPlus4;
    private Long femaleFiftyPlus4;

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

    public Long getMaleLessThanTwoMonths() {
        return maleLessThanTwoMonths;
    }

    public void setMaleLessThanTwoMonths(Long maleLessThanTwoMonths) {
        this.maleLessThanTwoMonths = maleLessThanTwoMonths;
    }

    public Long getFemaleLessThanTwoMonths() {
        return femaleLessThanTwoMonths;
    }

    public void setFemaleLessThanTwoMonths(Long femaleLessThanTwoMonths) {
        this.femaleLessThanTwoMonths = femaleLessThanTwoMonths;
    }

    public Long getMaleTwoToTwelveMonths() {
        return maleTwoToTwelveMonths;
    }

    public void setMaleTwoToTwelveMonths(Long maleTwoToTwelveMonths) {
        this.maleTwoToTwelveMonths = maleTwoToTwelveMonths;
    }

    public Long getFemaleTwoToTwelveMonths() {
        return femaleTwoToTwelveMonths;
    }

    public void setFemaleTwoToTwelveMonths(Long femaleTwoToTwelveMonths) {
        this.femaleTwoToTwelveMonths = femaleTwoToTwelveMonths;
    }

    public Long getMaleThirteenToTwentyFourMonths() {
        return maleThirteenToTwentyFourMonths;
    }

    public void setMaleThirteenToTwentyFourMonths(Long maleThirteenToTwentyFourMonths) {
        this.maleThirteenToTwentyFourMonths = maleThirteenToTwentyFourMonths;
    }

    public Long getFemaleThirteenToTwentyFourMonths() {
        return femaleThirteenToTwentyFourMonths;
    }

    public void setFemaleThirteenToTwentyFourMonths(Long femaleThirteenToTwentyFourMonths) {
        this.femaleThirteenToTwentyFourMonths = femaleThirteenToTwentyFourMonths;
    }

    public Long getMaleTwentyFiveToFiftyNineMonths() {
        return maleTwentyFiveToFiftyNineMonths;
    }

    public void setMaleTwentyFiveToFiftyNineMonths(Long maleTwentyFiveToFiftyNineMonths) {
        this.maleTwentyFiveToFiftyNineMonths = maleTwentyFiveToFiftyNineMonths;
    }

    public Long getFemaleTwentyFiveToFiftyNineMonths() {
        return femaleTwentyFiveToFiftyNineMonths;
    }

    public void setFemaleTwentyFiveToFiftyNineMonths(Long femaleTwentyFiveToFiftyNineMonths) {
        this.femaleTwentyFiveToFiftyNineMonths = femaleTwentyFiveToFiftyNineMonths;
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

    public Long getMaleThirtyToFortyNine1() {
        return maleThirtyToFortyNine1;
    }

    public void setMaleThirtyToFortyNine1(Long maleThirtyToFortyNine1) {
        this.maleThirtyToFortyNine1 = maleThirtyToFortyNine1;
    }

    public Long getFemaleThirtyToFortyNine1() {
        return femaleThirtyToFortyNine1;
    }

    public void setFemaleThirtyToFortyNine1(Long femaleThirtyToFortyNine1) {
        this.femaleThirtyToFortyNine1 = femaleThirtyToFortyNine1;
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

    public Long getMaleLessThanTwoMonths2() {
        return maleLessThanTwoMonths2;
    }

    public void setMaleLessThanTwoMonths2(Long maleLessThanTwoMonths2) {
        this.maleLessThanTwoMonths2 = maleLessThanTwoMonths2;
    }

    public Long getFemaleLessThanTwoMonths2() {
        return femaleLessThanTwoMonths2;
    }

    public void setFemaleLessThanTwoMonths2(Long femaleLessThanTwoMonths2) {
        this.femaleLessThanTwoMonths2 = femaleLessThanTwoMonths2;
    }

    public Long getMaleTwoToTwelveMonths2() {
        return maleTwoToTwelveMonths2;
    }

    public void setMaleTwoToTwelveMonths2(Long maleTwoToTwelveMonths2) {
        this.maleTwoToTwelveMonths2 = maleTwoToTwelveMonths2;
    }

    public Long getFemaleTwoToTwelveMonths2() {
        return femaleTwoToTwelveMonths2;
    }

    public void setFemaleTwoToTwelveMonths2(Long femaleTwoToTwelveMonths2) {
        this.femaleTwoToTwelveMonths2 = femaleTwoToTwelveMonths2;
    }

    public Long getMaleThirteenToTwentyFourMonths2() {
        return maleThirteenToTwentyFourMonths2;
    }

    public void setMaleThirteenToTwentyFourMonths2(Long maleThirteenToTwentyFourMonths2) {
        this.maleThirteenToTwentyFourMonths2 = maleThirteenToTwentyFourMonths2;
    }

    public Long getFemaleThirteenToTwentyFourMonths2() {
        return femaleThirteenToTwentyFourMonths2;
    }

    public void setFemaleThirteenToTwentyFourMonths2(Long femaleThirteenToTwentyFourMonths2) {
        this.femaleThirteenToTwentyFourMonths2 = femaleThirteenToTwentyFourMonths2;
    }

    public Long getMaleTwentyFiveToFiftyNineMonths2() {
        return maleTwentyFiveToFiftyNineMonths2;
    }

    public void setMaleTwentyFiveToFiftyNineMonths2(Long maleTwentyFiveToFiftyNineMonths2) {
        this.maleTwentyFiveToFiftyNineMonths2 = maleTwentyFiveToFiftyNineMonths2;
    }

    public Long getFemaleTwentyFiveToFiftyNineMonths2() {
        return femaleTwentyFiveToFiftyNineMonths2;
    }

    public void setFemaleTwentyFiveToFiftyNineMonths2(Long femaleTwentyFiveToFiftyNineMonths2) {
        this.femaleTwentyFiveToFiftyNineMonths2 = femaleTwentyFiveToFiftyNineMonths2;
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

    public Long getMaleThirtyToFortyNine2() {
        return maleThirtyToFortyNine2;
    }

    public void setMaleThirtyToFortyNine2(Long maleThirtyToFortyNine2) {
        this.maleThirtyToFortyNine2 = maleThirtyToFortyNine2;
    }

    public Long getFemaleThirtyToFortyNine2() {
        return femaleThirtyToFortyNine2;
    }

    public void setFemaleThirtyToFortyNine2(Long femaleThirtyToFortyNine2) {
        this.femaleThirtyToFortyNine2 = femaleThirtyToFortyNine2;
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

    public Long getMaleLessThanFifteen() {
        return maleLessThanFifteen;
    }

    public void setMaleLessThanFifteen(Long maleLessThanFifteen) {
        this.maleLessThanFifteen = maleLessThanFifteen;
    }

    public Long getFemaleLessThanFifteen() {
        return femaleLessThanFifteen;
    }

    public void setFemaleLessThanFifteen(Long femaleLessThanFifteen) {
        this.femaleLessThanFifteen = femaleLessThanFifteen;
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

    public Long getMaleThirtyToFortyNine3() {
        return maleThirtyToFortyNine3;
    }

    public void setMaleThirtyToFortyNine3(Long maleThirtyToFortyNine3) {
        this.maleThirtyToFortyNine3 = maleThirtyToFortyNine3;
    }

    public Long getFemaleThirtyToFortyNine3() {
        return femaleThirtyToFortyNine3;
    }

    public void setFemaleThirtyToFortyNine3(Long femaleThirtyToFortyNine3) {
        this.femaleThirtyToFortyNine3 = femaleThirtyToFortyNine3;
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

    public Long getMaleLessThanFifteen1() {
        return maleLessThanFifteen1;
    }

    public void setMaleLessThanFifteen1(Long maleLessThanFifteen1) {
        this.maleLessThanFifteen1 = maleLessThanFifteen1;
    }

    public Long getFemaleLessThanFifteen1() {
        return femaleLessThanFifteen1;
    }

    public void setFemaleLessThanFifteen1(Long femaleLessThanFifteen1) {
        this.femaleLessThanFifteen1 = femaleLessThanFifteen1;
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

    public Long getMaleThirtyToFortyNine4() {
        return maleThirtyToFortyNine4;
    }

    public void setMaleThirtyToFortyNine4(Long maleThirtyToFortyNine4) {
        this.maleThirtyToFortyNine4 = maleThirtyToFortyNine4;
    }

    public Long getFemaleThirtyToFortyNine4() {
        return femaleThirtyToFortyNine4;
    }

    public void setFemaleThirtyToFortyNine4(Long femaleThirtyToFortyNine4) {
        this.femaleThirtyToFortyNine4 = femaleThirtyToFortyNine4;
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
    
    
}
