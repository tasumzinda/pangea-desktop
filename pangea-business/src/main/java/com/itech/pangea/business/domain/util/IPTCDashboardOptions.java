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
public enum IPTCDashboardOptions {

    iPITC(1), INDEX_TESTING(2), LINKAGE_AND_TRACING(3), DEFAULTER_TRACING(4);
    
    private final Integer code;

    private IPTCDashboardOptions(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
    
    public static IPTCDashboardOptions get(Integer code){
        for(IPTCDashboardOptions item : values()){
            if(item.getCode().equals(code))
                return item;
        }
        throw new IllegalArgumentException("Parameter passed to method not recognized: " + code);
    }
    
    public String getName(){
        return code + ". " + StringUtils.toCamelCase3(super.name()).toUpperCase();
    }
}
