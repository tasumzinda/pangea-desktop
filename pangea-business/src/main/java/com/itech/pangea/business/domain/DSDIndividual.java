package com.itech.pangea.business.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by tdhlakama on 2/6/2016.
 */
@Entity
public class DSDIndividual extends BaseEntity {

    @Temporal(TemporalType.DATE)
    private Date dateCompleted;
    private String name;
    @Transient
    private String datec;
    @ManyToOne
    private Facility facility;
    private Long testedOPD = 0L;
    private Long positiveTestedOPD = 0L;
    private Long maleLessThanOne1 = 0L, maleLessThanOne4 = 0L, maleLessThanOne5 = 0L, maleLessThanOne6 = 0L, maleLessThanOne7 = 0L, maleLessThanOne8 = 0L, maleLessThanOne9, maleLessThanOne10;
    private Long femaleLessThanOne1 = 0L, femaleLessThanOne4 = 0L, femaleLessThanOne5 = 0L, femaleLessThanOne6 = 0L, femaleLessThanOne7 = 0L, femaleLessThanOne8 = 0L, femaleLessThanOne9, femaleLessThanOne10;
    private Long maleOneToFour1 = 0L, maleOneToFour4 = 0L, maleOneToFour5 = 0L, maleOneToFour6 = 0L, maleOneToFour7 = 0L, maleOneToFour8 = 0L, maleOneToFour9, maleOneToFour10;
    private Long femaleOneToFour1 = 0L, femaleOneToFour4 = 0L, femaleOneToFour5 = 0L, femaleOneToFour6 = 0L, femaleOneToFour7 = 0L, femaleOneToFour8 = 0L, femaleOneToFour9, femaleOneToFour10;
    private Long maleFiveToNine1 = 0L, maleFiveToNine4 = 0L, maleFiveToNine5 = 0L, maleFiveToNine6 = 0L, maleFiveToNine7 = 0L, maleFiveToNine8 = 0L, maleFiveToNine9, maleFiveToNine10;
    private Long femaleFiveToNine1 = 0L, femaleFiveToNine4 = 0L, femaleFiveToNine5 = 0L, femaleFiveToNine6 = 0L, femaleFiveToNine7 = 0L, femaleFiveToNine8 = 0L, femaleFiveToNine9, femaleFiveToNine10;
    private Long maleTenToFourteen1 = 0L, maleTenToFourteen4 = 0L, maleTenToFourteen5 = 0L, maleTenToFourteen6 = 0L, maleTenToFourteen7 = 0L, maleTenToFourteen8 = 0L, maleTenToFourteen9, maleTenToFourteen10;
    private Long femaleTenToFourteen1 = 0L, femaleTenToFourteen4 = 0L, femaleTenToFourteen5 = 0L, femaleTenToFourteen6 = 0L, femaleTenToFourteen7 = 0L, femaleTenToFourteen8 = 0L, femaleTenToFourteen9, femaleTenToFourteen10;
    private Long maleFifteenToNineteen1 = 0L, maleFifteenToNineteen4 = 0L, maleFifteenToNineteen5 = 0L, maleFifteenToNineteen6 = 0L, maleFifteenToNineteen7 = 0L, maleFifteenToNineteen8 = 0L ,maleFifteenToNineteen9, maleFifteenToNineteen10;
    private Long femaleFifteenToNineteen1 = 0L, femaleFifteenToNineteen4 = 0L, femaleFifteenToNineteen5 = 0L, femaleFifteenToNineteen6 = 0L, femaleFifteenToNineteen7 = 0L, femaleFifteenToNineteen8 = 0L, femaleFifteenToNineteen9, femaleFifteenToNineteen10;
    private Long maleTwentyToTwentyFour1 = 0L, maleTwentyToTwentyFour4 = 0L, maleTwentyToTwentyFour5 = 0L, maleTwentyToTwentyFour6 = 0L, maleTwentyToTwentyFour7 = 0L, maleTwentyToTwentyFour8 = 0L, maleTwentyToTwentyFour9, maleTwentyToTwentyFour10;
    private Long femaleTwentyToTwentyFour1 = 0L, femaleTwentyToTwentyFour4 = 0L, femaleTwentyToTwentyFour5 = 0L, femaleTwentyToTwentyFour6 = 0L, femaleTwentyToTwentyFour7 = 0L, femaleTwentyToTwentyFour8 = 0L, femaleTwentyToTwentyFour9, femaleTwentyToTwentyFour10;
    private Long maleTwentyFiveToTwentyNine1 = 0L, maleTwentyFiveToTwentyNine4 = 0L, maleTwentyFiveToTwentyNine5 = 0L, maleTwentyFiveToTwentyNine6 = 0L, maleTwentyFiveToTwentyNine7 = 0L, maleTwentyFiveToTwentyNine8 = 0L, maleTwentyFiveToTwentyNine9 = 0L, maleTwentyFiveToTwentyNine10 = 0L;
    private Long femaleTwentyFiveToTwentyNine1 = 0L, femaleTwentyFiveToTwentyNine4 = 0L, femaleTwentyFiveToTwentyNine5 = 0L, femaleTwentyFiveToTwentyNine6 = 0L, femaleTwentyFiveToTwentyNine7 = 0L, femaleTwentyFiveToTwentyNine8  = 0L, femaleTwentyFiveToTwentyNine9 = 0L, femaleTwentyFiveToTwentyNine10 = 0L;
    private Long maleThirtyToThirtyFour1 = 0L, maleThirtyToThirtyFour4 = 0L, maleThirtyToThirtyFour5 = 0L, maleThirtyToThirtyFour6 = 0L, maleThirtyToThirtyFour7 = 0L, maleThirtyToThirtyFour8 = 0L, maleThirtyToThirtyFour9 = 0L, maleThirtyToThirtyFour10 = 0L;
    private Long femaleThirtyToThirtyFour1 = 0L, femaleThirtyToThirtyFour4 = 0L, femaleThirtyToThirtyFour5 = 0L, femaleThirtyToThirtyFour6 = 0L, femaleThirtyToThirtyFour7 = 0L, femaleThirtyToThirtyFour8 = 0L, femaleThirtyToThirtyFour9 = 0L, femaleThirtyToThirtyFour10 = 0L;
    private Long maleThirtyFiveToThirtyNine1 = 0L, maleThirtyFiveToThirtyNine4 = 0L, maleThirtyFiveToThirtyNine5 = 0L, maleThirtyFiveToThirtyNine6 = 0L, maleThirtyFiveToThirtyNine7 = 0L, maleThirtyFiveToThirtyNine8 = 0L, maleThirtyFiveToThirtyNine9 = 0L, maleThirtyFiveToThirtyNine10 = 0L;
    private Long femaleThirtyFiveToThirtyNine1 = 0L, femaleThirtyFiveToThirtyNine4 = 0L, femaleThirtyFiveToThirtyNine5 = 0L, femaleThirtyFiveToThirtyNine6 = 0L, femaleThirtyFiveToThirtyNine7 = 0L, femaleThirtyFiveToThirtyNine8 = 0L, femaleThirtyFiveToThirtyNine9 = 0L, femaleThirtyFiveToThirtyNine10 = 0L;
    private Long maleFortyToFortyFour1 = 0L, maleFortyToFortyFour4 = 0L, maleFortyToFortyFour5 = 0L, maleFortyToFortyFour6 = 0L, maleFortyToFortyFour7 = 0L, maleFortyToFortyFour8 = 0L, maleFortyToFortyFour9 = 0L, maleFortyToFortyFour10 = 0L;
    private Long femaleFortyToFortyFour1 = 0L, femaleFortyToFortyFour4 = 0L, femaleFortyToFortyFour5 = 0L, femaleFortyToFortyFour6 = 0L, femaleFortyToFortyFour7 = 0L, femaleFortyToFortyFour8 = 0L, femaleFortyToFortyFour9 = 0L, femaleFortyToFortyFour10 = 0L;
    private Long maleFortyFiveToFortyNine1 = 0L, maleFortyFiveToFortyNine4 = 0L, maleFortyFiveToFortyNine5 = 0L, maleFortyFiveToFortyNine6 = 0L, maleFortyFiveToFortyNine7 = 0L, maleFortyFiveToFortyNine8 = 0L, maleFortyFiveToFortyNine9 = 0L, maleFortyFiveToFortyNine10 = 0L;
    private Long femaleFortyFiveToFortyNine1 = 0L, femaleFortyFiveToFortyNine4 = 0L, femaleFortyFiveToFortyNine5 = 0L, femaleFortyFiveToFortyNine6 = 0L, femaleFortyFiveToFortyNine7 = 0L, femaleFortyFiveToFortyNine8 = 0L, femaleFortyFiveToFortyNine9 = 0L, femaleFortyFiveToFortyNine10 = 0L;
    private Long maleFiftyPlus1 = 0L, maleFiftyPlus4 = 0L, maleFiftyPlus5 = 0L, maleFiftyPlus6 = 0L, maleFiftyPlus7 = 0L, maleFiftyPlus8 = 0L, maleFiftyPlus9, maleFiftyPlus10;
    private Long femaleFiftyPlus1 = 0L, femaleFiftyPlus4 = 0L, femaleFiftyPlus5 = 0L, femaleFiftyPlus6 = 0L, femaleFiftyPlus7 = 0L, femaleFiftyPlus8 = 0L, femaleFiftyPlus9, femaleFiftyPlus10;
    private Long testedOutreach = 0L;
    private Long positiveTestedOutreach = 0L;
    private Long testedPNC = 0L;
    private Long testedANC;
    private Long positiveTestedANC;
    private Long positiveTestedPNC = 0L;
    private Long testedFHS = 0L;
    private Long positiveTestedFHS = 0L;
    private Long femaleFifteenLess2, femaleFifteenLess3;
    private Long maleFifteenLess2, maleFifteenLess3;
    private Long femaleFifteenPlus2, femaleFifteenPlus3;
    private Long maleFifteenPlus2, maleFifteenPlus3;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Transient
    private String start;
    @Transient
    private String end;
    private Long testedInpatient;
    private Long positiveTestedInpatient;
    private Long testedPaediatric;
    private Long positiveTestedPaediatric;
    private Long couplesTested;
    private Long couplesPositiveTested;
    private Long couplesDiscordantTested;
    private Long positiveTestedIndex;
    private Long positiveTestedSTI;
    private Long testedVIAC;
    private Long testedIndex;
    private Long testedSTI;
    private Long testedTBUnit;
    private Long positiveTestedTBUnit;
    private Long testedVMMC;
    private Long positiveTestedVMMC;
    private Long positiveTestedVIAC;
    
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

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Long getTestedOPD() {
        return testedOPD;
    }

