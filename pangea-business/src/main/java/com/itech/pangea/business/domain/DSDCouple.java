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
public class DSDCouple extends BaseEntity {

    @Transient
    private String datec;
    private String name;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateCompleted;
    private Long testedFHS=0L;
    private Long positiveTestedFHS=0L;
    private Long testedOPD=0L;
    private Long positiveTestedOPD=0L;
    private Long testedOutreach=0L;
    private Long positiveTestedOutreach=0L;
    private Long testedMaternity=0L;
    private Long positiveTestedMaternity=0L;
    private Long testedANC=0L;
    private Long positiveTestedANC=0L;
    private Long maleLessThanOne1=0L, maleLessThanOne2=0L, maleLessThanOne3=0L;
    private Long femaleLessThanOne1=0L, femaleLessThanOne2=0L, femaleLessThanOne3=0L;
    private Long maleOneToFour1=0L, maleOneToFour2=0L, maleOneToFour3=0L;
    private Long femaleOneToFour1=0L, femaleOneToFour2=0L, femaleOneToFour3=0L;
    private Long maleFiveToNine1=0L, maleFiveToNine2=0L, maleFiveToNine3=0L;
    private Long femaleFiveToNine1=0L, femaleFiveToNine2=0L, femaleFiveToNine3=0L;
    private Long maleTenToFourteen1=0L, maleTenToFourteen2=0L, maleTenToFourteen3=0L;
    private Long femaleTenToFourteen1=0L, femaleTenToFourteen2=0L, femaleTenToFourteen3=0L;
    private Long maleFifteenToNineteen1=0L, maleFifteenToNineteen2=0L, maleFifteenToNineteen3=0L;
    private Long femaleFifteenToNineteen1=0L, femaleFifteenToNineteen2=0L, femaleFifteenToNineteen3=0L;
    private Long maleTwentyToTwentyFour1=0L, maleTwentyToTwentyFour2=0L, maleTwentyToTwentyFour3=0L;
    private Long femaleTwentyToTwentyFour1=0L, femaleTwentyToTwentyFour2=0L, femaleTwentyToTwentyFour3=0L;
    private Long maleTwentyFiveToFortyNine1=0L, maleTwentyFiveToFortyNine2=0L, maleTwentyFiveToFortyNine3=0L;
    private Long femaleTwentyFiveToFortyNine1=0L, femaleTwentyFiveToFortyNine2=0L, femaleTwentyFiveToFortyNine3=0L;
    private Long maleFiftyPlus1=0L, maleFiftyPlus2=0L, maleFiftyPlus3=0L;
    private Long femaleFiftyPlus1=0L, femaleFiftyPlus2=0L, femaleFiftyPlus3=0L;

    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Period period;

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public void setMaleLessThanOne1(Long maleLessThanOne1) {
        this.maleLessThanOne1 = maleLessThanOne1;
    }

    public void setMaleLessThanOne2(Long maleLessThanOne2) {
        this.maleLessThanOne2 = maleLessThanOne2;
    }

    public void setMaleLessThanOne3(Long maleLessThanOne3) {
        this.maleLessThanOne3 = maleLessThanOne3;
    }

    public void setFemaleLessThanOne1(Long femaleLessThanOne1) {
        this.femaleLessThanOne1 = femaleLessThanOne1;
    }

    public void setFemaleLessThanOne2(Long femaleLessThanOne2) {
        this.femaleLessThanOne2 = femaleLessThanOne2;
    }

    public void setFemaleLessThanOne3(Long femaleLessThanOne3) {
        this.femaleLessThanOne3 = femaleLessThanOne3;
    }

    public void setMaleOneToFour1(Long maleOneToFour1) {
        this.maleOneToFour1 = maleOneToFour1;
    }

    public void setMaleOneToFour2(Long maleOneToFour2) {
        this.maleOneToFour2 = maleOneToFour2;
    }

    public void setMaleOneToFour3(Long maleOneToFour3) {
        this.maleOneToFour3 = maleOneToFour3;
    }

