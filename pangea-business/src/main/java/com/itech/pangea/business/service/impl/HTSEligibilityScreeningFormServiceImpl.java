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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.HTSEligibilityScreeningForm;
import com.itech.pangea.business.repo.HTSEligibilityScreeningFormRepo;
import com.itech.pangea.business.service.HTSEligibilityScreeningFormService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;


/**
 *
 * @author Tasu Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class HTSEligibilityScreeningFormServiceImpl implements HTSEligibilityScreeningFormService {

    @Resource
    private HTSEligibilityScreeningFormRepo repo;
   
    @Resource
    private UserService userService;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<HTSEligibilityScreeningForm> getAll() {
        return repo.findByActive(Boolean.TRUE);
    }
    
    @Override
    public HTSEligibilityScreeningForm get(Long id){
        if(id == null)
            throw new IllegalStateException("Item to be does not exist");
        return repo.findOne(id);
    }

    @Override
    @Transactional
    public HTSEligibilityScreeningForm save(HTSEligibilityScreeningForm t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return repo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return repo.save(t);
    }

    @Override
    public List<HTSEligibilityScreeningForm> get(SearchNationalDTO dto) {
        StringBuilder builder = new StringBuilder("from HTSEligibilityScreeningForm p");
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
        TypedQuery query = entityManager.createQuery(builder.toString(), HTSEligibilityScreeningForm.class);
        if (dto.getFacility() != null) {
            query.setParameter("facility", dto.getFacility());
        }
        if (dto.getStartDate() != null && dto.getEndDate() != null) {
            query.setParameter("startDate", dto.getStartDate());
            query.setParameter("endDate", dto.getEndDate());
        }
        List<HTSEligibilityScreeningForm> result = (List<HTSEligibilityScreeningForm>) query.getResultList();
        return result;
    }

    @Override
    public Integer getVisitsWithKnownPositiveAndOnARTAtEntry(SearchNationalDTO dto) {
        String status = "Disclosed Being Hiv Positive";
        String onArt = "Disclosed Being On Art";
        if (dto.getFacility() != null) {
            return countVisitsWithKnownPositiveAndOnARTAtEntry(repo.findByFacility(dto.getFacility()), status, onArt);
        }else if(dto.getDistrict() != null){
            return countVisitsWithKnownPositiveAndOnARTAtEntry(repo.findByDistrict(dto.getDistrict()), status, onArt);
        }else if(dto.getProvince() != null){
            return countVisitsWithKnownPositiveAndOnARTAtEntry(repo.findByProvince(dto.getProvince()), status, onArt);
        }
        return countVisitsWithKnownPositiveAndOnARTAtEntry(getAll(), status, onArt);
    }
    
    @Override
    public Integer getVisitsWithKnownPositiveAndNotOnARTAtEntry(SearchNationalDTO dto) {
        String status = "Disclosed Being Hiv Positive";
        String onArt = "Disclosed Being On Art";
        if (dto.getFacility() != null) {
            return countVisitsWithKnownPositiveAndNotOnARTAtEntry(repo.findByFacility(dto.getFacility()), status, onArt);
        }else if(dto.getDistrict() != null){
            return countVisitsWithKnownPositiveAndNotOnARTAtEntry(repo.findByDistrict(dto.getDistrict()), status, onArt);
        }else if(dto.getProvince() != null){
            return countVisitsWithKnownPositiveAndNotOnARTAtEntry(repo.findByProvince(dto.getProvince()), status, onArt);
        }
        return countVisitsWithKnownPositiveAndNotOnARTAtEntry(getAll(), status, onArt);
    }
    
    @Override
    public Integer countByStatus(SearchNationalDTO dto){
       String status = "Recently Tested Negative Less Than 3 Months Ago"; 
       String status1 = "Recently Tested Negative Less Than 12 Months Ago";
       String status2 = "Recently Tested Negative Less Than 6 Months Ago";
       if(dto.getFacility() != null){
           return countVisitsWithNegativeStatus(repo.findByFacility(dto.getFacility()), status, status1, status2);
       }else if(dto.getDistrict() != null){
           return countVisitsWithNegativeStatus(repo.findByDistrict(dto.getDistrict()), status, status1, status2);
       }else if(dto.getProvince() != null){
           return countVisitsWithNegativeStatus(repo.findByProvince(dto.getProvince()), status, status1, status2);
       }
       return countVisitsWithNegativeStatus(getAll(), status, status1, status2);
    }

    public Integer countVisitsWithKnownPositiveAndOnARTAtEntry(List<HTSEligibilityScreeningForm> list, String status, String onART) {
        Integer count = 0;
        for (HTSEligibilityScreeningForm item : list) {
            String name = item.getReasonForIneligibilityForTesting();
            List<String> stringList = new ArrayList<>();
            if (item.getReasonForIneligibilityForTesting() != null) {
                String[] arr = name.split(",");
                stringList.addAll(Arrays.asList(arr));
                List<String> finalList = new ArrayList<>();
                for(String m : stringList){
                    finalList.add(m.trim());
                }
                if (finalList.contains(status.trim()) && finalList.contains(onART.trim())) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public Integer countVisitsWithKnownPositiveAndNotOnARTAtEntry(List<HTSEligibilityScreeningForm> list, String status, String onART) {
        Integer count = 0;
        for (HTSEligibilityScreeningForm item : list) {
            String name = item.getReasonForIneligibilityForTesting();
            List<String> stringList = new ArrayList<>();
            if (item.getReasonForIneligibilityForTesting() != null) {
                String[] arr = name.split(",");
                stringList.addAll(Arrays.asList(arr));
                List<String> finalList = new ArrayList<>();
                for(String m : stringList){
                    finalList.add(m.trim());
                }
                if (finalList.contains(status.trim()) && ! finalList.contains(onART.trim())) {
                    count++;
                }
            }
        }
        return count;
    }
    
     public Integer countVisitsWithNegativeStatus(List<HTSEligibilityScreeningForm> list, String status, String status1, String status2) {
        Integer count = 0;
        for (HTSEligibilityScreeningForm item : list) {
            String name = item.getReasonForIneligibilityForTesting();
            List<String> stringList = new ArrayList<>();
            if (item.getReasonForIneligibilityForTesting() != null) {
                String[] arr = name.split(",");
                stringList.addAll(Arrays.asList(arr));
                List<String> finalList = new ArrayList<>();
                for(String m : stringList){
                    finalList.add(m.trim());
                }
                if (finalList.contains(status.trim()) || finalList.contains(status1.trim()) || finalList.contains(status2.trim())) {
                    count++;
                }
            }
        }
        return count;
    }

    

}
