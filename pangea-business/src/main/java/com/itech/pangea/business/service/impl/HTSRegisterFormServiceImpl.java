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
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.HTSRegisterForm;
import com.itech.pangea.business.repo.HTSRegisterFormRepo;
import com.itech.pangea.business.service.HTSRegisterFormService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Tasu Muzinda
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class HTSRegisterFormServiceImpl implements HTSRegisterFormService{

    @Resource
    private UserService userService;
    @Resource
    private HTSRegisterFormRepo hTSRegisterFormRepo;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<HTSRegisterForm> getAll() {
        return hTSRegisterFormRepo.findAll();
    }

    @Override
    @Transactional
    public HTSRegisterForm save(HTSRegisterForm t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
            t.setCreatedBy(userService.getCurrentUser());
            return hTSRegisterFormRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return hTSRegisterFormRepo.save(t);
    }
    
    @Override
    public HTSRegisterForm get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist");
        }
        return hTSRegisterFormRepo.findOne(id);
    }

    @Override
    public void delete(HTSRegisterForm t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        hTSRegisterFormRepo.save(t);
    }

    @Override
    public List<HTSRegisterForm> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Boolean checkDuplicate(HTSRegisterForm current, HTSRegisterForm old){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<HTSRegisterForm> get(SearchNationalDTO dto) {
        StringBuilder builder = new StringBuilder("from HTSRegisterForm p");
        int position = 0;
        if (dto.getFacility() != null) {
            if (position == 0) {
                builder.append(" where ");
                builder.append("p.facility=:facility");
                position++;
            } else {
                builder.append(" and p.facility=:facility");
            }
        }
        if (dto.getStartDate() != null && dto.getEndDate() != null) {
            if (position == 0) {
                builder.append(" where ");
                builder.append("p.mDate between :startDate and :endDate");
                position++;
            } else {
                builder.append(" and (p.mDate between :startDate and :endDate)");
            }
        }
        //TypedQuery
        TypedQuery query = entityManager.createQuery(builder.toString(), HTSRegisterForm.class);
        if (dto.getFacility() != null) {
            query.setParameter("facility", dto.getFacility());
        }
        if (dto.getStartDate() != null && dto.getEndDate() != null) {
            query.setParameter("startDate", dto.getStartDate());
            query.setParameter("endDate", dto.getEndDate());
        }
        List<HTSRegisterForm> result = (List<HTSRegisterForm>) query.getResultList();
        return result;
    }
    @Override
    public Integer countByFinalResult(SearchNationalDTO dto) {
        if(dto.getFacility() != null){
            return hTSRegisterFormRepo.countByFacilityAndFinalResult(dto.getFacility(), dto.getHivResult());
        }
        else if(dto.getDistrict() != null){
            return hTSRegisterFormRepo.countByDistrictAndFinalResult(dto.getDistrict(), dto.getHivResult());        
        }
        else if(dto.getProvince() !=null){
            return hTSRegisterFormRepo.countByProvinceAndFinalResult(dto.getProvince(), dto.getHivResult());
        }
        else{
            return hTSRegisterFormRepo.countByFinalResult(dto.getHivResult());
        }
    }
}
