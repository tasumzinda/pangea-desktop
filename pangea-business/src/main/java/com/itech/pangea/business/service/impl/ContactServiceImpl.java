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
import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.repo.ContactRepo;
import com.itech.pangea.business.service.ContactService;
import com.itech.pangea.business.service.UserService;

/**
 *
 * @author Tasu Muzinda
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class ContactServiceImpl implements ContactService {

    @Resource
    private UserService userService;
    @Resource
    private ContactRepo repo;

    @Override
    public List<Contact> getAll() {
        return repo.findAll();
    }

    @Override
    @Transactional
    public Contact save(Contact t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
          //  t.setCreatedBy(userService.getCurrentUser());
            System.err.println("*************************************");
            System.err.println("Inside if ");
            System.err.println("*************************************");
            return repo.save(t);
        }
      //  t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        System.err.println("*************************************");
        System.err.println("Outside");
        System.err.println("*************************************");
        return repo.save(t);
    }

    @Override
    public Contact get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist");
        }
        return repo.findOne(id);
    }

    @Override
    public void delete(Contact t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        repo.save(t);
    }

    @Override
    public List<Contact> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean checkDuplicate(Contact current, Contact old) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contact> getByIndex(IndexCaseTestingForm index) {
        return repo.findByIndexCaseTestingForm(index);
    }
    
   

    @Override
    public List<Contact> findByUser(User createdBy) {
       return repo.findByCreatedBy(createdBy);
    }
}
