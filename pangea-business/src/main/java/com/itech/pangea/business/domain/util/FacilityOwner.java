/*
 * Copyright 2014 Judge Muzinda.
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
public enum FacilityOwner {
    
    GOVERNMENT(1), MISSION(2), LOCAL_AUTHORITY(3), ZRP_PRISONS(4);
    
    private final Integer code;
    
    private FacilityOwner(Integer code){
        this.code = code;
    }
    
    public Integer getCode(){
        return code;
    }
    
    public static FacilityOwner get(Integer code){
        switch(code){
            case 1:
                return GOVERNMENT;
            case 2:
                return MISSION;
            case 3:
                return LOCAL_AUTHORITY;
            case 4:
                return ZRP_PRISONS;
            default:
                throw new IllegalArgumentException("Parameter does not meet any in list :"+code);
        }
    }
    
    public String getName() {
        return StringUtils.toCamelCase3(super.name());
    }
}