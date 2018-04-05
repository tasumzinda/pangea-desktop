/*
 * Copyright 2018 tasu.
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
 * @author Tasu Muzinda
 */
public enum CallOutcome {
    NOT_FOUND(1), FOUND_AND_LINKED_BACK_TO_CARE(2), ATTENDING_ART_CLINIC_SOMEWHERE(3), DECEASED(4), FOUND_AND_REFUSED_TO_COME_BACK_TO_CARE(5),NUMBER_NOT_REACHABLE_OR_AVAILABLE(6), LTFU_NUMBER_NOT_IN_USE_OR_CORRECT(7), LTFU_WRONG_PHYSICAL_ADDRESS(8);
    
    private final Integer code;

    private CallOutcome(Integer code) {
        this.code = code;
    }
    
    public Integer getCode(){
        return code;
    }
    
    public String getName(){
        return StringUtils.toCamelCase3(super.name());
    }
    
    @Override
    public String toString(){
        return getName();
    }
    
    public static CallOutcome get(Integer code){
        for(CallOutcome item : values()){
            if(item.getCode().equals(code))
                return item;
        }
        throw new IllegalArgumentException("Parameter passed to method not recognized: " + code);
    }
}
