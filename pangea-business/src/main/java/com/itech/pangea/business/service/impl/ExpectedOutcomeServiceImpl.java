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
import com.itech.pangea.business.domain.ExpectedOutcome;
import com.itech.pangea.business.repo.ExpectedOutcomeRepo;
import com.itech.pangea.business.service.ExpectedOutcomeService;
import com.itech.pangea.business.service.UserService;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class ExpectedOutcomeServiceImpl implements ExpectedOutcomeService {
    
    @Resource
    private ExpectedOutcomeRepo expectedOutcomeRepo;
    @Resource
    private UserService userService;

    @Override
    public List<ExpectedOutcome> getAll() {
        return expectedOutcomeRepo.findByActive(Boolean.TRUE);
    }

    @Override
    public ExpectedOutcome get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist :" + id);
        }
        return expectedOutcomeRepo.findOne(id);
    }

    @Override
    public void delete(ExpectedOutcome t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        expectedOutcomeRepo.save(t);
    }

    @Override
    public List<ExpectedOutcome> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpectedOutcome save(ExpectedOutcome t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return expectedOutcomeRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return expectedOutcomeRepo.save(t);
    }

    @Override
    public ExpectedOutcome getByName(String name) {
        return expectedOutcomeRepo.findByName(name);
    }

    @Override
    public Boolean checkDuplicate(ExpectedOutcome current, ExpectedOutcome old) {
        if (current.getId() != null) {
            /**
             * @param current is in existence
             */
            if (!current.getName().equals(old.getName())) {
                if (getByName(current.getName()) != null) {
                    return true;
                }
            }

        } else if (current.getId() == null) {
            /**
             * @param current is new
             */
            if (getByName(current.getName()) != null) {
                return true;
            }
        }
        return false;
    }
}