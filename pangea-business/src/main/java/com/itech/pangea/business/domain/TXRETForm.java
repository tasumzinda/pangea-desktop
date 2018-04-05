package com.itech.pangea.business.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by tdhla on 10/25/2016.
 */
@Entity
public class TXRETForm extends BaseEntity {

    @ManyToOne
    private Facility facility;
    @Transient
    private String datec;
    private String name;
    @ManyToOne
    private Period period;
    private Long numerator;
    private Long denominator;
    private Long numeratorPregnant;
    private Long denominatorPregnant;
    private Long numeratorBreastFeeding;
    private Long denominatorBreastFeeding;
    
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
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateSubmitted;

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String getDatec() {
        return datec;
    }

    public void setDatec(String datec) {
        this.datec = datec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Long getNumerator() {
        return numerator;
    }

    public void setNumerator(Long numerator) {
        this.numerator = numerator;
    }

    public Long getNumeratorPregnant() {
        return numeratorPregnant;
    }

    public void setNumeratorPregnant(Long numeratorPregnant) {
        this.numeratorPregnant = numeratorPregnant;
    }

    public Long getNumeratorBreastFeeding() {
        return numeratorBreastFeeding;
    }

    public void setNumeratorBreastFeeding(Long numeratorBreastFeeding) {
        this.numeratorBreastFeeding = numeratorBreastFeeding;
    }

    public Long getDenominator() {
        return denominator;
    }

    public void setDenominator(Long denominator) {
        this.denominator = denominator;
    }

    public Long getDenominatorPregnant() {
        return denominatorPregnant;
    }

    public void setDenominatorPregnant(Long denominatorPregnant) {
        this.denominatorPregnant = denominatorPregnant;
    }

    public Long getDenominatorBreastFeeding() {
        return denominatorBreastFeeding;
    }

    public void setDenominatorBreastFeeding(Long denominatorBreastFeeding) {
        this.denominatorBreastFeeding = denominatorBreastFeeding;
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

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
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
    
    

}