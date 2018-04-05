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

package com.itech.pangea.business.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.MRFPMTCTEIDForm;
import com.itech.pangea.business.repo.MRFPMTCTEIDFormRepo;
import com.itech.pangea.business.service.MRFPMTCTEIDFormService;
import com.itech.pangea.business.service.UserService;

/**
 *
 * @author Tasu Muzinda
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class MRFPMTCTEIDFormServiceImpl implements MRFPMTCTEIDFormService{

    @Resource
    private MRFPMTCTEIDFormRepo repo;
    @Resource
    private UserService userService;
    
    @Override
    public List<MRFPMTCTEIDForm> getAll() {
        return repo.findAll();
    }

    @Override
    @Transactional
    public MRFPMTCTEIDForm save(MRFPMTCTEIDForm t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
            t.setCreatedBy(userService.getCurrentUser());
            return repo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return repo.save(t);
    }
    
    @Override
    public MRFPMTCTEIDForm get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist");
        }
        return repo.findOne(id);
    }

    @Override
    public void delete(MRFPMTCTEIDForm t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        repo.save(t);
    }

    @Override
    public List<MRFPMTCTEIDForm> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Boolean checkDuplicate(MRFPMTCTEIDForm current, MRFPMTCTEIDForm old){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
