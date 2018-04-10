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

package com.itech.pangea.business.service;

import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.util.dto.SearchNationalDTO;
import java.util.List;

/**
 *
 * @author Tasu Muzinda
 */
public interface DefaulterTrackingFormService extends GenericService<DefaulterTrackingForm>{
    public Integer countByFinalOutcomeIsNotNull(SearchNationalDTO dto);
    public long count(SearchNationalDTO dto);
    public Integer countByFinalOutcome(SearchNationalDTO dto);
    public Integer countNumberOfDefaulters(SearchNationalDTO dto);
    public List<DefaulterTrackingForm> findByUser(User createdBy);
    
}
