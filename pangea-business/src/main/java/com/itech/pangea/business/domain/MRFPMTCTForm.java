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
public class MRFPMTCTForm extends BaseEntity{
    @ManyToOne
    private Period period;
    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    private Long maleTenToFourteen;
    private Long femaleTenToFourteen;
    private Long maleFifteenToNineteen;
    private Long femaleFifteenToNineteen;
    private Long maleTwentyToTwentyFour;
    private Long femaleTwentyToTwentyFour;
    private Long maleTwentyFiveToTwentyNine;
    private Long femaleTwentyFiveToTwentyNine;
    private Long maleThirtyToFortyNine;
    private Long femaleThirtyToFortyNine;
    private Long maleFiftyPlus;
    private Long femaleFiftyPlus;
    
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
    
    private Long maleTenToFourteen3;
    private Long femaleTenToFourteen3;
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
    
    private Long maleTenToFourteen4;
    private Long femaleTenToFourteen4;
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
    
    private Long maleTenToFourteen5;
    private Long femaleTenToFourteen5;
    private Long maleFifteenToNineteen5;
    private Long femaleFifteenToNineteen5;
    private Long maleTwentyToTwentyFour5;
    private Long femaleTwentyToTwentyFour5;
    private Long maleTwentyFiveToTwentyNine5;
    private Long femaleTwentyFiveToTwentyNine5;
    private Long maleThirtyToFortyNine5;
    private Long femaleThirtyToFortyNine5;
    private Long maleFiftyPlus5;
    private Long femaleFiftyPlus5;
    
    private Long maleTenToFourteen6;
    private Long femaleTenToFourteen6;
    private Long maleFifteenToNineteen6;
    private Long femaleFifteenToNineteen6;
    private Long maleTwentyToTwentyFour6;
    private Long femaleTwentyToTwentyFour6;
    private Long maleTwentyFiveToTwentyNine6;
    private Long femaleTwentyFiveToTwentyNine6;
    private Long maleThirtyToFortyNine6;
    private Long femaleThirtyToFortyNine6;
    private Long maleFiftyPlus6;
    private Long femaleFiftyPlus6;

    private Long maleTenToFourteen7;
    private Long femaleTenToFourteen7;
    private Long maleFifteenToNineteen7;
    private Long femaleFifteenToNineteen7;
    private Long maleTwentyToTwentyFour7;
    private Long femaleTwentyToTwentyFour7;
    private Long maleTwentyFiveToTwentyNine7;
    private Long femaleTwentyFiveToTwentyNine7;
    private Long maleThirtyToFortyNine7;
    private Long femaleThirtyToFortyNine7;
    private Long maleFiftyPlus7;
    private Long femaleFiftyPlus7;
    
    private Long maleTenToFourteen8;
    private Long femaleTenToFourteen8;
    private Long maleFifteenToNineteen8;
    private Long femaleFifteenToNineteen8;
    private Long maleTwentyToTwentyFour8;
    private Long femaleTwentyToTwentyFour8;
    private Long maleTwentyFiveToTwentyNine8;
    private Long femaleTwentyFiveToTwentyNine8;
    private Long maleThirtyToFortyNine8;
    private Long femaleThirtyToFortyNine8;
    private Long maleFiftyPlus8;
    private Long femaleFiftyPlus8;
    
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
    
    private Long maleTenToFourteen11;
    private Long femaleTenToFourteen11;
    private Long maleFifteenToNineteen11;
    private Long femaleFifteenToNineteen11;
    private Long maleTwentyToTwentyFour11;
    private Long femaleTwentyToTwentyFour11;
    private Long maleTwentyFiveToTwentyNine11;
    private Long femaleTwentyFiveToTwentyNine11;
    private Long maleThirtyToFortyNine11;
    private Long femaleThirtyToFortyNine11;
    private Long maleFiftyPlus11;
    private Long femaleFiftyPlus11;
    
    private Long maleTenToFourteen12;
    private Long femaleTenToFourteen12;
    private Long maleFifteenToNineteen12;
    private Long femaleFifteenToNineteen12;
    private Long maleTwentyToTwentyFour12;
    private Long femaleTwentyToTwentyFour12;
    private Long maleTwentyFiveToTwentyNine12;
    private Long femaleTwentyFiveToTwentyNine12;
    private Long maleThirtyToFortyNine12;
    private Long femaleThirtyToFortyNine12;
    private Long maleFiftyPlus12;
    private Long femaleFiftyPlus12;
    
