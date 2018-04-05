/*
 * Copyright 2016 Tasunungurwa Muzinda.
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
 * @author Tasunungurwa Muzinda
 */
public enum OSDVReportOptions {
    PMTCT_STAT(1), PMTCT_EID(2), TX_NEW(3), HTC_TST(4);
    
    private final Integer code;
   
   private OSDVReportOptions(Integer code){
       this.code = code;
   }
   
   public Integer getCode(){
       return code;
   }
   
   public static OSDVReportOptions get(Integer code){
       for(OSDVReportOptions item : values()){
           if(item.code.equals(code))
               return item;
       }
       throw new IllegalArgumentException("Unexpected parameter passed to method");
   }
   
   public String getName() {
        return StringUtils.toCamelCase3(super.name()).toUpperCase();
    }
}
