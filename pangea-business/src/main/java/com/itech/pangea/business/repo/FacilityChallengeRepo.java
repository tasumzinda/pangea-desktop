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
import com.itech.pangea.business.domain.CaseFile;
import com.itech.pangea.business.domain.ChallengeStatus;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.FacilityChallenge;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.domain.Province;

/**
 *
 * @author Judge Muzinda
 */
public interface FacilityChallengeRepo extends AbstractRepo<FacilityChallenge, Long> {
    
    @Query("Select DISTINCT(m) from FacilityChallenge m where m.caseFile.facility.district.province=:province and m.active=:active order by m.dateCreated DESC")
    public List<FacilityChallenge> getByProvince(@Param("province") Province province, @Param("active") Boolean active);
    
    @Query("Select DISTINCT(m) from FacilityChallenge m where m.caseFile.facility.district=:district and m.active=:active order by m.dateCreated DESC")
    public List<FacilityChallenge> getByDistrict(@Param("district") District district, @Param("active") Boolean active);
    
    @Query("Select DISTINCT(m) from FacilityChallenge m where m.caseFile.facility=:facility and m.active=:active order by m.dateCreated DESC")
    public List<FacilityChallenge> getByFacility(@Param("facility") Facility facility, @Param("active") Boolean active);
    
    @Query("Select DISTINCT(m) from FacilityChallenge m where m.active=:active order by m.dateCreated DESC")
    public List<FacilityChallenge> getByNational(@Param("active") Boolean active);
    
    @Query("Select DISTINCT(m) from FacilityChallenge m where m.caseFile.facility.district.province=:province and m.active=:active and m.challengeStatus =:challengeStatus order by m.dateCreated DESC")
    public List<FacilityChallenge> getByProvinceAndChallengeStatus(@Param("province") Province province, @Param("active") Boolean active, @Param("challengeStatus") ChallengeStatus challengeStatus);
    
    @Query("Select DISTINCT(m) from FacilityChallenge m where m.active=:active and m.challengeStatus =:challengeStatus order by m.dateCreated DESC")
    public List<FacilityChallenge> getByChallengeStatus(@Param("active") Boolean active, @Param("challengeStatus") ChallengeStatus challengeStatus);
    
    @Query("Select DISTINCT(m) from FacilityChallenge m where m.caseFile.facility.district=:district and m.active=:active and m.challengeStatus =:challengeStatus order by m.dateCreated DESC")
    public List<FacilityChallenge> getByDistrictAndChallengeStatus(@Param("district") District district, @Param("active") Boolean active, @Param("challengeStatus") ChallengeStatus challengeStatus);
    
    @Query("Select DISTINCT(m) from FacilityChallenge m where m.caseFile.facility=:facility and m.active=:active and m.challengeStatus =:challengeStatus order by m.dateCreated DESC")
    public List<FacilityChallenge> getByFacilityAndChallengeStatus(@Param("facility") Facility facility, @Param("active") Boolean active, @Param("challengeStatus") ChallengeStatus challengeStatus);
    
    @Query("Select DISTINCT(m) from FacilityChallenge m where m.active=:active and m.challengeStatus =:challengeStatus order by m.dateCreated DESC")
    public List<FacilityChallenge> getByNationalAndChallengeStatus(@Param("active") Boolean active, @Param("challengeStatus") ChallengeStatus challengeStatus);
    
    public List<FacilityChallenge> findByCaseFile_FacilityAndActive(@Param("facility") Facility facility, @Param("active") Boolean active);
    
    public List<FacilityChallenge> findByCaseFile_FacilityAndChallengeStatusAndActive(@Param("facility") Facility facility, @Param("challengeStatus") ChallengeStatus challengeStatus, @Param("active") Boolean active);
    
    public List<FacilityChallenge> findByActiveAndParentIsNull(@Param("active") Boolean active);
    
    public FacilityChallenge findByActiveAndParent(@Param("active") Boolean active, @Param("parent") FacilityChallenge parent );
    
    @Query("select count(f) from FacilityChallenge f where f.caseFile.facility.district=:district and f.caseFile.period=:period and f.active=:active and f.challengeStatus =:challengeStatus and (f.caseFile.dateSubmitted between :startDate and :endDate)")
    public Integer findCountByDistrictAndPeriod(@Param("district") District district, @Param("period") Period period, @Param("active") Boolean active,@Param("challengeStatus") ChallengeStatus challengeStatus, @Param("startDate") Date startDate, @Param("endDate") Date endDate);
    
    @Query("select count(f) from FacilityChallenge f where f.caseFile.period=:period and f.active=:active and f.challengeStatus =:challengeStatus and (f.caseFile.dateSubmitted between :startDate and :endDate)")
    public Integer findCountByPeriod(@Param("period") Period period, @Param("active") Boolean active, @Param("challengeStatus") ChallengeStatus challengeStatus, @Param("startDate") Date startDate, @Param("endDate") Date endDate);
    
    public List<FacilityChallenge> findByCaseFile(CaseFile caseFile);
}