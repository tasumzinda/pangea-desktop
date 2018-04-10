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
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.repo.IndexCaseTestingFormRepo;
import com.itech.pangea.business.service.IndexCaseTestingFormService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Tasu Muzinda
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class IndexCaseTestingFormServiceImpl implements IndexCaseTestingFormService{

    @Resource
    private UserService userService;
    @Resource
    private IndexCaseTestingFormRepo repo;

    @Override
    public List<IndexCaseTestingForm> getAll() {
        return repo.findAll();
    }

    @Override
    @Transactional
    public IndexCaseTestingForm save(IndexCaseTestingForm t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
           // t.setCreatedBy(userService.getCurrentUser());
            return repo.save(t);
        }
      //  t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return repo.save(t);
    }
    
    @Override
    public IndexCaseTestingForm get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist");
        }
        return repo.findOne(id);
    }

    @Override
    public void delete(IndexCaseTestingForm t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        repo.save(t);
    }

    @Override
    public List<IndexCaseTestingForm> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Boolean checkDuplicate(IndexCaseTestingForm current, IndexCaseTestingForm old){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IndexCaseTestingForm> findByUser(User createdBy) {
        return repo.findByCreatedBy(createdBy);
    }

}
