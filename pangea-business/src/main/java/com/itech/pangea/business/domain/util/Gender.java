/*
 * Copyright 2015 Judge Muzinda.
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
package com.itech.pangea.business.domain.util;

import com.itech.pangea.business.util.StringUtils;

/**
 *
 * @author Judge Muzinda
 */
public enum Gender {
    
    FEMALE(1), MALE(2), OTHER(3);
    
    private final Integer code;
    
    private Gender(Integer code){
        this.code = code;
    }
    
    public Integer getCode(){
        return code;
    }
    
    public static Gender get(Integer code){
        switch(code){
            case 1:
                return FEMALE;
            case 2:
                return MALE;
            default:
                throw new IllegalArgumentException("Unknown parameter passed to method expected {1-3} and receieved :"+code);
        }
    }
    
    public static Gender get(String code){
        switch(code){
            case "female":
                return FEMALE;
            case "male":
                return MALE;
            default:
                throw new IllegalArgumentException("Unknown parameter passed to method expected {1-3} and receieved :"+code);
        }
    }
    
    public String getName() {
        return StringUtils.toCamelCase3(super.name());
    }
    
    private static final Gender[] VALUES = {Gender.MALE, Gender.FEMALE};
    
    public static Gender[] getItems(){
        return VALUES.clone();
    }
}