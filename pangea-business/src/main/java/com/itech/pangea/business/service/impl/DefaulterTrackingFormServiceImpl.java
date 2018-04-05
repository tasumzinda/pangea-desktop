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
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.repo.DefaulterTrackingFormRepo;
import com.itech.pangea.business.service.DefaulterTrackingFormService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Tasu Muzinda
 */
@Repository
@Transactional(readOnly = true)
public class DefaulterTrackingFormServiceImpl implements DefaulterTrackingFormService{
    @Resource
    private DefaulterTrackingFormRepo defaulterTrackingFormRepo;
    @Resource
    private UserService userService;

    @Override
    public List<DefaulterTrackingForm> getAll() {
        return defaulterTrackingFormRepo.findAll();
    }
    @Override
    public Integer countNumberOfDefaulters(SearchNationalDTO dto){
        if(dto.getFacility() != null){
            return count(defaulterTrackingFormRepo.findByFacility(dto.getFacility()));
        }     
        if(dto.getDistrict() != null){
            return count(defaulterTrackingFormRepo.findByDistrict(dto.getDistrict()));
        }
        if(dto.getProvince() != null){
            return count(defaulterTrackingFormRepo.findByProvince(dto.getProvince()));
        }
        else{
             return count(getAll());
         }
    }
    
    public Integer count(List<DefaulterTrackingForm> list){ 
        Integer count = 0;
        for(DefaulterTrackingForm item : list){
            if(item.getDateOfCall1() != null || item.getDateOfCall2() != null || item.getDateOfCall3() != null || item.getDateOfVisit() != null){
                count++;
            }
        }
        return count;
   }
    
    @Override
    @Transactional
    public DefaulterTrackingForm save(DefaulterTrackingForm t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
            t.setCreatedBy(userService.getCurrentUser());
            return defaulterTrackingFormRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return defaulterTrackingFormRepo.save(t);
    }
    
    @Override
    public DefaulterTrackingForm get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist");
        }
        return defaulterTrackingFormRepo.findOne(id);
    }

    @Override
    public void delete(DefaulterTrackingForm t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        defaulterTrackingFormRepo.save(t);
    }

    @Override
    public List<DefaulterTrackingForm> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Boolean checkDuplicate(DefaulterTrackingForm current, DefaulterTrackingForm old){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer countByFinalOutcomeIsNotNull(SearchNationalDTO dto) {
        if(dto.getFacility() != null){
            return defaulterTrackingFormRepo.countByFacilityAndFinalOutcomeIsNotNull(dto.getFacility());
        }else if(dto.getDistrict() != null){
            return defaulterTrackingFormRepo.countByDistrictAndFinalOutcomeIsNotNull(dto.getDistrict());
        }else if(dto.getProvince() != null){
            return defaulterTrackingFormRepo.countByProvinceAndFinalOutcomeIsNotNull(dto.getProvince());
        }
        return defaulterTrackingFormRepo.countByFinalOutcomeIsNotNull();
    }

    @Override
    public long count(SearchNationalDTO dto) {
        if(dto.getFacility() != null){
            return defaulterTrackingFormRepo.countByFacility(dto.getFacility());
        }else if(dto.getDistrict() != null){
            return defaulterTrackingFormRepo.countByDistrict(dto.getDistrict());
        }else if(dto.getProvince() != null){
            return defaulterTrackingFormRepo.countByProvince(dto.getProvince());
        }
        return defaulterTrackingFormRepo.count();
    }

    @Override
    public Integer countByFinalOutcome(SearchNationalDTO dto) {
        if(dto.getFacility() != null){
            return defaulterTrackingFormRepo.countByFacilityAndFinalOutcome(dto.getFacility(), dto.getCallOutcome());
        }else if(dto.getDistrict() != null){
            return defaulterTrackingFormRepo.countByDistrictAndFinalOutcome(dto.getDistrict(), dto.getCallOutcome());
        }else if(dto.getProvince() != null){
            return defaulterTrackingFormRepo.countByProvinceAndFinalOutcome(dto.getProvince(), dto.getCallOutcome());
        }
        return defaulterTrackingFormRepo.countByFinalOutcome(dto.getCallOutcome());
    }
    
    
}
