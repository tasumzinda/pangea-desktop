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

import java.util.Date;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Judge Muzinda
 */
@MappedSuperclass
abstract public class GenericTB extends BaseEntity {

    @ManyToOne
    private Period period;
    @ManyToOne
    private Facility facility;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateCompleted;
    private String name;
    private Integer numerator;
    private Integer denominator;
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
    
    @Transient
    private String datec;

    public GenericTB() {
    }

    public GenericTB(Period period) {
        this.period = period;
    }

    public GenericTB(Period period, Facility facility) {
        this.period = period;
        this.facility = facility;
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

    public Integer getNumerator() {
        return numerator;
    }

    public void setNumerator(Integer numerator) {
        this.numerator = numerator;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    public String getDatec() {
        return datec;
    }

    public void setDatec(String datec) {
        this.datec = datec;
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
    
}