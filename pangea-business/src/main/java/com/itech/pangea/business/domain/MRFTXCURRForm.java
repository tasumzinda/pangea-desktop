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
public class MRFTXCURRForm extends BaseEntity{

    @ManyToOne
    private Period period;
    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    private Long maleLessThanTwoMonths9;
    private Long femaleLessThanTwoMonths9;
    private Long maleTwoToTwelveMonths9;
    private Long femaleTwoToTwelveMonths9;
    private Long maleThirteenToTwentyFourMonths9;
    private Long femaleThirteenToTwentyFourMonths9;
    private Long maleTwentyFiveToFiftyNineMonths9;
    private Long femaleTwentyFiveToFiftyNineMonths9;
    private Long maleFiveToNine9;
    private Long femaleFiveToNine9;
    private Long maleTenToFourteen9;
    private Long femaleTenToFourteen9;
    private Long maleFifteenToNineteen9;
    private Long femaleFifteenToNineteen9;
    private Long maleTwentyToTwentyFour9;
    private Long femaleTwentyToTwentyFour9;
    private Long maleTwentyFiveToTwentyNine9;
    private Long femaleTwentyFiveToTwentyNine9;
    private Long maleThirtyToFortyNine9;
    private Long femaleThirtyToFortyNine9;
    private Long maleFiftyPlus9;
    private Long femaleFiftyPlus9;

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

    public Long getMaleLessThanTwoMonths9() {
        return maleLessThanTwoMonths9;
    }

    public void setMaleLessThanTwoMonths9(Long maleLessThanTwoMonths9) {
        this.maleLessThanTwoMonths9 = maleLessThanTwoMonths9;
    }

    public Long getFemaleLessThanTwoMonths9() {
        return femaleLessThanTwoMonths9;
    }

    public void setFemaleLessThanTwoMonths9(Long femaleLessThanTwoMonths9) {
        this.femaleLessThanTwoMonths9 = femaleLessThanTwoMonths9;
    }

    public Long getMaleTwoToTwelveMonths9() {
        return maleTwoToTwelveMonths9;
    }

    public void setMaleTwoToTwelveMonths9(Long maleTwoToTwelveMonths9) {
        this.maleTwoToTwelveMonths9 = maleTwoToTwelveMonths9;
    }

    public Long getFemaleTwoToTwelveMonths9() {
        return femaleTwoToTwelveMonths9;
    }

    public void setFemaleTwoToTwelveMonths9(Long femaleTwoToTwelveMonths9) {
        this.femaleTwoToTwelveMonths9 = femaleTwoToTwelveMonths9;
    }

    public Long getMaleThirteenToTwentyFourMonths9() {
        return maleThirteenToTwentyFourMonths9;
    }

    public void setMaleThirteenToTwentyFourMonths9(Long maleThirteenToTwentyFourMonths9) {
        this.maleThirteenToTwentyFourMonths9 = maleThirteenToTwentyFourMonths9;
    }

    public Long getFemaleThirteenToTwentyFourMonths9() {
        return femaleThirteenToTwentyFourMonths9;
    }

    public void setFemaleThirteenToTwentyFourMonths9(Long femaleThirteenToTwentyFourMonths9) {
        this.femaleThirteenToTwentyFourMonths9 = femaleThirteenToTwentyFourMonths9;
    }

    public Long getMaleTwentyFiveToFiftyNineMonths9() {
        return maleTwentyFiveToFiftyNineMonths9;
    }

    public void setMaleTwentyFiveToFiftyNineMonths9(Long maleTwentyFiveToFiftyNineMonths9) {
        this.maleTwentyFiveToFiftyNineMonths9 = maleTwentyFiveToFiftyNineMonths9;
    }

    public Long getFemaleTwentyFiveToFiftyNineMonths9() {
        return femaleTwentyFiveToFiftyNineMonths9;
    }

    public void setFemaleTwentyFiveToFiftyNineMonths9(Long femaleTwentyFiveToFiftyNineMonths9) {
        this.femaleTwentyFiveToFiftyNineMonths9 = femaleTwentyFiveToFiftyNineMonths9;
    }

