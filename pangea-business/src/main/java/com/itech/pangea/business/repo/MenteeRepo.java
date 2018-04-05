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

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Mentee;
import com.itech.pangea.business.domain.Province;

/**
 *
 * @author Judge Muzinda
 */
public interface MenteeRepo extends AbstractRepo<Mentee, Long> {
    
    public List<Mentee> findByFacility(Facility facility);
    
    @Query("from Mentee m left join fetch m.facility where m.facility.district=:district and m.active=:active order by m.lastName, m.firstName")
    public List<Mentee> getByDistrict(@Param("district") District district, @Param("active") Boolean active );
    
    @Query("from Mentee m left join fetch m.facility where m.facility.district.province=:province and m.active=:active order by m.lastName, m.firstName")
    public List<Mentee> getByProvince(@Param("province") Province province, @Param("active") Boolean active );
}