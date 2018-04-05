package com.itech.pangea.business.domain.util;

import com.itech.pangea.business.util.StringUtils;

public enum ReasonForHIVTest {

    KNOW_HIV_STATUS(1), RETEST_FOR_ART_INITIATION(2), INDEX_CASE_TESTING(3);

    private final Integer code;

    ReasonForHIVTest(Integer code){
        this.code = code;
    }
    
    public Integer getCode(){
        return code;
    }

    public static ReasonForHIVTest get(Integer code){
        for(ReasonForHIVTest item : values()){
            if(item.code.equals(code)){
                return item;
            }
        }
        throw new IllegalArgumentException("Uknown parameter passed to method");
    }

    public String getName(){
        return StringUtils.toCamelCase3(super.name());
    }

    @Override
    public String toString() {
        return getName();
    }
}
