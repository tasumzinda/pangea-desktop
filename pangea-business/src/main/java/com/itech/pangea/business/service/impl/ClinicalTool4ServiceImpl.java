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
import com.itech.pangea.business.domain.ClinicalTool4;
import com.itech.pangea.business.domain.Mentee;
import com.itech.pangea.business.repo.ClinicalTool4Repo;
import com.itech.pangea.business.service.ClinicalTool4Service;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class ClinicalTool4ServiceImpl implements ClinicalTool4Service {

    @Resource
    private ClinicalTool4Repo clinicalTool4Repo;
    @Resource
    private UserService userService;

    @Override
    public List<ClinicalTool4> getAll() {
        return clinicalTool4Repo.findByActive(Boolean.TRUE);
    }

    @Override
    public ClinicalTool4 get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist :" + id);
        }
        return clinicalTool4Repo.findOne(id);
    }

    @Override
    public void delete(ClinicalTool4 t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        clinicalTool4Repo.save(t);
    }

    @Override
    public List<ClinicalTool4> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClinicalTool4 save(ClinicalTool4 t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return clinicalTool4Repo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return clinicalTool4Repo.save(t);
    }

    @Override
    public Boolean checkDuplicate(ClinicalTool4 current, ClinicalTool4 old) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }
    
    @Override
    public List<ClinicalTool4> get(SearchNationalDTO dto) {
        if(dto.getDistrict() != null){
            return clinicalTool4Repo.findByMentee_Facility_DistrictAndActive(dto.getDistrict(), Boolean.TRUE);
        }else if(dto.getProvince() != null){
            return clinicalTool4Repo.findByMentee_Facility_District_ProvinceAndActive(dto.getProvince(), Boolean.TRUE);
        }
        return getAll();
    }

    @Override
    public Long getLastMenteeReport(Mentee mentee) {
        for(ClinicalTool4 item : clinicalTool4Repo.findByActiveAndMenteeOrderByDateCreatedDesc(Boolean.TRUE, mentee)){
            return item.getId();
        }
        return null;
    }
    
}