    public void setTestedOPD(Long testedOPD) {
        this.testedOPD = testedOPD;
    }

    public Long getPositiveTestedOPD() {
        return positiveTestedOPD;
    }

    public void setPositiveTestedOPD(Long positiveTestedOPD) {
        this.positiveTestedOPD = positiveTestedOPD;
    }

    public Long getMaleLessThanOne1() {
        return maleLessThanOne1;
    }
    
    public Long getMaleLessThanOne4() {
        return maleLessThanOne4;
    }

    public void setMaleLessThanOne4(Long maleLessThanOne4) {
        this.maleLessThanOne4 = maleLessThanOne4;
    }

    public Long getMaleLessThanOne5() {
        return maleLessThanOne5;
    }

    public void setMaleLessThanOne5(Long maleLessThanOne5) {
        this.maleLessThanOne5 = maleLessThanOne5;
    }

    public Long getMaleLessThanOne6() {
        return maleLessThanOne6;
    }

    public void setMaleLessThanOne6(Long maleLessThanOne6) {
        this.maleLessThanOne6 = maleLessThanOne6;
    }

    public Long getMaleLessThanOne7() {
        return maleLessThanOne7;
    }

    public void setMaleLessThanOne7(Long maleLessThanOne7) {
        this.maleLessThanOne7 = maleLessThanOne7;
    }

    public Long getMaleLessThanOne8() {
        return maleLessThanOne8;
    }

    public void setMaleLessThanOne8(Long maleLessThanOne8) {
        this.maleLessThanOne8 = maleLessThanOne8;
    }

    public Long getFemaleLessThanOne1() {
        return femaleLessThanOne1;
    }

    public Long getFemaleLessThanOne4() {
        return femaleLessThanOne4;
    }

    public void setFemaleLessThanOne4(Long femaleLessThanOne4) {
        this.femaleLessThanOne4 = femaleLessThanOne4;
    }

    public Long getFemaleLessThanOne5() {
        return femaleLessThanOne5;
    }

    public void setFemaleLessThanOne5(Long femaleLessThanOne5) {
        this.femaleLessThanOne5 = femaleLessThanOne5;
    }

    public Long getFemaleLessThanOne6() {
        return femaleLessThanOne6;
    }

    public void setFemaleLessThanOne6(Long femaleLessThanOne6) {
        this.femaleLessThanOne6 = femaleLessThanOne6;
    }

    public Long getFemaleLessThanOne7() {
        return femaleLessThanOne7;
    }

    public void setFemaleLessThanOne7(Long femaleLessThanOne7) {
        this.femaleLessThanOne7 = femaleLessThanOne7;
    }

    public Long getFemaleLessThanOne8() {
        return femaleLessThanOne8;
    }

    public void setFemaleLessThanOne8(Long femaleLessThanOne8) {
        this.femaleLessThanOne8 = femaleLessThanOne8;
    }

    public Long getMaleOneToFour1() {
        return maleOneToFour1;
    }

    public void setMaleOneToFour1(Long maleOneToFour1) {
        this.maleOneToFour1 = maleOneToFour1;
    }
    
    public Long getMaleOneToFour4() {
        return maleOneToFour4;
    }

    public void setMaleOneToFour4(Long maleOneToFour4) {
        this.maleOneToFour4 = maleOneToFour4;
    }

    public Long getMaleOneToFour5() {
        return maleOneToFour5;
    }

    public void setMaleOneToFour5(Long maleOneToFour5) {
        this.maleOneToFour5 = maleOneToFour5;
    }

    public Long getMaleOneToFour6() {
        return maleOneToFour6;
    }

    public void setMaleOneToFour6(Long maleOneToFour6) {
        this.maleOneToFour6 = maleOneToFour6;
    }

    public Long getMaleOneToFour7() {
        return maleOneToFour7;
    }

    public void setMaleOneToFour7(Long maleOneToFour7) {
        this.maleOneToFour7 = maleOneToFour7;
    }

    public Long getMaleOneToFour8() {
        return maleOneToFour8;
    }

    public void setMaleOneToFour8(Long maleOneToFour8) {
        this.maleOneToFour8 = maleOneToFour8;
    }

    public Long getFemaleOneToFour1() {
        return femaleOneToFour1;
    }

    public void setFemaleOneToFour1(Long femaleOneToFour1) {
        this.femaleOneToFour1 = femaleOneToFour1;
    }

    public Long getFemaleOneToFour4() {
        return femaleOneToFour4;
    }

    public void setFemaleOneToFour4(Long femaleOneToFour4) {
        this.femaleOneToFour4 = femaleOneToFour4;
    }

    public Long getFemaleOneToFour5() {
        return femaleOneToFour5;
    }

    public void setFemaleOneToFour5(Long femaleOneToFour5) {
        this.femaleOneToFour5 = femaleOneToFour5;
    }

    public Long getFemaleOneToFour6() {
        return femaleOneToFour6;
    }

    public void setFemaleOneToFour6(Long femaleOneToFour6) {
        this.femaleOneToFour6 = femaleOneToFour6;
    }

    public Long getFemaleOneToFour7() {
        return femaleOneToFour7;
    }

    public void setFemaleOneToFour7(Long femaleOneToFour7) {
        this.femaleOneToFour7 = femaleOneToFour7;
    }

    public Long getFemaleOneToFour8() {
        return femaleOneToFour8;
    }

    public void setFemaleOneToFour8(Long femaleOneToFour8) {
        this.femaleOneToFour8 = femaleOneToFour8;
    }

    public Long getMaleFiveToNine1() {
        return maleFiveToNine1;
    }

    public void setMaleFiveToNine1(Long maleFiveToNine1) {
        this.maleFiveToNine1 = maleFiveToNine1;
    }

    public Long getMaleFiveToNine4() {
        return maleFiveToNine4;
    }

    public void setMaleFiveToNine4(Long maleFiveToNine4) {
        this.maleFiveToNine4 = maleFiveToNine4;
    }

    public Long getMaleFiveToNine5() {
        return maleFiveToNine5;
    }

    public void setMaleFiveToNine5(Long maleFiveToNine5) {
        this.maleFiveToNine5 = maleFiveToNine5;
    }

    public Long getMaleFiveToNine6() {
        return maleFiveToNine6;
    }

    public void setMaleFiveToNine6(Long maleFiveToNine6) {
        this.maleFiveToNine6 = maleFiveToNine6;
    }

    public Long getMaleFiveToNine7() {
        return maleFiveToNine7;
    }

    public void setMaleFiveToNine7(Long maleFiveToNine7) {
        this.maleFiveToNine7 = maleFiveToNine7;
    }

    public Long getMaleFiveToNine8() {
        return maleFiveToNine8;
    }

    public void setMaleFiveToNine8(Long maleFiveToNine8) {
        this.maleFiveToNine8 = maleFiveToNine8;
    }

    public Long getFemaleFiveToNine1() {
        return femaleFiveToNine1;
    }

    public void setFemaleFiveToNine1(Long femaleFiveToNine1) {
        this.femaleFiveToNine1 = femaleFiveToNine1;
    }

    public Long getFemaleFiveToNine4() {
        return femaleFiveToNine4;
    }

    public void setFemaleFiveToNine4(Long femaleFiveToNine4) {
        this.femaleFiveToNine4 = femaleFiveToNine4;
    }

