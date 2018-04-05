package com.itech.pangea.business.domain;

import javax.persistence.Entity;


/**
 * Created by tdhlakama on 4/8/2016.
 */
@Entity
public class DSDQuestion extends BaseEntity {

    public Long serverId;

    public String name;

    public Long maleLessThanOne;

    public Long femaleLessThanOne;

    public Long maleOneToFour;

    public Long femaleOneToFour;

    public Long maleFiveToNine;

    public Long femaleFiveToNine;

    public Long maleTenToFourteen;

    public Long femaleTenToFourteen;

    public Long maleFifteenToNineteen;

    public Long femaleFifteenToNineteen;

    public Long maleTwentyToTwentyFour;

    public Long getServerId() {
        return serverId;
    }

    public String getName() {
        return name;
    }

    public Long getMaleLessThanOne() {
        return maleLessThanOne;
    }

    public Long getFemaleLessThanOne() {
        return femaleLessThanOne;
    }

    public Long getMaleOneToFour() {
        return maleOneToFour;
    }

    public Long getFemaleOneToFour() {
        return femaleOneToFour;
    }

    public Long getMaleFiveToNine() {
        return maleFiveToNine;
    }

    public Long getFemaleFiveToNine() {
        return femaleFiveToNine;
    }

    public Long getMaleTenToFourteen() {
        return maleTenToFourteen;
    }

    public Long getFemaleTenToFourteen() {
        return femaleTenToFourteen;
    }

    public Long getMaleFifteenToNineteen() {
        return maleFifteenToNineteen;
    }

    public Long getFemaleFifteenToNineteen() {
        return femaleFifteenToNineteen;
    }

    public Long getMaleTwentyToTwentyFour() {
        return maleTwentyToTwentyFour;
    }

    public Long getFemaleTwentyToTwentyFour() {
        return femaleTwentyToTwentyFour;
    }

    public Long getMaleTwentyFiveToFortyNine() {
        return maleTwentyFiveToFortyNine;
    }

    public Long getFemaleTwentyFiveToFortyNine() {
        return femaleTwentyFiveToFortyNine;
    }

    public Long getMalefiftyPlus() {
        return malefiftyPlus;
    }

    public Long getFemalefiftyPlus() {
        return femalefiftyPlus;
    }

    public Long femaleTwentyToTwentyFour;

    public Long maleTwentyFiveToFortyNine;

    public Long femaleTwentyFiveToFortyNine;

    public Long malefiftyPlus;

    public Long femalefiftyPlus;
}
