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

import java.util.List;
import org.springframework.data.repository.query.Param;
import com.itech.pangea.business.domain.ClinicalTool6;
import com.itech.pangea.business.domain.Mentee;

/**
 *
 * @author Judge Muzinda
 */
public interface ClinicalTool6Repo extends ClinicalToolRepo<ClinicalTool6, Long> {
    
    List<ClinicalTool6> findByActiveAndMenteeOrderByEntryDateDesc(@Param("active") Boolean active, @Param("mentee") Mentee mentee);
}