    public Long getFemaleFiveToNine5() {
        return femaleFiveToNine5;
    }

    public void setFemaleFiveToNine5(Long femaleFiveToNine5) {
        this.femaleFiveToNine5 = femaleFiveToNine5;
    }

    public Long getFemaleFiveToNine6() {
        return femaleFiveToNine6;
    }

    public void setFemaleFiveToNine6(Long femaleFiveToNine6) {
        this.femaleFiveToNine6 = femaleFiveToNine6;
    }

    public Long getFemaleFiveToNine7() {
        return femaleFiveToNine7;
    }

    public void setFemaleFiveToNine7(Long femaleFiveToNine7) {
        this.femaleFiveToNine7 = femaleFiveToNine7;
    }

    public Long getFemaleFiveToNine8() {
        return femaleFiveToNine8;
    }

    public void setFemaleFiveToNine8(Long femaleFiveToNine8) {
        this.femaleFiveToNine8 = femaleFiveToNine8;
    }

    public Long getMaleTenToFourteen1() {
        return maleTenToFourteen1;
    }

    public void setMaleTenToFourteen1(Long maleTenToFourteen1) {
        this.maleTenToFourteen1 = maleTenToFourteen1;
    }

    public Long getMaleTenToFourteen4() {
        return maleTenToFourteen4;
    }

    public void setMaleTenToFourteen4(Long maleTenToFourteen4) {
        this.maleTenToFourteen4 = maleTenToFourteen4;
    }

    public Long getMaleTenToFourteen5() {
        return maleTenToFourteen5;
    }

    public void setMaleTenToFourteen5(Long maleTenToFourteen5) {
        this.maleTenToFourteen5 = maleTenToFourteen5;
    }

    public Long getMaleTenToFourteen6() {
        return maleTenToFourteen6;
    }

    public void setMaleTenToFourteen6(Long maleTenToFourteen6) {
        this.maleTenToFourteen6 = maleTenToFourteen6;
    }

    public Long getMaleTenToFourteen7() {
        return maleTenToFourteen7;
    }

    public void setMaleTenToFourteen7(Long maleTenToFourteen7) {
        this.maleTenToFourteen7 = maleTenToFourteen7;
    }

    public Long getMaleTenToFourteen8() {
        return maleTenToFourteen8;
    }

    public void setMaleTenToFourteen8(Long maleTenToFourteen8) {
        this.maleTenToFourteen8 = maleTenToFourteen8;
    }

    public Long getFemaleTenToFourteen1() {
        return femaleTenToFourteen1;
    }

    public void setFemaleTenToFourteen1(Long femaleTenToFourteen1) {
        this.femaleTenToFourteen1 = femaleTenToFourteen1;
    }

    public Long getFemaleTenToFourteen4() {
        return femaleTenToFourteen4;
    }

    public void setFemaleTenToFourteen4(Long femaleTenToFourteen4) {
        this.femaleTenToFourteen4 = femaleTenToFourteen4;
    }

    public Long getFemaleTenToFourteen5() {
        return femaleTenToFourteen5;
    }

    public void setFemaleTenToFourteen5(Long femaleTenToFourteen5) {
        this.femaleTenToFourteen5 = femaleTenToFourteen5;
    }

    public Long getFemaleTenToFourteen6() {
        return femaleTenToFourteen6;
    }

    public void setFemaleTenToFourteen6(Long femaleTenToFourteen6) {
        this.femaleTenToFourteen6 = femaleTenToFourteen6;
    }

    public Long getFemaleTenToFourteen7() {
        return femaleTenToFourteen7;
    }

    public void setFemaleTenToFourteen7(Long femaleTenToFourteen7) {
        this.femaleTenToFourteen7 = femaleTenToFourteen7;
    }

    public Long getFemaleTenToFourteen8() {
        return femaleTenToFourteen8;
    }

    public void setFemaleTenToFourteen8(Long femaleTenToFourteen8) {
        this.femaleTenToFourteen8 = femaleTenToFourteen8;
    }

    public Long getMaleFifteenToNineteen1() {
        return maleFifteenToNineteen1;
    }

    public void setMaleFifteenToNineteen1(Long maleFifteenToNineteen1) {
        this.maleFifteenToNineteen1 = maleFifteenToNineteen1;
    }

    public Long getMaleFifteenToNineteen4() {
        return maleFifteenToNineteen4;
    }

    public void setMaleFifteenToNineteen4(Long maleFifteenToNineteen4) {
        this.maleFifteenToNineteen4 = maleFifteenToNineteen4;
    }

    public Long getMaleFifteenToNineteen5() {
        return maleFifteenToNineteen5;
    }

    public void setMaleFifteenToNineteen5(Long maleFifteenToNineteen5) {
        this.maleFifteenToNineteen5 = maleFifteenToNineteen5;
    }

    public Long getMaleFifteenToNineteen6() {
        return maleFifteenToNineteen6;
    }

    public void setMaleFifteenToNineteen6(Long maleFifteenToNineteen6) {
        this.maleFifteenToNineteen6 = maleFifteenToNineteen6;
    }

    public Long getMaleFifteenToNineteen7() {
        return maleFifteenToNineteen7;
    }

    public void setMaleFifteenToNineteen7(Long maleFifteenToNineteen7) {
        this.maleFifteenToNineteen7 = maleFifteenToNineteen7;
    }

    public Long getMaleFifteenToNineteen8() {
        return maleFifteenToNineteen8;
    }

    public void setMaleFifteenToNineteen8(Long maleFifteenToNineteen8) {
        this.maleFifteenToNineteen8 = maleFifteenToNineteen8;
    }

    public Long getFemaleFifteenToNineteen1() {
        return femaleFifteenToNineteen1;
    }

    public void setFemaleFifteenToNineteen1(Long femaleFifteenToNineteen1) {
        this.femaleFifteenToNineteen1 = femaleFifteenToNineteen1;
    }

    public Long getFemaleFifteenToNineteen4() {
        return femaleFifteenToNineteen4;
    }

    public void setFemaleFifteenToNineteen4(Long femaleFifteenToNineteen4) {
        this.femaleFifteenToNineteen4 = femaleFifteenToNineteen4;
    }

    public Long getFemaleFifteenToNineteen5() {
        return femaleFifteenToNineteen5;
    }

    public void setFemaleFifteenToNineteen5(Long femaleFifteenToNineteen5) {
        this.femaleFifteenToNineteen5 = femaleFifteenToNineteen5;
    }

    public Long getFemaleFifteenToNineteen6() {
        return femaleFifteenToNineteen6;
    }

    public void setFemaleFifteenToNineteen6(Long femaleFifteenToNineteen6) {
        this.femaleFifteenToNineteen6 = femaleFifteenToNineteen6;
    }

    public Long getFemaleFifteenToNineteen7() {
        return femaleFifteenToNineteen7;
    }

    public void setFemaleFifteenToNineteen7(Long femaleFifteenToNineteen7) {
        this.femaleFifteenToNineteen7 = femaleFifteenToNineteen7;
    }

    public Long getFemaleFifteenToNineteen8() {
        return femaleFifteenToNineteen8;
    }

    public void setFemaleFifteenToNineteen8(Long femaleFifteenToNineteen8) {
        this.femaleFifteenToNineteen8 = femaleFifteenToNineteen8;
    }

    public Long getMaleTwentyToTwentyFour1() {
        return maleTwentyToTwentyFour1;
    }

    public void setMaleTwentyToTwentyFour1(Long maleTwentyToTwentyFour1) {
        this.maleTwentyToTwentyFour1 = maleTwentyToTwentyFour1;
    }

    public Long getMaleTwentyToTwentyFour4() {
        return maleTwentyToTwentyFour4;
    }

    public void setMaleTwentyToTwentyFour4(Long maleTwentyToTwentyFour4) {
        this.maleTwentyToTwentyFour4 = maleTwentyToTwentyFour4;
    }

    public Long getMaleTwentyToTwentyFour5() {
        return maleTwentyToTwentyFour5;
    }

    public void setMaleTwentyToTwentyFour5(Long maleTwentyToTwentyFour5) {
        this.maleTwentyToTwentyFour5 = maleTwentyToTwentyFour5;
    }

    public Long getMaleTwentyToTwentyFour6() {
        return maleTwentyToTwentyFour6;
    }

    public void setMaleTwentyToTwentyFour6(Long maleTwentyToTwentyFour6) {
        this.maleTwentyToTwentyFour6 = maleTwentyToTwentyFour6;
    }

    public Long getMaleTwentyToTwentyFour7() {
        return maleTwentyToTwentyFour7;
    }

    public void setMaleTwentyToTwentyFour7(Long maleTwentyToTwentyFour7) {
        this.maleTwentyToTwentyFour7 = maleTwentyToTwentyFour7;
    }

    public Long getMaleTwentyToTwentyFour8() {
        return maleTwentyToTwentyFour8;
    }

