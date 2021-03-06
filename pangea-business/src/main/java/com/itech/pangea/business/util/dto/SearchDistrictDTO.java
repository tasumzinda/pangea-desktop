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
package com.itech.pangea.business.util.dto;

import java.io.Serializable;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Period;

/**
 *
 * @author Judge Muzinda
 */
public class SearchDistrictDTO implements Serializable {
 
    private Period period;
    private Facility facility;

    public SearchDistrictDTO() {
    }

    public SearchDistrictDTO(Period period) {
        this.period = period;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
    
}