    private Long maleTenToFourteen13;
    private Long femaleTenToFourteen13;
    private Long maleFifteenToNineteen13;
    private Long femaleFifteenToNineteen13;
    private Long maleTwentyToTwentyFour13;
    private Long femaleTwentyToTwentyFour13;
    private Long maleTwentyFiveToTwentyNine13;
    private Long femaleTwentyFiveToTwentyNine13;
    private Long maleThirtyToFortyNine13;
    private Long femaleThirtyToFortyNine13;
    private Long maleFiftyPlus13;
    private Long femaleFiftyPlus13;
    
    private Long maleTenToFourteen14;
    private Long femaleTenToFourteen14;
    private Long maleFifteenToNineteen14;
    private Long femaleFifteenToNineteen14;
    private Long maleTwentyToTwentyFour14;
    private Long femaleTwentyToTwentyFour14;
    private Long maleTwentyFiveToTwentyNine14;
    private Long femaleTwentyFiveToTwentyNine14;
    private Long maleThirtyToFortyNine14;
    private Long femaleThirtyToFortyNine14;
    private Long maleFiftyPlus14;
    private Long femaleFiftyPlus14;
    
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

    public Long getMaleThirtyToFortyNine() {
        return maleThirtyToFortyNine;
    }

    public void setMaleThirtyToFortyNine(Long maleThirtyToFortyNine) {
        this.maleThirtyToFortyNine = maleThirtyToFortyNine;
    }

    public Long getFemaleThirtyToFortyNine() {
        return femaleThirtyToFortyNine;
    }

