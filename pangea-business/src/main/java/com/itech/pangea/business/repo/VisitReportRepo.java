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

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.Visit;
import com.itech.pangea.business.domain.util.VisitStatus;

/**
 *
 * @author Judge Muzinda
 */
public interface VisitReportRepo extends CrudRepository<Visit, Long> {

    @Query("select count(v) from Visit v where v.facility.district.province=:province and v.period=:period and v.visitStatus=:visitStatus")
    public Integer getByProvinceAndVisitStatusAndPeriod(@Param("province") Province province, @Param("period") Period period, @Param("visitStatus") VisitStatus visitStatus);

    /*@Query("select count(v) from Visit v left join fetch v.mentors vm where v.facility.district.province=:province and  :mentor in (vm) and v.period=:period and v.visitStatus=:visitStatus")
    public Integer getByProvinceAndMentorAndVisitStatusAndPeriod(@Param("province") Province province, @Param("mentor") Mentor mentor, @Param("period") Period period, @Param("visitStatus") VisitStatus visitStatus);*/

    @Query("select count(v) from Visit v where v.facility.district=:district and v.period=:period and v.visitStatus=:visitStatus")
    public Integer getByDistrictAndVisitStatusAndPeriod(@Param("district") District district, @Param("period") Period period, @Param("visitStatus") VisitStatus visitStatus);

    /*@Query("select count(v) from Visit v left join fetch v.mentors vm where v.facility.district=:district and  :mentor in (vm) and v.period=:period and v.visitStatus=:visitStatus")
    public Integer getByDistrictAndMentorVisitStatusAndPeriod(@Param("district") District district, @Param("mentor") Mentor mentor, @Param("period") Period period, @Param("visitStatus") VisitStatus visitStatus);

    @Query("select count(v) from Visit v left join fetch v.mentors vm where :mentor in (vm) and v.period=:period and v.visitStatus=:visitStatus")
    public Integer getByMentorAndVisitStatusAndPeriod(@Param("mentor") Mentor mentor, @Param("period") Period period, @Param("visitStatus") VisitStatus visitStatus);*/
    
    @Query("select count(v) from Visit v where v.period=:period and v.visitStatus=:visitStatus")
    public Integer getByVisitStatusAndPeriod(@Param("period") Period period, @Param("visitStatus") VisitStatus visitStatus);
}
