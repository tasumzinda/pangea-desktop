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

import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.repo.FacilityRepo;
import com.itech.pangea.business.service.FacilityService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.DistrictDTO;
import com.itech.pangea.business.util.dto.FacilityDTO;
import com.itech.pangea.business.util.dto.NameIdDTO;
import com.itech.pangea.business.util.dto.SearchNationalDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class FacilityServiceImpl implements FacilityService {

    @Resource
    private FacilityRepo facilityRepo;
    @Resource
    private UserService userService;

    @Override
    public List<Facility> getAll() {
        return facilityRepo.getOptAll(Boolean.TRUE);
    }

    @Override
    public Facility get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist");
        }
        return facilityRepo.findOne(id);
    }

    @Override
    public void delete(Facility t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        facilityRepo.save(t);
    }

    @Override
    public List<Facility> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public Facility save(Facility t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return facilityRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return facilityRepo.save(t);
    }

    @Override
    public Boolean checkDuplicate(Facility current, Facility old) {
        if(current.getId() != null){
            /**
             * @param current is in existence
             */
            if(!current.getName().equalsIgnoreCase(old.getName())){
                if(getByDistrictAndName(current.getDistrict(), current.getName()) != null){
                    return true;
                }
            }
            
        }else if(current.getId() == null){
            /**
             * @param current is new
             */
            if(getByDistrictAndName(current.getDistrict(), current.getName()) != null){
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer getCount(SearchNationalDTO dto) {
        if (dto.getDistrict() != null) {
            return facilityRepo.getCountByDistrict(dto.getDistrict());
        } else if (dto.getProvince() != null) {
            return facilityRepo.getCountByProvince(dto.getProvince());
        }
        return facilityRepo.getCount();
    }

    @Override
    public List<Facility> getByDistrict(District district) {
        return facilityRepo.findByDistrict(district, Boolean.TRUE);
    }

    @Override
    public Facility getByDistrictAndName(District district, String name) {
        return facilityRepo.findByDistrictAndName(district, name);
    }

    @Override
    public List<NameIdDTO> getByParent(List<Facility> facilitys) {
        List<NameIdDTO> items = new ArrayList<>();
        for (Facility facility : facilitys) {
            items.add(new NameIdDTO(facility.getName(), facility.getId()));
        }
        return items;
    }

    @Override
    public List<Facility> getByMentorAndDistrict(Mentor mentor) {
        List<Facility> items = new ArrayList<>();
        for (District district : mentor.getDistricts()) {
            for (Facility f : getByDistrict(district)) {
                items.add(f);
            }
        }
        return items;
    }

    @Override
    public List<Facility> get(SearchNationalDTO dto) {
        if(dto.getDistrict() != null){
            return getByDistrict(dto.getDistrict());
        }else if(dto.getProvince() != null){
            return facilityRepo.getByProvince(dto.getProvince(), Boolean.TRUE);
        }
        return getAll();
    }

    @Override
    public List<Facility> getByProvince(Province province) {
        return facilityRepo.getByProvince(province, Boolean.TRUE);
    }

    @Override
    public Facility getByDhisName(String name) {
        return facilityRepo.findByDhisName(name);
    }

    
    @Override
    public List<FacilityDTO> getFacilities(){
        List<FacilityDTO> list = new ArrayList<>();
        for(Facility item : getAll()){
            list.add(new FacilityDTO(item.getName(), item.getId(), item.getFacilityCode(), item.getContactName(), item.getContactMobileNumber(), item.getContactEmail(), new DistrictDTO(item.getDistrict().getName(), item.getDistrict().getId(), new NameIdDTO(item.getDistrict().getProvince().getName(), item.getDistrict().getProvince().getId()))));
        }
        return list;
    }
}