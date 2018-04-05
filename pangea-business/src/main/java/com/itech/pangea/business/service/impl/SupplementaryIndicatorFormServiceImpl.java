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
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.SupplementaryIndicatorForm;
import com.itech.pangea.business.repo.SupplementaryIndicatorFormRepo;
import com.itech.pangea.business.service.SupplementaryIndicatorFormService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true)
public class SupplementaryIndicatorFormServiceImpl implements SupplementaryIndicatorFormService {
    
    @Resource
    private SupplementaryIndicatorFormRepo supplementaryIndicatorFormRepo;
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<SupplementaryIndicatorForm> getAll(){
        return supplementaryIndicatorFormRepo.findAll();
    }
    
    @Override
    @Transactional
    public SupplementaryIndicatorForm save(SupplementaryIndicatorForm t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
            return supplementaryIndicatorFormRepo.save(t);
        }
        t.setDateModified(new Date());
        return supplementaryIndicatorFormRepo.save(t);
    }
    
    @Override
    public Long get(SearchNationalDTO dto, String colName) {
        StringBuilder builder = new StringBuilder("Select sum(p."+colName+") from SupplementaryIndicatorForm p");
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
