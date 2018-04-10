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
import com.itech.pangea.business.repo.ContactRepo;
import com.itech.pangea.business.service.ContactService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

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
    public Integer countByHivStatusEntry(SearchNationalDTO dto) {
        if(dto.getFacility() != null){
            return repo.countByFacilityAndHivStatusEntry(dto.getFacility(), dto.getHivStatusEntry());
        }else if(dto.getDistrict()!= null){
            return repo.countByDistrictAndHivStatusEntry(dto.getDistrict(), dto.getHivStatusEntry());
        }else if(dto.getProvince()!= null){
            return repo.countByProvinceAndHivStatusEntry(dto.getProvince(), dto.getHivStatusEntry());
        }
        return repo.countByHivStatusEntry(dto.getHivStatusEntry());
    }

    @Override
    public Integer countByHivStatusEntryAndInitiatedOnART(SearchNationalDTO dto) {
        if(dto.getFacility() != null){
            return repo.countByFacilityAndHivStatusEntryAndOnART(dto.getFacility(), dto.getHivStatusEntry(), dto.getInitiatedOnART());
        }else if(dto.getDistrict()!= null){
            return repo.countByDistrictAndHivStatusEntryAndOnART(dto.getDistrict(), dto.getHivStatusEntry(), dto.getInitiatedOnART());
        }else if(dto.getProvince()!= null){
            return repo.countByProvinceAndHivStatusEntryAndOnART(dto.getProvince(), dto.getHivStatusEntry(), dto.getInitiatedOnART());
        }
        return repo.countByHivStatusEntryAndOnART(dto.getHivStatusEntry(), dto.getInitiatedOnART());
    }

    @Override
    public Integer countByHivResult(SearchNationalDTO dto) {
        if(dto.getFacility() != null){
            return repo.countByFacilityAndHivResult(dto.getFacility(), dto.getHivResult());
        }else if(dto.getDistrict()!= null){
            return repo.countByDistrictAndHivResult(dto.getDistrict(), dto.getHivResult());
        }else if(dto.getProvince()!= null){
            return repo.countByProvinceAndHivResult(dto.getProvince(), dto.getHivResult());
        }
        return repo.countByHivResult(dto.getHivResult());
    }
    
    @Override
    public Integer getNewlyTestedContacts(SearchNationalDTO dto){
        if(dto.getFacility() != null){
            return repo.countByFacilityAndContactTestedDateIsNotNull(dto.getFacility());
        }else if(dto.getDistrict() != null){
            return repo.countByDistrictAndContactTestedDateIsNotNull(dto.getDistrict());
        }else if(dto.getProvince() != null){
            return repo.countByProvinceAndContactTestedDateIsNotNull(dto.getProvince());
        }
        return repo.countByContactTestedDateIsNotNull();
    }
}
