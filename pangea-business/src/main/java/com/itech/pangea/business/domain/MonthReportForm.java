package com.itech.pangea.business.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by tdhlakama on 2/6/2016.
 */
@Entity
public class MonthReportForm extends BaseEntity {

    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Period period;
    @Transient
    private String datec;
    String name;
    private Long maleLessThanTwoMonths;
    private Long femaleLessThanTwoMonths;
    private Long maleTwoToTwelveMonths;
    private Long femaleTwoToTwelveMonths;
    private Long maleThirteenToTwentyFourMonths;
    private Long femaleThirteenToTwentyFourMonths;
    private Long maleTwentyFiveToFiftyNineMonths;
    private Long femaleTwentyFiveToFiftyNineMonths;
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
    private Long maleThirtyToFortyNine1;
    private Long femaleThirtyToFortyNine1;
    private Long maleFiftyPlus1;
    private Long femaleFiftyPlus1;
    private Long maleLessThanTwoMonths2;
    private Long femaleLessThanTwoMonths2;
    private Long maleTwoToTwelveMonths2;
    private Long femaleTwoToTwelveMonths2;
    private Long maleThirteenToTwentyFourMonths2;
    private Long femaleThirteenToTwentyFourMonths2;
    private Long maleTwentyFiveToFiftyNineMonths2;
    private Long femaleTwentyFiveToFiftyNineMonths2;
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
    private Long maleThirtyToFortyNine2;
    private Long femaleThirtyToFortyNine2;
    private Long maleFiftyPlus2;
    private Long femaleFiftyPlus2;
    private Long maleLessThanFifteen;
    private Long femaleLessThanFifteen;
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
    private Long maleLessThanFifteen1;
    private Long femaleLessThanFifteen1;
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
    
    private Long maleLessThanOne5;
    private Long femaleLessThanOne5;
    private Long maleOneToFour5;
    private Long femaleOneToFour5;
    private Long maleFiveToNine5;
    private Long femaleFiveToNine5;
    private Long maleTenToFourteen5;
    private Long femaleTenToFourteen5;
    private Long maleFifteenToNineteen5;
    private Long femaleFifteenToNineteen5;
    private Long maleTwentyToTwentyFour5;
    private Long femaleTwentyToTwentyFour5;
    private Long maleTwentyFiveToTwentyNine5;
    private Long femaleTwentyFiveToTwentyNine5;
    private Long maleThirtyToThirtyFour5;
    private Long femaleThirtyToThirtyFour5;
    private Long maleThirtyFiveToThirtyNine5;
    private Long femaleThirtyFiveToThirtyNine5;
    private Long maleFortyToFortyFour5;
    private Long femaleFortyToFortyFour5;
    private Long maleFortyFiveToFortyNine5;
    private Long femaleFortyFiveToFortyNine5;
    private Long maleFiftyPlus5;
    private Long femaleFiftyPlus5;
    
    private Long maleLessThanOne6;
    private Long femaleLessThanOne6;
    private Long maleOneToFour6;
    private Long femaleOneToFour6;
    private Long maleFiveToNine6;
    private Long femaleFiveToNine6;
    private Long maleTenToFourteen6;
    private Long femaleTenToFourteen6;
    private Long maleFifteenToNineteen6;
    private Long femaleFifteenToNineteen6;
    private Long maleTwentyToTwentyFour6;
    private Long femaleTwentyToTwentyFour6;
    private Long maleTwentyFiveToTwentyNine6;
    private Long femaleTwentyFiveToTwentyNine6;
    private Long maleThirtyToThirtyFour6;
    private Long femaleThirtyToThirtyFour6;
    private Long maleThirtyFiveToThirtyNine6;
    private Long femaleThirtyFiveToThirtyNine6;
    private Long maleFortyToFortyFour6;
    private Long femaleFortyToFortyFour6;
    private Long maleFortyFiveToFortyNine6;
    private Long femaleFortyFiveToFortyNine6;
    private Long maleFiftyPlus6;
    private Long femaleFiftyPlus6;
    
    private Long maleLessThanOne7;
    private Long femaleLessThanOne7;
    private Long maleOneToFour7;
    private Long femaleOneToFour7;
    private Long maleFiveToNine7;
    private Long femaleFiveToNine7;
    private Long maleTenToFourteen7;
    private Long femaleTenToFourteen7;
    private Long maleFifteenToNineteen7;
    private Long femaleFifteenToNineteen7;
    private Long maleTwentyToTwentyFour7;
    private Long femaleTwentyToTwentyFour7;
    private Long maleTwentyFiveToTwentyNine7;
    private Long femaleTwentyFiveToTwentyNine7;
    private Long maleThirtyToThirtyFour7;
    private Long femaleThirtyToThirtyFour7;
    private Long maleThirtyFiveToThirtyNine7;
    private Long femaleThirtyFiveToThirtyNine7;
    private Long maleFortyToFortyFour7;
    private Long femaleFortyToFortyFour7;
    private Long maleFortyFiveToFortyNine7;
    private Long femaleFortyFiveToFortyNine7;
    private Long maleFiftyPlus7;
    private Long femaleFiftyPlus7;
    
    private Long maleLessThanOne8;
    private Long femaleLessThanOne8;
    private Long maleOneToFour8;
    private Long femaleOneToFour8;
    private Long maleFiveToNine8;
    private Long femaleFiveToNine8;
    private Long maleTenToFourteen8;
    private Long femaleTenToFourteen8;
    private Long maleFifteenToNineteen8;
    private Long femaleFifteenToNineteen8;
    private Long maleTwentyToTwentyFour8;
    private Long femaleTwentyToTwentyFour8;
    private Long maleTwentyFiveToTwentyNine8;
    private Long femaleTwentyFiveToTwentyNine8;
    private Long maleThirtyToThirtyFour8;
    private Long femaleThirtyToThirtyFour8;
    private Long maleThirtyFiveToThirtyNine8;
    private Long femaleThirtyFiveToThirtyNine8;
    private Long maleFortyToFortyFour8;
    private Long femaleFortyToFortyFour8;
    private Long maleFortyFiveToFortyNine8;
    private Long femaleFortyFiveToFortyNine8;
    private Long maleFiftyPlus8;
    private Long femaleFiftyPlus8;
    
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
    private Long testedOPD = 0L;
    private Long positiveTestedOPD = 0L;
    private Long testedInpatient = 0L;
    private Long positiveTestedInpatient = 0L;
    private Long testedPaediatric = 0L;
    private Long positiveTestedPaediatric = 0L;
    private Long testedPMTCT = 0L;
    private Long positiveTestedPMTCT = 0L;
    private Long testedSTI = 0L;
    private Long positiveTestedSTI = 0L;
    private Long testedTB = 0L;
    private Long positiveTestedTB = 0L;
    private Long pmtctEIDP30 = 0L;
    private Long pmtctEIDP31 = 0L;
    private Long pmtctEIDP4 = 0L;
    private Long pmtctEIDP5 = 0L;
    private Long pmtctEIDP14 = 0L;
    private Long pmtctEIDP17 = 0L;
    private Long lessThanTwo;
    private Long threeToTwelve;
    private Long thirteenToTwentyFour;
    private Long lessThanTwo1;
    private Long threeToTwelve1;
    private Long thirteenToTwentyFour1;
    private Long lessThanTwo2;
    private Long threeToTwelve2;
    private Long thirteenToTwentyFour2;
    private Long pmtctSTATP2 = 0L;
    private Long pmtctSTATP5 = 0L;
    private Long pmtctSTATP13 = 0L;
    private Long pmtctSTATP1 = 0L;
    private Long pmtctSTATP12 = 0L;
    private Long pmtctSTATP12DisaggregationP4 = 0L;
    private Long pmtctSTATP12DisaggregationP5 = 0L;
    private Long pmtctSTATP12DisaggregationP14 = 0L;
    private Long pmtctSTATP12DisaggregationP17 = 0L;
    
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
    
    private Long maleTenToFourteen15;
    private Long femaleTenToFourteen15;
    private Long maleFifteenToNineteen15;
    private Long femaleFifteenToNineteen15;
    private Long maleTwentyToTwentyFour15;
    private Long femaleTwentyToTwentyFour15;
    private Long maleTwentyFiveToTwentyNine15;
    private Long femaleTwentyFiveToTwentyNine15;
    private Long maleThirtyToFortyNine15;
    private Long femaleThirtyToFortyNine15;
    private Long maleFiftyPlus15;
    private Long femaleFiftyPlus15;
    
    private Long maleTenToFourteen16;
    private Long femaleTenToFourteen16;
    private Long maleFifteenToNineteen16;
    private Long femaleFifteenToNineteen16;
    private Long maleTwentyToTwentyFour16;
    private Long femaleTwentyToTwentyFour16;
    private Long maleTwentyFiveToTwentyNine16;
    private Long femaleTwentyFiveToTwentyNine16;
    private Long maleThirtyToFortyNine16;
    private Long femaleThirtyToFortyNine16;
    private Long maleFiftyPlus16;
    private Long femaleFiftyPlus16;
    
