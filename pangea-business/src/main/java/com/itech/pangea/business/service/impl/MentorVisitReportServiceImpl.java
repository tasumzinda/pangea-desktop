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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.CaseFile;
import com.itech.pangea.business.domain.FacilityChallenge;
import com.itech.pangea.business.domain.MentorVisitReport;
import com.itech.pangea.business.domain.util.MentorVisitStatus;
import com.itech.pangea.business.repo.FacilityChallengeRepo;
import com.itech.pangea.business.repo.MentorVisitReportRepo;
import com.itech.pangea.business.repo.UserRepo;
import com.itech.pangea.business.service.FacilityChallengeService;
import com.itech.pangea.business.service.MentorVisitReportService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;
import com.itech.pangea.business.util.dto.VisitReportSearchDTO;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class MentorVisitReportServiceImpl implements MentorVisitReportService {

    @Resource
    private MentorVisitReportRepo mentorVisitReportRepo;
    @PersistenceContext
    private EntityManager entityManager;
    @Resource
    private UserRepo userRepo;
    @Resource
    FacilityChallengeRepo facilityChallengeRepo;

    @Override
    public List<MentorVisitReport> getAll() {
        return mentorVisitReportRepo.findByActive(Boolean.TRUE);
    }

    @Override
    public MentorVisitReport get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist :" + id);
        }
        return mentorVisitReportRepo.findOne(id);
    }

    @Override
    public void delete(MentorVisitReport t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        mentorVisitReportRepo.save(t);
    }

    @Override
    public List<MentorVisitReport> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MentorVisitReport save(MentorVisitReport t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
            return mentorVisitReportRepo.save(t);
        }
        t.setDateModified(new Date());
        return mentorVisitReportRepo.save(t);
    }

    @Override
    public Boolean checkDuplicate(MentorVisitReport current, MentorVisitReport old) {
        throw new UnsupportedOperationException("Implement method");
    }

    @Override
    public List<MentorVisitReport> get(SearchNationalDTO dto) {
        if (dto.getDistrict() != null) {
            return mentorVisitReportRepo.getByDistrict(dto.getDistrict(), Boolean.TRUE);
        } else if (dto.getProvince() != null) {
            return mentorVisitReportRepo.getByProvince(dto.getProvince(), Boolean.TRUE);
        }
        return mentorVisitReportRepo.getByNational(Boolean.TRUE);
    }

    @Override
    public List<MentorVisitReport> get(VisitReportSearchDTO dto) {
        if (dto.getFacility() != null && dto.getStartDate() == null) {
            return mentorVisitReportRepo.getByFacility(dto.getFacility(), Boolean.TRUE);
        } else if (dto.getDistrict() != null && dto.getStartDate() == null) {
            return mentorVisitReportRepo.getByDistrict(dto.getDistrict(), Boolean.TRUE);
        } else if (dto.getProvince() != null && dto.getStartDate() == null) {
            return mentorVisitReportRepo.getByProvince(dto.getProvince(), Boolean.TRUE);
        } else if (dto.getFacility() != null && dto.getStartDate() != null) {
            return mentorVisitReportRepo.getByFacilityAndDateRange(dto.getFacility(), Boolean.TRUE, dto.getStartDate(), dto.getEndDate());
        } else if (dto.getDistrict() != null && dto.getStartDate() != null) {
            return mentorVisitReportRepo.getByDistrictAndDateRange(dto.getDistrict(), Boolean.TRUE, dto.getStartDate(), dto.getEndDate());
        } else if (dto.getProvince() != null && dto.getStartDate() != null) {
            return mentorVisitReportRepo.getByProvinceAndDateRange(dto.getProvince(), Boolean.TRUE, dto.getStartDate(), dto.getEndDate());
        } else if (dto.getStartDate() != null) {
            return mentorVisitReportRepo.getByDateRange(Boolean.TRUE, dto.getStartDate(), dto.getEndDate());
        }
        return mentorVisitReportRepo.getByNational(Boolean.TRUE);
    }
    
    @Override
    public List<MentorVisitReport> getTeamMemberExcelReport(SearchNationalDTO dto){
            if (dto.getFacility() != null && dto.getStartDate() == null) {
            return mentorVisitReportRepo.getByFacility(dto.getFacility(), Boolean.TRUE);
        } else if (dto.getDistrict() != null && dto.getStartDate() == null) {
            return mentorVisitReportRepo.getByDistrict(dto.getDistrict(), Boolean.TRUE);
        } else if (dto.getProvince() != null && dto.getStartDate() == null) {
            return mentorVisitReportRepo.getByProvince(dto.getProvince(), Boolean.TRUE);
        } else if (dto.getFacility() != null && dto.getStartDate() != null) {
            return mentorVisitReportRepo.getByFacilityAndDateRange(dto.getFacility(), Boolean.TRUE, dto.getStartDate(), dto.getEndDate());
        } else if (dto.getDistrict() != null && dto.getStartDate() != null) {
            return mentorVisitReportRepo.getByDistrictAndDateRange(dto.getDistrict(), Boolean.TRUE, dto.getStartDate(), dto.getEndDate());
        } else if (dto.getProvince() != null && dto.getStartDate() != null) {
            return mentorVisitReportRepo.getByProvinceAndDateRange(dto.getProvince(), Boolean.TRUE, dto.getStartDate(), dto.getEndDate());
        } else if(dto.getFacility() != null && dto.getStartDate() != null && dto.getMentor() != null){
            return mentorVisitReportRepo.getByFacilityAndMentorAndDateRange(dto.getFacility(), Boolean.TRUE, userRepo.findByUserName(dto.getMentor().getEmail(), Boolean.TRUE), dto.getStartDate(), dto.getEndDate());
        }else if(dto.getDistrict() != null && dto.getStartDate() != null && dto.getMentor() != null){
            return mentorVisitReportRepo.getByDistrictAndMentorAndDateRange(dto.getDistrict(), Boolean.TRUE, userRepo.findByUserName(dto.getMentor().getEmail(), Boolean.TRUE), dto.getStartDate(), dto.getEndDate());
        }else if(dto.getProvince() != null && dto.getStartDate() != null && dto.getMentor() != null){
            return mentorVisitReportRepo.getByProvinceAndMentorAndDateRange(dto.getProvince(), Boolean.TRUE, userRepo.findByUserName(dto.getMentor().getEmail(), Boolean.TRUE), dto.getStartDate(), dto.getEndDate());
        }
        return mentorVisitReportRepo.getByNational(Boolean.TRUE);
    }

    @Override
    public Integer getVisitCount(SearchNationalDTO dto) {
        if (dto.focusAreas()) {
            //return mentorVisitReportRepo.findCountByDistrictAndPeriodAndFocusArea(dto.getDistrict(), dto.getPeriod(), Boolean.TRUE, dto.getMentorShipFocusAreas());
            return 0;
        }
        return mentorVisitReportRepo.findCountByDistrictAndPeriod(dto.getDistrict(), dto.getStartDate(), dto.getEndDate(), Boolean.TRUE);
    }

    @Override
    public List<MentorVisitReport> getUnProcessedVisits() {
        return mentorVisitReportRepo.findByMentorVisitStatusIsNull();
    }

    @Override
    public Integer getVisitPeriodCount(SearchNationalDTO dto, MentorVisitStatus status) {
        if (dto.getFacility()!= null) {
            return mentorVisitReportRepo.findCountByFacilityAndPeriodAndStatus(dto.getFacility(), dto.getPeriod(), Boolean.TRUE, status);

        } else if (dto.getDistrict() != null) {
            return mentorVisitReportRepo.findCountByDistrictAndPeriodAndStatus(dto.getDistrict(), dto.getPeriod(), Boolean.TRUE, status);

        } else if (dto.getProvince() != null) {
            return mentorVisitReportRepo.findCountByProvinceAndPeriod(dto.getProvince(), dto.getPeriod(), Boolean.TRUE, status);
        }
        return mentorVisitReportRepo.findCountByPeriod(dto.getPeriod(), Boolean.TRUE, status);
    }

    @Transactional(propagation=Propagation.REQUIRED, readOnly=true, noRollbackFor=Exception.class)
    @Override
    public List<MentorVisitReport> getMentorVisits(SearchNationalDTO dto){
        StringBuilder builder = new StringBuilder("from MentorVisitReport m");
        int position = 0;
        //builder.append(" where ");
        if(dto.getProvince() != null){
            if(position == 0){
                builder.append(" where ");
                builder.append("m.caseFile.facility.district.province=:province");
                position++;
            }else{
                builder.append(" and m.caseFile.facility.district.province=:province");
            }
        }
        if(dto.getDistrict() != null){
            if(position == 0){
                builder.append(" where ");
                builder.append("m.caseFile.facility.district=:district");
                position++;
            }else{
                builder.append(" and m.caseFile.facility.district=:district");
            }
        }
        if(dto.getFacility() != null){
            if(position == 0){
                builder.append(" where ");
                builder.append("m.caseFile.facility=:facility");
                position++;
            }else{
                builder.append(" and m.caseFile.facility=:facility");
            }
        }
        if(dto.getMentor() != null){
            if(position == 0){
                builder.append(" where ");
                builder.append("m.caseFile.createdBy=:createdBy");
                position++;
            }else{
                builder.append(" and m.caseFile.createdBy=:createdBy");
            }
        }
        if(dto.getPeriod() != null){
            if(position == 0){
                builder.append(" where ");
                builder.append("m.caseFile.period=:period");
                position++;
            }else{
                builder.append(" and m.caseFile.period=:period");
            }
        }
        if(dto.getStartDate() != null && dto.getEndDate() != null){
            if(position == 0){
                builder.append(" where ");
                builder.append("m.caseFile.startDate between :startDate and :endDate");
                position++;
            }else{
                builder.append(" and m.caseFile.startDate between :startDate and :endDate");
            }
        }
        /*if(dto.getStartDate() != null){
            builder.append(" Order By m.caseFile.startDate DESC");
        }*/
        
        TypedQuery query = entityManager.createQuery(builder.toString(), MentorVisitReport.class);
        if(dto.getProvince() != null){
            query.setParameter("province", dto.getProvince());
        }
        if(dto.getDistrict() != null){
            query.setParameter("district", dto.getDistrict());
        }
        if(dto.getFacility() != null){
            query.setParameter("facility", dto.getFacility());
        }
        if(dto.getStartDate() != null && dto.getEndDate() != null){
            query.setParameter("startDate", dto.getStartDate());
            query.setParameter("endDate", dto.getEndDate());
        }
        if(dto.getPeriod() != null){
            query.setParameter("period", dto.getPeriod());
        }
        if(dto.getMentor() != null){
            query.setParameter("createdBy", userRepo.findByUserName(dto.getMentor().getEmail(), Boolean.TRUE));
        }
        List<MentorVisitReport> result = (List<MentorVisitReport>) query.getResultList();
        List<MentorVisitReport> list = new ArrayList<>();
        for(MentorVisitReport item : result){
            CaseFile current = item.getCaseFile();
            List<FacilityChallenge> facilityChallenges = facilityChallengeRepo.findByCaseFile(current);
            item.getCaseFile().setFacilityChallenges(facilityChallenges);
            list.add(item);
        }
        return list;
    }
    
    @Override
    public List<MentorVisitReport> getCheckInCheckOutMonthlySummaryReport(VisitReportSearchDTO dto){
        return mentorVisitReportRepo.getByPeriodAndMentor(dto.getPeriod(), Boolean.TRUE, userRepo.findByUserName(dto.getMentor().getEmail(), Boolean.TRUE));
    }
    
    /*@Override
    public List<MentorVisitReport> getCheckInCheckOutMonthlySummaryReport(VisitReportSearchDTO dto){
        List<MentorVisitReport> list = new ArrayList<>();
        for(MentorVisitReport item : getByPeriod(dto.getPeriod())){
            CaseFile caseFile = item.getCaseFile();
            Set<Mentor> mentors = caseFile.getMentors();
            if(mentors.contains(dto.getMentor())){
               list.add(item);
            }
        }
        return list;
    }*/
}