    public void setFemaleOneToFour1(Long femaleOneToFour1) {
        this.femaleOneToFour1 = femaleOneToFour1;
    }

    public void setFemaleOneToFour2(Long femaleOneToFour2) {
        this.femaleOneToFour2 = femaleOneToFour2;
    }

    public void setFemaleOneToFour3(Long femaleOneToFour3) {
        this.femaleOneToFour3 = femaleOneToFour3;
    }

    public void setMaleFiveToNine1(Long maleFiveToNine1) {
        this.maleFiveToNine1 = maleFiveToNine1;
    }

    public void setMaleFiveToNine2(Long maleFiveToNine2) {
        this.maleFiveToNine2 = maleFiveToNine2;
    }

    public void setMaleFiveToNine3(Long maleFiveToNine3) {
        this.maleFiveToNine3 = maleFiveToNine3;
    }

    public void setFemaleFiveToNine1(Long femaleFiveToNine1) {
        this.femaleFiveToNine1 = femaleFiveToNine1;
    }

    public void setFemaleFiveToNine2(Long femaleFiveToNine2) {
        this.femaleFiveToNine2 = femaleFiveToNine2;
    }

    public void setFemaleFiveToNine3(Long femaleFiveToNine3) {
        this.femaleFiveToNine3 = femaleFiveToNine3;
    }

    public void setMaleTenToFourteen1(Long maleTenToFourteen1) {
        this.maleTenToFourteen1 = maleTenToFourteen1;
    }

    public void setMaleTenToFourteen2(Long maleTenToFourteen2) {
        this.maleTenToFourteen2 = maleTenToFourteen2;
    }

    public void setMaleTenToFourteen3(Long maleTenToFourteen3) {
        this.maleTenToFourteen3 = maleTenToFourteen3;
    }

    public void setFemaleTenToFourteen1(Long femaleTenToFourteen1) {
        this.femaleTenToFourteen1 = femaleTenToFourteen1;
    }

    public void setFemaleTenToFourteen2(Long femaleTenToFourteen2) {
        this.femaleTenToFourteen2 = femaleTenToFourteen2;
    }

    public void setFemaleTenToFourteen3(Long femaleTenToFourteen3) {
        this.femaleTenToFourteen3 = femaleTenToFourteen3;
    }

    public void setMaleFifteenToNineteen1(Long maleFifteenToNineteen1) {
        this.maleFifteenToNineteen1 = maleFifteenToNineteen1;
    }

    public void setMaleFifteenToNineteen2(Long maleFifteenToNineteen2) {
        this.maleFifteenToNineteen2 = maleFifteenToNineteen2;
    }

    public void setMaleFifteenToNineteen3(Long maleFifteenToNineteen3) {
        this.maleFifteenToNineteen3 = maleFifteenToNineteen3;
    }

    public void setFemaleFifteenToNineteen1(Long femaleFifteenToNineteen1) {
        this.femaleFifteenToNineteen1 = femaleFifteenToNineteen1;
    }

    public void setFemaleFifteenToNineteen2(Long femaleFifteenToNineteen2) {
        this.femaleFifteenToNineteen2 = femaleFifteenToNineteen2;
    }

    public void setFemaleFifteenToNineteen3(Long femaleFifteenToNineteen3) {
        this.femaleFifteenToNineteen3 = femaleFifteenToNineteen3;
    }

    public void setMaleTwentyToTwentyFour1(Long maleTwentyToTwentyFour1) {
        this.maleTwentyToTwentyFour1 = maleTwentyToTwentyFour1;
    }

    public void setMaleTwentyToTwentyFour2(Long maleTwentyToTwentyFour2) {
        this.maleTwentyToTwentyFour2 = maleTwentyToTwentyFour2;
    }

    public void setMaleTwentyToTwentyFour3(Long maleTwentyToTwentyFour3) {
        this.maleTwentyToTwentyFour3 = maleTwentyToTwentyFour3;
    }

    public void setFemaleTwentyToTwentyFour1(Long femaleTwentyToTwentyFour1) {
        this.femaleTwentyToTwentyFour1 = femaleTwentyToTwentyFour1;
    }

