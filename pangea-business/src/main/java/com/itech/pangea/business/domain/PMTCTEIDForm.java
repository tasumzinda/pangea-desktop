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
public class PMTCTEIDForm extends BaseEntity{
    
    @ManyToOne
    private Period period;
    @ManyToOne
    private Facility facility;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateCompleted;
    private String name;
    private Long numerator;
    @Transient
    private String datec;
    
    private Long positiveZeroToTwo;

    private Long positiveTwoToTwelve;

    private Long negativeZeroToTwo;

    private Long negativeTwoToTwelve;

    private Long collectedZeroToTwo;

    private Long collectedTwoToTwelve;

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

    public String getDatec() {
        return datec;
    }

    public void setDatec(String datec) {
        this.datec = datec;
    }

    public Long getPositiveZeroToTwo() {
        return positiveZeroToTwo;
    }

    public void setPositiveZeroToTwo(Long positiveZeroToTwo) {
        this.positiveZeroToTwo = positiveZeroToTwo;
    }

    public Long getPositiveTwoToTwelve() {
        return positiveTwoToTwelve;
    }

    public void setPositiveTwoToTwelve(Long positiveTwoToTwelve) {
        this.positiveTwoToTwelve = positiveTwoToTwelve;
    }

    public Long getNegativeZeroToTwo() {
        return negativeZeroToTwo;
    }

    public void setNegativeZeroToTwo(Long negativeZeroToTwo) {
        this.negativeZeroToTwo = negativeZeroToTwo;
    }

    public Long getNegativeTwoToTwelve() {
        return negativeTwoToTwelve;
    }

    public void setNegativeTwoToTwelve(Long negativeTwoToTwelve) {
        this.negativeTwoToTwelve = negativeTwoToTwelve;
    }

    public Long getCollectedZeroToTwo() {
        return collectedZeroToTwo;
    }

    public void setCollectedZeroToTwo(Long collectedZeroToTwo) {
        this.collectedZeroToTwo = collectedZeroToTwo;
    }

    public Long getCollectedTwoToTwelve() {
        return collectedTwoToTwelve;
    }

    public void setCollectedTwoToTwelve(Long collectedTwoToTwelve) {
        this.collectedTwoToTwelve = collectedTwoToTwelve;
    }
    
    
}
