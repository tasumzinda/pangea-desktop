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
public enum MonthReportOptions {
    NUMBER_OF_INDIVIDUALS_WHO_RECEIVED_THEIR_RESULTS_THIS_MONTH(1), NUMBER_OF_INDIVIDUALS_TESTED_POSITIVE_THIS_MONTH(2), NUMBER_OF_COUPLES_TESTED_THIS_MONTH(3), NUMBER_OF_COUPLES_TESTED_POSITIVE_THIS_MONTH(4),ENTRY_POINTS(5), PMTCT_EID(6), PMTCT_STAT(7), TOTAL_INITIATED_ON_ART(9), TOTAL_DECLINED_ART(10), TOTAL_CD4_TESTED(11), TOTAL_VIRAL_LOAD_TESTED(12), TX_CURR(13), TX_NEW(14), PMTCT_P1(15), PMTCT_P2(16), PMTCT_P3(17), PMTCT_P4(18), PMTCT_P6(19), PMTCT_P10(20), PMTCT_P11(21), PMTCT_P12(22), PMTCT_P17(23), PMTCT_P18(24), PMTCT_P19(25), PMTCT_P20(26), PMTCT_P21(27), PMTCT_P22(28), PMTCT_P23(29);
    
    private final Integer code;
    
    private MonthReportOptions(Integer code){
        this.code = code;
    }
    
    public Integer getCode(){
        return code;
    }
    
    public static MonthReportOptions get(Integer code){
        for(MonthReportOptions item : values()){
            if(item.code.equals(code)){
                return item;
            }
        }
        throw new IllegalArgumentException("Illegal arguement passed to method");
    }
    
    public String getName() {
        return StringUtils.toCamelCase3(super.name()).toUpperCase();
    }
}