    public Long getMaleFiveToNine9() {
        return maleFiveToNine9;
    }

    public void setMaleFiveToNine9(Long maleFiveToNine9) {
        this.maleFiveToNine9 = maleFiveToNine9;
    }

    public Long getFemaleFiveToNine9() {
        return femaleFiveToNine9;
    }

    public void setFemaleFiveToNine9(Long femaleFiveToNine9) {
        this.femaleFiveToNine9 = femaleFiveToNine9;
    }

    public Long getMaleTenToFourteen9() {
        return maleTenToFourteen9;
    }

    public void setMaleTenToFourteen9(Long maleTenToFourteen9) {
        this.maleTenToFourteen9 = maleTenToFourteen9;
    }

    public Long getFemaleTenToFourteen9() {
        return femaleTenToFourteen9;
    }

    public void setFemaleTenToFourteen9(Long femaleTenToFourteen9) {
        this.femaleTenToFourteen9 = femaleTenToFourteen9;
    }

    public Long getMaleFifteenToNineteen9() {
        return maleFifteenToNineteen9;
    }

    public void setMaleFifteenToNineteen9(Long maleFifteenToNineteen9) {
        this.maleFifteenToNineteen9 = maleFifteenToNineteen9;
    }

    public Long getFemaleFifteenToNineteen9() {
        return femaleFifteenToNineteen9;
    }

    public void setFemaleFifteenToNineteen9(Long femaleFifteenToNineteen9) {
        this.femaleFifteenToNineteen9 = femaleFifteenToNineteen9;
    }

    public Long getMaleTwentyToTwentyFour9() {
        return maleTwentyToTwentyFour9;
    }

    public void setMaleTwentyToTwentyFour9(Long maleTwentyToTwentyFour9) {
        this.maleTwentyToTwentyFour9 = maleTwentyToTwentyFour9;
    }

    public Long getFemaleTwentyToTwentyFour9() {
        return femaleTwentyToTwentyFour9;
    }

    public void setFemaleTwentyToTwentyFour9(Long femaleTwentyToTwentyFour9) {
        this.femaleTwentyToTwentyFour9 = femaleTwentyToTwentyFour9;
    }

    public Long getMaleTwentyFiveToTwentyNine9() {
        return maleTwentyFiveToTwentyNine9;
    }

    public void setMaleTwentyFiveToTwentyNine9(Long maleTwentyFiveToTwentyNine9) {
        this.maleTwentyFiveToTwentyNine9 = maleTwentyFiveToTwentyNine9;
    }

    public Long getFemaleTwentyFiveToTwentyNine9() {
        return femaleTwentyFiveToTwentyNine9;
    }

    public void setFemaleTwentyFiveToTwentyNine9(Long femaleTwentyFiveToTwentyNine9) {
        this.femaleTwentyFiveToTwentyNine9 = femaleTwentyFiveToTwentyNine9;
    }

    public Long getMaleThirtyToFortyNine9() {
        return maleThirtyToFortyNine9;
    }

    public void setMaleThirtyToFortyNine9(Long maleThirtyToFortyNine9) {
        this.maleThirtyToFortyNine9 = maleThirtyToFortyNine9;
    }

    public Long getFemaleThirtyToFortyNine9() {
        return femaleThirtyToFortyNine9;
    }

    public void setFemaleThirtyToFortyNine9(Long femaleThirtyToFortyNine9) {
        this.femaleThirtyToFortyNine9 = femaleThirtyToFortyNine9;
    }

    public Long getMaleFiftyPlus9() {
        return maleFiftyPlus9;
    }

    public void setMaleFiftyPlus9(Long maleFiftyPlus9) {
        this.maleFiftyPlus9 = maleFiftyPlus9;
    }

    public Long getFemaleFiftyPlus9() {
        return femaleFiftyPlus9;
    }

    public void setFemaleFiftyPlus9(Long femaleFiftyPlus9) {
        this.femaleFiftyPlus9 = femaleFiftyPlus9;
    }
    
    
}
