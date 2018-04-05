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

import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.repo.MentorReportRepo;
import com.itech.pangea.business.service.MentorReportService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class MentorReportServiceImpl implements MentorReportService {
    
    @Resource
    private MentorReportRepo mentorReportRepo;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Integer get(SearchNationalDTO dto) {
        return process(dto);
    }
    
    private Integer process(SearchNationalDTO dto){
        
        /*if(dto.getMentor() != null && dto.getDistrict() != null){
            return mentorReportRepo.getByMentorAndDistrict(dto.getMentor(), dto.getDistrict());
        }else if(dto.getMentor() != null && dto.getVisitStatus() != null){
            return mentorReportRepo.getByMentorAndVisitStatus(dto.getMentor(), dto.getVisitStatus());
        }else if(dto.getMentor() != null && dto.getVisitFailReason() != null){
            return mentorReportRepo.getByMentorAndVisitFailReason(dto.getMentor(), dto.getVisitFailReason());
        }*/
        return 0;
    }
}