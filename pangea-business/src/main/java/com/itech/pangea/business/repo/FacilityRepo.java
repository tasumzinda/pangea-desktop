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

import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Province;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Judge Muzinda
 */
public interface FacilityRepo extends AbstractNameDescRepo<Facility, Long> {

    @Query("from Facility f left join fetch f.district where f.active=:active Order By f.name ASC")
    public List<Facility> getOptAll(@Param("active") Boolean active);

    @Query("select count(f) from Facility f")
    public Integer getCount();
    
    @Query("select count(f) from Facility f where f.district.province=:province")
    public Integer getCountByProvince(@Param("province") Province province);
    
    @Query("select count(f) from Facility f where f.district=:district")
    public Integer getCountByDistrict(@Param("district") District district);
    
    @Query("from Facility f left join fetch f.district where f.district=:district and f.active=:active Order By f.name ASC")
    public List<Facility> findByDistrict(@Param("district") District district, @Param("active") Boolean active);
    
    @Query("from Facility f left join fetch f.district where f.district=:district and f.name=:name")
    public Facility findByDistrictAndName(@Param("district") District district, @Param("name") String name);
    
    @Query("from Facility f left join fetch f.district where f.dhisName=:name")
    public Facility findByDhisName(@Param("name") String name);
    
    @Query("from Facility f left join fetch f.district where f.district.province=:province and f.active=:active Order By f.name ASC")
    public List<Facility> getByProvince(@Param("province") Province province, @Param("active") Boolean active );

}