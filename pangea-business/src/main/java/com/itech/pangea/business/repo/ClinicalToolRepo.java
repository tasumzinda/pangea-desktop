/*
 * Copyright 2016 Judge Muzinda.
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
package com.itech.pangea.business.repo;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.query.Param;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Province;

/**
 *
 * @author Judge Muzinda
 * @param <T>
 * @param <ID>
 */
public interface ClinicalToolRepo<T , ID extends Serializable> extends AbstractRepo<T, ID> {
    
    public List<T> findByMentee_Facility_District_ProvinceAndActive(@Param("province") Province province, @Param("active") Boolean active);
    
    public List<T> findByMentee_Facility_DistrictAndActive(@Param("district") District district, @Param("active") Boolean active);
}