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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Mentee;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.repo.MenteeRepo;
import com.itech.pangea.business.service.MenteeService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.NameIdDTO;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class MenteeServiceImpl implements MenteeService {
    
    @Resource
    private MenteeRepo menteeRepo;
    @Resource
    private UserService userService;

    @Override
    public List<Mentee> getAll() {
        return menteeRepo.findByActive(Boolean.TRUE);
    }

    @Override
    public Mentee get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist :" + id);
        }
        return menteeRepo.findOne(id);
    }

    @Override
    public void delete(Mentee t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        menteeRepo.save(t);
    }

    @Override
    public List<Mentee> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mentee save(Mentee t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return menteeRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return menteeRepo.save(t);
    }
    
    @Override
    public Boolean checkDuplicate(Mentee current, Mentee old) {
        throw new UnsupportedOperationException("Implement method");
    }

    @Override
    public List<Mentee> getByFacility(Facility facility) {
        return menteeRepo.findByFacility(facility);
    }

    @Override
    public List<NameIdDTO> getByParent(List<Mentee> mentees) {
        List<NameIdDTO> items = new ArrayList<>();
        for(Mentee mentee : mentees){
            items.add(new NameIdDTO(mentee.getName(), mentee.getId()));
        }
        return items;
    }

    @Override
    public List<Mentee> get(SearchNationalDTO dto) {
        if(dto.getDistrict() != null){
            return menteeRepo.getByDistrict(dto.getDistrict(), Boolean.TRUE);
        }else if(dto.getProvince() != null){
            return menteeRepo.getByProvince(dto.getProvince(), Boolean.TRUE);
        }
        return getAll();
    }

    @Override
    public List<Mentee> getByProvince(Province province) {
        return menteeRepo.getByProvince(province, Boolean.TRUE);
    }
    
}