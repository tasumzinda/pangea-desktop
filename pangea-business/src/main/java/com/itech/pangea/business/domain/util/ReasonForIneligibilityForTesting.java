package com.itech.pangea.business.domain.util;

import com.itech.pangea.business.util.StringUtils;

public enum ReasonForIneligibilityForTesting {

    POSITIVE(1), NEGATIVE(2), UNKNOWN(3);

    private final Integer code;

    ReasonForIneligibilityForTesting(Integer code){
        this.code = code;
    }

    public static ReasonForIneligibilityForTesting get(Integer code){
        for(ReasonForIneligibilityForTesting item : values()){
            if(item.code.equals(code)){
                return item;
            }
        }
        throw new IllegalArgumentException("Unknown parameter passed to method");
    }

    public String getName(){
        return StringUtils.toCamelCase3(super.name());
    }

    @Override
    public String toString() {
        return getName();
    }
    
    public Integer getCode(){
        return code;
    }

}