    public void setMaleTwentyToTwentyFour8(Long maleTwentyToTwentyFour8) {
        this.maleTwentyToTwentyFour8 = maleTwentyToTwentyFour8;
    }

    public Long getFemaleTwentyToTwentyFour1() {
        return femaleTwentyToTwentyFour1;
    }

    public void setFemaleTwentyToTwentyFour1(Long femaleTwentyToTwentyFour1) {
        this.femaleTwentyToTwentyFour1 = femaleTwentyToTwentyFour1;
    }

    public Long getFemaleTwentyToTwentyFour4() {
        return femaleTwentyToTwentyFour4;
    }

    public void setFemaleTwentyToTwentyFour4(Long femaleTwentyToTwentyFour4) {
        this.femaleTwentyToTwentyFour4 = femaleTwentyToTwentyFour4;
    }

    public Long getFemaleTwentyToTwentyFour5() {
        return femaleTwentyToTwentyFour5;
    }

    public void setFemaleTwentyToTwentyFour5(Long femaleTwentyToTwentyFour5) {
        this.femaleTwentyToTwentyFour5 = femaleTwentyToTwentyFour5;
    }

    public Long getFemaleTwentyToTwentyFour6() {
        return femaleTwentyToTwentyFour6;
    }

    public void setFemaleTwentyToTwentyFour6(Long femaleTwentyToTwentyFour6) {
        this.femaleTwentyToTwentyFour6 = femaleTwentyToTwentyFour6;
    }

    public Long getFemaleTwentyToTwentyFour7() {
        return femaleTwentyToTwentyFour7;
    }

    public void setFemaleTwentyToTwentyFour7(Long femaleTwentyToTwentyFour7) {
        this.femaleTwentyToTwentyFour7 = femaleTwentyToTwentyFour7;
    }

    public Long getFemaleTwentyToTwentyFour8() {
        return femaleTwentyToTwentyFour8;
    }

    public void setFemaleTwentyToTwentyFour8(Long femaleTwentyToTwentyFour8) {
        this.femaleTwentyToTwentyFour8 = femaleTwentyToTwentyFour8;
    }

    public Long getMaleFiftyPlus1() {
        return maleFiftyPlus1;
    }

    public void setMaleFiftyPlus1(Long maleFiftyPlus1) {
        this.maleFiftyPlus1 = maleFiftyPlus1;
    }

    public Long getMaleFiftyPlus4() {
        return maleFiftyPlus4;
    }

    public void setMaleFiftyPlus4(Long maleFiftyPlus4) {
        this.maleFiftyPlus4 = maleFiftyPlus4;
    }

    public Long getMaleFiftyPlus5() {
        return maleFiftyPlus5;
    }

    public void setMaleFiftyPlus5(Long maleFiftyPlus5) {
        this.maleFiftyPlus5 = maleFiftyPlus5;
    }

    public Long getMaleFiftyPlus6() {
        return maleFiftyPlus6;
    }

    public void setMaleFiftyPlus6(Long maleFiftyPlus6) {
        this.maleFiftyPlus6 = maleFiftyPlus6;
    }

    public Long getMaleFiftyPlus7() {
        return maleFiftyPlus7;
    }

    public void setMaleFiftyPlus7(Long maleFiftyPlus7) {
        this.maleFiftyPlus7 = maleFiftyPlus7;
    }

    public Long getMaleFiftyPlus8() {
        return maleFiftyPlus8;
    }

    public void setMaleFiftyPlus8(Long maleFiftyPlus8) {
        this.maleFiftyPlus8 = maleFiftyPlus8;
    }

    public Long getFemaleFiftyPlus1() {
        return femaleFiftyPlus1;
    }

    public void setFemaleFiftyPlus1(Long femaleFiftyPlus1) {
        this.femaleFiftyPlus1 = femaleFiftyPlus1;
    }
    
    public Long getFemaleFiftyPlus4() {
        return femaleFiftyPlus4;
    }

    public void setFemaleFiftyPlus4(Long femaleFiftyPlus4) {
        this.femaleFiftyPlus4 = femaleFiftyPlus4;
    }

    public Long getFemaleFiftyPlus5() {
        return femaleFiftyPlus5;
    }

    public void setFemaleFiftyPlus5(Long femaleFiftyPlus5) {
        this.femaleFiftyPlus5 = femaleFiftyPlus5;
    }

    public Long getFemaleFiftyPlus6() {
        return femaleFiftyPlus6;
    }

    public void setFemaleFiftyPlus6(Long femaleFiftyPlus6) {
        this.femaleFiftyPlus6 = femaleFiftyPlus6;
    }

    public Long getFemaleFiftyPlus7() {
        return femaleFiftyPlus7;
    }

    public void setFemaleFiftyPlus7(Long femaleFiftyPlus7) {
        this.femaleFiftyPlus7 = femaleFiftyPlus7;
    }

    public Long getFemaleFiftyPlus8() {
        return femaleFiftyPlus8;
    }

    public void setFemaleFiftyPlus8(Long femaleFiftyPlus8) {
        this.femaleFiftyPlus8 = femaleFiftyPlus8;
    }

    public Long getTestedOutreach() {
        return testedOutreach;
    }

    public void setTestedOutreach(Long testedOutreach) {
        this.testedOutreach = testedOutreach;
    }

    public Long getPositiveTestedOutreach() {
        return positiveTestedOutreach;
    }

    public void setPositiveTestedOutreach(Long positiveTestedOutreach) {
        this.positiveTestedOutreach = positiveTestedOutreach;
    }

    public Long getTestedPNC() {
        return testedPNC;
    }

    public void setTestedPNC(Long testedPNC) {
        this.testedPNC = testedPNC;
    }

    public Long getPositiveTestedPNC() {
        return positiveTestedPNC;
    }

    public void setPositiveTestedPNC(Long positiveTestedPNC) {
        this.positiveTestedPNC = positiveTestedPNC;
    }

    public Long getTestedFHS() {
        return testedFHS;
    }

    public void setTestedFHS(Long testedFHS) {
        this.testedFHS = testedFHS;
    }

    public Long getPositiveTestedFHS() {
        return positiveTestedFHS;
    }

