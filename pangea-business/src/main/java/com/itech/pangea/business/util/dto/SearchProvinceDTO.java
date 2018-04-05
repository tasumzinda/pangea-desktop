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

import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Period;


/**
 *
 * @author Judge Muzinda
 */
public class SearchProvinceDTO extends SearchDistrictDTO {
    
    private District district;

    public SearchProvinceDTO() {
    }

    public SearchProvinceDTO(Period period) {
        super(period);
    }
    
    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}