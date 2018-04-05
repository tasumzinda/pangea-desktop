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
public enum MentorRole {
    
    MENTOR(1), MENTOR2(8), DRIVER(2), NATIONAL(3), USER_1_R_NURSE(4), USER_2_MOH(5),USER_3_DSIO(6),  PROVINCIAL(7); 

    
    private final Integer code;
    
    private MentorRole(Integer code){
        this.code = code;
    }
    
    public Integer getCode(){
        return code;
    }
    
    public static MentorRole get(Integer code){
        switch(code){
            case 1:
                return MENTOR;
            case 2:
                return DRIVER;
            case 3:
                return NATIONAL;
            case 7:
                return PROVINCIAL;
            case 8:
                return MENTOR2;
            default:
                throw new IllegalArgumentException("Illegal parameter passed to method :"+code);
        }
    }
    
    public static MentorRole get(String code){
        switch(code){
            case "mentor":
                return MENTOR;
            case "driver":
                return DRIVER;
            case "national":
                return NATIONAL;
            case "provincial":
                return PROVINCIAL;
            case "mentor2":
                return MENTOR2;
            default:
                throw new IllegalArgumentException("Unknown parameter passed to method expected {1-3} and receieved :"+code);
        }
    }
    
    private static final MentorRole[] VALUES = new MentorRole[]{MentorRole.DRIVER, MentorRole.MENTOR, MentorRole.NATIONAL, MentorRole.PROVINCIAL, MentorRole.MENTOR2};
    
    public static MentorRole[] getItems(){
        return (MentorRole[]) VALUES.clone();
    }
    
    public String getName() {
        return StringUtils.toCamelCase3(super.name());
    }
}