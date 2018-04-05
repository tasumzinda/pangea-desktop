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
public class MRFTXNewForm extends BaseEntity{
    
    @ManyToOne
    private Period period;
    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    private Long maleLessThanTwoMonths10;
    private Long femaleLessThanTwoMonths10;
    private Long maleTwoToTwelveMonths10;
    private Long femaleTwoToTwelveMonths10;
    private Long maleThirteenToTwentyFourMonths10;
    private Long femaleThirteenToTwentyFourMonths10;
    private Long maleTwentyFiveToFiftyNineMonths10;
    private Long femaleTwentyFiveToFiftyNineMonths10;
    private Long maleFiveToNine10;
    private Long femaleFiveToNine10;
    private Long maleTenToFourteen10;
    private Long femaleTenToFourteen10;
    private Long maleFifteenToNineteen10;
    private Long femaleFifteenToNineteen10;
    private Long maleTwentyToTwentyFour10;
    private Long femaleTwentyToTwentyFour10;
    private Long maleTwentyFiveToTwentyNine10;
    private Long femaleTwentyFiveToTwentyNine10;
    private Long maleThirtyToFortyNine10;
    private Long femaleThirtyToFortyNine10;
    private Long maleFiftyPlus10;
    private Long femaleFiftyPlus10;

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

    public Long getMaleLessThanTwoMonths10() {
        return maleLessThanTwoMonths10;
    }

    public void setMaleLessThanTwoMonths10(Long maleLessThanTwoMonths10) {
        this.maleLessThanTwoMonths10 = maleLessThanTwoMonths10;
    }

    public Long getFemaleLessThanTwoMonths10() {
        return femaleLessThanTwoMonths10;
    }

    public void setFemaleLessThanTwoMonths10(Long femaleLessThanTwoMonths10) {
        this.femaleLessThanTwoMonths10 = femaleLessThanTwoMonths10;
    }

    public Long getMaleTwoToTwelveMonths10() {
        return maleTwoToTwelveMonths10;
    }

    public void setMaleTwoToTwelveMonths10(Long maleTwoToTwelveMonths10) {
        this.maleTwoToTwelveMonths10 = maleTwoToTwelveMonths10;
    }

    public Long getFemaleTwoToTwelveMonths10() {
        return femaleTwoToTwelveMonths10;
    }

    public void setFemaleTwoToTwelveMonths10(Long femaleTwoToTwelveMonths10) {
        this.femaleTwoToTwelveMonths10 = femaleTwoToTwelveMonths10;
    }

    public Long getMaleThirteenToTwentyFourMonths10() {
        return maleThirteenToTwentyFourMonths10;
    }

    public void setMaleThirteenToTwentyFourMonths10(Long maleThirteenToTwentyFourMonths10) {
        this.maleThirteenToTwentyFourMonths10 = maleThirteenToTwentyFourMonths10;
    }

    public Long getFemaleThirteenToTwentyFourMonths10() {
        return femaleThirteenToTwentyFourMonths10;
    }

    public void setFemaleThirteenToTwentyFourMonths10(Long femaleThirteenToTwentyFourMonths10) {
        this.femaleThirteenToTwentyFourMonths10 = femaleThirteenToTwentyFourMonths10;
    }

    public Long getMaleTwentyFiveToFiftyNineMonths10() {
        return maleTwentyFiveToFiftyNineMonths10;
    }

    public void setMaleTwentyFiveToFiftyNineMonths10(Long maleTwentyFiveToFiftyNineMonths10) {
        this.maleTwentyFiveToFiftyNineMonths10 = maleTwentyFiveToFiftyNineMonths10;
    }

    public Long getFemaleTwentyFiveToFiftyNineMonths10() {
        return femaleTwentyFiveToFiftyNineMonths10;
    }

    public void setFemaleTwentyFiveToFiftyNineMonths10(Long femaleTwentyFiveToFiftyNineMonths10) {
        this.femaleTwentyFiveToFiftyNineMonths10 = femaleTwentyFiveToFiftyNineMonths10;
    }