    public void setFemaleTwentyToTwentyFour2(Long femaleTwentyToTwentyFour2) {
        this.femaleTwentyToTwentyFour2 = femaleTwentyToTwentyFour2;
    }

    public void setFemaleTwentyToTwentyFour3(Long femaleTwentyToTwentyFour3) {
        this.femaleTwentyToTwentyFour3 = femaleTwentyToTwentyFour3;
    }

    public void setMaleTwentyFiveToFortyNine1(Long maleTwentyFiveToFortyNine1) {
        this.maleTwentyFiveToFortyNine1 = maleTwentyFiveToFortyNine1;
    }

    public void setMaleTwentyFiveToFortyNine2(Long maleTwentyFiveToFortyNine2) {
        this.maleTwentyFiveToFortyNine2 = maleTwentyFiveToFortyNine2;
    }

    public void setMaleTwentyFiveToFortyNine3(Long maleTwentyFiveToFortyNine3) {
        this.maleTwentyFiveToFortyNine3 = maleTwentyFiveToFortyNine3;
    }

    public void setFemaleTwentyFiveToFortyNine1(Long femaleTwentyFiveToFortyNine1) {
        this.femaleTwentyFiveToFortyNine1 = femaleTwentyFiveToFortyNine1;
    }

    public void setFemaleTwentyFiveToFortyNine2(Long femaleTwentyFiveToFortyNine2) {
        this.femaleTwentyFiveToFortyNine2 = femaleTwentyFiveToFortyNine2;
    }

    public void setFemaleTwentyFiveToFortyNine3(Long femaleTwentyFiveToFortyNine3) {
        this.femaleTwentyFiveToFortyNine3 = femaleTwentyFiveToFortyNine3;
    }

    public void setMaleFiftyPlus1(Long maleFiftyPlus1) {
        this.maleFiftyPlus1 = maleFiftyPlus1;
    }

    public void setMaleFiftyPlus2(Long maleFiftyPlus2) {
        this.maleFiftyPlus2 = maleFiftyPlus2;
    }

    public void setMaleFiftyPlus3(Long maleFiftyPlus3) {
        this.maleFiftyPlus3 = maleFiftyPlus3;
    }

    public void setFemaleFiftyPlus1(Long femaleFiftyPlus1) {
        this.femaleFiftyPlus1 = femaleFiftyPlus1;
    }

    public void setFemaleFiftyPlus2(Long femaleFiftyPlus2) {
        this.femaleFiftyPlus2 = femaleFiftyPlus2;
    }

    public void setFemaleFiftyPlus3(Long femaleFiftyPlus3) {
        this.femaleFiftyPlus3 = femaleFiftyPlus3;
    }

