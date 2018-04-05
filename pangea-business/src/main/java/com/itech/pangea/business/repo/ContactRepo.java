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
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.util.HIVResult;
import com.itech.pangea.business.domain.util.ReasonForIneligibilityForTesting;
import com.itech.pangea.business.domain.util.YesNo;

/**
 *
 * @author Tasu Muzinda
 */
public interface ContactRepo extends AbstractRepo<Contact, Long>{

    public List<Contact> findByIndexCaseTestingForm(IndexCaseTestingForm indexCaseTestingForm);
    
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.province=:province and m.hivStatusEntry=:hivStatusEntry")
    public Integer countByProvinceAndHivStatusEntry(@Param("province") Province province, @Param("hivStatusEntry") ReasonForIneligibilityForTesting hivStatusEntry);
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.district=:district and m.hivStatusEntry=:hivStatusEntry")
    public Integer countByDistrictAndHivStatusEntry(@Param("district") District district, @Param("hivStatusEntry") ReasonForIneligibilityForTesting hivStatusEntry);
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.facility=:facility and m.hivStatusEntry=:hivStatusEntry")
    public Integer countByFacilityAndHivStatusEntry(@Param("facility") Facility facility, @Param("hivStatusEntry") ReasonForIneligibilityForTesting hivStatusEntry);
    public Integer countByHivStatusEntry(@Param("hivStatusEntry") ReasonForIneligibilityForTesting hivStatusEntry);
    
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.province=:province and m.hivStatusEntry=:hivStatusEntry and onART=:onART")
    public Integer countByProvinceAndHivStatusEntryAndOnART(@Param("province") Province province, @Param("hivStatusEntry") ReasonForIneligibilityForTesting hivStatusEntry, @Param("onART") YesNo onART);
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.district=:district and m.hivStatusEntry=:hivStatusEntry and onART=:onART")
    public Integer countByDistrictAndHivStatusEntryAndOnART(@Param("district") District district, @Param("hivStatusEntry") ReasonForIneligibilityForTesting hivStatusEntry, @Param("onART") YesNo onART);
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.facility=:facility and m.hivStatusEntry=:hivStatusEntry and onART=:onART")
    public Integer countByFacilityAndHivStatusEntryAndOnART(@Param("facility") Facility facility, @Param("hivStatusEntry") ReasonForIneligibilityForTesting hivStatusEntry, @Param("onART") YesNo onART);
    public Integer countByHivStatusEntryAndOnART(@Param("hivStatusEntry") ReasonForIneligibilityForTesting hivStatusEntry, @Param("onART") YesNo onART);
    
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.province=:province and m.hivResult=:hivResult")
    public Integer countByProvinceAndHivResult(@Param("province") Province province, @Param("hivResult") HIVResult hivResult);
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.district=:district and m.hivResult=:hivResult")
    public Integer countByDistrictAndHivResult(@Param("district") District district, @Param("hivResult") HIVResult hivResult);
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.facility=:facility and m.hivResult=:hivResult")
    public Integer countByFacilityAndHivResult(@Param("facility") Facility facility, @Param("hivResult") HIVResult hivResult);
    public Integer countByHivResult(@Param("hivResult") HIVResult hivResult);
    
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.province=:province and m.contactTestedDate is not null")
    public Integer countByProvinceAndContactTestedDateIsNotNull(@Param("province") Province province);
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.district=:district and m.contactTestedDate is not null")
    public Integer countByDistrictAndContactTestedDateIsNotNull(@Param("district") District district);
    @Query("select count(m) from Contact m where m.indexCaseTestingForm.facility=:facility and m.contactTestedDate is not null")
    public Integer countByFacilityAndContactTestedDateIsNotNull(@Param("facility") Facility facility);
    public Integer countByContactTestedDateIsNotNull();
}