    public Long getMaleFiveToNine10() {
        return maleFiveToNine10;
    }

    public void setMaleFiveToNine10(Long maleFiveToNine10) {
        this.maleFiveToNine10 = maleFiveToNine10;
    }

    public Long getFemaleFiveToNine10() {
        return femaleFiveToNine10;
    }

    public void setFemaleFiveToNine10(Long femaleFiveToNine10) {
        this.femaleFiveToNine10 = femaleFiveToNine10;
    }

    public Long getMaleTenToFourteen10() {
        return maleTenToFourteen10;
    }

    public void setMaleTenToFourteen10(Long maleTenToFourteen10) {
        this.maleTenToFourteen10 = maleTenToFourteen10;
    }

    public Long getFemaleTenToFourteen10() {
        return femaleTenToFourteen10;
    }

    public void setFemaleTenToFourteen10(Long femaleTenToFourteen10) {
        this.femaleTenToFourteen10 = femaleTenToFourteen10;
    }

    public Long getMaleFifteenToNineteen10() {
        return maleFifteenToNineteen10;
    }

    public void setMaleFifteenToNineteen10(Long maleFifteenToNineteen10) {
        this.maleFifteenToNineteen10 = maleFifteenToNineteen10;
    }

    public Long getFemaleFifteenToNineteen10() {
        return femaleFifteenToNineteen10;
    }

    public void setFemaleFifteenToNineteen10(Long femaleFifteenToNineteen10) {
        this.femaleFifteenToNineteen10 = femaleFifteenToNineteen10;
    }

    public Long getMaleTwentyToTwentyFour10() {
        return maleTwentyToTwentyFour10;
    }

    public void setMaleTwentyToTwentyFour10(Long maleTwentyToTwentyFour10) {
        this.maleTwentyToTwentyFour10 = maleTwentyToTwentyFour10;
    }

    public Long getFemaleTwentyToTwentyFour10() {
        return femaleTwentyToTwentyFour10;
    }

    public void setFemaleTwentyToTwentyFour10(Long femaleTwentyToTwentyFour10) {
        this.femaleTwentyToTwentyFour10 = femaleTwentyToTwentyFour10;
    }

    public Long getMaleTwentyFiveToTwentyNine10() {
        return maleTwentyFiveToTwentyNine10;
    }

    public void setMaleTwentyFiveToTwentyNine10(Long maleTwentyFiveToTwentyNine10) {
        this.maleTwentyFiveToTwentyNine10 = maleTwentyFiveToTwentyNine10;
    }

    public Long getFemaleTwentyFiveToTwentyNine10() {
        return femaleTwentyFiveToTwentyNine10;
    }

    public void setFemaleTwentyFiveToTwentyNine10(Long femaleTwentyFiveToTwentyNine10) {
        this.femaleTwentyFiveToTwentyNine10 = femaleTwentyFiveToTwentyNine10;
    }

    public Long getMaleThirtyToFortyNine10() {
        return maleThirtyToFortyNine10;
    }

    public void setMaleThirtyToFortyNine10(Long maleThirtyToFortyNine10) {
        this.maleThirtyToFortyNine10 = maleThirtyToFortyNine10;
    }

    public Long getFemaleThirtyToFortyNine10() {
        return femaleThirtyToFortyNine10;
    }

    public void setFemaleThirtyToFortyNine10(Long femaleThirtyToFortyNine10) {
        this.femaleThirtyToFortyNine10 = femaleThirtyToFortyNine10;
    }

    public Long getMaleFiftyPlus10() {
        return maleFiftyPlus10;
    }

    public void setMaleFiftyPlus10(Long maleFiftyPlus10) {
        this.maleFiftyPlus10 = maleFiftyPlus10;
    }

    public Long getFemaleFiftyPlus10() {
        return femaleFiftyPlus10;
    }

    public void setFemaleFiftyPlus10(Long femaleFiftyPlus10) {
        this.femaleFiftyPlus10 = femaleFiftyPlus10;
    }
    
    
}
