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
package com.itech.pangea.business.service;

import java.util.List;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.util.dto.FacilityDTO;
import com.itech.pangea.business.util.dto.NameIdDTO;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
public interface FacilityService extends GenericService<Facility> {

    public Integer getCount(SearchNationalDTO dto);

    public List<Facility> getByDistrict(District district);

    public Facility getByDistrictAndName(District district, String name);
    
    public Facility getByDhisName(String name);

    public List<NameIdDTO> getByParent(List<Facility> items);

    public List<Facility> getByMentorAndDistrict(Mentor mentor);
    
    public List<Facility> get(SearchNationalDTO dto);
    
    public List<Facility> getByProvince(Province province);
    
    public List<FacilityDTO> getFacilities();

}
