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
import com.itech.pangea.business.domain.Designation;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.util.dto.NameIdDTO;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
public interface MentorService extends GenericService<Mentor> {
    
    public List<Mentor> getByDistrict(District district);
    
    public List<Mentor> getByProvince(Province province);
    
    public Mentor getByNationalId(String nationalId);
    
    public Mentor getByEmail(String email);
    
    public NameIdDTO getMentor(Mentor item);
    
    public Boolean getDistricts(Mentor mentor);
    
    public void updateMentor(Mentor mentor);
    
    public List<Mentor> get(SearchNationalDTO dto);
    
    public List<Mentor> getByDistrictAndDesignation(District district, Designation designation);
    
    public void changeUserName();
}