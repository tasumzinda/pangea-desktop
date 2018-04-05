package com.itech.pangea.business.domain.util;

import com.itech.pangea.business.util.StringUtils;


public enum Relationship {

    SEXUAL_PARTNER(1), BIOLOGICAL_CHILDREN(2), SPOUSE(3), OTHER(4);

    private final Integer code;

    Relationship(Integer code){
        this.code = code;
    }

    public static Relationship get(Integer code){
        for(Relationship item : values()){
            if(item.code.equals(code)){
                return item;
            }
        }
        throw new IllegalArgumentException("Unknown parameter");
    }

    public String getName(){
        return StringUtils.toCamelCase3(super.name());
    }

    @Override
    public String toString() {
        return getName();
    }

    public Integer getCode() {
        return code;
    }
}
