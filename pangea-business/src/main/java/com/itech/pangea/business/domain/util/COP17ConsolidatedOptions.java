/*
 * Copyright 2017 User.
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
 * @author User
 */
public enum COP17ConsolidatedOptions {
    
     TOTAL_FIRST_TIME_TESTED(1), POSITIVE_FIRST_TIME_TESTED(2), TOTAL_RETESTED_INDIVIDUALS(3), POSITIVE_RETESTED_INDIVIDUALS(4), PITC_VMMC_POSITIVE(5), PITC_VMMC_NEGATIVE(6), OTHER_PITC_POSITIVE(7), OTHER_PITC_NEGATIVE(8), FACILITY_INDEX_POSITIVE(9), FACILITY_INDEX_NEGATIVE(10);
   private Integer code;
   
   private COP17ConsolidatedOptions(Integer code){
       this.code = code;
   }
   
   public Integer getCode(){
       return code;
   }
   
   public static COP17ConsolidatedOptions get(Integer code){
       for(COP17ConsolidatedOptions item : values()){
           if(item.getCode().equals(code)){
               return item;
           }
       }
       throw new IllegalArgumentException("Parameter not recognized");
       /*switch(code){
           case 1:
               return TOTAL_FIRST_TIME_TESTED;
           case 2:
               return POSITIVE_FIRST_TIME_TESTED;
           case 3:
               return TOTAL_RETESTED_INDIVIDUALS;
           case 4:
               return POSITIVE_RETESTED_INDIVIDUALS;
           case 5:
               return PITC_VMMC_POSITIVE;
           case 6:
               return PITC_VMMC_NEGATIVE;
           case 7:
               return OTHER_PITC_POSITIVE;
           case 8:
               return OTHER_PITC_NEGATIVE;
           case 9:
               return FACILITY_INDEX_POSITIVE;
           case 10:
               return FACILITY_INDEX_NEGATIVE;
           default: throw new IllegalArgumentException("Unknown parameter passed to method expected {1-10} and receieved :"+code);
       }*/
   }
   
   public String getName() {
        return getCode() + ". " + StringUtils.toCamelCase3(super.name()).toUpperCase();
    }
}
