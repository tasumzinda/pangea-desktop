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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.domain.TbStat;
import com.itech.pangea.business.repo.TbStatRepo;
import com.itech.pangea.business.service.TbStatService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muiznda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class TbStatServiceImpl implements TbStatService {

    @Resource
    private TbStatRepo tbStatRepo;
    @Resource
    private UserService userService;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<TbStat> getAll() {
        return tbStatRepo.findByActive(Boolean.TRUE);
    }

    @Override
    public TbStat get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist :" + id);
        }
        return tbStatRepo.findOne(id);
    }

    @Override
    public void delete(TbStat t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        tbStatRepo.save(t);
    }

    @Override
    public List<TbStat> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public TbStat save(TbStat t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return tbStatRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return tbStatRepo.save(t);
    }

    @Override
    public Boolean checkDuplicate(TbStat current, TbStat old) {
        throw new UnsupportedOperationException("implement method");
    }

    @Override
    public List<TbStat> getByPeriod(Period period) {
        return tbStatRepo.findByPeriodAndActive(period, Boolean.TRUE);
    }
    
     @Override
    public Long get(SearchNationalDTO dto, String colName) {
        StringBuilder builder = new StringBuilder("Select sum(p."+colName+") from TbStat p");
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