    public void setPositiveTestedFHS(Long positiveTestedFHS) {
        this.positiveTestedFHS = positiveTestedFHS;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Long getTestedInpatient() {
        return testedInpatient;
    }

    public void setTestedInpatient(Long testedInpatient) {
        this.testedInpatient = testedInpatient;
    }

    public Long getPositiveTestedInpatient() {
        return positiveTestedInpatient;
    }

    public void setPositiveTestedInpatient(Long positiveTestedInpatient) {
        this.positiveTestedInpatient = positiveTestedInpatient;
    }

    public Long getTestedPaediatric() {
        return testedPaediatric;
    }

    public void setTestedPaediatric(Long testedPaediatric) {
        this.testedPaediatric = testedPaediatric;
    }

    public Long getPositiveTestedPaediatric() {
        return positiveTestedPaediatric;
    }

    public void setPositiveTestedPaediatric(Long positiveTestedPaediatric) {
        this.positiveTestedPaediatric = positiveTestedPaediatric;
    }

    public Long getCouplesTested() {
        return couplesTested;
    }

    public void setCouplesTested(Long couplesTested) {
        this.couplesTested = couplesTested;
    }

    public Long getCouplesPositiveTested() {
        return couplesPositiveTested;
    }

    public void setCouplesPositiveTested(Long couplesPositiveTested) {
        this.couplesPositiveTested = couplesPositiveTested;
    }

    public Long getCouplesDiscordantTested() {
        return couplesDiscordantTested;
    }

    public void setCouplesDiscordantTested(Long couplesDiscordantTested) {
        this.couplesDiscordantTested = couplesDiscordantTested;
    }
    
    public Long getPositiveTestedSTI() {
        return positiveTestedSTI;
    }

    public void setPositiveTestedSTI(Long positiveTestedSTI) {
        this.positiveTestedSTI = positiveTestedSTI;
    }

    public Long getTestedVIAC() {
        return testedVIAC;
    }

    public void setTestedVIAC(Long testedVIAC) {
        this.testedVIAC = testedVIAC;
    }

    public Long getTestedSTI() {
        return testedSTI;
    }

    public void setTestedSTI(Long testedSTI) {
        this.testedSTI = testedSTI;
    }

    public Long getTestedTBUnit() {
        return testedTBUnit;
    }

    public void setTestedTBUnit(Long testedTBUnit) {
        this.testedTBUnit = testedTBUnit;
    }

    public Long getPositiveTestedTBUnit() {
        return positiveTestedTBUnit;
    }

    public void setPositiveTestedTBUnit(Long positiveTestedTBUnit) {
        this.positiveTestedTBUnit = positiveTestedTBUnit;
    }

    public Long getTestedVMMC() {
        return testedVMMC;
    }

    public void setTestedVMMC(Long testedVMMC) {
        this.testedVMMC = testedVMMC;
    }

    public Long getPositiveTestedVMMC() {
        return positiveTestedVMMC;
    }

    public void setPositiveTestedVMMC(Long positiveTestedVMMC) {
        this.positiveTestedVMMC = positiveTestedVMMC;
    }

    public Long getPositiveTestedVIAC() {
        return positiveTestedVIAC;
    }

    public void setPositiveTestedVIAC(Long positiveTestedVIAC) {
        this.positiveTestedVIAC = positiveTestedVIAC;
    }

    public String getDatec() {
        return datec;
    }

    public void setDatec(String datec) {
        this.datec = datec;
    }

    public Long getFemaleFifteenLess2() {
        return femaleFifteenLess2;
    }

    public void setFemaleFifteenLess2(Long femaleFifteenLess2) {
        this.femaleFifteenLess2 = femaleFifteenLess2;
    }

    public Long getFemaleFifteenLess3() {
        return femaleFifteenLess3;
    }

    public void setFemaleFifteenLess3(Long femaleFifteenLess3) {
        this.femaleFifteenLess3 = femaleFifteenLess3;
    }

    public Long getMaleFifteenLess2() {
        return maleFifteenLess2;
    }

    public void setMaleFifteenLess2(Long maleFifteenLess2) {
        this.maleFifteenLess2 = maleFifteenLess2;
    }

    public Long getMaleFifteenLess3() {
        return maleFifteenLess3;
    }

    public void setMaleFifteenLess3(Long maleFifteenLess3) {
        this.maleFifteenLess3 = maleFifteenLess3;
    }

    public Long getFemaleFifteenPlus2() {
        return femaleFifteenPlus2;
    }

    public void setFemaleFifteenPlus2(Long femaleFifteenPlus2) {
        this.femaleFifteenPlus2 = femaleFifteenPlus2;
    }

    public Long getFemaleFifteenPlus3() {
        return femaleFifteenPlus3;
    }

    public void setFemaleFifteenPlus3(Long femaleFifteenPlus3) {
        this.femaleFifteenPlus3 = femaleFifteenPlus3;
    }

    public Long getMaleFifteenPlus2() {
        return maleFifteenPlus2;
    }

    public void setMaleFifteenPlus2(Long maleFifteenPlus2) {
        this.maleFifteenPlus2 = maleFifteenPlus2;
    }

    public Long getMaleFifteenPlus3() {
        return maleFifteenPlus3;
    }

    public void setMaleFifteenPlus3(Long maleFifteenPlus3) {
        this.maleFifteenPlus3 = maleFifteenPlus3;
    }

    public Long getFemaleFifteenToNineteen10() {
        return femaleFifteenToNineteen10;
    }

    public void setFemaleFifteenToNineteen10(Long femaleFifteenToNineteen10) {
        this.femaleFifteenToNineteen10 = femaleFifteenToNineteen10;
    }

    public Long getMaleFifteenToNineteen10() {
        return maleFifteenToNineteen10;
    }

    public void setMaleFifteenToNineteen10(Long maleFifteenToNineteen10) {
        this.maleFifteenToNineteen10 = maleFifteenToNineteen10;
    }

    public Long getFemaleFifteenToNineteen9() {
        return femaleFifteenToNineteen9;
    }

    public void setFemaleFifteenToNineteen9(Long femaleFifteenToNineteen9) {
        this.femaleFifteenToNineteen9 = femaleFifteenToNineteen9;
    }

    public Long getMaleFifteenToNineteen9() {
        return maleFifteenToNineteen9;
    }

    public void setMaleFifteenToNineteen9(Long maleFifteenToNineteen9) {
        this.maleFifteenToNineteen9 = maleFifteenToNineteen9;
    }

    public Long getMaleLessThanOne9() {
        return maleLessThanOne9;
    }

    public void setMaleLessThanOne9(Long maleLessThanOne9) {
        this.maleLessThanOne9 = maleLessThanOne9;
    }

    public Long getMaleLessThanOne10() {
        return maleLessThanOne10;
    }

    public void setMaleLessThanOne10(Long maleLessThanOne10) {
        this.maleLessThanOne10 = maleLessThanOne10;
    }

    public Long getFemaleLessThanOne9() {
        return femaleLessThanOne9;
    }

    public void setFemaleLessThanOne9(Long femaleLessThanOne9) {
        this.femaleLessThanOne9 = femaleLessThanOne9;
    }

    public Long getFemaleLessThanOne10() {
        return femaleLessThanOne10;
    }

    public void setFemaleLessThanOne10(Long femaleLessThanOne10) {
        this.femaleLessThanOne10 = femaleLessThanOne10;
    }

    public Long getMaleOneToFour9() {
        return maleOneToFour9;
    }

    public void setMaleOneToFour9(Long maleOneToFour9) {
        this.maleOneToFour9 = maleOneToFour9;
    }

    public Long getMaleOneToFour10() {
        return maleOneToFour10;
    }

    public void setMaleOneToFour10(Long maleOneToFour10) {
        this.maleOneToFour10 = maleOneToFour10;
    }

    public Long getFemaleOneToFour9() {
        return femaleOneToFour9;
    }

    public void setFemaleOneToFour9(Long femaleOneToFour9) {
        this.femaleOneToFour9 = femaleOneToFour9;
    }

    public Long getFemaleOneToFour10() {
        return femaleOneToFour10;
    }

    public void setFemaleOneToFour10(Long femaleOneToFour10) {
        this.femaleOneToFour10 = femaleOneToFour10;
    }

    public Long getMaleFiveToNine9() {
        return maleFiveToNine9;
    }

    public void setMaleFiveToNine9(Long maleFiveToNine9) {
        this.maleFiveToNine9 = maleFiveToNine9;
    }

    public Long getMaleFiveToNine10() {
        return maleFiveToNine10;
    }

    public void setMaleFiveToNine10(Long maleFiveToNine10) {
        this.maleFiveToNine10 = maleFiveToNine10;
    }

    public Long getFemaleFiveToNine9() {
        return femaleFiveToNine9;
    }

    public void setFemaleFiveToNine9(Long femaleFiveToNine9) {
        this.femaleFiveToNine9 = femaleFiveToNine9;
    }

    public Long getFemaleFiveToNine10() {
        return femaleFiveToNine10;
    }

    public void setFemaleFiveToNine10(Long femaleFiveToNine10) {
        this.femaleFiveToNine10 = femaleFiveToNine10;
    }

    public Long getMaleTenToFourteen9() {
        return maleTenToFourteen9;
    }

    public void setMaleTenToFourteen9(Long maleTenToFourteen9) {
        this.maleTenToFourteen9 = maleTenToFourteen9;
    }

    public Long getMaleTenToFourteen10() {
        return maleTenToFourteen10;
    }

    public void setMaleTenToFourteen10(Long maleTenToFourteen10) {
        this.maleTenToFourteen10 = maleTenToFourteen10;
    }

    public Long getFemaleTenToFourteen9() {
        return femaleTenToFourteen9;
    }

    public void setFemaleTenToFourteen9(Long femaleTenToFourteen9) {
        this.femaleTenToFourteen9 = femaleTenToFourteen9;
    }

    public Long getFemaleTenToFourteen10() {
        return femaleTenToFourteen10;
    }

    public void setFemaleTenToFourteen10(Long femaleTenToFourteen10) {
        this.femaleTenToFourteen10 = femaleTenToFourteen10;
    }

    public Long getMaleTwentyToTwentyFour9() {
        return maleTwentyToTwentyFour9;
    }

    public void setMaleTwentyToTwentyFour9(Long maleTwentyToTwentyFour9) {
        this.maleTwentyToTwentyFour9 = maleTwentyToTwentyFour9;
    }

    public Long getMaleTwentyToTwentyFour10() {
        return maleTwentyToTwentyFour10;
    }

    public void setMaleTwentyToTwentyFour10(Long maleTwentyToTwentyFour10) {
        this.maleTwentyToTwentyFour10 = maleTwentyToTwentyFour10;
    }

    public Long getFemaleTwentyToTwentyFour9() {
        return femaleTwentyToTwentyFour9;
    }

    public void setFemaleTwentyToTwentyFour9(Long femaleTwentyToTwentyFour9) {
        this.femaleTwentyToTwentyFour9 = femaleTwentyToTwentyFour9;
    }

    public Long getFemaleTwentyToTwentyFour10() {
        return femaleTwentyToTwentyFour10;
    }

    public void setFemaleTwentyToTwentyFour10(Long femaleTwentyToTwentyFour10) {
        this.femaleTwentyToTwentyFour10 = femaleTwentyToTwentyFour10;
    }

    public Long getMaleFiftyPlus9() {
        return maleFiftyPlus9;
    }

    public void setMaleFiftyPlus9(Long maleFiftyPlus9) {
        this.maleFiftyPlus9 = maleFiftyPlus9;
    }

    public Long getMaleFiftyPlus10() {
        return maleFiftyPlus10;
    }

    public void setMaleFiftyPlus10(Long maleFiftyPlus10) {
        this.maleFiftyPlus10 = maleFiftyPlus10;
    }

    public Long getFemaleFiftyPlus9() {
        return femaleFiftyPlus9;
    }

    public void setFemaleFiftyPlus9(Long femaleFiftyPlus9) {
        this.femaleFiftyPlus9 = femaleFiftyPlus9;
    }

    public Long getFemaleFiftyPlus10() {
        return femaleFiftyPlus10;
    }

    public void setFemaleFiftyPlus10(Long femaleFiftyPlus10) {
        this.femaleFiftyPlus10 = femaleFiftyPlus10;
    }

    public Long getTestedANC() {
        return testedANC;
    }

    public void setTestedANC(Long testedANC) {
        this.testedANC = testedANC;
    }

    public Long getPositiveTestedANC() {
        return positiveTestedANC;
    }

    public void setPositiveTestedANC(Long positiveTestedANC) {
        this.positiveTestedANC = positiveTestedANC;
    }

    public Long getPositiveTestedIndex() {
        return positiveTestedIndex;
    }

    public void setPositiveTestedIndex(Long positiveTestedIndex) {
        this.positiveTestedIndex = positiveTestedIndex;
    }

    public Long getTestedIndex() {
        return testedIndex;
    }

    public void setTestedIndex(Long testedIndex) {
        this.testedIndex = testedIndex;
    }

    public Long getMaleTwentyFiveToTwentyNine1() {
        return maleTwentyFiveToTwentyNine1;
    }

    public void setMaleTwentyFiveToTwentyNine1(Long maleTwentyFiveToTwentyNine1) {
        this.maleTwentyFiveToTwentyNine1 = maleTwentyFiveToTwentyNine1;
    }

    public Long getMaleTwentyFiveToTwentyNine4() {
        return maleTwentyFiveToTwentyNine4;
    }

    public void setMaleTwentyFiveToTwentyNine4(Long maleTwentyFiveToTwentyNine4) {
        this.maleTwentyFiveToTwentyNine4 = maleTwentyFiveToTwentyNine4;
    }

    public Long getMaleTwentyFiveToTwentyNine5() {
        return maleTwentyFiveToTwentyNine5;
    }

    public void setMaleTwentyFiveToTwentyNine5(Long maleTwentyFiveToTwentyNine5) {
        this.maleTwentyFiveToTwentyNine5 = maleTwentyFiveToTwentyNine5;
    }

    public Long getMaleTwentyFiveToTwentyNine6() {
        return maleTwentyFiveToTwentyNine6;
    }

    public void setMaleTwentyFiveToTwentyNine6(Long maleTwentyFiveToTwentyNine6) {
        this.maleTwentyFiveToTwentyNine6 = maleTwentyFiveToTwentyNine6;
    }

    public Long getMaleTwentyFiveToTwentyNine7() {
        return maleTwentyFiveToTwentyNine7;
    }

    public void setMaleTwentyFiveToTwentyNine7(Long maleTwentyFiveToTwentyNine7) {
        this.maleTwentyFiveToTwentyNine7 = maleTwentyFiveToTwentyNine7;
    }

    public Long getMaleTwentyFiveToTwentyNine8() {
        return maleTwentyFiveToTwentyNine8;
    }

    public void setMaleTwentyFiveToTwentyNine8(Long maleTwentyFiveToTwentyNine8) {
        this.maleTwentyFiveToTwentyNine8 = maleTwentyFiveToTwentyNine8;
    }

    public Long getMaleTwentyFiveToTwentyNine9() {
        return maleTwentyFiveToTwentyNine9;
    }

    public void setMaleTwentyFiveToTwentyNine9(Long maleTwentyFiveToTwentyNine9) {
        this.maleTwentyFiveToTwentyNine9 = maleTwentyFiveToTwentyNine9;
    }

    public Long getMaleTwentyFiveToTwentyNine10() {
        return maleTwentyFiveToTwentyNine10;
    }

    public void setMaleTwentyFiveToTwentyNine10(Long maleTwentyFiveToTwentyNine10) {
        this.maleTwentyFiveToTwentyNine10 = maleTwentyFiveToTwentyNine10;
    }

    public Long getFemaleTwentyFiveToTwentyNine1() {
        return femaleTwentyFiveToTwentyNine1;
    }

    public void setFemaleTwentyFiveToTwentyNine1(Long femaleTwentyFiveToTwentyNine1) {
        this.femaleTwentyFiveToTwentyNine1 = femaleTwentyFiveToTwentyNine1;
    }

    public Long getFemaleTwentyFiveToTwentyNine4() {
        return femaleTwentyFiveToTwentyNine4;
    }

    public void setFemaleTwentyFiveToTwentyNine4(Long femaleTwentyFiveToTwentyNine4) {
        this.femaleTwentyFiveToTwentyNine4 = femaleTwentyFiveToTwentyNine4;
    }

    public Long getFemaleTwentyFiveToTwentyNine5() {
        return femaleTwentyFiveToTwentyNine5;
    }

    public void setFemaleTwentyFiveToTwentyNine5(Long femaleTwentyFiveToTwentyNine5) {
        this.femaleTwentyFiveToTwentyNine5 = femaleTwentyFiveToTwentyNine5;
    }

    public Long getFemaleTwentyFiveToTwentyNine6() {
        return femaleTwentyFiveToTwentyNine6;
    }

    public void setFemaleTwentyFiveToTwentyNine6(Long femaleTwentyFiveToTwentyNine6) {
        this.femaleTwentyFiveToTwentyNine6 = femaleTwentyFiveToTwentyNine6;
    }

    public Long getFemaleTwentyFiveToTwentyNine7() {
        return femaleTwentyFiveToTwentyNine7;
    }

    public void setFemaleTwentyFiveToTwentyNine7(Long femaleTwentyFiveToTwentyNine7) {
        this.femaleTwentyFiveToTwentyNine7 = femaleTwentyFiveToTwentyNine7;
    }

    public Long getFemaleTwentyFiveToTwentyNine8() {
        return femaleTwentyFiveToTwentyNine8;
    }

    public void setFemaleTwentyFiveToTwentyNine8(Long femaleTwentyFiveToTwentyNine8) {
        this.femaleTwentyFiveToTwentyNine8 = femaleTwentyFiveToTwentyNine8;
    }

    public Long getFemaleTwentyFiveToTwentyNine9() {
        return femaleTwentyFiveToTwentyNine9;
    }

    public void setFemaleTwentyFiveToTwentyNine9(Long femaleTwentyFiveToTwentyNine9) {
        this.femaleTwentyFiveToTwentyNine9 = femaleTwentyFiveToTwentyNine9;
    }

    public Long getFemaleTwentyFiveToTwentyNine10() {
        return femaleTwentyFiveToTwentyNine10;
    }

    public void setFemaleTwentyFiveToTwentyNine10(Long femaleTwentyFiveToTwentyNine10) {
        this.femaleTwentyFiveToTwentyNine10 = femaleTwentyFiveToTwentyNine10;
    }

    public Long getMaleThirtyToThirtyFour1() {
        return maleThirtyToThirtyFour1;
    }

    public void setMaleThirtyToThirtyFour1(Long maleThirtyToThirtyFour1) {
        this.maleThirtyToThirtyFour1 = maleThirtyToThirtyFour1;
    }

    public Long getMaleThirtyToThirtyFour4() {
        return maleThirtyToThirtyFour4;
    }

    public void setMaleThirtyToThirtyFour4(Long maleThirtyToThirtyFour4) {
        this.maleThirtyToThirtyFour4 = maleThirtyToThirtyFour4;
    }

    public Long getMaleThirtyToThirtyFour5() {
        return maleThirtyToThirtyFour5;
    }

    public void setMaleThirtyToThirtyFour5(Long maleThirtyToThirtyFour5) {
        this.maleThirtyToThirtyFour5 = maleThirtyToThirtyFour5;
    }

    public Long getMaleThirtyToThirtyFour6() {
        return maleThirtyToThirtyFour6;
    }

    public void setMaleThirtyToThirtyFour6(Long maleThirtyToThirtyFour6) {
        this.maleThirtyToThirtyFour6 = maleThirtyToThirtyFour6;
    }

    public Long getMaleThirtyToThirtyFour7() {
        return maleThirtyToThirtyFour7;
    }

    public void setMaleThirtyToThirtyFour7(Long maleThirtyToThirtyFour7) {
        this.maleThirtyToThirtyFour7 = maleThirtyToThirtyFour7;
    }

    public Long getMaleThirtyToThirtyFour8() {
        return maleThirtyToThirtyFour8;
    }

    public void setMaleThirtyToThirtyFour8(Long maleThirtyToThirtyFour8) {
        this.maleThirtyToThirtyFour8 = maleThirtyToThirtyFour8;
    }

    public Long getMaleThirtyToThirtyFour9() {
        return maleThirtyToThirtyFour9;
    }

    public void setMaleThirtyToThirtyFour9(Long maleThirtyToThirtyFour9) {
        this.maleThirtyToThirtyFour9 = maleThirtyToThirtyFour9;
    }

    public Long getMaleThirtyToThirtyFour10() {
        return maleThirtyToThirtyFour10;
    }

    public void setMaleThirtyToThirtyFour10(Long maleThirtyToThirtyFour10) {
        this.maleThirtyToThirtyFour10 = maleThirtyToThirtyFour10;
    }

    public Long getFemaleThirtyToThirtyFour1() {
        return femaleThirtyToThirtyFour1;
    }

    public void setFemaleThirtyToThirtyFour1(Long femaleThirtyToThirtyFour1) {
        this.femaleThirtyToThirtyFour1 = femaleThirtyToThirtyFour1;
    }

    public Long getFemaleThirtyToThirtyFour4() {
        return femaleThirtyToThirtyFour4;
    }

    public void setFemaleThirtyToThirtyFour4(Long femaleThirtyToThirtyFour4) {
        this.femaleThirtyToThirtyFour4 = femaleThirtyToThirtyFour4;
    }

    public Long getFemaleThirtyToThirtyFour5() {
        return femaleThirtyToThirtyFour5;
    }

    public void setFemaleThirtyToThirtyFour5(Long femaleThirtyToThirtyFour5) {
        this.femaleThirtyToThirtyFour5 = femaleThirtyToThirtyFour5;
    }

    public Long getFemaleThirtyToThirtyFour6() {
        return femaleThirtyToThirtyFour6;
    }

    public void setFemaleThirtyToThirtyFour6(Long femaleThirtyToThirtyFour6) {
        this.femaleThirtyToThirtyFour6 = femaleThirtyToThirtyFour6;
    }

    public Long getFemaleThirtyToThirtyFour7() {
        return femaleThirtyToThirtyFour7;
    }

    public void setFemaleThirtyToThirtyFour7(Long femaleThirtyToThirtyFour7) {
        this.femaleThirtyToThirtyFour7 = femaleThirtyToThirtyFour7;
    }

    public Long getFemaleThirtyToThirtyFour8() {
        return femaleThirtyToThirtyFour8;
    }

    public void setFemaleThirtyToThirtyFour8(Long femaleThirtyToThirtyFour8) {
        this.femaleThirtyToThirtyFour8 = femaleThirtyToThirtyFour8;
    }

    public Long getFemaleThirtyToThirtyFour9() {
        return femaleThirtyToThirtyFour9;
    }

    public void setFemaleThirtyToThirtyFour9(Long femaleThirtyToThirtyFour9) {
        this.femaleThirtyToThirtyFour9 = femaleThirtyToThirtyFour9;
    }

    public Long getFemaleThirtyToThirtyFour10() {
        return femaleThirtyToThirtyFour10;
    }

    public void setFemaleThirtyToThirtyFour10(Long femaleThirtyToThirtyFour10) {
        this.femaleThirtyToThirtyFour10 = femaleThirtyToThirtyFour10;
    }

    public Long getMaleThirtyFiveToThirtyNine1() {
        return maleThirtyFiveToThirtyNine1;
    }

    public void setMaleThirtyFiveToThirtyNine1(Long maleThirtyFiveToThirtyNine1) {
        this.maleThirtyFiveToThirtyNine1 = maleThirtyFiveToThirtyNine1;
    }

    public Long getMaleThirtyFiveToThirtyNine4() {
        return maleThirtyFiveToThirtyNine4;
    }

    public void setMaleThirtyFiveToThirtyNine4(Long maleThirtyFiveToThirtyNine4) {
        this.maleThirtyFiveToThirtyNine4 = maleThirtyFiveToThirtyNine4;
    }

    public Long getMaleThirtyFiveToThirtyNine5() {
        return maleThirtyFiveToThirtyNine5;
    }

    public void setMaleThirtyFiveToThirtyNine5(Long maleThirtyFiveToThirtyNine5) {
        this.maleThirtyFiveToThirtyNine5 = maleThirtyFiveToThirtyNine5;
    }

    public Long getMaleThirtyFiveToThirtyNine6() {
        return maleThirtyFiveToThirtyNine6;
    }

    public void setMaleThirtyFiveToThirtyNine6(Long maleThirtyFiveToThirtyNine6) {
        this.maleThirtyFiveToThirtyNine6 = maleThirtyFiveToThirtyNine6;
    }

    public Long getMaleThirtyFiveToThirtyNine7() {
        return maleThirtyFiveToThirtyNine7;
    }

    public void setMaleThirtyFiveToThirtyNine7(Long maleThirtyFiveToThirtyNine7) {
        this.maleThirtyFiveToThirtyNine7 = maleThirtyFiveToThirtyNine7;
    }

    public Long getMaleThirtyFiveToThirtyNine8() {
        return maleThirtyFiveToThirtyNine8;
    }

    public void setMaleThirtyFiveToThirtyNine8(Long maleThirtyFiveToThirtyNine8) {
        this.maleThirtyFiveToThirtyNine8 = maleThirtyFiveToThirtyNine8;
    }

    public Long getMaleThirtyFiveToThirtyNine9() {
        return maleThirtyFiveToThirtyNine9;
    }

    public void setMaleThirtyFiveToThirtyNine9(Long maleThirtyFiveToThirtyNine9) {
        this.maleThirtyFiveToThirtyNine9 = maleThirtyFiveToThirtyNine9;
    }

    public Long getMaleThirtyFiveToThirtyNine10() {
        return maleThirtyFiveToThirtyNine10;
    }

    public void setMaleThirtyFiveToThirtyNine10(Long maleThirtyFiveToThirtyNine10) {
        this.maleThirtyFiveToThirtyNine10 = maleThirtyFiveToThirtyNine10;
    }

    public Long getFemaleThirtyFiveToThirtyNine1() {
        return femaleThirtyFiveToThirtyNine1;
    }

    public void setFemaleThirtyFiveToThirtyNine1(Long femaleThirtyFiveToThirtyNine1) {
        this.femaleThirtyFiveToThirtyNine1 = femaleThirtyFiveToThirtyNine1;
    }

    public Long getFemaleThirtyFiveToThirtyNine4() {
        return femaleThirtyFiveToThirtyNine4;
    }

    public void setFemaleThirtyFiveToThirtyNine4(Long femaleThirtyFiveToThirtyNine4) {
        this.femaleThirtyFiveToThirtyNine4 = femaleThirtyFiveToThirtyNine4;
    }

    public Long getFemaleThirtyFiveToThirtyNine5() {
        return femaleThirtyFiveToThirtyNine5;
    }

    public void setFemaleThirtyFiveToThirtyNine5(Long femaleThirtyFiveToThirtyNine5) {
        this.femaleThirtyFiveToThirtyNine5 = femaleThirtyFiveToThirtyNine5;
    }

    public Long getFemaleThirtyFiveToThirtyNine6() {
        return femaleThirtyFiveToThirtyNine6;
    }

    public void setFemaleThirtyFiveToThirtyNine6(Long femaleThirtyFiveToThirtyNine6) {
        this.femaleThirtyFiveToThirtyNine6 = femaleThirtyFiveToThirtyNine6;
    }

    public Long getFemaleThirtyFiveToThirtyNine7() {
        return femaleThirtyFiveToThirtyNine7;
    }

    public void setFemaleThirtyFiveToThirtyNine7(Long femaleThirtyFiveToThirtyNine7) {
        this.femaleThirtyFiveToThirtyNine7 = femaleThirtyFiveToThirtyNine7;
    }

    public Long getFemaleThirtyFiveToThirtyNine8() {
        return femaleThirtyFiveToThirtyNine8;
    }

    public void setFemaleThirtyFiveToThirtyNine8(Long femaleThirtyFiveToThirtyNine8) {
        this.femaleThirtyFiveToThirtyNine8 = femaleThirtyFiveToThirtyNine8;
    }

    public Long getFemaleThirtyFiveToThirtyNine9() {
        return femaleThirtyFiveToThirtyNine9;
    }

    public void setFemaleThirtyFiveToThirtyNine9(Long femaleThirtyFiveToThirtyNine9) {
        this.femaleThirtyFiveToThirtyNine9 = femaleThirtyFiveToThirtyNine9;
    }

    public Long getFemaleThirtyFiveToThirtyNine10() {
        return femaleThirtyFiveToThirtyNine10;
    }

    public void setFemaleThirtyFiveToThirtyNine10(Long femaleThirtyFiveToThirtyNine10) {
        this.femaleThirtyFiveToThirtyNine10 = femaleThirtyFiveToThirtyNine10;
    }

    public Long getMaleFortyToFortyFour1() {
        return maleFortyToFortyFour1;
    }

    public void setMaleFortyToFortyFour1(Long maleFortyToFortyFour1) {
        this.maleFortyToFortyFour1 = maleFortyToFortyFour1;
    }

    public Long getMaleFortyToFortyFour4() {
        return maleFortyToFortyFour4;
    }

    public void setMaleFortyToFortyFour4(Long maleFortyToFortyFour4) {
        this.maleFortyToFortyFour4 = maleFortyToFortyFour4;
    }

    public Long getMaleFortyToFortyFour5() {
        return maleFortyToFortyFour5;
    }

    public void setMaleFortyToFortyFour5(Long maleFortyToFortyFour5) {
        this.maleFortyToFortyFour5 = maleFortyToFortyFour5;
    }

    public Long getMaleFortyToFortyFour6() {
        return maleFortyToFortyFour6;
    }

    public void setMaleFortyToFortyFour6(Long maleFortyToFortyFour6) {
        this.maleFortyToFortyFour6 = maleFortyToFortyFour6;
    }

    public Long getMaleFortyToFortyFour7() {
        return maleFortyToFortyFour7;
    }

    public void setMaleFortyToFortyFour7(Long maleFortyToFortyFour7) {
        this.maleFortyToFortyFour7 = maleFortyToFortyFour7;
    }

    public Long getMaleFortyToFortyFour8() {
        return maleFortyToFortyFour8;
    }

    public void setMaleFortyToFortyFour8(Long maleFortyToFortyFour8) {
        this.maleFortyToFortyFour8 = maleFortyToFortyFour8;
    }

    public Long getMaleFortyToFortyFour9() {
        return maleFortyToFortyFour9;
    }

    public void setMaleFortyToFortyFour9(Long maleFortyToFortyFour9) {
        this.maleFortyToFortyFour9 = maleFortyToFortyFour9;
    }

    public Long getMaleFortyToFortyFour10() {
        return maleFortyToFortyFour10;
    }

    public void setMaleFortyToFortyFour10(Long maleFortyToFortyFour10) {
        this.maleFortyToFortyFour10 = maleFortyToFortyFour10;
    }

    public Long getMaleFortyFiveToFortyNine1() {
        return maleFortyFiveToFortyNine1;
    }

    public void setMaleFortyFiveToFortyNine1(Long maleFortyFiveToFortyNine1) {
        this.maleFortyFiveToFortyNine1 = maleFortyFiveToFortyNine1;
    }

    public Long getMaleFortyFiveToFortyNine4() {
        return maleFortyFiveToFortyNine4;
    }

    public void setMaleFortyFiveToFortyNine4(Long maleFortyFiveToFortyNine4) {
        this.maleFortyFiveToFortyNine4 = maleFortyFiveToFortyNine4;
    }

    public Long getMaleFortyFiveToFortyNine5() {
        return maleFortyFiveToFortyNine5;
    }

    public void setMaleFortyFiveToFortyNine5(Long maleFortyFiveToFortyNine5) {
        this.maleFortyFiveToFortyNine5 = maleFortyFiveToFortyNine5;
    }

    public Long getMaleFortyFiveToFortyNine6() {
        return maleFortyFiveToFortyNine6;
    }

    public void setMaleFortyFiveToFortyNine6(Long maleFortyFiveToFortyNine6) {
        this.maleFortyFiveToFortyNine6 = maleFortyFiveToFortyNine6;
    }

    public Long getMaleFortyFiveToFortyNine7() {
        return maleFortyFiveToFortyNine7;
    }

    public void setMaleFortyFiveToFortyNine7(Long maleFortyFiveToFortyNine7) {
        this.maleFortyFiveToFortyNine7 = maleFortyFiveToFortyNine7;
    }

    public Long getMaleFortyFiveToFortyNine8() {
        return maleFortyFiveToFortyNine8;
    }

    public void setMaleFortyFiveToFortyNine8(Long maleFortyFiveToFortyNine8) {
        this.maleFortyFiveToFortyNine8 = maleFortyFiveToFortyNine8;
    }

    public Long getMaleFortyFiveToFortyNine9() {
        return maleFortyFiveToFortyNine9;
    }

    public void setMaleFortyFiveToFortyNine9(Long maleFortyFiveToFortyNine9) {
        this.maleFortyFiveToFortyNine9 = maleFortyFiveToFortyNine9;
    }

    public Long getMaleFortyFiveToFortyNine10() {
        return maleFortyFiveToFortyNine10;
    }

    public void setMaleFortyFiveToFortyNine10(Long maleFortyFiveToFortyNine10) {
        this.maleFortyFiveToFortyNine10 = maleFortyFiveToFortyNine10;
    }

    public Long getFemaleFortyToFortyFour1() {
        return femaleFortyToFortyFour1;
    }

    public void setFemaleFortyToFortyFour1(Long femaleFortyToFortyFour1) {
        this.femaleFortyToFortyFour1 = femaleFortyToFortyFour1;
    }

    public Long getFemaleFortyToFortyFour4() {
        return femaleFortyToFortyFour4;
    }

    public void setFemaleFortyToFortyFour4(Long femaleFortyToFortyFour4) {
        this.femaleFortyToFortyFour4 = femaleFortyToFortyFour4;
    }

    public Long getFemaleFortyToFortyFour5() {
        return femaleFortyToFortyFour5;
    }

    public void setFemaleFortyToFortyFour5(Long femaleFortyToFortyFour5) {
        this.femaleFortyToFortyFour5 = femaleFortyToFortyFour5;
    }

    public Long getFemaleFortyToFortyFour6() {
        return femaleFortyToFortyFour6;
    }

    public void setFemaleFortyToFortyFour6(Long femaleFortyToFortyFour6) {
        this.femaleFortyToFortyFour6 = femaleFortyToFortyFour6;
    }

    public Long getFemaleFortyToFortyFour7() {
        return femaleFortyToFortyFour7;
    }

    public void setFemaleFortyToFortyFour7(Long femaleFortyToFortyFour7) {
        this.femaleFortyToFortyFour7 = femaleFortyToFortyFour7;
    }

    public Long getFemaleFortyToFortyFour8() {
        return femaleFortyToFortyFour8;
    }

    public void setFemaleFortyToFortyFour8(Long femaleFortyToFortyFour8) {
        this.femaleFortyToFortyFour8 = femaleFortyToFortyFour8;
    }

    public Long getFemaleFortyToFortyFour9() {
        return femaleFortyToFortyFour9;
    }

    public void setFemaleFortyToFortyFour9(Long femaleFortyToFortyFour9) {
        this.femaleFortyToFortyFour9 = femaleFortyToFortyFour9;
    }

    public Long getFemaleFortyToFortyFour10() {
        return femaleFortyToFortyFour10;
    }

    public void setFemaleFortyToFortyFour10(Long femaleFortyToFortyFour10) {
        this.femaleFortyToFortyFour10 = femaleFortyToFortyFour10;
    }

    public Long getFemaleFortyFiveToFortyNine1() {
        return femaleFortyFiveToFortyNine1;
    }

    public void setFemaleFortyFiveToFortyNine1(Long femaleFortyFiveToFortyNine1) {
        this.femaleFortyFiveToFortyNine1 = femaleFortyFiveToFortyNine1;
    }

    public Long getFemaleFortyFiveToFortyNine4() {
        return femaleFortyFiveToFortyNine4;
    }

    public void setFemaleFortyFiveToFortyNine4(Long femaleFortyFiveToFortyNine4) {
        this.femaleFortyFiveToFortyNine4 = femaleFortyFiveToFortyNine4;
    }

    public Long getFemaleFortyFiveToFortyNine5() {
        return femaleFortyFiveToFortyNine5;
    }

    public void setFemaleFortyFiveToFortyNine5(Long femaleFortyFiveToFortyNine5) {
        this.femaleFortyFiveToFortyNine5 = femaleFortyFiveToFortyNine5;
    }

    public Long getFemaleFortyFiveToFortyNine6() {
        return femaleFortyFiveToFortyNine6;
    }

    public void setFemaleFortyFiveToFortyNine6(Long femaleFortyFiveToFortyNine6) {
        this.femaleFortyFiveToFortyNine6 = femaleFortyFiveToFortyNine6;
    }

    public Long getFemaleFortyFiveToFortyNine7() {
        return femaleFortyFiveToFortyNine7;
    }

    public void setFemaleFortyFiveToFortyNine7(Long femaleFortyFiveToFortyNine7) {
        this.femaleFortyFiveToFortyNine7 = femaleFortyFiveToFortyNine7;
    }

    public Long getFemaleFortyFiveToFortyNine8() {
        return femaleFortyFiveToFortyNine8;
    }

    public void setFemaleFortyFiveToFortyNine8(Long femaleFortyFiveToFortyNine8) {
        this.femaleFortyFiveToFortyNine8 = femaleFortyFiveToFortyNine8;
    }

    public Long getFemaleFortyFiveToFortyNine9() {
        return femaleFortyFiveToFortyNine9;
    }

    public void setFemaleFortyFiveToFortyNine9(Long femaleFortyFiveToFortyNine9) {
        this.femaleFortyFiveToFortyNine9 = femaleFortyFiveToFortyNine9;
    }

    public Long getFemaleFortyFiveToFortyNine10() {
        return femaleFortyFiveToFortyNine10;
    }

    public void setFemaleFortyFiveToFortyNine10(Long femaleFortyFiveToFortyNine10) {
        this.femaleFortyFiveToFortyNine10 = femaleFortyFiveToFortyNine10;
    }
    
    
}