package com.itech.pangea.business.domain.util;

import com.itech.pangea.business.util.StringUtils;

public enum ClientServices {

    OPD(1), FHS(2), OTHER(3);

    private final Integer code;

    ClientServices(Integer code){
        this.code = code;
    }

    public static ClientServices get(Integer code){
        for(ClientServices item : values()){
            if(item.code.equals(code)){
                return item;
            }
        }
        throw new IllegalArgumentException("Unknown argument passed to method");
    }

    public String getName(){
        return StringUtils.toCamelCase4(super.name());
    }

    @Override
    public String toString() {
        return getName();
    }

    public Integer getCode() {
        return code;
    }
}
