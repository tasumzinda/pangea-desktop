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
public class MRFPMTCTEIDForm extends BaseEntity{

    @ManyToOne
    private Period period;
    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    private Long pmtctEIDP30;
    private Long pmtctEIDP31;
    private Long pmtctEIDP4;
    private Long pmtctEIDP5;
    private Long pmtctEIDP14;
    private Long pmtctEIDP17;
    private Long lessThanTwo;
    private Long threeToTwelve;
    private Long thirteenToTwentyFour;
    private Long lessThanTwo1;
    private Long threeToTwelve1;
    private Long thirteenToTwentyFour1;
    private Long lessThanTwo2;
    private Long threeToTwelve2;
    private Long thirteenToTwentyFour2;

    public Long getPmtctEIDP30() {
        return pmtctEIDP30;
    }

    public void setPmtctEIDP30(Long pmtctEIDP30) {
        this.pmtctEIDP30 = pmtctEIDP30;
    }

    public Long getPmtctEIDP31() {
        return pmtctEIDP31;
    }

    public void setPmtctEIDP31(Long pmtctEIDP31) {
        this.pmtctEIDP31 = pmtctEIDP31;
    }

    public Long getPmtctEIDP4() {
        return pmtctEIDP4;
    }

    public void setPmtctEIDP4(Long pmtctEIDP4) {
        this.pmtctEIDP4 = pmtctEIDP4;
    }

    public Long getPmtctEIDP5() {
        return pmtctEIDP5;
    }

    public void setPmtctEIDP5(Long pmtctEIDP5) {
        this.pmtctEIDP5 = pmtctEIDP5;
    }

    public Long getPmtctEIDP14() {
        return pmtctEIDP14;
    }

    public void setPmtctEIDP14(Long pmtctEIDP14) {
        this.pmtctEIDP14 = pmtctEIDP14;
    }

    public Long getPmtctEIDP17() {
        return pmtctEIDP17;
    }

    public void setPmtctEIDP17(Long pmtctEIDP17) {
        this.pmtctEIDP17 = pmtctEIDP17;
    }

    public Long getLessThanTwo() {
        return lessThanTwo;
    }

    public void setLessThanTwo(Long lessThanTwo) {
        this.lessThanTwo = lessThanTwo;
    }

    public Long getThreeToTwelve() {
        return threeToTwelve;
    }

    public void setThreeToTwelve(Long threeToTwelve) {
        this.threeToTwelve = threeToTwelve;
    }

    public Long getThirteenToTwentyFour() {
        return thirteenToTwentyFour;
    }

    public void setThirteenToTwentyFour(Long thirteenToTwentyFour) {
        this.thirteenToTwentyFour = thirteenToTwentyFour;
    }

    public Long getLessThanTwo1() {
        return lessThanTwo1;
    }

    public void setLessThanTwo1(Long lessThanTwo1) {
        this.lessThanTwo1 = lessThanTwo1;
    }

    public Long getThreeToTwelve1() {
        return threeToTwelve1;
    }

    public void setThreeToTwelve1(Long threeToTwelve1) {
        this.threeToTwelve1 = threeToTwelve1;
    }

    public Long getThirteenToTwentyFour1() {
        return thirteenToTwentyFour1;
    }

    public void setThirteenToTwentyFour1(Long thirteenToTwentyFour1) {
        this.thirteenToTwentyFour1 = thirteenToTwentyFour1;
    }

    public Long getLessThanTwo2() {
        return lessThanTwo2;
    }

    public void setLessThanTwo2(Long lessThanTwo2) {
        this.lessThanTwo2 = lessThanTwo2;
    }

    public Long getThreeToTwelve2() {
        return threeToTwelve2;
    }

    public void setThreeToTwelve2(Long threeToTwelve2) {
        this.threeToTwelve2 = threeToTwelve2;
    }

    public Long getThirteenToTwentyFour2() {
        return thirteenToTwentyFour2;
    }

    public void setThirteenToTwentyFour2(Long thirteenToTwentyFour2) {
        this.thirteenToTwentyFour2 = thirteenToTwentyFour2;
    }

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
}