    private Long maleTenToFourteen17;
    private Long femaleTenToFourteen17;
    private Long maleFifteenToNineteen17;
    private Long femaleFifteenToNineteen17;
    private Long maleTwentyToTwentyFour17;
    private Long femaleTwentyToTwentyFour17;
    private Long maleTwentyFiveToTwentyNine17;
    private Long femaleTwentyFiveToTwentyNine17;
    private Long maleThirtyToFortyNine17;
    private Long femaleThirtyToFortyNine17;
    private Long maleFiftyPlus17;
    private Long femaleFiftyPlus17;
    
    private Long maleTenToFourteen18;
    private Long femaleTenToFourteen18;
    private Long maleFifteenToNineteen18;
    private Long femaleFifteenToNineteen18;
    private Long maleTwentyToTwentyFour18;
    private Long femaleTwentyToTwentyFour18;
    private Long maleTwentyFiveToTwentyNine18;
    private Long femaleTwentyFiveToTwentyNine18;
    private Long maleThirtyToFortyNine18;
    private Long femaleThirtyToFortyNine18;
    private Long maleFiftyPlus18;
    private Long femaleFiftyPlus18;
    
    private Long maleTenToFourteen19;
    private Long femaleTenToFourteen19;
    private Long maleFifteenToNineteen19;
    private Long femaleFifteenToNineteen19;
    private Long maleTwentyToTwentyFour19;
    private Long femaleTwentyToTwentyFour19;
    private Long maleTwentyFiveToTwentyNine19;
    private Long femaleTwentyFiveToTwentyNine19;
    private Long maleThirtyToFortyNine19;
    private Long femaleThirtyToFortyNine19;
    private Long maleFiftyPlus19;
    private Long femaleFiftyPlus19;
    
    private Long maleTenToFourteen20;
    private Long femaleTenToFourteen20;
    private Long maleFifteenToNineteen20;
    private Long femaleFifteenToNineteen20;
    private Long maleTwentyToTwentyFour20;
    private Long femaleTwentyToTwentyFour20;
    private Long maleTwentyFiveToTwentyNine20;
    private Long femaleTwentyFiveToTwentyNine20;
    private Long maleThirtyToFortyNine20;
    private Long femaleThirtyToFortyNine20;
    private Long maleFiftyPlus20;
    private Long femaleFiftyPlus20;
    
    private Long maleTenToFourteen21;
    private Long femaleTenToFourteen21;
    private Long maleFifteenToNineteen21;
    private Long femaleFifteenToNineteen21;
    private Long maleTwentyToTwentyFour21;
    private Long femaleTwentyToTwentyFour21;
    private Long maleTwentyFiveToTwentyNine21;
    private Long femaleTwentyFiveToTwentyNine21;
    private Long maleThirtyToFortyNine21;
    private Long femaleThirtyToFortyNine21;
    private Long maleFiftyPlus21;
    private Long femaleFiftyPlus21;
    
    private Long maleTenToFourteen22;
    private Long femaleTenToFourteen22;
    private Long maleFifteenToNineteen22;
    private Long femaleFifteenToNineteen22;
    private Long maleTwentyToTwentyFour22;
    private Long femaleTwentyToTwentyFour22;
    private Long maleTwentyFiveToTwentyNine22;
    private Long femaleTwentyFiveToTwentyNine22;
    private Long maleThirtyToFortyNine22;
    private Long femaleThirtyToFortyNine22;
    private Long maleFiftyPlus22;
    private Long femaleFiftyPlus22;
    
    private Long maleTenToFourteen23;
    private Long femaleTenToFourteen23;
    private Long maleFifteenToNineteen23;
    private Long femaleFifteenToNineteen23;
    private Long maleTwentyToTwentyFour23;
    private Long femaleTwentyToTwentyFour23;
    private Long maleTwentyFiveToTwentyNine23;
    private Long femaleTwentyFiveToTwentyNine23;
    private Long maleThirtyToFortyNine23;
    private Long femaleThirtyToFortyNine23;
    private Long maleFiftyPlus23;
    private Long femaleFiftyPlus23;
    
    private Long maleTenToFourteen24;
    private Long femaleTenToFourteen24;
    private Long maleFifteenToNineteen24;
    private Long femaleFifteenToNineteen24;
    private Long maleTwentyToTwentyFour24;
    private Long femaleTwentyToTwentyFour24;
    private Long maleTwentyFiveToTwentyNine24;
    private Long femaleTwentyFiveToTwentyNine24;
    private Long maleThirtyToFortyNine24;
    private Long femaleThirtyToFortyNine24;
    private Long maleFiftyPlus24;
    private Long femaleFiftyPlus24;
    
    private Long maleTenToFourteen25;
    private Long femaleTenToFourteen25;
    private Long maleFifteenToNineteen25;
    private Long femaleFifteenToNineteen25;
    private Long maleTwentyToTwentyFour25;
    private Long femaleTwentyToTwentyFour25;
    private Long maleTwentyFiveToTwentyNine25;
    private Long femaleTwentyFiveToTwentyNine25;
    private Long maleThirtyToFortyNine25;
    private Long femaleThirtyToFortyNine25;
    private Long maleFiftyPlus25;
    private Long femaleFiftyPlus25;
    
    private Long testedFHS;
    private Long positiveTestedFHS;
    private Long testedOutreach;
    private Long positiveTestedOutreach;
    private Long testedPNC;
    private Long positiveTestedPNC;
    private Long testedVMMC;
    private Long positiveTestedVMMC;
    private Long testedVIACCentre;
    private Long denominator = 0L;
    private Long numerator = 0L;
    private Long statDenominator;
    private Long positiveTestedVIACCentre;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date dateCompleted;

    public void setStatDenominator(Long statDenominator) {
        this.statDenominator = statDenominator;
    }

    @Formula("statDenominator + pmtctSTATP1 + pmtctSTATP12")
    public Long getStatDenominator() {
        return statDenominator;
    }

    @Formula("numerator + pmtctSTATP2 + pmtctSTATP5 + pmtctSTATP13")
    public Long getNumerator() {
        return numerator;
    }

