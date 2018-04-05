/*
 * Copyright 2016 jmuzinda.
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
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.MonthReportForm;
import com.itech.pangea.business.repo.MonthReportFormRepo;
import com.itech.pangea.business.service.MonthReportFormService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author jmuzinda
 */
@Repository
@Transactional(readOnly = true)
public class MonthReportFormServiceImpl implements MonthReportFormService{
 
    @Resource
    private MonthReportFormRepo monthReportFormRepo;
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<MonthReportForm> getAll(){
        return monthReportFormRepo.findAll();
    }
    
    @Override
    public MonthReportForm get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist");
        }
        return monthReportFormRepo.findOne(id);
    }
    
    @Override
    public void delete(MonthReportForm t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        monthReportFormRepo.save(t);
    }
    
    @Override
    @Transactional
    public MonthReportForm save(MonthReportForm t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
            return monthReportFormRepo.save(t);
        }
        t.setDateModified(new Date());
        return monthReportFormRepo.save(t);
    }
    
    @Override
    public Long get(SearchNationalDTO dto, String colName) {
        StringBuilder builder = new StringBuilder("Select sum(p."+colName+") from MonthReportForm p");
        int position = 0;
        builder.append(" where ");
        if (dto.getFacility() != null) {
            if (position == 0) {
                builder.append("p.facility=:facility");
                position++;
            } else {
                builder.append(" and p.facility=:facility");
            }
        }
        if (dto.getPeriod() != null) {
            if (position == 0) {
                builder.append("p.period=:period");
                position++;
            } else {
                builder.append(" and p.period=:period");
            }
        }
        //TypedQuery
        TypedQuery query = entityManager.createQuery(builder.toString(), Long.class);
        if (dto.getFacility() != null) {
            query.setParameter("facility", dto.getFacility());
        }
        if (dto.getPeriod() != null) {
            query.setParameter("period", dto.getPeriod());
        }
        //query.setParameter("name", colName);
        Long result = (Long) query.getSingleResult();
        return result == null ? 0 : result;
    }
}
