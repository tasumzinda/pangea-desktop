/*
 * Copyright 2016 Judge Muzinda.
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

/**
 *
 * @author Judge Muzinda
 */
@Entity
public class TbScreendx extends GenericTB {
    
    private Integer disagregattedBySexAndAge;
    
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

    private Long positiveScreen;

    private Long negativeScreen;

    private Long denomSpecimenSent;

    private Long denomSmear;

    private Long denomExpert;

    private Long denomOthers;

    public TbScreendx() {
    }

    public Integer getDisagregattedBySexAndAge() {
        return disagregattedBySexAndAge;
    }

    public void setDisagregattedBySexAndAge(Integer disagregattedBySexAndAge) {
        this.disagregattedBySexAndAge = disagregattedBySexAndAge;
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

    public Long getPositiveScreen() {
        return positiveScreen;
    }

    public void setPositiveScreen(Long positiveScreen) {
        this.positiveScreen = positiveScreen;
    }

    public Long getNegativeScreen() {
        return negativeScreen;
    }

    public void setNegativeScreen(Long negativeScreen) {
        this.negativeScreen = negativeScreen;
    }

    public Long getDenomSpecimenSent() {
        return denomSpecimenSent;
    }

    public void setDenomSpecimenSent(Long denomSpecimenSent) {
        this.denomSpecimenSent = denomSpecimenSent;
    }

    public Long getDenomSmear() {
        return denomSmear;
    }

    public void setDenomSmear(Long denomSmear) {
        this.denomSmear = denomSmear;
    }

    public Long getDenomExpert() {
        return denomExpert;
    }

    public void setDenomExpert(Long denomExpert) {
        this.denomExpert = denomExpert;
    }

    public Long getDenomOthers() {
        return denomOthers;
    }

    public void setDenomOthers(Long denomOthers) {
        this.denomOthers = denomOthers;
    }
    
}