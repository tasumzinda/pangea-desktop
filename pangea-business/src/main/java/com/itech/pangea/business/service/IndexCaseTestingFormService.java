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

import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.User;
import java.util.List;

/**
 *
 * @author Tasu Muzinda
 */
public interface IndexCaseTestingFormService extends GenericService<IndexCaseTestingForm>{
   public List<IndexCaseTestingForm> findByUser(User createdBy);
}
