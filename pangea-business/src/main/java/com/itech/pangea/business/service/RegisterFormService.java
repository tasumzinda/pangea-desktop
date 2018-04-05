/*
 * Copyright 2016 jmuzinda.
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

import com.itech.pangea.business.domain.RegisterForm;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author jmuzinda
 */
public interface RegisterFormService extends GenericDSDService<RegisterForm>{
    public Long get(SearchNationalDTO dto, String colName);
    
    public RegisterForm get(Long id);
    
    public void delete(RegisterForm t);
}