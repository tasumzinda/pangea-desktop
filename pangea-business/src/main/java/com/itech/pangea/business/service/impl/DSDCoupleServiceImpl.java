/*
 * Copyright 2016 Tasunungurwa Muzinda.
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

package com.itech.pangea.business.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.DSDCouple;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.repo.DSDCoupleRepo;
import com.itech.pangea.business.service.DSDCoupleService;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Repository
@Transactional(readOnly = true)
public class DSDCoupleServiceImpl implements DSDCoupleService{
    
    @Resource
    private DSDCoupleRepo dsdCoupleRepo;
    
    @Override
    public List<DSDCouple> getAll(){
        return dsdCoupleRepo.findAll();
    }
    
    @Override
    @Transactional
    public DSDCouple save(DSDCouple t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
            return dsdCoupleRepo.save(t);
        }
        t.setDateModified(new Date());
        return dsdCoupleRepo.save(t);
    }
}