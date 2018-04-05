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

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
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
public interface VisitRepo extends AbstractRepo<Visit, Long> {
    
    @Override
    @Query("from Visit v left join fetch v.facility left join fetch v.visitFailReason left join fetch v.period where v.active=:active Order By v.startDate Desc")
    public List<Visit> findByActive(@Param("active") Boolean active);
    
    @Query("from Visit v left join fetch v.mentors vm left join fetch v.facility left join fetch v.visitFailReason left join fetch v.period where v.id=:id")
    public Visit findItem(@Param("id") Long id);
    
    @Query("from Visit v left join fetch v.mentors vm left join fetch v.facility left join fetch v.visitFailReason left join fetch v.period where v.active=:active and :visitDate between v.startDate and v.endDate")
    public List<Visit> findBetweenStartDateAndEndDate(@Param("visitDate") Date visitDate, @Param("active") Boolean active );
    
    public List<Visit> findByPeriod(Period period);
    
    public List<Visit> findByVisitStatusAndPeriodOrderByStartDateDesc(VisitStatus visitStatus, Period period);
    
    public List<Visit> findByFacility_District_ProvinceAndPeriodOrderByStartDateDesc(Province province, Period period);
    
    public List<Visit> findByFacility_DistrictAndPeriodOrderByStartDateDesc(District district, Period period);
    
    @Query("from Visit v left join fetch v.mentors vm where :mentor in (vm) and v.period=:period Order By v.startDate Desc")
    public List<Visit> findByMentor(@Param("mentor") Mentor mentor, @Param("period") Period period);
    
    @Query("from Visit v left join fetch v.mentors vm where :mentor in (vm) and v.facility.district.province=:province and v.period=:period Order By v.startDate Desc")
    public List<Visit> findByFacility_District_ProvinceAndMentor(
    @Param("province") Province province, @Param("mentor") Mentor mentor, @Param("period") Period period
    );
    
    public List<Visit> findByFacility_District_ProvinceAndVisitStatusAndPeriodOrderByStartDateDesc(
    Province province, VisitStatus visitStatus, Period period
    );
    
    @Query("from Visit v left join fetch v.mentors vm where :mentor in (vm) and v.facility.district.province=:province and v.visitStatus=:visitStatus and v.period=:period Order By v.startDate Desc")
    public List<Visit> findByFacility_District_ProvinceAndMentorAndVisitStatus(
    @Param("province") Province province, @Param("mentor") Mentor mentor, @Param("visitStatus") VisitStatus visitStatus, @Param("period") Period period
    );
    
    @Query("from Visit v left join fetch v.mentors vm where v.facility.district=:district and :mentor in (vm) and v.period=:period Order By v.startDate Desc")
    public List<Visit> findByFacility_DistrictAndMentor(@Param("district") District district, @Param("mentor") Mentor mentor, @Param("period") Period period);
    
    public List<Visit> findByFacility_DistrictAndVisitStatusAndPeriod(District district, VisitStatus visitStatus, Period period);
    
    @Query("from Visit v left join fetch v.mentors vm where :mentor in (vm) and v.facility.district=:district and v.visitStatus=:visitStatus and v.period=:period Order By v.startDate Desc")
    public List<Visit> findByFacility_DistrictAndMentorVisitStatus(@Param("district") District district, @Param("mentor") Mentor mentor,@Param("visitStatus") VisitStatus visitStatus, @Param("period") Period period);
    
    @Query("from Visit v left join fetch v.mentors vm where :mentor in (vm) and v.visitStatus=:visitStatus and v.period=:period Order By v.startDate Desc")
    public List<Visit> findByMentorAndVisitStatus(@Param("mentor") Mentor mentor, @Param("visitStatus") VisitStatus visitStatus, @Param("period") Period period);
    
    public List<Visit> findByVisitStatusIsNullAndPeriodOrderByStartDateDesc(Period period);
    
    @Query("from Visit v where v.visitStatus=:visitStatus and (v.startDate <= :start) Order By v.startDate Desc")
    public List<Visit> getLapsedVisits(@Param("visitStatus") VisitStatus visitStatus,@Param("start") Date start);
    
    public List<Visit> findByFacility_District_Province(Province province);
    
    @Query("from Visit v left join fetch v.mentors vm where v.facility.district.province=:province and :mentor in (vm)")
    public List<Visit> findByFacility_District_ProvinceAndMentor(@Param("province") Province province,@Param("mentor") Mentor mentor);
    
    public List<Visit> findByFacility_District_ProvinceAndVisitStatus(Province province, VisitStatus visitStatus);
    
    @Query("from Visit v left join fetch v.mentors vm where v.facility.district.province=:province and :mentor in (vm) and v.visitStatus=:visitStatus")
    public List<Visit> findByFacility_District_ProvinceAndMentorAndVisitStatus(@Param("province") Province province, @Param("mentor") Mentor mentor, @Param("visitStatus") VisitStatus visitStatus);
    
    public List<Visit> findByFacility_District(District district);
    
    @Query("from Visit v left join fetch v.mentors vm where v.facility.district=:district and :mentor in (vm)")
    public List<Visit> findByFacility_DistrictAndMentor(@Param("district") District district, @Param("mentor") Mentor mentor);
    
    public List<Visit> findByFacility_DistrictAndVisitStatus(District district, VisitStatus visitStatus);
    
    @Query("from Visit v left join fetch v.mentors vm where v.facility.district=:district and :mentor in (vm) and v.visitStatus=:visitStatus")
    public List<Visit> findByFacility_DistrictAndMentorAndVisitStatus(@Param("district") District district, @Param("mentor") Mentor mentor,@Param("visitStatus") VisitStatus visitStatus);
    
    @Query("from Visit v left join fetch v.mentors vm where :mentor in (vm)")
    public List<Visit> findByMentor(@Param("mentor") Mentor mentor);
    
    @Query("from Visit v left join fetch v.mentors vm where :mentor in (vm) and v.visitStatus=:visitStatus")
    public List<Visit> findByMentorAndVisitStatus(@Param("mentor") Mentor mentor,@Param("visitStatus") VisitStatus visitStatus);
    
    public List<Visit> findByVisitStatus(VisitStatus visitStatus);
}