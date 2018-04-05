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

import java.util.ArrayList;
import java.util.List;
import com.itech.pangea.business.util.StringUtils;

/**
 *
 * @author Judge Muzinda
 */
public enum VisitStatus {
    
    DONE(1), OVERDUE(2), RESCHEDULED(3), NOT_DONE(4), PENDING(5);
    
    /**
     * not done manual process where visit will not be done for current month
     * overdue 10 days past schedule date
     */
    private final Integer code;
    
    private VisitStatus(Integer code){
        this.code = code;
    }
    
    public Integer getCode(){
        return code;
    }
    
    public static VisitStatus get(Integer code){
        switch(code){
            case 1:
                return DONE;
            case 2:
                return OVERDUE;
            case 3:
                return RESCHEDULED;
            case 4:
                return NOT_DONE;
            case 5:
                return PENDING;
            default:
                throw new IllegalArgumentException("Illegal parameter passed to method expected range {1-4} :"+code);
        }
    }
    
    public static List<VisitStatus> getManualItems(){
        List<VisitStatus> manual = new ArrayList<>();
        manual.add(DONE);
        manual.add(RESCHEDULED);
        manual.add(NOT_DONE);
        return manual;
    }
    
    public String getName() {
        return StringUtils.toCamelCase3(super.name());
    }
}