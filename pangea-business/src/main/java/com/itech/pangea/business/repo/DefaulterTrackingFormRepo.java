/*
 * Copyright 2018 tasu.
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
import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.CallOutcome;

/**
 *
 * @author Tasu Muzinda
 */
public interface DefaulterTrackingFormRepo extends AbstractRepo<DefaulterTrackingForm, Long>{

    public Integer countByProvinceAndFinalOutcomeIsNotNull(Province province);
    public Integer countByDistrictAndFinalOutcomeIsNotNull(District district);
    public Integer countByFacilityAndFinalOutcomeIsNotNull(Facility facility);
    public Integer countByFinalOutcomeIsNotNull();
    
    public long countByProvince(Province province);
    public long countByDistrict(District district);
    public long countByFacility(Facility facility);
    
    public List<DefaulterTrackingForm> findByProvince(Province province);
    public List<DefaulterTrackingForm> findByDistrict(District district);
    public List<DefaulterTrackingForm> findByFacility(Facility facility);
    
    public Integer countByProvinceAndFinalOutcome(Province province, CallOutcome callOutcome);
    public Integer countByDistrictAndFinalOutcome(District district, CallOutcome callOutcome);
    public Integer countByFacilityAndFinalOutcome(Facility facility, CallOutcome callOutcome);
    public Integer countByFinalOutcome(CallOutcome callOutcome);
    
    public List<DefaulterTrackingForm> findByCreatedBy(User createdBy);
}
