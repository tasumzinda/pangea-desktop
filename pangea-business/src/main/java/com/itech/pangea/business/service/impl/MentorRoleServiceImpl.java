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
import com.itech.pangea.business.domain.MentorRole;
import com.itech.pangea.business.repo.MentorRoleRepo;
import com.itech.pangea.business.service.MentorRoleService;
import com.itech.pangea.business.service.UserService;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class MentorRoleServiceImpl implements MentorRoleService {
    
    @Resource
    private MentorRoleRepo mentorRoleRepo;
    @Resource
    private UserService userService;

    @Override
    public List<MentorRole> getAll() {
        return mentorRoleRepo.findByActiveOrderByNameAsc(Boolean.TRUE);
    }

    @Override
    public MentorRole get(Long id) {
        return mentorRoleRepo.findOne(id);
    }

    @Override
    public void delete(MentorRole t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        mentorRoleRepo.save(t);
    }

    @Override
    public List<MentorRole> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public MentorRole save(MentorRole t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
            t.setCreatedBy(userService.getCurrentUser());
            return mentorRoleRepo.save(t);
        }
        t.setDateModified(new Date());
        t.setModifiedBy(userService.getCurrentUser());
        return mentorRoleRepo.save(t);
    }

    @Override
    public Boolean checkDuplicate(MentorRole current, MentorRole old) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}