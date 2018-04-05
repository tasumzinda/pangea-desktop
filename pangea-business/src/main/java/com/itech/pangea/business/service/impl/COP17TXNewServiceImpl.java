/*
 * Copyright 2017 User.
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
import com.itech.pangea.business.domain.COP17TXNew;
import com.itech.pangea.business.domain.DSDNew;
import com.itech.pangea.business.repo.COP17TXNewRepo;
import com.itech.pangea.business.service.COP17TXNewService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author User
 */
@Repository
@Transactional(readOnly = true)
public class COP17TXNewServiceImpl implements COP17TXNewService{
    
    @Resource
    private COP17TXNewRepo dsdNewRepo;
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public Long get(SearchNationalDTO dto, String colName) {
        StringBuilder builder = new StringBuilder("Select sum(p."+colName+") from COP17TXNew p");
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
        if (dto.getStartDate() != null && dto.getEndDate() != null) {
            if (position == 0) {
                builder.append("p.startDate between :startDate and :endDate");
                position++;
            } else {
                builder.append(" and (p.startDate between :startDate and :endDate)");
            }
        }
        //TypedQuery
        TypedQuery query = entityManager.createQuery(builder.toString(), Long.class);
        if (dto.getFacility() != null) {
            query.setParameter("facility", dto.getFacility());
        }
        if (dto.getStartDate() != null && dto.getEndDate() != null) {
            query.setParameter("startDate", dto.getStartDate());
            query.setParameter("endDate", dto.getEndDate());
        }
        //query.setParameter("name", colName);
        Long result = (Long) query.getSingleResult();
        return result == null ? 0 : result;
    }
    
    @Override
    public List<COP17TXNew> getAll(){
        return dsdNewRepo.findAll();
    }
    
    @Override
    @Transactional
    public COP17TXNew save(COP17TXNew t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
            return dsdNewRepo.save(t);
        }
        t.setDateModified(new Date());
        return dsdNewRepo.save(t);
    }
}