    public void setTotalCouplesTested(Long totalCouplesTested) {
        this.totalCouplesTested = totalCouplesTested;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestedFHS(Long testedFHS) {
        this.testedFHS = testedFHS;
    }

    public void setPositiveTestedFHS(Long positiveTestedFHS) {
        this.positiveTestedFHS = positiveTestedFHS;
    }

    public void setTestedOPD(Long testedOPD) {
        this.testedOPD = testedOPD;
    }

    public void setPositiveTestedOPD(Long positiveTestedOPD) {
        this.positiveTestedOPD = positiveTestedOPD;
    }

    public void setTestedOutreach(Long testedOutreach) {
        this.testedOutreach = testedOutreach;
    }

    public void setPositiveTestedOutreach(Long positiveTestedOutreach) {
        this.positiveTestedOutreach = positiveTestedOutreach;
    }

    public void setTestedMaternity(Long testedMaternity) {
        this.testedMaternity = testedMaternity;
    }

    public void setPositiveTestedMaternity(Long positiveTestedMaternity) {
        this.positiveTestedMaternity = positiveTestedMaternity;
    }

    public void setTestedANC(Long testedANC) {
        this.testedANC = testedANC;
    }

    public void setPositiveTestedANC(Long positiveTestedANC) {
        this.positiveTestedANC = positiveTestedANC;
    }
    
    @Transient
    private Long totalCouplesFemaleTested = 0L;
    public Long getTotalCouplesFemaleTested(){
        return totalCouplesFemaleTested + getFemaleLessThanOne1() + getFemaleOneToFour1() + getFemaleFiveToNine1() + getFemaleTenToFourteen1() + getFemaleFifteenToNineteen1() + getFemaleTwentyToTwentyFour1() + getFemaleTwentyFiveToFortyNine1() + getFemaleFiftyPlus1();
    }
    @Transient
    private Long totalCouplesMaleTested = 0L;
    public Long getTotalCouplesMaleTested(){
        return totalCouplesMaleTested + getMaleLessThanOne1() + getMaleOneToFour1() + getMaleFiveToNine1() + getMaleTenToFourteen1() + getMaleFifteenToNineteen1() + getMaleTwentyToTwentyFour1() + getMaleTwentyFiveToFortyNine1() + getMaleFiftyPlus1();
    }
    @Transient
    private Long totalCouplesTested = 0L;
    public Long getTotalCouplesTested(){
        return totalCouplesTested + getTotalCouplesFemaleTested() + getTotalCouplesMaleTested();
    }
    @Transient
    private Long totalCouplesFemalePositive = 0L;
    public Long getTotalCouplesFemalePositive(){
        return totalCouplesFemalePositive + getFemaleLessThanOne2() + getFemaleOneToFour2() + getFemaleFiveToNine2() + getFemaleTenToFourteen2() + getFemaleFifteenToNineteen2() + getFemaleTwentyToTwentyFour2() + getFemaleTwentyFiveToFortyNine2() + getFemaleFiftyPlus2();
    }
    @Transient
    private Long totalCouplesMalePositive = 0L;
    public Long getTotalCouplesMalePositive(){
        return totalCouplesMalePositive + getMaleLessThanOne2() + getMaleOneToFour2() + getMaleFiveToNine2() + getMaleTenToFourteen2() + getMaleFifteenToNineteen2() + getMaleTwentyToTwentyFour2() + getMaleTwentyFiveToFortyNine2() + getMaleFiftyPlus2();
    }
    @Transient
    private Long totalCouplesPositive = 0L;
    public Long getTotalCouplesPositive(){
        return totalCouplesPositive + getTotalCouplesFemalePositive() + getTotalCouplesMalePositive();
    }
    @Transient
    private Long totalDiscordantCouplesFemale = 0L;
    public Long getTotalDiscordantCouplesFemale(){
        return totalDiscordantCouplesFemale + getFemaleLessThanOne3() + getFemaleOneToFour3() + getFemaleFiveToNine3() + getFemaleTenToFourteen3() + getFemaleFifteenToNineteen3() + getFemaleTwentyToTwentyFour3() + getFemaleTwentyFiveToFortyNine3() + getFemaleFiftyPlus3();
    }
    @Transient
    private Long totalDiscordantCouplesMale = 0L;
    public Long getTotalDiscordantCouplesMale(){
        return totalDiscordantCouplesMale + getMaleLessThanOne3() + getMaleOneToFour3() + getMaleFiveToNine3() + getMaleTenToFourteen3() + getMaleFifteenToNineteen3() + getMaleTwentyToTwentyFour3() + getMaleTwentyFiveToFortyNine3() + getMaleFiftyPlus3();
    }
    @Transient
    private Long totalDiscordantCouples = 0L;
    public Long getTotalDiscordantCouples(){
        return totalDiscordantCouples + getTotalDiscordantCouplesFemale() + getTotalDiscordantCouplesMale();
    }
    
    public Period getPeriod() {
        return period;
    }

    public String getName() {
        return name;
    }
    
    public Facility getFacility() {
        return facility;
    }

    public Long getFemaleTwentyToTwentyFour1() {
        return femaleTwentyToTwentyFour1 != null ? femaleTwentyToTwentyFour1 : 0;
    }

    public Long getFemaleTwentyToTwentyFour2() {
        return femaleTwentyToTwentyFour2 != null ? femaleTwentyToTwentyFour2 : 0;
    }

    public Long getFemaleTwentyToTwentyFour3() {
        return femaleTwentyToTwentyFour3 != null ? femaleTwentyToTwentyFour3 : 0;
    }
    
    public Long getMaleTwentyFiveToFortyNine1() {
        return maleTwentyFiveToFortyNine1 != null ? maleTwentyFiveToFortyNine1 : 0;
    }

    public Long getMaleTwentyFiveToFortyNine2() {
        return maleTwentyFiveToFortyNine2 != null ? maleTwentyFiveToFortyNine2 : 0;
    }

    public Long getMaleTwentyFiveToFortyNine3() {
        return maleTwentyFiveToFortyNine3 != null ? maleTwentyFiveToFortyNine3 : 0;
    }
    
    public Long getFemaleTwentyFiveToFortyNine1() {
        return femaleTwentyFiveToFortyNine1 != null ? femaleTwentyFiveToFortyNine1 : 0;
    }

    public Long getFemaleTwentyFiveToFortyNine2() {
        return femaleTwentyFiveToFortyNine2 != null ? femaleTwentyFiveToFortyNine2 : 0;
    }

    public Long getFemaleTwentyFiveToFortyNine3() {
        return femaleTwentyFiveToFortyNine3 != null ? femaleTwentyFiveToFortyNine3 : 0;
    }
    
    public Long getMaleFiftyPlus1() {
        return maleFiftyPlus1 != null ? maleFiftyPlus1 : 0;
    }

    public Long getMaleFiftyPlus2() {
        return maleFiftyPlus2 != null ? maleFiftyPlus2 : 0;
    }

    public Long getMaleFiftyPlus3() {
        return maleFiftyPlus3 != null ? maleFiftyPlus3 : 0;
    }
    
    public Long getFemaleFiftyPlus1() {
        return femaleFiftyPlus1 != null ? femaleFiftyPlus1 : 0;
    }

    public Long getFemaleFiftyPlus2() {
        return femaleFiftyPlus2 != null ? femaleFiftyPlus2 : 0;
    }

    public Long getFemaleFiftyPlus3() {
        return femaleFiftyPlus3 != null ? femaleFiftyPlus3 : 0;
    }
    
    public Long getMaleLessThanOne1() {
        return maleLessThanOne1 != null ? maleLessThanOne1 : 0;
    }

    public Long getMaleLessThanOne2() {
        return maleLessThanOne2 != null ? maleLessThanOne2 : 0;
    }

    public Long getMaleLessThanOne3() {
        return maleLessThanOne3 != null ? maleLessThanOne3 : 0;
    }
    
    public Long getFemaleLessThanOne1() {
        return femaleLessThanOne1 != null ? femaleLessThanOne1 : 0;
    }

    public Long getFemaleLessThanOne2() {
        return femaleLessThanOne2 != null ? femaleLessThanOne2 : 0;
    }

    public Long getFemaleLessThanOne3() {
        return femaleLessThanOne3 != null ? femaleLessThanOne3 : 0;
    }
    
    public Long getMaleOneToFour1() {
        return maleOneToFour1 != null ? maleOneToFour1 : 0;
    }

    public Long getMaleOneToFour2() {
        return maleOneToFour2 != null ? maleOneToFour2 : 0;
    }

    public Long getMaleOneToFour3() {
        return maleOneToFour3 != null ? maleOneToFour3 : 0;
    }
    
    public Long getFemaleOneToFour1() {
        return femaleOneToFour1 != null ? femaleOneToFour1 : 0;
    }

    public Long getFemaleOneToFour2() {
        return femaleOneToFour2 != null ? femaleOneToFour2 : 0;
    }

    public Long getFemaleOneToFour3() {
        return femaleOneToFour3 != null ? femaleOneToFour3 : 0;
    }
    
     public Long getMaleFiveToNine1() {
        return maleFiveToNine1 != null ? maleFiveToNine1 : 0;
    }

    public Long getMaleFiveToNine2() {
        return maleFiveToNine2 != null ? maleFiveToNine2 : 0;
    }

    public Long getMaleFiveToNine3() {
        return maleFiveToNine3 != null ? maleFiveToNine3 : 0;
    }
    
     public Long getFemaleFiveToNine1() {
        return femaleFiveToNine1 != null ? femaleFiveToNine1 : 0;
    }

    public Long getFemaleFiveToNine2() {
        return femaleFiveToNine2 != null ? femaleFiveToNine2 : 0;
    }

    public Long getFemaleFiveToNine3() {
        return femaleFiveToNine3 != null ? femaleFiveToNine3 : 0;
    }
    
    public Long getMaleTenToFourteen1() {
        return maleTenToFourteen1 != null ? maleTenToFourteen1 : 0;
    }

    public Long getMaleTenToFourteen2() {
        return maleTenToFourteen2 != null ? maleTenToFourteen2 : 0;
    }

    public Long getMaleTenToFourteen3() {
        return maleTenToFourteen3 != null ? maleTenToFourteen3 : 0;
    }
    
    public Long getFemaleTenToFourteen1() {
        return femaleTenToFourteen1 != null ? femaleTenToFourteen1 : 0;
    }

    public Long getFemaleTenToFourteen2() {
        return femaleTenToFourteen2 != null ? femaleTenToFourteen2 : 0;
    }

    public Long getFemaleTenToFourteen3() {
        return femaleTenToFourteen3 != null ? femaleTenToFourteen3 : 0;
    }
    
    public Long getMaleFifteenToNineteen1() {
        return maleFifteenToNineteen1 != null ? maleFifteenToNineteen1 : 0;
    }

    public Long getMaleFifteenToNineteen2() {
        return maleFifteenToNineteen2 != null ? maleFifteenToNineteen2 : 0;
    }

    public Long getMaleFifteenToNineteen3() {
        return maleFifteenToNineteen3 != null ? maleFifteenToNineteen3 : 0;
    }
    
    public Long getFemaleFifteenToNineteen1() {
        return femaleFifteenToNineteen1 != null ? femaleFifteenToNineteen1 : 0;
    }

    public Long getFemaleFifteenToNineteen2() {
        return femaleFifteenToNineteen2 != null ? femaleFifteenToNineteen2 : 0;
    }

    public Long getFemaleFifteenToNineteen3() {
        return femaleFifteenToNineteen3 != null ? femaleFifteenToNineteen3 : 0;
    }
    
    public Long getMaleTwentyToTwentyFour1() {
        return maleTwentyToTwentyFour1 != null ? maleTwentyToTwentyFour1 : 0;
    }

    public Long getMaleTwentyToTwentyFour2() {
        return maleTwentyToTwentyFour2 != null ? maleTwentyToTwentyFour2 : 0;
    }

    public Long getMaleTwentyToTwentyFour3() {
        return maleTwentyToTwentyFour3 != null ? maleTwentyToTwentyFour3 : 0;
    }
    
    public Long getTestedOutreach() {
        return testedOutreach != null ? testedOutreach : 0;
    }

    public Long getPositiveTestedOutreach() {
        return positiveTestedOutreach != null ? positiveTestedOutreach : 0;
    }

    public Long getTestedMaternity() {
        return testedMaternity != null ? testedMaternity : 0;
    }

    public Long getPositiveTestedMaternity() {
        return positiveTestedMaternity != null ? positiveTestedMaternity : 0;
    }

    public Long getTestedANC() {
        return testedANC != null ? testedANC : 0;
    }

    public Long getPositiveTestedANC() {
        return positiveTestedANC != null ? positiveTestedANC : 0;
    }

    public Long getTestedFHS() {
        return testedFHS != null ? testedFHS : 0;
    }

    public Long getPositiveTestedFHS() {
        return positiveTestedFHS != null ? positiveTestedFHS : 0;
    }

    public Long getTestedOPD() {
        return testedOPD != null ? testedOPD : 0;
    }

    public Long getPositiveTestedOPD() {
        return positiveTestedOPD != null ? positiveTestedOPD : 0;
    }

    public String getDatec() {
        return datec;
    }

    public void setDatec(String datec) {
        this.datec = datec;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }
    
}
