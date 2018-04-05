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
public enum COP17TXNewOptions {
    
   TOTAL_INITIATED_ON_ART(1), TOTAL_DECLINED_ART(2), TOTATL_CD4_TESTED(3), TOTAL_VIRAL_LOAD_TESTED(4);
   private Integer code;
   
   private COP17TXNewOptions(Integer code){
       this.code = code;
   }
   
   public Integer getCode(){
       return code;
   }
   
   public static COP17TXNewOptions get(Integer code){
       switch(code){
           case 1:
               return TOTAL_INITIATED_ON_ART;
           case 2:
               return TOTAL_DECLINED_ART;
           case 3:
               return TOTATL_CD4_TESTED;
           case 4:
               return TOTAL_VIRAL_LOAD_TESTED;
           default: throw new IllegalArgumentException("Unknown parameter passed to method expected {1-10} and receieved :"+code);
       }
   }
   
   public String getName() {
        return getCode() + ". " + StringUtils.toCamelCase3(super.name()).toUpperCase();
    }
}
