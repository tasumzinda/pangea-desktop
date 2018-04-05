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
import com.itech.pangea.business.domain.ClinicalTool6;
import com.itech.pangea.business.domain.Mentee;
import com.itech.pangea.business.repo.ClinicalTool6Repo;
import com.itech.pangea.business.service.ClinicalTool6Service;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class ClinicalTool6ServiceImpl implements ClinicalTool6Service {

    @Resource
    private ClinicalTool6Repo clinicalTool6Repo;
    @Resource
    private UserService userService;

    @Override
    public List<ClinicalTool6> getAll() {
        return clinicalTool6Repo.findByActive(Boolean.TRUE);
    }

    @Override
    public ClinicalTool6 get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist :" + id);
        }
        return clinicalTool6Repo.findOne(id);
    }

    @Override
    public void delete(ClinicalTool6 t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        clinicalTool6Repo.save(t);
    }

    @Override
    public List<ClinicalTool6> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClinicalTool6 save(ClinicalTool6 t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return clinicalTool6Repo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return clinicalTool6Repo.save(t);
    }

    @Override
    public Boolean checkDuplicate(ClinicalTool6 current, ClinicalTool6 old) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }

    @Override
    public List<ClinicalTool6> get(SearchNationalDTO dto) {
        if(dto.getDistrict() != null){
            return clinicalTool6Repo.findByMentee_Facility_DistrictAndActive(dto.getDistrict(), Boolean.TRUE);
        }else if(dto.getProvince() != null){
            return clinicalTool6Repo.findByMentee_Facility_District_ProvinceAndActive(dto.getProvince(), Boolean.TRUE);
        }
        return getAll();
    } 
    
    @Override
    public Long getLastMenteeReport(Mentee mentee) {
        for(ClinicalTool6 item : clinicalTool6Repo.findByActiveAndMenteeOrderByEntryDateDesc(Boolean.TRUE, mentee)){
            return item.getId();
        }
        return null;
    }
}