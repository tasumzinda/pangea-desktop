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

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.MentorVisitReport;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.MentorVisitStatus;

/**
 *
 * @author Judge Muzinda
 */
public interface MentorVisitReportRepo extends AbstractRepo<MentorVisitReport, Long> {

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.facility.district.province=:province and m.active=:active order by m.dateCreated DESC")
    public List<MentorVisitReport> getByProvince(@Param("province") Province province, @Param("active") Boolean active);

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.facility.district=:district and m.active=:active order by m.dateCreated DESC")
    public List<MentorVisitReport> getByDistrict(@Param("district") District district, @Param("active") Boolean active);

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.facility=:facility and m.active=:active order by m.dateCreated DESC")
    public List<MentorVisitReport> getByFacility(@Param("facility") Facility facility, @Param("active") Boolean active);

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.active=:active order by m.dateCreated DESC")
    public List<MentorVisitReport> getByNational(@Param("active") Boolean active);

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.facility.district.province=:province and m.active=:active and (m.dateCreated between :startDate and :endDate) order by m.dateCreated DESC")
    public List<MentorVisitReport> getByProvinceAndDateRange(@Param("province") Province province, @Param("active") Boolean active, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.facility.district=:district and m.active=:active and (m.dateCreated between :startDate and :endDate) order by m.dateCreated DESC")
    public List<MentorVisitReport> getByDistrictAndDateRange(@Param("district") District district, @Param("active") Boolean active, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.facility=:facility and m.active=:active and (m.dateCreated between :startDate and :endDate) order by m.dateCreated DESC")
    public List<MentorVisitReport> getByFacilityAndDateRange(@Param("facility") Facility facility, @Param("active") Boolean active, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.facility.district.province=:province and m.active=:active and m.createdBy=:createdBy and (m.dateCreated between :startDate and :endDate) order by m.dateCreated DESC")
    public List<MentorVisitReport> getByProvinceAndMentorAndDateRange(@Param("province") Province province, @Param("active") Boolean active, @Param("createdBy") User createdBy, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.facility.district=:district and m.active=:active and m.createdBy=:createdBy and (m.dateCreated between :startDate and :endDate) order by m.dateCreated DESC")
    public List<MentorVisitReport> getByDistrictAndMentorAndDateRange(@Param("district") District district, @Param("active") Boolean active, @Param("createdBy") User createdBy, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.facility=:facility and m.active=:active and m.createdBy=:createdBy and (m.dateCreated between :startDate and :endDate) order by m.dateCreated DESC")
    public List<MentorVisitReport> getByFacilityAndMentorAndDateRange(@Param("facility") Facility facility, @Param("active") Boolean active, @Param("createdBy") User createdBy, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.active=:active and (m.dateCreated between :startDate and :endDate) order by m.dateCreated DESC")
    public List<MentorVisitReport> getByDateRange(@Param("active") Boolean active, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("select count(m) from MentorVisitReport m where m.caseFile.facility.district=:district and (m.startDate between :startDate and :endDate) and m.active=:active")
    public Integer findCountByDistrictAndPeriod(@Param("district") District district, @Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("active") Boolean active);

    @Query("select count(m) from MentorVisitReport m where m.caseFile.facility.district=:district and m.caseFile.period=:period and m.active=:active and m.mentorVisitStatus=:mentorVisitStatus")
    public Integer findCountByDistrictAndPeriodAndStatus(@Param("district") District district, @Param("period") Period period, @Param("active") Boolean active, @Param("mentorVisitStatus") MentorVisitStatus mentorVisitStatus);

    @Query("select count(m) from MentorVisitReport m where m.caseFile.facility=:facility and m.caseFile.period=:period and m.active=:active and m.mentorVisitStatus=:mentorVisitStatus")
    public Integer findCountByFacilityAndPeriodAndStatus(@Param("facility") Facility facility, @Param("period") Period period, @Param("active") Boolean active, @Param("mentorVisitStatus") MentorVisitStatus mentorVisitStatus);

    @Query("select count(m) from MentorVisitReport m where m.caseFile.facility.district.province=:province and m.caseFile.period=:period and m.active=:active and m.mentorVisitStatus=:mentorVisitStatus")
    public Integer findCountByProvinceAndPeriod(@Param("province") Province province, @Param("period") Period period, @Param("active") Boolean active, @Param("mentorVisitStatus") MentorVisitStatus mentorVisitStatus);

    //@Query("select count(m) from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.facility.district=:district and m.caseFile.period=:period and m.active=:active and m.mentorShipFocusArea in :focusAreas")
    //public Integer findCountByDistrictAndPeriodAndFocusArea(@Param("district") District district, @Param("period") Period period, @Param("active") Boolean active, @Param("focusAreas") Set<MentorShipFocusArea> focusAreas);
    @Query("select count(m) from MentorVisitReport m where m.caseFile.period=:period and m.active=:active and m.mentorVisitStatus=:mentorVisitStatus")
    public Integer findCountByPeriod(@Param("period") Period period, @Param("active") Boolean active, @Param("mentorVisitStatus") MentorVisitStatus mentorVisitStatus);

    //@Query("select count(m) from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.period=:period and m.active=:active and m.mentorShipFocusArea in :focusAreas")
    //public Integer findCountByPeriodAndFocusArea(@Param("period") Period period, @Param("active") Boolean active, @Param("focusAreas") Set<MentorShipFocusArea> focusAreas);
    public List<MentorVisitReport> findByMentorVisitStatusIsNull();

    @Query("Select Distinct m from MentorVisitReport m left join fetch m.mentorShipFocusAreas left join fetch m.caseFile where m.caseFile.period=:period and m.active=:active and m.createdBy=:createdBy order by m.dateCreated DESC")
    public List<MentorVisitReport> getByPeriodAndMentor(@Param("period") Period period, @Param("active") Boolean active, @Param("createdBy") User createdBy);
}
