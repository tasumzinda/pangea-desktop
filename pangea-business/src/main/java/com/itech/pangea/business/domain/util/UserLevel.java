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

import java.util.ArrayList;
import java.util.List;
import com.itech.pangea.business.util.StringUtils;

/**
 *
 * @author Judge Muzinda
 */
public enum UserLevel {
    NATIONAL(1), PROVINCE(2), DISTRICT(3), WARD(4), VILLAGE(5);
    
    private final Integer code;
    
    private UserLevel(Integer code){
        this.code = code;
    }
    
    public Integer getCode(){
        return code;
    }
    
    public static UserLevel get(Integer code){
        switch(code){
            case 1:
                return NATIONAL;
            case 2:
                return PROVINCE;
            case 3:
                return DISTRICT;
            case 4:
                return WARD;
            case 5:
                return VILLAGE;
            default:
                throw new IllegalArgumentException("Illegal parameter passed to method :" + code);
        }
    }
    
    public static List<UserLevel> getUserLevel(){
        List<UserLevel> items = new ArrayList<>();
        items.add(NATIONAL);
        items.add(PROVINCE);
        items.add(DISTRICT);
        items.add(WARD);
        return items;
    }
    
    public String getName(){
        return StringUtils.toCamelCase3(super.name());
    }
}