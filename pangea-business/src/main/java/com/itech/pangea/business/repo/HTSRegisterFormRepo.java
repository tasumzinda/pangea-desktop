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
import org.springframework.data.repository.CrudRepository;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.HTSRegisterForm;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.util.HIVResult;
import com.itech.pangea.business.domain.util.ReasonForIneligibilityForTesting;
import com.itech.pangea.business.domain.util.YesNo;

/**
 *
 * @author Tasu Muzinda
 */
public interface HTSRegisterFormRepo extends CrudRepository<HTSRegisterForm, Long>{
    @Override
    public List<HTSRegisterForm> findAll();
    
    public Integer countByFinalResultAndInitiatedOnArt(ReasonForIneligibilityForTesting finalResult, YesNo initiatedOnArt);
    
    public Integer countByFinalResult(HIVResult finalResult);
    public Integer countByFacilityAndFinalResult(Facility facility, HIVResult finalResult);
    public Integer countByDistrictAndFinalResult(District district, HIVResult finalResult);
    public Integer countByProvinceAndFinalResult(Province province, HIVResult finalResult);
    
    
    
}
