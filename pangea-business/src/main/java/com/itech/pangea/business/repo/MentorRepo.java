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
package com.itech.pangea.business.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.itech.pangea.business.domain.Designation;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Mentor;

/**
 *
 * @author Judge Muzinda
 */
public interface MentorRepo extends AbstractRepo<Mentor, Long> {
    
    @Query("from Mentor m left join fetch m.districts md where :district in (md) order by m.lastName, m.firstName")
    public List<Mentor> getByDistrict(@Param("district") District district);
    
    @Query("Select Distinct m from Mentor m left join fetch m.districts where m.active=:active order by m.lastName, m.firstName")
    public List<Mentor> findByActiveOpt(@Param("active") Boolean active);
    
    public Mentor findByNationalId(String nationalId);
    
    @Query("from District d left join fetch d.mentors dm  where :mentor in (dm)")
    public List<District> findMentorDistricts(@Param("mentor") Mentor mentor);
    
    public Mentor findByEmail(String email);
    
    @Query("from Mentor m left join fetch m.districts districts where m.id=:id")
    public Mentor getItem(@Param("id") Long id);
    @Query("from Mentor m left join fetch m.districts md where :district in (md) and m.designation =:designation")
    public List<Mentor> findByDistrictAndDesignation(District district, Designation designation);
}