/*
 * Copyright 2016 jmuzinda.
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
 * @author jmuzinda
 */
public enum DSDIndividualOptions {
    NUMBER_OF_CLIENTS_MOBILIZED_FOR_PITC(1), NUMBER_OF_PITC_CLIENTS_RECEIVING_GHE_TALK_AND_OFFERED_HIV_TESTING(2), NUMBER_ELIGIBLE_FOR_TESTING(3), TOTAL_NUMBER_INDIVIDUALS_TESTED_WHO_RECEIVED_RESULTS(4), FIRST_TIME_INDIVIDUALS_TESTED(5), TOTAL_POSITIVE_FIRST_TIME_INDIVIDUALS(7), TOTAL_RETESTED_INDIVIDUALS(8), TOTAL_POSITIVE_RETESTED_INDIVIDUALS(9), NUMBER_OF_NEWLY_IDENTIFIED_POSITIVES_SUCCESSFULLY_LINKED_TO_CARE(10), TOTAL_POSITIVE_INDIVIDUALS(11), SUMMARY(12), COUPLES_TESTED(13), ENTRY_POINTS(6);
    private final Integer code;
    
    private DSDIndividualOptions(Integer code){
        this.code = code;
    }
    
    public Integer getCode(){
        return code;
    }
    
    public static DSDIndividualOptions get(Integer code){
        switch(code){
            case 1:
                return NUMBER_OF_CLIENTS_MOBILIZED_FOR_PITC;
            case 2:
                return NUMBER_OF_PITC_CLIENTS_RECEIVING_GHE_TALK_AND_OFFERED_HIV_TESTING;
            case 3:
                return NUMBER_ELIGIBLE_FOR_TESTING;
            case 4: 
                return TOTAL_NUMBER_INDIVIDUALS_TESTED_WHO_RECEIVED_RESULTS;
            case 5:
                return FIRST_TIME_INDIVIDUALS_TESTED;
            case 6:
                return NUMBER_OF_NEWLY_IDENTIFIED_POSITIVES_SUCCESSFULLY_LINKED_TO_CARE;
            case 7:
                return TOTAL_POSITIVE_FIRST_TIME_INDIVIDUALS;
            case 8:
                return TOTAL_RETESTED_INDIVIDUALS;
            case 9:
                return TOTAL_POSITIVE_RETESTED_INDIVIDUALS;
            case 10:
                return NUMBER_OF_NEWLY_IDENTIFIED_POSITIVES_SUCCESSFULLY_LINKED_TO_CARE;
            case 11:
                return TOTAL_POSITIVE_INDIVIDUALS;
            case 12:
                return SUMMARY;
            case 13:
                return COUPLES_TESTED;
            default: throw new IllegalArgumentException("Unknown parameter passed to method expected {1-13} and receieved :"+code);
        }
    }
    
    public String getName() {
        String name = StringUtils.toCamelCase3(super.name()).toUpperCase();
        return getCode() == 6 ? "14. "+name : getCode() + ". " + name;
    }
}
