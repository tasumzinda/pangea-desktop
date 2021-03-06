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
package com.itech.pangea.business.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.CaseFile;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.repo.CaseFileRepo;
import com.itech.pangea.business.service.CaseFileService;
import com.itech.pangea.business.service.PeriodService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.DateUtil;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class CaseFileServiceImpl implements CaseFileService {

    @Resource
    private CaseFileRepo caseFileRepo;
    @Resource
    private UserService userService;
    @Resource
    private PeriodService periodService;

    @Override
    public List<CaseFile> getAll() {
        return caseFileRepo.findByActive(Boolean.TRUE);
    }

    @Override
    public CaseFile get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item does not exist :" + id);
        }
        return caseFileRepo.findOne(id);
    }

    @Override
    public void delete(CaseFile t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        caseFileRepo.save(t);
    }

    @Override
    public List<CaseFile> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public CaseFile save(CaseFile t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            if (periodService.getByStartDate(DateUtil.getPeriodStart(t.getDateSubmitted())) != null) {
                t.setPeriod(periodService.getByStartDate(DateUtil.getPeriodStart(t.getDateSubmitted())));
            } else {
                //create period
                Period p = periodService.save(periodService.constructPeriod(t.getDateSubmitted()));
                t.setPeriod(p);
            }
            return caseFileRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return caseFileRepo.save(t);
    }

    @Override
    public Boolean checkDuplicate(CaseFile current, CaseFile old) {
        throw new UnsupportedOperationException("Operation not yet implemented");
    }

    @Override
    public List<CaseFile> getByFacility(Facility facility) {
        return caseFileRepo.findByFacility(facility);
    }

}
