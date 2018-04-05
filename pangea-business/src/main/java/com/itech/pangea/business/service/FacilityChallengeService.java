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
package com.itech.pangea.business.service;

import java.util.List;
import com.itech.pangea.business.domain.ChallengeStatus;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.FacilityChallenge;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
public interface FacilityChallengeService extends GenericService<FacilityChallenge> {
    
    public List<FacilityChallenge> get(SearchNationalDTO dto);
    
    public List<FacilityChallenge> getByFacility(Facility facility);
    
    public List<FacilityChallenge> getByFacilityAndChallenge(Facility facility,ChallengeStatus challengeStatus);
    
    public FacilityChallenge getByParent(FacilityChallenge parent);
    
    public List<FacilityChallenge> getFirstLevel();
    
    public List<FacilityChallenge> getFacilityChallengeChain(FacilityChallenge facilityChallenge);
    
    public Integer getVisitCount(SearchNationalDTO dto, Integer startDay, Integer endDay);
}