    public void setNumerator(Long numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(Long denominator) {
        this.denominator = denominator;
    }

    @Formula("denominator + pmtctEIDP4 + pmtctEIDP5 + pmtctEIDP14 + pmtctEID17")
    public Long getDenominator() {
        return denominator;
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

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public String getDatec() {
        return datec;
    }

    public void setDatec(String datec) {
        this.datec = datec;
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

    public Long getMaleFiveToNine2() {
        return maleFiveToNine2;
    }

    public void setMaleFiveToNine2(Long maleFiveToNine2) {
        this.maleFiveToNine2 = maleFiveToNine2;
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

    public Long getFemaleFiveToNine2() {
        return femaleFiveToNine2;
    }

    public void setFemaleFiveToNine2(Long femaleFiveToNine2) {
        this.femaleFiveToNine2 = femaleFiveToNine2;
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

    public Long getMaleTenToFourteen2() {
        return maleTenToFourteen2;
    }

    public void setMaleTenToFourteen2(Long maleTenToFourteen2) {
        this.maleTenToFourteen2 = maleTenToFourteen2;
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

    public Long getFemaleTenToFourteen2() {
        return femaleTenToFourteen2;
    }

    public void setFemaleTenToFourteen2(Long femaleTenToFourteen2) {
        this.femaleTenToFourteen2 = femaleTenToFourteen2;
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

    public Long getMaleFifteenToNineteen2() {
        return maleFifteenToNineteen2;
    }

    public void setMaleFifteenToNineteen2(Long maleFifteenToNineteen2) {
        this.maleFifteenToNineteen2 = maleFifteenToNineteen2;
    }

    public Long getMaleFifteenToNineteen3() {
        return maleFifteenToNineteen3;
    }

    public void setMaleFifteenToNineteen3(Long maleFifteenToNineteen3) {
        this.maleFifteenToNineteen3 = maleFifteenToNineteen3;
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

    public Long getFemaleFifteenToNineteen2() {
        return femaleFifteenToNineteen2;
    }

    public void setFemaleFifteenToNineteen2(Long femaleFifteenToNineteen2) {
        this.femaleFifteenToNineteen2 = femaleFifteenToNineteen2;
    }

    public Long getFemaleFifteenToNineteen3() {
        return femaleFifteenToNineteen3;
    }

    public void setFemaleFifteenToNineteen3(Long femaleFifteenToNineteen3) {
        this.femaleFifteenToNineteen3 = femaleFifteenToNineteen3;
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

    public Long getMaleTwentyToTwentyFour2() {
        return maleTwentyToTwentyFour2;
    }

    public void setMaleTwentyToTwentyFour2(Long maleTwentyToTwentyFour2) {
        this.maleTwentyToTwentyFour2 = maleTwentyToTwentyFour2;
    }

    public Long getMaleTwentyToTwentyFour3() {
        return maleTwentyToTwentyFour3;
    }

    public void setMaleTwentyToTwentyFour3(Long maleTwentyToTwentyFour3) {
        this.maleTwentyToTwentyFour3 = maleTwentyToTwentyFour3;
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

    public Long getFemaleTwentyToTwentyFour2() {
        return femaleTwentyToTwentyFour2;
    }

    public void setFemaleTwentyToTwentyFour2(Long femaleTwentyToTwentyFour2) {
        this.femaleTwentyToTwentyFour2 = femaleTwentyToTwentyFour2;
    }

    public Long getFemaleTwentyToTwentyFour3() {
        return femaleTwentyToTwentyFour3;
    }

    public void setFemaleTwentyToTwentyFour3(Long femaleTwentyToTwentyFour3) {
        this.femaleTwentyToTwentyFour3 = femaleTwentyToTwentyFour3;
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

    public Long getMaleFiftyPlus2() {
        return maleFiftyPlus2;
    }

    public void setMaleFiftyPlus2(Long maleFiftyPlus2) {
        this.maleFiftyPlus2 = maleFiftyPlus2;
    }

    public Long getMaleFiftyPlus3() {
        return maleFiftyPlus3;
    }

    public void setMaleFiftyPlus3(Long maleFiftyPlus3) {
        this.maleFiftyPlus3 = maleFiftyPlus3;
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

    public Long getFemaleFiftyPlus2() {
        return femaleFiftyPlus2;
    }

    public void setFemaleFiftyPlus2(Long femaleFiftyPlus2) {
        this.femaleFiftyPlus2 = femaleFiftyPlus2;
    }

    public Long getFemaleFiftyPlus3() {
        return femaleFiftyPlus3;
    }

    public void setFemaleFiftyPlus3(Long femaleFiftyPlus3) {
        this.femaleFiftyPlus3 = femaleFiftyPlus3;
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

    public Long getTestedPMTCT() {
        return testedPMTCT;
    }

    public void setTestedPMTCT(Long testedPMTCT) {
        this.testedPMTCT = testedPMTCT;
    }

    public Long getPositiveTestedPMTCT() {
        return positiveTestedPMTCT;
    }

    public void setPositiveTestedPMTCT(Long positiveTestedPMTCT) {
        this.positiveTestedPMTCT = positiveTestedPMTCT;
    }

    public Long getTestedSTI() {
        return testedSTI;
    }

    public void setTestedSTI(Long testedSTI) {
        this.testedSTI = testedSTI;
    }

    public Long getPositiveTestedSTI() {
        return positiveTestedSTI;
    }

    public void setPositiveTestedSTI(Long positiveTestedSTI) {
        this.positiveTestedSTI = positiveTestedSTI;
    }

    public Long getTestedTB() {
        return testedTB;
    }

    public void setTestedTB(Long testedTB) {
        this.testedTB = testedTB;
    }

    public Long getPositiveTestedTB() {
        return positiveTestedTB;
    }

    public void setPositiveTestedTB(Long positiveTestedTB) {
        this.positiveTestedTB = positiveTestedTB;
    }

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

    public Long getPmtctSTATP2() {
        return pmtctSTATP2;
    }

    public void setPmtctSTATP2(Long pmtctSTATP2) {
        this.pmtctSTATP2 = pmtctSTATP2;
    }

    public Long getPmtctSTATP5() {
        return pmtctSTATP5;
    }

    public void setPmtctSTATP5(Long pmtctSTATP5) {
        this.pmtctSTATP5 = pmtctSTATP5;
    }

    public Long getPmtctSTATP13() {
        return pmtctSTATP13;
    }

    public void setPmtctSTATP13(Long pmtctSTATP13) {
        this.pmtctSTATP13 = pmtctSTATP13;
    }

    public Long getPmtctSTATP1() {
        return pmtctSTATP1;
    }

    public void setPmtctSTATP1(Long pmtctSTATP1) {
        this.pmtctSTATP1 = pmtctSTATP1;
    }

    public Long getPmtctSTATP12() {
        return pmtctSTATP12;
    }

    public void setPmtctSTATP12(Long pmtctSTATP12) {
        this.pmtctSTATP12 = pmtctSTATP12;
    }

    public Long getPmtctSTATP12DisaggregationP4() {
        return pmtctSTATP12DisaggregationP4;
    }

    public void setPmtctSTATP12DisaggregationP4(Long pmtctSTATP12DisaggregationP4) {
        this.pmtctSTATP12DisaggregationP4 = pmtctSTATP12DisaggregationP4;
    }

    public Long getPmtctSTATP12DisaggregationP5() {
        return pmtctSTATP12DisaggregationP5;
    }

    public void setPmtctSTATP12DisaggregationP5(Long pmtctSTATP12DisaggregationP5) {
        this.pmtctSTATP12DisaggregationP5 = pmtctSTATP12DisaggregationP5;
    }

    public Long getPmtctSTATP12DisaggregationP14() {
        return pmtctSTATP12DisaggregationP14;
    }

    public void setPmtctSTATP12DisaggregationP14(Long pmtctSTATP12DisaggregationP14) {
        this.pmtctSTATP12DisaggregationP14 = pmtctSTATP12DisaggregationP14;
    }

    public Long getPmtctSTATP12DisaggregationP17() {
        return pmtctSTATP12DisaggregationP17;
    }

    public void setPmtctSTATP12DisaggregationP17(Long pmtctSTATP12DisaggregationP17) {
        this.pmtctSTATP12DisaggregationP17 = pmtctSTATP12DisaggregationP17;
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

    public Long getTestedVIACCentre() {
        return testedVIACCentre;
    }

    public void setTestedVIACCentre(Long testedVIACCentre) {
        this.testedVIACCentre = testedVIACCentre;
    }

    public Long getPositiveTestedVIACCentre() {
        return positiveTestedVIACCentre;
    }

    public void setPositiveTestedVIACCentre(Long positiveTestedVIACCentre) {
        this.positiveTestedVIACCentre = positiveTestedVIACCentre;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Long getMaleTwentyFiveToTwentyNine1() {
        return maleTwentyFiveToTwentyNine1;
    }

    public void setMaleTwentyFiveToTwentyNine1(Long maleTwentyFiveToTwentyNine1) {
        this.maleTwentyFiveToTwentyNine1 = maleTwentyFiveToTwentyNine1;
    }

    public Long getMaleTwentyFiveToTwentyNine2() {
        return maleTwentyFiveToTwentyNine2;
    }

    public void setMaleTwentyFiveToTwentyNine2(Long maleTwentyFiveToTwentyNine2) {
        this.maleTwentyFiveToTwentyNine2 = maleTwentyFiveToTwentyNine2;
    }

    public Long getMaleTwentyFiveToTwentyNine3() {
        return maleTwentyFiveToTwentyNine3;
    }

    public void setMaleTwentyFiveToTwentyNine3(Long maleTwentyFiveToTwentyNine3) {
        this.maleTwentyFiveToTwentyNine3 = maleTwentyFiveToTwentyNine3;
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

    public Long getFemaleTwentyFiveToTwentyNine1() {
        return femaleTwentyFiveToTwentyNine1;
    }

    public void setFemaleTwentyFiveToTwentyNine1(Long femaleTwentyFiveToTwentyNine1) {
        this.femaleTwentyFiveToTwentyNine1 = femaleTwentyFiveToTwentyNine1;
    }

    public Long getFemaleTwentyFiveToTwentyNine2() {
        return femaleTwentyFiveToTwentyNine2;
    }

    public void setFemaleTwentyFiveToTwentyNine2(Long femaleTwentyFiveToTwentyNine2) {
        this.femaleTwentyFiveToTwentyNine2 = femaleTwentyFiveToTwentyNine2;
    }

    public Long getFemaleTwentyFiveToTwentyNine3() {
        return femaleTwentyFiveToTwentyNine3;
    }

    public void setFemaleTwentyFiveToTwentyNine3(Long femaleTwentyFiveToTwentyNine3) {
        this.femaleTwentyFiveToTwentyNine3 = femaleTwentyFiveToTwentyNine3;
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

    public Long getMaleLessThanTwoMonths() {
        return maleLessThanTwoMonths;
    }

    public void setMaleLessThanTwoMonths(Long maleLessThanTwoMonths) {
        this.maleLessThanTwoMonths = maleLessThanTwoMonths;
    }

    public Long getFemaleLessThanTwoMonths() {
        return femaleLessThanTwoMonths;
    }

    public void setFemaleLessThanTwoMonths(Long femaleLessThanTwoMonths) {
        this.femaleLessThanTwoMonths = femaleLessThanTwoMonths;
    }

    public Long getMaleTwoToTwelveMonths() {
        return maleTwoToTwelveMonths;
    }

    public void setMaleTwoToTwelveMonths(Long maleTwoToTwelveMonths) {
        this.maleTwoToTwelveMonths = maleTwoToTwelveMonths;
    }

    public Long getFemaleTwoToTwelveMonths() {
        return femaleTwoToTwelveMonths;
    }

    public void setFemaleTwoToTwelveMonths(Long femaleTwoToTwelveMonths) {
        this.femaleTwoToTwelveMonths = femaleTwoToTwelveMonths;
    }

    public Long getMaleThirteenToTwentyFourMonths() {
        return maleThirteenToTwentyFourMonths;
    }

    public void setMaleThirteenToTwentyFourMonths(Long maleThirteenToTwentyFourMonths) {
        this.maleThirteenToTwentyFourMonths = maleThirteenToTwentyFourMonths;
    }

    public Long getFemaleThirteenToTwentyFourMonths() {
        return femaleThirteenToTwentyFourMonths;
    }

    public void setFemaleThirteenToTwentyFourMonths(Long femaleThirteenToTwentyFourMonths) {
        this.femaleThirteenToTwentyFourMonths = femaleThirteenToTwentyFourMonths;
    }

    public Long getMaleTwentyFiveToFiftyNineMonths() {
        return maleTwentyFiveToFiftyNineMonths;
    }

    public void setMaleTwentyFiveToFiftyNineMonths(Long maleTwentyFiveToFiftyNineMonths) {
        this.maleTwentyFiveToFiftyNineMonths = maleTwentyFiveToFiftyNineMonths;
    }

    public Long getFemaleTwentyFiveToFiftyNineMonths() {
        return femaleTwentyFiveToFiftyNineMonths;
    }

    public void setFemaleTwentyFiveToFiftyNineMonths(Long femaleTwentyFiveToFiftyNineMonths) {
        this.femaleTwentyFiveToFiftyNineMonths = femaleTwentyFiveToFiftyNineMonths;
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

    public Long getMaleLessThanTwoMonths2() {
        return maleLessThanTwoMonths2;
    }

    public void setMaleLessThanTwoMonths2(Long maleLessThanTwoMonths2) {
        this.maleLessThanTwoMonths2 = maleLessThanTwoMonths2;
    }

    public Long getFemaleLessThanTwoMonths2() {
        return femaleLessThanTwoMonths2;
    }

    public void setFemaleLessThanTwoMonths2(Long femaleLessThanTwoMonths2) {
        this.femaleLessThanTwoMonths2 = femaleLessThanTwoMonths2;
    }

    public Long getMaleTwoToTwelveMonths2() {
        return maleTwoToTwelveMonths2;
    }

    public void setMaleTwoToTwelveMonths2(Long maleTwoToTwelveMonths2) {
        this.maleTwoToTwelveMonths2 = maleTwoToTwelveMonths2;
    }

    public Long getFemaleTwoToTwelveMonths2() {
        return femaleTwoToTwelveMonths2;
    }

    public void setFemaleTwoToTwelveMonths2(Long femaleTwoToTwelveMonths2) {
        this.femaleTwoToTwelveMonths2 = femaleTwoToTwelveMonths2;
    }

    public Long getMaleThirteenToTwentyFourMonths2() {
        return maleThirteenToTwentyFourMonths2;
    }

    public void setMaleThirteenToTwentyFourMonths2(Long maleThirteenToTwentyFourMonths2) {
        this.maleThirteenToTwentyFourMonths2 = maleThirteenToTwentyFourMonths2;
    }

    public Long getFemaleThirteenToTwentyFourMonths2() {
        return femaleThirteenToTwentyFourMonths2;
    }

    public void setFemaleThirteenToTwentyFourMonths2(Long femaleThirteenToTwentyFourMonths2) {
        this.femaleThirteenToTwentyFourMonths2 = femaleThirteenToTwentyFourMonths2;
    }

    public Long getMaleTwentyFiveToFiftyNineMonths2() {
        return maleTwentyFiveToFiftyNineMonths2;
    }

    public void setMaleTwentyFiveToFiftyNineMonths2(Long maleTwentyFiveToFiftyNineMonths2) {
        this.maleTwentyFiveToFiftyNineMonths2 = maleTwentyFiveToFiftyNineMonths2;
    }

    public Long getFemaleTwentyFiveToFiftyNineMonths2() {
        return femaleTwentyFiveToFiftyNineMonths2;
    }

    public void setFemaleTwentyFiveToFiftyNineMonths2(Long femaleTwentyFiveToFiftyNineMonths2) {
        this.femaleTwentyFiveToFiftyNineMonths2 = femaleTwentyFiveToFiftyNineMonths2;
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

    public Long getMaleLessThanFifteen() {
        return maleLessThanFifteen;
    }

    public void setMaleLessThanFifteen(Long maleLessThanFifteen) {
        this.maleLessThanFifteen = maleLessThanFifteen;
    }

    public Long getFemaleLessThanFifteen() {
        return femaleLessThanFifteen;
    }

    public void setFemaleLessThanFifteen(Long femaleLessThanFifteen) {
        this.femaleLessThanFifteen = femaleLessThanFifteen;
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

    public Long getMaleLessThanFifteen1() {
        return maleLessThanFifteen1;
    }

    public void setMaleLessThanFifteen1(Long maleLessThanFifteen1) {
        this.maleLessThanFifteen1 = maleLessThanFifteen1;
    }

    public Long getFemaleLessThanFifteen1() {
        return femaleLessThanFifteen1;
    }

    public void setFemaleLessThanFifteen1(Long femaleLessThanFifteen1) {
        this.femaleLessThanFifteen1 = femaleLessThanFifteen1;
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

    public Long getFemaleThirtyFiveToThirtyNine5() {
        return femaleThirtyFiveToThirtyNine5;
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

    public Long getMaleTenToFourteen15() {
        return maleTenToFourteen15;
    }

    public void setMaleTenToFourteen15(Long maleTenToFourteen15) {
        this.maleTenToFourteen15 = maleTenToFourteen15;
    }

    public Long getFemaleTenToFourteen15() {
        return femaleTenToFourteen15;
    }

    public void setFemaleTenToFourteen15(Long femaleTenToFourteen15) {
        this.femaleTenToFourteen15 = femaleTenToFourteen15;
    }

    public Long getMaleFifteenToNineteen15() {
        return maleFifteenToNineteen15;
    }

    public void setMaleFifteenToNineteen15(Long maleFifteenToNineteen15) {
        this.maleFifteenToNineteen15 = maleFifteenToNineteen15;
    }

    public Long getFemaleFifteenToNineteen15() {
        return femaleFifteenToNineteen15;
    }

    public void setFemaleFifteenToNineteen15(Long femaleFifteenToNineteen15) {
        this.femaleFifteenToNineteen15 = femaleFifteenToNineteen15;
    }

    public Long getMaleTwentyToTwentyFour15() {
        return maleTwentyToTwentyFour15;
    }

    public void setMaleTwentyToTwentyFour15(Long maleTwentyToTwentyFour15) {
        this.maleTwentyToTwentyFour15 = maleTwentyToTwentyFour15;
    }

    public Long getFemaleTwentyToTwentyFour15() {
        return femaleTwentyToTwentyFour15;
    }

    public void setFemaleTwentyToTwentyFour15(Long femaleTwentyToTwentyFour15) {
        this.femaleTwentyToTwentyFour15 = femaleTwentyToTwentyFour15;
    }

    public Long getMaleTwentyFiveToTwentyNine15() {
        return maleTwentyFiveToTwentyNine15;
    }

    public void setMaleTwentyFiveToTwentyNine15(Long maleTwentyFiveToTwentyNine15) {
        this.maleTwentyFiveToTwentyNine15 = maleTwentyFiveToTwentyNine15;
    }

    public Long getFemaleTwentyFiveToTwentyNine15() {
        return femaleTwentyFiveToTwentyNine15;
    }

    public void setFemaleTwentyFiveToTwentyNine15(Long femaleTwentyFiveToTwentyNine15) {
        this.femaleTwentyFiveToTwentyNine15 = femaleTwentyFiveToTwentyNine15;
    }

    public Long getMaleThirtyToFortyNine15() {
        return maleThirtyToFortyNine15;
    }

    public void setMaleThirtyToFortyNine15(Long maleThirtyToFortyNine15) {
        this.maleThirtyToFortyNine15 = maleThirtyToFortyNine15;
    }

    public Long getFemaleThirtyToFortyNine15() {
        return femaleThirtyToFortyNine15;
    }

    public void setFemaleThirtyToFortyNine15(Long femaleThirtyToFortyNine15) {
        this.femaleThirtyToFortyNine15 = femaleThirtyToFortyNine15;
    }

    public Long getMaleFiftyPlus15() {
        return maleFiftyPlus15;
    }

    public void setMaleFiftyPlus15(Long maleFiftyPlus15) {
        this.maleFiftyPlus15 = maleFiftyPlus15;
    }

    public Long getFemaleFiftyPlus15() {
        return femaleFiftyPlus15;
    }

    public void setFemaleFiftyPlus15(Long femaleFiftyPlus15) {
        this.femaleFiftyPlus15 = femaleFiftyPlus15;
    }

    public Long getMaleTenToFourteen16() {
        return maleTenToFourteen16;
    }

    public void setMaleTenToFourteen16(Long maleTenToFourteen16) {
        this.maleTenToFourteen16 = maleTenToFourteen16;
    }

    public Long getFemaleTenToFourteen16() {
        return femaleTenToFourteen16;
    }

    public void setFemaleTenToFourteen16(Long femaleTenToFourteen16) {
        this.femaleTenToFourteen16 = femaleTenToFourteen16;
    }

    public Long getMaleFifteenToNineteen16() {
        return maleFifteenToNineteen16;
    }

    public void setMaleFifteenToNineteen16(Long maleFifteenToNineteen16) {
        this.maleFifteenToNineteen16 = maleFifteenToNineteen16;
    }

    public Long getFemaleFifteenToNineteen16() {
        return femaleFifteenToNineteen16;
    }

    public void setFemaleFifteenToNineteen16(Long femaleFifteenToNineteen16) {
        this.femaleFifteenToNineteen16 = femaleFifteenToNineteen16;
    }

    public Long getMaleTwentyToTwentyFour16() {
        return maleTwentyToTwentyFour16;
    }

    public void setMaleTwentyToTwentyFour16(Long maleTwentyToTwentyFour16) {
        this.maleTwentyToTwentyFour16 = maleTwentyToTwentyFour16;
    }

    public Long getFemaleTwentyToTwentyFour16() {
        return femaleTwentyToTwentyFour16;
    }

    public void setFemaleTwentyToTwentyFour16(Long femaleTwentyToTwentyFour16) {
        this.femaleTwentyToTwentyFour16 = femaleTwentyToTwentyFour16;
    }

    public Long getMaleTwentyFiveToTwentyNine16() {
        return maleTwentyFiveToTwentyNine16;
    }

    public void setMaleTwentyFiveToTwentyNine16(Long maleTwentyFiveToTwentyNine16) {
        this.maleTwentyFiveToTwentyNine16 = maleTwentyFiveToTwentyNine16;
    }

    public Long getFemaleTwentyFiveToTwentyNine16() {
        return femaleTwentyFiveToTwentyNine16;
    }

    public void setFemaleTwentyFiveToTwentyNine16(Long femaleTwentyFiveToTwentyNine16) {
        this.femaleTwentyFiveToTwentyNine16 = femaleTwentyFiveToTwentyNine16;
    }

    public Long getMaleThirtyToFortyNine16() {
        return maleThirtyToFortyNine16;
    }

    public void setMaleThirtyToFortyNine16(Long maleThirtyToFortyNine16) {
        this.maleThirtyToFortyNine16 = maleThirtyToFortyNine16;
    }

    public Long getFemaleThirtyToFortyNine16() {
        return femaleThirtyToFortyNine16;
    }

    public void setFemaleThirtyToFortyNine16(Long femaleThirtyToFortyNine16) {
        this.femaleThirtyToFortyNine16 = femaleThirtyToFortyNine16;
    }

    public Long getMaleFiftyPlus16() {
        return maleFiftyPlus16;
    }

    public void setMaleFiftyPlus16(Long maleFiftyPlus16) {
        this.maleFiftyPlus16 = maleFiftyPlus16;
    }

    public Long getFemaleFiftyPlus16() {
        return femaleFiftyPlus16;
    }

    public void setFemaleFiftyPlus16(Long femaleFiftyPlus16) {
        this.femaleFiftyPlus16 = femaleFiftyPlus16;
    }

    public Long getMaleTenToFourteen17() {
        return maleTenToFourteen17;
    }

    public void setMaleTenToFourteen17(Long maleTenToFourteen17) {
        this.maleTenToFourteen17 = maleTenToFourteen17;
    }

    public Long getFemaleTenToFourteen17() {
        return femaleTenToFourteen17;
    }

    public void setFemaleTenToFourteen17(Long femaleTenToFourteen17) {
        this.femaleTenToFourteen17 = femaleTenToFourteen17;
    }

    public Long getMaleFifteenToNineteen17() {
        return maleFifteenToNineteen17;
    }

    public void setMaleFifteenToNineteen17(Long maleFifteenToNineteen17) {
        this.maleFifteenToNineteen17 = maleFifteenToNineteen17;
    }

    public Long getFemaleFifteenToNineteen17() {
        return femaleFifteenToNineteen17;
    }

    public void setFemaleFifteenToNineteen17(Long femaleFifteenToNineteen17) {
        this.femaleFifteenToNineteen17 = femaleFifteenToNineteen17;
    }

    public Long getMaleTwentyToTwentyFour17() {
        return maleTwentyToTwentyFour17;
    }

    public void setMaleTwentyToTwentyFour17(Long maleTwentyToTwentyFour17) {
        this.maleTwentyToTwentyFour17 = maleTwentyToTwentyFour17;
    }

    public Long getFemaleTwentyToTwentyFour17() {
        return femaleTwentyToTwentyFour17;
    }

    public void setFemaleTwentyToTwentyFour17(Long femaleTwentyToTwentyFour17) {
        this.femaleTwentyToTwentyFour17 = femaleTwentyToTwentyFour17;
    }

    public Long getMaleTwentyFiveToTwentyNine17() {
        return maleTwentyFiveToTwentyNine17;
    }

    public void setMaleTwentyFiveToTwentyNine17(Long maleTwentyFiveToTwentyNine17) {
        this.maleTwentyFiveToTwentyNine17 = maleTwentyFiveToTwentyNine17;
    }

    public Long getFemaleTwentyFiveToTwentyNine17() {
        return femaleTwentyFiveToTwentyNine17;
    }

    public void setFemaleTwentyFiveToTwentyNine17(Long femaleTwentyFiveToTwentyNine17) {
        this.femaleTwentyFiveToTwentyNine17 = femaleTwentyFiveToTwentyNine17;
    }

    public Long getMaleThirtyToFortyNine17() {
        return maleThirtyToFortyNine17;
    }

    public void setMaleThirtyToFortyNine17(Long maleThirtyToFortyNine17) {
        this.maleThirtyToFortyNine17 = maleThirtyToFortyNine17;
    }

    public Long getFemaleThirtyToFortyNine17() {
        return femaleThirtyToFortyNine17;
    }

    public void setFemaleThirtyToFortyNine17(Long femaleThirtyToFortyNine17) {
        this.femaleThirtyToFortyNine17 = femaleThirtyToFortyNine17;
    }

    public Long getMaleFiftyPlus17() {
        return maleFiftyPlus17;
    }

    public void setMaleFiftyPlus17(Long maleFiftyPlus17) {
        this.maleFiftyPlus17 = maleFiftyPlus17;
    }

    public Long getFemaleFiftyPlus17() {
        return femaleFiftyPlus17;
    }

    public void setFemaleFiftyPlus17(Long femaleFiftyPlus17) {
        this.femaleFiftyPlus17 = femaleFiftyPlus17;
    }

    public Long getMaleTenToFourteen18() {
        return maleTenToFourteen18;
    }

    public void setMaleTenToFourteen18(Long maleTenToFourteen18) {
        this.maleTenToFourteen18 = maleTenToFourteen18;
    }

    public Long getFemaleTenToFourteen18() {
        return femaleTenToFourteen18;
    }

    public void setFemaleTenToFourteen18(Long femaleTenToFourteen18) {
        this.femaleTenToFourteen18 = femaleTenToFourteen18;
    }

    public Long getMaleFifteenToNineteen18() {
        return maleFifteenToNineteen18;
    }

    public void setMaleFifteenToNineteen18(Long maleFifteenToNineteen18) {
        this.maleFifteenToNineteen18 = maleFifteenToNineteen18;
    }

    public Long getFemaleFifteenToNineteen18() {
        return femaleFifteenToNineteen18;
    }

    public void setFemaleFifteenToNineteen18(Long femaleFifteenToNineteen18) {
        this.femaleFifteenToNineteen18 = femaleFifteenToNineteen18;
    }

    public Long getMaleTwentyToTwentyFour18() {
        return maleTwentyToTwentyFour18;
    }

    public void setMaleTwentyToTwentyFour18(Long maleTwentyToTwentyFour18) {
        this.maleTwentyToTwentyFour18 = maleTwentyToTwentyFour18;
    }

    public Long getFemaleTwentyToTwentyFour18() {
        return femaleTwentyToTwentyFour18;
    }

    public void setFemaleTwentyToTwentyFour18(Long femaleTwentyToTwentyFour18) {
        this.femaleTwentyToTwentyFour18 = femaleTwentyToTwentyFour18;
    }

    public Long getMaleTwentyFiveToTwentyNine18() {
        return maleTwentyFiveToTwentyNine18;
    }

    public void setMaleTwentyFiveToTwentyNine18(Long maleTwentyFiveToTwentyNine18) {
        this.maleTwentyFiveToTwentyNine18 = maleTwentyFiveToTwentyNine18;
    }

    public Long getFemaleTwentyFiveToTwentyNine18() {
        return femaleTwentyFiveToTwentyNine18;
    }

    public void setFemaleTwentyFiveToTwentyNine18(Long femaleTwentyFiveToTwentyNine18) {
        this.femaleTwentyFiveToTwentyNine18 = femaleTwentyFiveToTwentyNine18;
    }

    public Long getMaleThirtyToFortyNine18() {
        return maleThirtyToFortyNine18;
    }

    public void setMaleThirtyToFortyNine18(Long maleThirtyToFortyNine18) {
        this.maleThirtyToFortyNine18 = maleThirtyToFortyNine18;
    }

    public Long getFemaleThirtyToFortyNine18() {
        return femaleThirtyToFortyNine18;
    }

    public void setFemaleThirtyToFortyNine18(Long femaleThirtyToFortyNine18) {
        this.femaleThirtyToFortyNine18 = femaleThirtyToFortyNine18;
    }

    public Long getMaleFiftyPlus18() {
        return maleFiftyPlus18;
    }

    public void setMaleFiftyPlus18(Long maleFiftyPlus18) {
        this.maleFiftyPlus18 = maleFiftyPlus18;
    }

    public Long getFemaleFiftyPlus18() {
        return femaleFiftyPlus18;
    }

    public void setFemaleFiftyPlus18(Long femaleFiftyPlus18) {
        this.femaleFiftyPlus18 = femaleFiftyPlus18;
    }

    public Long getMaleTenToFourteen19() {
        return maleTenToFourteen19;
    }

    public void setMaleTenToFourteen19(Long maleTenToFourteen19) {
        this.maleTenToFourteen19 = maleTenToFourteen19;
    }

    public Long getFemaleTenToFourteen19() {
        return femaleTenToFourteen19;
    }

    public void setFemaleTenToFourteen19(Long femaleTenToFourteen19) {
        this.femaleTenToFourteen19 = femaleTenToFourteen19;
    }

    public Long getMaleFifteenToNineteen19() {
        return maleFifteenToNineteen19;
    }

    public void setMaleFifteenToNineteen19(Long maleFifteenToNineteen19) {
        this.maleFifteenToNineteen19 = maleFifteenToNineteen19;
    }

    public Long getFemaleFifteenToNineteen19() {
        return femaleFifteenToNineteen19;
    }

    public void setFemaleFifteenToNineteen19(Long femaleFifteenToNineteen19) {
        this.femaleFifteenToNineteen19 = femaleFifteenToNineteen19;
    }

    public Long getMaleTwentyToTwentyFour19() {
        return maleTwentyToTwentyFour19;
    }

    public void setMaleTwentyToTwentyFour19(Long maleTwentyToTwentyFour19) {
        this.maleTwentyToTwentyFour19 = maleTwentyToTwentyFour19;
    }

    public Long getFemaleTwentyToTwentyFour19() {
        return femaleTwentyToTwentyFour19;
    }

    public void setFemaleTwentyToTwentyFour19(Long femaleTwentyToTwentyFour19) {
        this.femaleTwentyToTwentyFour19 = femaleTwentyToTwentyFour19;
    }

    public Long getMaleTwentyFiveToTwentyNine19() {
        return maleTwentyFiveToTwentyNine19;
    }

    public void setMaleTwentyFiveToTwentyNine19(Long maleTwentyFiveToTwentyNine19) {
        this.maleTwentyFiveToTwentyNine19 = maleTwentyFiveToTwentyNine19;
    }

    public Long getFemaleTwentyFiveToTwentyNine19() {
        return femaleTwentyFiveToTwentyNine19;
    }

    public void setFemaleTwentyFiveToTwentyNine19(Long femaleTwentyFiveToTwentyNine19) {
        this.femaleTwentyFiveToTwentyNine19 = femaleTwentyFiveToTwentyNine19;
    }

    public Long getMaleThirtyToFortyNine19() {
        return maleThirtyToFortyNine19;
    }

    public void setMaleThirtyToFortyNine19(Long maleThirtyToFortyNine19) {
        this.maleThirtyToFortyNine19 = maleThirtyToFortyNine19;
    }

    public Long getFemaleThirtyToFortyNine19() {
        return femaleThirtyToFortyNine19;
    }

    public void setFemaleThirtyToFortyNine19(Long femaleThirtyToFortyNine19) {
        this.femaleThirtyToFortyNine19 = femaleThirtyToFortyNine19;
    }

    public Long getMaleFiftyPlus19() {
        return maleFiftyPlus19;
    }

    public void setMaleFiftyPlus19(Long maleFiftyPlus19) {
        this.maleFiftyPlus19 = maleFiftyPlus19;
    }

    public Long getFemaleFiftyPlus19() {
        return femaleFiftyPlus19;
    }

    public void setFemaleFiftyPlus19(Long femaleFiftyPlus19) {
        this.femaleFiftyPlus19 = femaleFiftyPlus19;
    }

    public Long getMaleTenToFourteen20() {
        return maleTenToFourteen20;
    }

    public void setMaleTenToFourteen20(Long maleTenToFourteen20) {
        this.maleTenToFourteen20 = maleTenToFourteen20;
    }

    public Long getFemaleTenToFourteen20() {
        return femaleTenToFourteen20;
    }

    public void setFemaleTenToFourteen20(Long femaleTenToFourteen20) {
        this.femaleTenToFourteen20 = femaleTenToFourteen20;
    }

    public Long getMaleFifteenToNineteen20() {
        return maleFifteenToNineteen20;
    }

    public void setMaleFifteenToNineteen20(Long maleFifteenToNineteen20) {
        this.maleFifteenToNineteen20 = maleFifteenToNineteen20;
    }

    public Long getFemaleFifteenToNineteen20() {
        return femaleFifteenToNineteen20;
    }

    public void setFemaleFifteenToNineteen20(Long femaleFifteenToNineteen20) {
        this.femaleFifteenToNineteen20 = femaleFifteenToNineteen20;
    }

    public Long getMaleTwentyToTwentyFour20() {
        return maleTwentyToTwentyFour20;
    }

    public void setMaleTwentyToTwentyFour20(Long maleTwentyToTwentyFour20) {
        this.maleTwentyToTwentyFour20 = maleTwentyToTwentyFour20;
    }

    public Long getFemaleTwentyToTwentyFour20() {
        return femaleTwentyToTwentyFour20;
    }

    public void setFemaleTwentyToTwentyFour20(Long femaleTwentyToTwentyFour20) {
        this.femaleTwentyToTwentyFour20 = femaleTwentyToTwentyFour20;
    }

    public Long getMaleTwentyFiveToTwentyNine20() {
        return maleTwentyFiveToTwentyNine20;
    }

    public void setMaleTwentyFiveToTwentyNine20(Long maleTwentyFiveToTwentyNine20) {
        this.maleTwentyFiveToTwentyNine20 = maleTwentyFiveToTwentyNine20;
    }

    public Long getFemaleTwentyFiveToTwentyNine20() {
        return femaleTwentyFiveToTwentyNine20;
    }

    public void setFemaleTwentyFiveToTwentyNine20(Long femaleTwentyFiveToTwentyNine20) {
        this.femaleTwentyFiveToTwentyNine20 = femaleTwentyFiveToTwentyNine20;
    }

    public Long getMaleThirtyToFortyNine20() {
        return maleThirtyToFortyNine20;
    }

    public void setMaleThirtyToFortyNine20(Long maleThirtyToFortyNine20) {
        this.maleThirtyToFortyNine20 = maleThirtyToFortyNine20;
    }

    public Long getFemaleThirtyToFortyNine20() {
        return femaleThirtyToFortyNine20;
    }

    public void setFemaleThirtyToFortyNine20(Long femaleThirtyToFortyNine20) {
        this.femaleThirtyToFortyNine20 = femaleThirtyToFortyNine20;
    }

    public Long getMaleFiftyPlus20() {
        return maleFiftyPlus20;
    }

    public void setMaleFiftyPlus20(Long maleFiftyPlus20) {
        this.maleFiftyPlus20 = maleFiftyPlus20;
    }

    public Long getFemaleFiftyPlus20() {
        return femaleFiftyPlus20;
    }

    public void setFemaleFiftyPlus20(Long femaleFiftyPlus20) {
        this.femaleFiftyPlus20 = femaleFiftyPlus20;
    }

    public Long getMaleTenToFourteen21() {
        return maleTenToFourteen21;
    }

    public void setMaleTenToFourteen21(Long maleTenToFourteen21) {
        this.maleTenToFourteen21 = maleTenToFourteen21;
    }

    public Long getFemaleTenToFourteen21() {
        return femaleTenToFourteen21;
    }

    public void setFemaleTenToFourteen21(Long femaleTenToFourteen21) {
        this.femaleTenToFourteen21 = femaleTenToFourteen21;
    }

    public Long getMaleFifteenToNineteen21() {
        return maleFifteenToNineteen21;
    }

    public void setMaleFifteenToNineteen21(Long maleFifteenToNineteen21) {
        this.maleFifteenToNineteen21 = maleFifteenToNineteen21;
    }

    public Long getFemaleFifteenToNineteen21() {
        return femaleFifteenToNineteen21;
    }

    public void setFemaleFifteenToNineteen21(Long femaleFifteenToNineteen21) {
        this.femaleFifteenToNineteen21 = femaleFifteenToNineteen21;
    }

    public Long getMaleTwentyToTwentyFour21() {
        return maleTwentyToTwentyFour21;
    }

    public void setMaleTwentyToTwentyFour21(Long maleTwentyToTwentyFour21) {
        this.maleTwentyToTwentyFour21 = maleTwentyToTwentyFour21;
    }

    public Long getFemaleTwentyToTwentyFour21() {
        return femaleTwentyToTwentyFour21;
    }

    public void setFemaleTwentyToTwentyFour21(Long femaleTwentyToTwentyFour21) {
        this.femaleTwentyToTwentyFour21 = femaleTwentyToTwentyFour21;
    }

    public Long getMaleTwentyFiveToTwentyNine21() {
        return maleTwentyFiveToTwentyNine21;
    }

    public void setMaleTwentyFiveToTwentyNine21(Long maleTwentyFiveToTwentyNine21) {
        this.maleTwentyFiveToTwentyNine21 = maleTwentyFiveToTwentyNine21;
    }

    public Long getFemaleTwentyFiveToTwentyNine21() {
        return femaleTwentyFiveToTwentyNine21;
    }

    public void setFemaleTwentyFiveToTwentyNine21(Long femaleTwentyFiveToTwentyNine21) {
        this.femaleTwentyFiveToTwentyNine21 = femaleTwentyFiveToTwentyNine21;
    }

    public Long getMaleThirtyToFortyNine21() {
        return maleThirtyToFortyNine21;
    }

    public void setMaleThirtyToFortyNine21(Long maleThirtyToFortyNine21) {
        this.maleThirtyToFortyNine21 = maleThirtyToFortyNine21;
    }

    public Long getFemaleThirtyToFortyNine21() {
        return femaleThirtyToFortyNine21;
    }

    public void setFemaleThirtyToFortyNine21(Long femaleThirtyToFortyNine21) {
        this.femaleThirtyToFortyNine21 = femaleThirtyToFortyNine21;
    }

    public Long getMaleFiftyPlus21() {
        return maleFiftyPlus21;
    }

    public void setMaleFiftyPlus21(Long maleFiftyPlus21) {
        this.maleFiftyPlus21 = maleFiftyPlus21;
    }

    public Long getFemaleFiftyPlus21() {
        return femaleFiftyPlus21;
    }

    public void setFemaleFiftyPlus21(Long femaleFiftyPlus21) {
        this.femaleFiftyPlus21 = femaleFiftyPlus21;
    }

    public Long getMaleTenToFourteen22() {
        return maleTenToFourteen22;
    }

    public void setMaleTenToFourteen22(Long maleTenToFourteen22) {
        this.maleTenToFourteen22 = maleTenToFourteen22;
    }

    public Long getFemaleTenToFourteen22() {
        return femaleTenToFourteen22;
    }

    public void setFemaleTenToFourteen22(Long femaleTenToFourteen22) {
        this.femaleTenToFourteen22 = femaleTenToFourteen22;
    }

    public Long getMaleFifteenToNineteen22() {
        return maleFifteenToNineteen22;
    }

    public void setMaleFifteenToNineteen22(Long maleFifteenToNineteen22) {
        this.maleFifteenToNineteen22 = maleFifteenToNineteen22;
    }

    public Long getFemaleFifteenToNineteen22() {
        return femaleFifteenToNineteen22;
    }

    public void setFemaleFifteenToNineteen22(Long femaleFifteenToNineteen22) {
        this.femaleFifteenToNineteen22 = femaleFifteenToNineteen22;
    }

    public Long getMaleTwentyToTwentyFour22() {
        return maleTwentyToTwentyFour22;
    }

    public void setMaleTwentyToTwentyFour22(Long maleTwentyToTwentyFour22) {
        this.maleTwentyToTwentyFour22 = maleTwentyToTwentyFour22;
    }

    public Long getFemaleTwentyToTwentyFour22() {
        return femaleTwentyToTwentyFour22;
    }

    public void setFemaleTwentyToTwentyFour22(Long femaleTwentyToTwentyFour22) {
        this.femaleTwentyToTwentyFour22 = femaleTwentyToTwentyFour22;
    }

    public Long getMaleTwentyFiveToTwentyNine22() {
        return maleTwentyFiveToTwentyNine22;
    }

    public void setMaleTwentyFiveToTwentyNine22(Long maleTwentyFiveToTwentyNine22) {
        this.maleTwentyFiveToTwentyNine22 = maleTwentyFiveToTwentyNine22;
    }

    public Long getFemaleTwentyFiveToTwentyNine22() {
        return femaleTwentyFiveToTwentyNine22;
    }

    public void setFemaleTwentyFiveToTwentyNine22(Long femaleTwentyFiveToTwentyNine22) {
        this.femaleTwentyFiveToTwentyNine22 = femaleTwentyFiveToTwentyNine22;
    }

    public Long getMaleThirtyToFortyNine22() {
        return maleThirtyToFortyNine22;
    }

    public void setMaleThirtyToFortyNine22(Long maleThirtyToFortyNine22) {
        this.maleThirtyToFortyNine22 = maleThirtyToFortyNine22;
    }

    public Long getFemaleThirtyToFortyNine22() {
        return femaleThirtyToFortyNine22;
    }

    public void setFemaleThirtyToFortyNine22(Long femaleThirtyToFortyNine22) {
        this.femaleThirtyToFortyNine22 = femaleThirtyToFortyNine22;
    }

    public Long getMaleFiftyPlus22() {
        return maleFiftyPlus22;
    }

    public void setMaleFiftyPlus22(Long maleFiftyPlus22) {
        this.maleFiftyPlus22 = maleFiftyPlus22;
    }

    public Long getFemaleFiftyPlus22() {
        return femaleFiftyPlus22;
    }

    public void setFemaleFiftyPlus22(Long femaleFiftyPlus22) {
        this.femaleFiftyPlus22 = femaleFiftyPlus22;
    }

    public Long getMaleTenToFourteen23() {
        return maleTenToFourteen23;
    }

    public void setMaleTenToFourteen23(Long maleTenToFourteen23) {
        this.maleTenToFourteen23 = maleTenToFourteen23;
    }

    public Long getFemaleTenToFourteen23() {
        return femaleTenToFourteen23;
    }

    public void setFemaleTenToFourteen23(Long femaleTenToFourteen23) {
        this.femaleTenToFourteen23 = femaleTenToFourteen23;
    }

    public Long getMaleFifteenToNineteen23() {
        return maleFifteenToNineteen23;
    }

    public void setMaleFifteenToNineteen23(Long maleFifteenToNineteen23) {
        this.maleFifteenToNineteen23 = maleFifteenToNineteen23;
    }

    public Long getFemaleFifteenToNineteen23() {
        return femaleFifteenToNineteen23;
    }

    public void setFemaleFifteenToNineteen23(Long femaleFifteenToNineteen23) {
        this.femaleFifteenToNineteen23 = femaleFifteenToNineteen23;
    }

    public Long getMaleTwentyToTwentyFour23() {
        return maleTwentyToTwentyFour23;
    }

    public void setMaleTwentyToTwentyFour23(Long maleTwentyToTwentyFour23) {
        this.maleTwentyToTwentyFour23 = maleTwentyToTwentyFour23;
    }

    public Long getFemaleTwentyToTwentyFour23() {
        return femaleTwentyToTwentyFour23;
    }

    public void setFemaleTwentyToTwentyFour23(Long femaleTwentyToTwentyFour23) {
        this.femaleTwentyToTwentyFour23 = femaleTwentyToTwentyFour23;
    }

    public Long getMaleTwentyFiveToTwentyNine23() {
        return maleTwentyFiveToTwentyNine23;
    }

    public void setMaleTwentyFiveToTwentyNine23(Long maleTwentyFiveToTwentyNine23) {
        this.maleTwentyFiveToTwentyNine23 = maleTwentyFiveToTwentyNine23;
    }

    public Long getFemaleTwentyFiveToTwentyNine23() {
        return femaleTwentyFiveToTwentyNine23;
    }

    public void setFemaleTwentyFiveToTwentyNine23(Long femaleTwentyFiveToTwentyNine23) {
        this.femaleTwentyFiveToTwentyNine23 = femaleTwentyFiveToTwentyNine23;
    }

    public Long getMaleThirtyToFortyNine23() {
        return maleThirtyToFortyNine23;
    }

    public void setMaleThirtyToFortyNine23(Long maleThirtyToFortyNine23) {
        this.maleThirtyToFortyNine23 = maleThirtyToFortyNine23;
    }

    public Long getFemaleThirtyToFortyNine23() {
        return femaleThirtyToFortyNine23;
    }

    public void setFemaleThirtyToFortyNine23(Long femaleThirtyToFortyNine23) {
        this.femaleThirtyToFortyNine23 = femaleThirtyToFortyNine23;
    }

    public Long getMaleFiftyPlus23() {
        return maleFiftyPlus23;
    }

    public void setMaleFiftyPlus23(Long maleFiftyPlus23) {
        this.maleFiftyPlus23 = maleFiftyPlus23;
    }

    public Long getFemaleFiftyPlus23() {
        return femaleFiftyPlus23;
    }

    public void setFemaleFiftyPlus23(Long femaleFiftyPlus23) {
        this.femaleFiftyPlus23 = femaleFiftyPlus23;
    }

    public Long getMaleTenToFourteen24() {
        return maleTenToFourteen24;
    }

    public void setMaleTenToFourteen24(Long maleTenToFourteen24) {
        this.maleTenToFourteen24 = maleTenToFourteen24;
    }

    public Long getFemaleTenToFourteen24() {
        return femaleTenToFourteen24;
    }

    public void setFemaleTenToFourteen24(Long femaleTenToFourteen24) {
        this.femaleTenToFourteen24 = femaleTenToFourteen24;
    }

    public Long getMaleFifteenToNineteen24() {
        return maleFifteenToNineteen24;
    }

    public void setMaleFifteenToNineteen24(Long maleFifteenToNineteen24) {
        this.maleFifteenToNineteen24 = maleFifteenToNineteen24;
    }

    public Long getFemaleFifteenToNineteen24() {
        return femaleFifteenToNineteen24;
    }

    public void setFemaleFifteenToNineteen24(Long femaleFifteenToNineteen24) {
        this.femaleFifteenToNineteen24 = femaleFifteenToNineteen24;
    }

    public Long getMaleTwentyToTwentyFour24() {
        return maleTwentyToTwentyFour24;
    }

    public void setMaleTwentyToTwentyFour24(Long maleTwentyToTwentyFour24) {
        this.maleTwentyToTwentyFour24 = maleTwentyToTwentyFour24;
    }

    public Long getFemaleTwentyToTwentyFour24() {
        return femaleTwentyToTwentyFour24;
    }

    public void setFemaleTwentyToTwentyFour24(Long femaleTwentyToTwentyFour24) {
        this.femaleTwentyToTwentyFour24 = femaleTwentyToTwentyFour24;
    }

    public Long getMaleTwentyFiveToTwentyNine24() {
        return maleTwentyFiveToTwentyNine24;
    }

    public void setMaleTwentyFiveToTwentyNine24(Long maleTwentyFiveToTwentyNine24) {
        this.maleTwentyFiveToTwentyNine24 = maleTwentyFiveToTwentyNine24;
    }

    public Long getFemaleTwentyFiveToTwentyNine24() {
        return femaleTwentyFiveToTwentyNine24;
    }

    public void setFemaleTwentyFiveToTwentyNine24(Long femaleTwentyFiveToTwentyNine24) {
        this.femaleTwentyFiveToTwentyNine24 = femaleTwentyFiveToTwentyNine24;
    }

    public Long getMaleThirtyToFortyNine24() {
        return maleThirtyToFortyNine24;
    }

    public void setMaleThirtyToFortyNine24(Long maleThirtyToFortyNine24) {
        this.maleThirtyToFortyNine24 = maleThirtyToFortyNine24;
    }

    public Long getFemaleThirtyToFortyNine24() {
        return femaleThirtyToFortyNine24;
    }

    public void setFemaleThirtyToFortyNine24(Long femaleThirtyToFortyNine24) {
        this.femaleThirtyToFortyNine24 = femaleThirtyToFortyNine24;
    }

    public Long getMaleFiftyPlus24() {
        return maleFiftyPlus24;
    }

    public void setMaleFiftyPlus24(Long maleFiftyPlus24) {
        this.maleFiftyPlus24 = maleFiftyPlus24;
    }

    public Long getFemaleFiftyPlus24() {
        return femaleFiftyPlus24;
    }

    public void setFemaleFiftyPlus24(Long femaleFiftyPlus24) {
        this.femaleFiftyPlus24 = femaleFiftyPlus24;
    }

    public Long getMaleTenToFourteen25() {
        return maleTenToFourteen25;
    }

    public void setMaleTenToFourteen25(Long maleTenToFourteen25) {
        this.maleTenToFourteen25 = maleTenToFourteen25;
    }

    public Long getFemaleTenToFourteen25() {
        return femaleTenToFourteen25;
    }

    public void setFemaleTenToFourteen25(Long femaleTenToFourteen25) {
        this.femaleTenToFourteen25 = femaleTenToFourteen25;
    }

    public Long getMaleFifteenToNineteen25() {
        return maleFifteenToNineteen25;
    }

    public void setMaleFifteenToNineteen25(Long maleFifteenToNineteen25) {
        this.maleFifteenToNineteen25 = maleFifteenToNineteen25;
    }

    public Long getFemaleFifteenToNineteen25() {
        return femaleFifteenToNineteen25;
    }

    public void setFemaleFifteenToNineteen25(Long femaleFifteenToNineteen25) {
        this.femaleFifteenToNineteen25 = femaleFifteenToNineteen25;
    }

    public Long getMaleTwentyToTwentyFour25() {
        return maleTwentyToTwentyFour25;
    }

    public void setMaleTwentyToTwentyFour25(Long maleTwentyToTwentyFour25) {
        this.maleTwentyToTwentyFour25 = maleTwentyToTwentyFour25;
    }

    public Long getFemaleTwentyToTwentyFour25() {
        return femaleTwentyToTwentyFour25;
    }

    public void setFemaleTwentyToTwentyFour25(Long femaleTwentyToTwentyFour25) {
        this.femaleTwentyToTwentyFour25 = femaleTwentyToTwentyFour25;
    }

    public Long getMaleTwentyFiveToTwentyNine25() {
        return maleTwentyFiveToTwentyNine25;
    }

    public void setMaleTwentyFiveToTwentyNine25(Long maleTwentyFiveToTwentyNine25) {
        this.maleTwentyFiveToTwentyNine25 = maleTwentyFiveToTwentyNine25;
    }

    public Long getFemaleTwentyFiveToTwentyNine25() {
        return femaleTwentyFiveToTwentyNine25;
    }

    public void setFemaleTwentyFiveToTwentyNine25(Long femaleTwentyFiveToTwentyNine25) {
        this.femaleTwentyFiveToTwentyNine25 = femaleTwentyFiveToTwentyNine25;
    }

    public Long getMaleThirtyToFortyNine25() {
        return maleThirtyToFortyNine25;
    }

    public void setMaleThirtyToFortyNine25(Long maleThirtyToFortyNine25) {
        this.maleThirtyToFortyNine25 = maleThirtyToFortyNine25;
    }

    public Long getFemaleThirtyToFortyNine25() {
        return femaleThirtyToFortyNine25;
    }

    public void setFemaleThirtyToFortyNine25(Long femaleThirtyToFortyNine25) {
        this.femaleThirtyToFortyNine25 = femaleThirtyToFortyNine25;
    }

    public Long getMaleFiftyPlus25() {
        return maleFiftyPlus25;
    }

    public void setMaleFiftyPlus25(Long maleFiftyPlus25) {
        this.maleFiftyPlus25 = maleFiftyPlus25;
    }

    public Long getFemaleFiftyPlus25() {
        return femaleFiftyPlus25;
    }

    public void setFemaleFiftyPlus25(Long femaleFiftyPlus25) {
        this.femaleFiftyPlus25 = femaleFiftyPlus25;
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