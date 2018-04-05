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
public enum CommunityBasedDSDOptions {
    
    COMMUNITY_ASSISTED_SELF_TESTING_POSITIVE(1), COMMUNITY_ASSISTED_SELF_TESTING_NEGATIVE(2), COMMUNITY_UNASSISTED_SELF_TESTING_POSITIVE(3), COMMUNITY_UNASSISTED_SELF_TESTING_NEGATIVE(4),COMMUNITY_INDEX_TESTING_POSITIVE(5), COMMUNITY_INDEX_TESTING_NEGATIVE(6), COMMUNITY_TARGETED_MOBILE_TESTING_POSITIVE(7), COMMUNITY_TARGETED_MOBILE_TESTING_NEGATIVE(8);
   private Integer code;
   
   private CommunityBasedDSDOptions(Integer code){
       this.code = code;
   }
   
   public Integer getCode(){
       return code;
   }
   
   public static CommunityBasedDSDOptions get(Integer code){
       for(CommunityBasedDSDOptions item : values()){
           if(item.getCode().equals(code)){
               return item;
           }
       }
       /*switch(code){
           case 1:
               return COMMUNITY_SELF_TESTING_POSITIVE;
           case 2:
               return COMMUNITY_SELF_TESTING_NEGATIVE;
           case 3:
               return COMMUNITY_INDEX_TESTING_POSITIVE;
           case 4:
               return COMMUNITY_INDEX_TESTING_NEGATIVE;
           case 5:
               return COMMUNITY_TARGETED_MOBILE_TESTING_POSITIVE;
           case 6:
               return COMMUNITY_TARGETED_MOBILE_TESTING_NEGATIVE;
           default: throw new IllegalArgumentException("Unknown parameter passed to method expected {1-10} and receieved :"+code);
       }*/
       throw new IllegalArgumentException("Unknown parameter passed to method expected {1-10} and receieved :"+code);
       
   }
   
   public String getName() {
        return getCode() + ". " + StringUtils.toCamelCase3(super.name()).toUpperCase();
    }
}
