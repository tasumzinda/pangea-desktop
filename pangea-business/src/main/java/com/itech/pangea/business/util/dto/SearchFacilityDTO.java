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

package com.itech.pangea.business.util.dto;

import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.domain.Province;

/**
 *
 * @author Tasunungurwa Muzinda
 */
public class SearchFacilityDTO implements Serializable{
    
    private Period period;
    private Facility facility;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date endDate;
    private String name;
    private Province province;

    public SearchFacilityDTO(){
        
    }
    
    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
    private District district;

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public SearchFacilityDTO(Period period){
        this.period = period;
    }
    
    public void setPeriod(Period period){
        this.period = period;
    }
    
    public Period getPeriod(){
        return period;
    }
    
    public void setFacility(Facility facility){
        this.facility = facility;
    }
    
    public Facility getFacility(){
        return facility;
    }
    
    public static SearchFacilityDTO getInstance(SearchFacilityDTO dto){
        SearchFacilityDTO search = new SearchFacilityDTO(dto.getPeriod());
        search.setEndDate(dto.getEndDate());
        search.setFacility(dto.getFacility());
        search.setName(dto.getName());
        search.setProvince(dto.getProvince());
        search.setDistrict(dto.getDistrict());
        return search;
    }
}
