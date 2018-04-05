/*
 * Copyright 2015 Judge Muzinda.
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
import com.itech.pangea.business.domain.VisitFailReason;
import com.itech.pangea.business.repo.VisitFailReasonRepo;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.service.VisitFailReasonService;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class VisitFailReasonServiceImpl implements VisitFailReasonService {
    
    @Resource
    private VisitFailReasonRepo visitFailReasonRepo;
    @Resource
    private UserService userService;

    @Override
    public List<VisitFailReason> getAll() {
        return visitFailReasonRepo.findByActiveOrderByNameAsc(Boolean.TRUE);
    }

    @Override
    public VisitFailReason get(Long id) {
        return visitFailReasonRepo.findOne(id);
    }

    @Override
    public void delete(VisitFailReason t) {
         if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        visitFailReasonRepo.save(t);
    }

    @Override
    public List<VisitFailReason> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public VisitFailReason save(VisitFailReason t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return visitFailReasonRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return visitFailReasonRepo.save(t);
    }

    @Override
    public Boolean checkDuplicate(VisitFailReason current, VisitFailReason old) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}