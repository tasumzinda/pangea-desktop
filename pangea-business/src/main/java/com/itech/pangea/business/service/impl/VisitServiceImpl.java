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

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.Visit;
import com.itech.pangea.business.domain.util.VisitStatus;
import com.itech.pangea.business.repo.VisitRepo;
import com.itech.pangea.business.service.PeriodService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.service.VisitService;
import com.itech.pangea.business.util.DateUtil;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class VisitServiceImpl implements VisitService {
    
    @Resource
    private VisitRepo visitRepo;
    @Resource
    private UserService userService;
    @Resource
    private PeriodService periodService;

    @Override
    public List<Visit> getAll() {
        return visitRepo.findByActive(Boolean.TRUE);
    }

    @Override
    public Visit get(Long id) {
        return visitRepo.findItem(id);
    }

    @Override
    @Transactional
    public void delete(Visit t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        visitRepo.delete(t);
    }

    @Override
    public List<Visit> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public Visit save(Visit t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            t.setVisitStatus(VisitStatus.PENDING);
            //set visit to period using startdate
            if(periodService.getByStartDate(DateUtil.getPeriodStart(t.getStartDate())) != null){
                t.setPeriod(periodService.getByStartDate(DateUtil.getPeriodStart(t.getStartDate())));
            }else{
                //create period
                Period p = periodService.save(periodService.constructPeriod(t.getStartDate()));
                t.setPeriod(p);
            }
            return visitRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return visitRepo.save(t);
    }

    @Override
    public Boolean checkDuplicate(Visit current, Visit old) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Visit> getByVisitStatus(VisitStatus visitStatus, Period period) {
        return visitRepo.findByVisitStatusAndPeriodOrderByStartDateDesc(visitStatus, period);
    }

    @Override
    public List<Visit> getByProvince(Province province, Period period) {
        return visitRepo.findByFacility_District_ProvinceAndPeriodOrderByStartDateDesc(province, period);
    }

    @Override
    public List<Visit> getByDistrict(District district, Period period) {
        return visitRepo.findByFacility_DistrictAndPeriodOrderByStartDateDesc(district, period);
    }

    @Override
    public List<Visit> getByMentor(Mentor mentor, Period period) {
        return visitRepo.findByMentor(mentor, period);
    }

    
    @Override
    public List<Visit> getByProvinceAndMentor(Province province, Mentor mentor, Period period) {
        return visitRepo.findByFacility_District_ProvinceAndMentor(province, mentor, period);
    }

    @Override
    public List<Visit> getByProvinceAndVisitStatus(Province province, VisitStatus visitStatus, Period period) {
        return visitRepo.findByFacility_District_ProvinceAndVisitStatusAndPeriodOrderByStartDateDesc(province, visitStatus, period);
    }

    @Override
    public List<Visit> getByProvinceAndMentorAndVisitStatus(Province province, Mentor mentor, VisitStatus visitStatus, Period period) {
        return visitRepo.findByFacility_District_ProvinceAndMentorAndVisitStatus(province, mentor, visitStatus, period);
    }

    @Override
    public List<Visit> getByDistrictAndMentor(District district, Mentor mentor, Period period) {
        return visitRepo.findByFacility_DistrictAndMentor(district, mentor, period);
    }

    @Override
    public List<Visit> getByDistrictAndVisitStatus(District district, VisitStatus visitStatus, Period period) {
        return visitRepo.findByFacility_DistrictAndVisitStatusAndPeriod(district, visitStatus, period);
    }

    @Override
    public List<Visit> getByDistrictAndMentorVisitStatus(District district, Mentor mentor, VisitStatus visitStatus, Period period) {
        return visitRepo.findByFacility_DistrictAndMentorVisitStatus(district, mentor, visitStatus, period);
    }

    @Override
    public List<Visit> getByMentorAndVisitStatus(Mentor mentor, VisitStatus visitStatus, Period period) {
        return visitRepo.findByMentorAndVisitStatus(mentor, visitStatus, period);
    }

    @Override
    public List<Visit> getPendingVisit(Period period) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void updateStaleVisits() {
        for(Visit visit : visitRepo.getLapsedVisits(VisitStatus.PENDING, DateUtil.getDateDiffDate(-7))){
            visit.setVisitStatus(VisitStatus.OVERDUE);
            save(visit);
        }
        for(Visit visit : visitRepo.getLapsedVisits(VisitStatus.RESCHEDULED, DateUtil.getDateDiffDate(-7))){
            visit.setVisitStatus(VisitStatus.OVERDUE);
            save(visit);
        }
    }

    @Override
    public List<Visit> getByPeriod(Period period) {
        return visitRepo.findByPeriod(period);
    }

    @Override
    public Boolean getBetweenStartDateAndEndDate(Date visitDate) {
        return visitRepo.findBetweenStartDateAndEndDate(visitDate, Boolean.TRUE) .size() >=1 ? Boolean.TRUE : Boolean.FALSE;
    }
    
    
}