    public void setFemaleThirtyToFortyNine(Long femaleThirtyToFortyNine) {
        this.femaleThirtyToFortyNine = femaleThirtyToFortyNine;
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

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
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

    public Long getMaleThirtyToFortyNine5() {
        return maleThirtyToFortyNine5;
    }

    public void setMaleThirtyToFortyNine5(Long maleThirtyToFortyNine5) {
        this.maleThirtyToFortyNine5 = maleThirtyToFortyNine5;
    }

    public Long getFemaleThirtyToFortyNine5() {
        return femaleThirtyToFortyNine5;
    }

    public void setFemaleThirtyToFortyNine5(Long femaleThirtyToFortyNine5) {
        this.femaleThirtyToFortyNine5 = femaleThirtyToFortyNine5;
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

    public Long getMaleThirtyToFortyNine6() {
        return maleThirtyToFortyNine6;
    }

    public void setMaleThirtyToFortyNine6(Long maleThirtyToFortyNine6) {
        this.maleThirtyToFortyNine6 = maleThirtyToFortyNine6;
    }

    public Long getFemaleThirtyToFortyNine6() {
        return femaleThirtyToFortyNine6;
    }

    public void setFemaleThirtyToFortyNine6(Long femaleThirtyToFortyNine6) {
        this.femaleThirtyToFortyNine6 = femaleThirtyToFortyNine6;
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

    public Long getMaleThirtyToFortyNine7() {
        return maleThirtyToFortyNine7;
    }

    public void setMaleThirtyToFortyNine7(Long maleThirtyToFortyNine7) {
        this.maleThirtyToFortyNine7 = maleThirtyToFortyNine7;
    }

    public Long getFemaleThirtyToFortyNine7() {
        return femaleThirtyToFortyNine7;
    }

    public void setFemaleThirtyToFortyNine7(Long femaleThirtyToFortyNine7) {
        this.femaleThirtyToFortyNine7 = femaleThirtyToFortyNine7;
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

    public Long getMaleThirtyToFortyNine8() {
        return maleThirtyToFortyNine8;
    }

    public void setMaleThirtyToFortyNine8(Long maleThirtyToFortyNine8) {
        this.maleThirtyToFortyNine8 = maleThirtyToFortyNine8;
    }

    public Long getFemaleThirtyToFortyNine8() {
        return femaleThirtyToFortyNine8;
    }

    public void setFemaleThirtyToFortyNine8(Long femaleThirtyToFortyNine8) {
        this.femaleThirtyToFortyNine8 = femaleThirtyToFortyNine8;
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

    public Long getMaleTenToFourteen11() {
        return maleTenToFourteen11;
    }

    public void setMaleTenToFourteen11(Long maleTenToFourteen11) {
        this.maleTenToFourteen11 = maleTenToFourteen11;
    }

    public Long getFemaleTenToFourteen11() {
        return femaleTenToFourteen11;
    }

    public void setFemaleTenToFourteen11(Long femaleTenToFourteen11) {
        this.femaleTenToFourteen11 = femaleTenToFourteen11;
    }

    public Long getMaleFifteenToNineteen11() {
        return maleFifteenToNineteen11;
    }

    public void setMaleFifteenToNineteen11(Long maleFifteenToNineteen11) {
        this.maleFifteenToNineteen11 = maleFifteenToNineteen11;
    }

    public Long getFemaleFifteenToNineteen11() {
        return femaleFifteenToNineteen11;
    }

    public void setFemaleFifteenToNineteen11(Long femaleFifteenToNineteen11) {
        this.femaleFifteenToNineteen11 = femaleFifteenToNineteen11;
    }

    public Long getMaleTwentyToTwentyFour11() {
        return maleTwentyToTwentyFour11;
    }

    public void setMaleTwentyToTwentyFour11(Long maleTwentyToTwentyFour11) {
        this.maleTwentyToTwentyFour11 = maleTwentyToTwentyFour11;
    }

    public Long getFemaleTwentyToTwentyFour11() {
        return femaleTwentyToTwentyFour11;
    }

    public void setFemaleTwentyToTwentyFour11(Long femaleTwentyToTwentyFour11) {
        this.femaleTwentyToTwentyFour11 = femaleTwentyToTwentyFour11;
    }

    public Long getMaleTwentyFiveToTwentyNine11() {
        return maleTwentyFiveToTwentyNine11;
    }

    public void setMaleTwentyFiveToTwentyNine11(Long maleTwentyFiveToTwentyNine11) {
        this.maleTwentyFiveToTwentyNine11 = maleTwentyFiveToTwentyNine11;
    }

    public Long getFemaleTwentyFiveToTwentyNine11() {
        return femaleTwentyFiveToTwentyNine11;
    }

    public void setFemaleTwentyFiveToTwentyNine11(Long femaleTwentyFiveToTwentyNine11) {
        this.femaleTwentyFiveToTwentyNine11 = femaleTwentyFiveToTwentyNine11;
    }

    public Long getMaleThirtyToFortyNine11() {
        return maleThirtyToFortyNine11;
    }

    public void setMaleThirtyToFortyNine11(Long maleThirtyToFortyNine11) {
        this.maleThirtyToFortyNine11 = maleThirtyToFortyNine11;
    }

    public Long getFemaleThirtyToFortyNine11() {
        return femaleThirtyToFortyNine11;
    }

    public void setFemaleThirtyToFortyNine11(Long femaleThirtyToFortyNine11) {
        this.femaleThirtyToFortyNine11 = femaleThirtyToFortyNine11;
    }

    public Long getMaleFiftyPlus11() {
        return maleFiftyPlus11;
    }

    public void setMaleFiftyPlus11(Long maleFiftyPlus11) {
        this.maleFiftyPlus11 = maleFiftyPlus11;
    }

    public Long getFemaleFiftyPlus11() {
        return femaleFiftyPlus11;
    }

    public void setFemaleFiftyPlus11(Long femaleFiftyPlus11) {
        this.femaleFiftyPlus11 = femaleFiftyPlus11;
    }

    public Long getMaleTenToFourteen12() {
        return maleTenToFourteen12;
    }

    public void setMaleTenToFourteen12(Long maleTenToFourteen12) {
        this.maleTenToFourteen12 = maleTenToFourteen12;
    }

    public Long getFemaleTenToFourteen12() {
        return femaleTenToFourteen12;
    }

    public void setFemaleTenToFourteen12(Long femaleTenToFourteen12) {
        this.femaleTenToFourteen12 = femaleTenToFourteen12;
    }

    public Long getMaleFifteenToNineteen12() {
        return maleFifteenToNineteen12;
    }

    public void setMaleFifteenToNineteen12(Long maleFifteenToNineteen12) {
        this.maleFifteenToNineteen12 = maleFifteenToNineteen12;
    }

    public Long getFemaleFifteenToNineteen12() {
        return femaleFifteenToNineteen12;
    }

    public void setFemaleFifteenToNineteen12(Long femaleFifteenToNineteen12) {
        this.femaleFifteenToNineteen12 = femaleFifteenToNineteen12;
    }

    public Long getMaleTwentyToTwentyFour12() {
        return maleTwentyToTwentyFour12;
    }

    public void setMaleTwentyToTwentyFour12(Long maleTwentyToTwentyFour12) {
        this.maleTwentyToTwentyFour12 = maleTwentyToTwentyFour12;
    }

    public Long getFemaleTwentyToTwentyFour12() {
        return femaleTwentyToTwentyFour12;
    }

    public void setFemaleTwentyToTwentyFour12(Long femaleTwentyToTwentyFour12) {
        this.femaleTwentyToTwentyFour12 = femaleTwentyToTwentyFour12;
    }

    public Long getMaleTwentyFiveToTwentyNine12() {
        return maleTwentyFiveToTwentyNine12;
    }

    public void setMaleTwentyFiveToTwentyNine12(Long maleTwentyFiveToTwentyNine12) {
        this.maleTwentyFiveToTwentyNine12 = maleTwentyFiveToTwentyNine12;
    }

    public Long getFemaleTwentyFiveToTwentyNine12() {
        return femaleTwentyFiveToTwentyNine12;
    }

    public void setFemaleTwentyFiveToTwentyNine12(Long femaleTwentyFiveToTwentyNine12) {
        this.femaleTwentyFiveToTwentyNine12 = femaleTwentyFiveToTwentyNine12;
    }

    public Long getMaleThirtyToFortyNine12() {
        return maleThirtyToFortyNine12;
    }

    public void setMaleThirtyToFortyNine12(Long maleThirtyToFortyNine12) {
        this.maleThirtyToFortyNine12 = maleThirtyToFortyNine12;
    }

    public Long getFemaleThirtyToFortyNine12() {
        return femaleThirtyToFortyNine12;
    }

    public void setFemaleThirtyToFortyNine12(Long femaleThirtyToFortyNine12) {
        this.femaleThirtyToFortyNine12 = femaleThirtyToFortyNine12;
    }

    public Long getMaleFiftyPlus12() {
        return maleFiftyPlus12;
    }

    public void setMaleFiftyPlus12(Long maleFiftyPlus12) {
        this.maleFiftyPlus12 = maleFiftyPlus12;
    }

    public Long getFemaleFiftyPlus12() {
        return femaleFiftyPlus12;
    }

    public void setFemaleFiftyPlus12(Long femaleFiftyPlus12) {
        this.femaleFiftyPlus12 = femaleFiftyPlus12;
    }

    public Long getMaleTenToFourteen13() {
        return maleTenToFourteen13;
    }

    public void setMaleTenToFourteen13(Long maleTenToFourteen13) {
        this.maleTenToFourteen13 = maleTenToFourteen13;
    }

    public Long getFemaleTenToFourteen13() {
        return femaleTenToFourteen13;
    }

    public void setFemaleTenToFourteen13(Long femaleTenToFourteen13) {
        this.femaleTenToFourteen13 = femaleTenToFourteen13;
    }

    public Long getMaleFifteenToNineteen13() {
        return maleFifteenToNineteen13;
    }

    public void setMaleFifteenToNineteen13(Long maleFifteenToNineteen13) {
        this.maleFifteenToNineteen13 = maleFifteenToNineteen13;
    }

    public Long getFemaleFifteenToNineteen13() {
        return femaleFifteenToNineteen13;
    }

    public void setFemaleFifteenToNineteen13(Long femaleFifteenToNineteen13) {
        this.femaleFifteenToNineteen13 = femaleFifteenToNineteen13;
    }

    public Long getMaleTwentyToTwentyFour13() {
        return maleTwentyToTwentyFour13;
    }

    public void setMaleTwentyToTwentyFour13(Long maleTwentyToTwentyFour13) {
        this.maleTwentyToTwentyFour13 = maleTwentyToTwentyFour13;
    }

    public Long getFemaleTwentyToTwentyFour13() {
        return femaleTwentyToTwentyFour13;
    }

    public void setFemaleTwentyToTwentyFour13(Long femaleTwentyToTwentyFour13) {
        this.femaleTwentyToTwentyFour13 = femaleTwentyToTwentyFour13;
    }

    public Long getMaleTwentyFiveToTwentyNine13() {
        return maleTwentyFiveToTwentyNine13;
    }

    public void setMaleTwentyFiveToTwentyNine13(Long maleTwentyFiveToTwentyNine13) {
        this.maleTwentyFiveToTwentyNine13 = maleTwentyFiveToTwentyNine13;
    }

    public Long getFemaleTwentyFiveToTwentyNine13() {
        return femaleTwentyFiveToTwentyNine13;
    }

    public void setFemaleTwentyFiveToTwentyNine13(Long femaleTwentyFiveToTwentyNine13) {
        this.femaleTwentyFiveToTwentyNine13 = femaleTwentyFiveToTwentyNine13;
    }

    public Long getMaleThirtyToFortyNine13() {
        return maleThirtyToFortyNine13;
    }

    public void setMaleThirtyToFortyNine13(Long maleThirtyToFortyNine13) {
        this.maleThirtyToFortyNine13 = maleThirtyToFortyNine13;
    }

    public Long getFemaleThirtyToFortyNine13() {
        return femaleThirtyToFortyNine13;
    }

    public void setFemaleThirtyToFortyNine13(Long femaleThirtyToFortyNine13) {
        this.femaleThirtyToFortyNine13 = femaleThirtyToFortyNine13;
    }

    public Long getMaleFiftyPlus13() {
        return maleFiftyPlus13;
    }

    public void setMaleFiftyPlus13(Long maleFiftyPlus13) {
        this.maleFiftyPlus13 = maleFiftyPlus13;
    }

    public Long getFemaleFiftyPlus13() {
        return femaleFiftyPlus13;
    }

    public void setFemaleFiftyPlus13(Long femaleFiftyPlus13) {
        this.femaleFiftyPlus13 = femaleFiftyPlus13;
    }

    public Long getMaleTenToFourteen14() {
        return maleTenToFourteen14;
    }

    public void setMaleTenToFourteen14(Long maleTenToFourteen14) {
        this.maleTenToFourteen14 = maleTenToFourteen14;
    }

    public Long getFemaleTenToFourteen14() {
        return femaleTenToFourteen14;
    }

    public void setFemaleTenToFourteen14(Long femaleTenToFourteen14) {
        this.femaleTenToFourteen14 = femaleTenToFourteen14;
    }

    public Long getMaleFifteenToNineteen14() {
        return maleFifteenToNineteen14;
    }

    public void setMaleFifteenToNineteen14(Long maleFifteenToNineteen14) {
        this.maleFifteenToNineteen14 = maleFifteenToNineteen14;
    }

    public Long getFemaleFifteenToNineteen14() {
        return femaleFifteenToNineteen14;
    }

    public void setFemaleFifteenToNineteen14(Long femaleFifteenToNineteen14) {
        this.femaleFifteenToNineteen14 = femaleFifteenToNineteen14;
    }

    public Long getMaleTwentyToTwentyFour14() {
        return maleTwentyToTwentyFour14;
    }

    public void setMaleTwentyToTwentyFour14(Long maleTwentyToTwentyFour14) {
        this.maleTwentyToTwentyFour14 = maleTwentyToTwentyFour14;
    }

    public Long getFemaleTwentyToTwentyFour14() {
        return femaleTwentyToTwentyFour14;
    }

    public void setFemaleTwentyToTwentyFour14(Long femaleTwentyToTwentyFour14) {
        this.femaleTwentyToTwentyFour14 = femaleTwentyToTwentyFour14;
    }

    public Long getMaleTwentyFiveToTwentyNine14() {
        return maleTwentyFiveToTwentyNine14;
    }

    public void setMaleTwentyFiveToTwentyNine14(Long maleTwentyFiveToTwentyNine14) {
        this.maleTwentyFiveToTwentyNine14 = maleTwentyFiveToTwentyNine14;
    }

    public Long getFemaleTwentyFiveToTwentyNine14() {
        return femaleTwentyFiveToTwentyNine14;
    }

    public void setFemaleTwentyFiveToTwentyNine14(Long femaleTwentyFiveToTwentyNine14) {
        this.femaleTwentyFiveToTwentyNine14 = femaleTwentyFiveToTwentyNine14;
    }

    public Long getMaleThirtyToFortyNine14() {
        return maleThirtyToFortyNine14;
    }

    public void setMaleThirtyToFortyNine14(Long maleThirtyToFortyNine14) {
        this.maleThirtyToFortyNine14 = maleThirtyToFortyNine14;
    }

    public Long getFemaleThirtyToFortyNine14() {
        return femaleThirtyToFortyNine14;
    }

    public void setFemaleThirtyToFortyNine14(Long femaleThirtyToFortyNine14) {
        this.femaleThirtyToFortyNine14 = femaleThirtyToFortyNine14;
    }

    public Long getMaleFiftyPlus14() {
        return maleFiftyPlus14;
    }

    public void setMaleFiftyPlus14(Long maleFiftyPlus14) {
        this.maleFiftyPlus14 = maleFiftyPlus14;
    }

    public Long getFemaleFiftyPlus14() {
        return femaleFiftyPlus14;
    }

    public void setFemaleFiftyPlus14(Long femaleFiftyPlus14) {
        this.femaleFiftyPlus14 = femaleFiftyPlus14;
    }
    
}
