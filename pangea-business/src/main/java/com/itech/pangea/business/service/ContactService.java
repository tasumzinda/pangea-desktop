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

import java.util.List;
import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Tasu Muzinda
 */
public interface ContactService extends GenericService<Contact>{
    public List<Contact> getByIndex(IndexCaseTestingForm index);
    
     public Integer countByHivStatusEntry(SearchNationalDTO dto);
    
    public Integer countByHivStatusEntryAndInitiatedOnART(SearchNationalDTO dto);
    
    public Integer countByHivResult(SearchNationalDTO dto);
    
    public Integer getNewlyTestedContacts(SearchNationalDTO dto);
}
