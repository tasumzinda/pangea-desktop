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
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.ChallengeStatus;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.FacilityChallenge;
import com.itech.pangea.business.repo.FacilityChallengeRepo;
import com.itech.pangea.business.service.ChallengeStatusService;
import com.itech.pangea.business.service.FacilityChallengeService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.DateUtil;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class FacilityChallengeServiceImpl implements FacilityChallengeService {

    @Resource
    private FacilityChallengeRepo facilityChallengeRepo;
    @Resource
    private UserService userService;
    @Resource
    private ChallengeStatusService challengeStatusService;

    @Override
    public List<FacilityChallenge> getAll() {
        return facilityChallengeRepo.findByActive(Boolean.TRUE);
    }

    @Override
    public FacilityChallenge get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist :" + id);
        }
        return facilityChallengeRepo.findOne(id);
    }

    @Override
    public void delete(FacilityChallenge t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        facilityChallengeRepo.save(t);
    }

    @Override
    public List<FacilityChallenge> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FacilityChallenge save(FacilityChallenge t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return facilityChallengeRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return facilityChallengeRepo.save(t);
    }

    @Override
    public Boolean checkDuplicate(FacilityChallenge current, FacilityChallenge old) {
        throw new UnsupportedOperationException("Implement method");
    }

    @Override
    public List<FacilityChallenge> get(SearchNationalDTO dto) {
        return processItems(getGrossList(dto));
    }

    private List<FacilityChallenge> getGrossList(SearchNationalDTO dto) {
        if (dto.getFacility() != null && dto.getChallengeStatus() == null) {
            return facilityChallengeRepo.getByFacility(dto.getFacility(), Boolean.TRUE);
        } else if (dto.getDistrict() != null && dto.getChallengeStatus() == null) {
            return facilityChallengeRepo.getByDistrict(dto.getDistrict(), Boolean.TRUE);
        } else if (dto.getProvince() != null && dto.getChallengeStatus() == null) {
            return facilityChallengeRepo.getByProvince(dto.getProvince(), Boolean.TRUE);
        } else if (dto.getFacility() != null && dto.getChallengeStatus() != null) {
            return facilityChallengeRepo.getByFacilityAndChallengeStatus(dto.getFacility(), Boolean.TRUE, dto.getChallengeStatus());
        } else if (dto.getDistrict() != null && dto.getChallengeStatus() != null) {
            return facilityChallengeRepo.getByDistrictAndChallengeStatus(dto.getDistrict(), Boolean.TRUE, dto.getChallengeStatus());
        } else if (dto.getProvince() != null && dto.getChallengeStatus() != null) {
            return facilityChallengeRepo.getByProvinceAndChallengeStatus(dto.getProvince(), Boolean.TRUE, dto.getChallengeStatus());
        } else if (dto.getChallengeStatus() != null) {
            return facilityChallengeRepo.getByChallengeStatus(Boolean.TRUE, dto.getChallengeStatus());
        }
        return facilityChallengeRepo.getByNational(Boolean.TRUE);
    }

    private List<FacilityChallenge> processItems(List<FacilityChallenge> items) {
        List<FacilityChallenge> newList = new ArrayList<>();
        for (FacilityChallenge item : items) {
            //existing challenge with no review
            if (item.getParent() == null) {
                // all children here
                item.setChildren(getFacilityChallengeChain(item));
                newList.add(item);
            }
        }
        return newList;
    }

    @Override
    public List<FacilityChallenge> getByFacility(Facility facility) {
        return facilityChallengeRepo.findByCaseFile_FacilityAndActive(facility, Boolean.TRUE);
    }

    @Override
    public List<FacilityChallenge> getByFacilityAndChallenge(Facility facility, ChallengeStatus challengeStatus) {
        return facilityChallengeRepo.findByCaseFile_FacilityAndChallengeStatusAndActive(facility, challengeStatus, Boolean.TRUE);
    }

    @Override
    public FacilityChallenge getByParent(FacilityChallenge parent) {
        return facilityChallengeRepo.findByActiveAndParent(Boolean.TRUE, parent);
    }

    @Override
    public List<FacilityChallenge> getFirstLevel() {
        return facilityChallengeRepo.findByActiveAndParentIsNull(Boolean.TRUE);
    }

    @Override
    public List<FacilityChallenge> getFacilityChallengeChain(FacilityChallenge facilityChallenge) {
        List<FacilityChallenge> items = new ArrayList<>();
        while (getByParent(facilityChallenge) != null) {            
            facilityChallenge = getByParent(facilityChallenge);
            items.add(facilityChallenge);
        }
        return items;
    }

    private FacilityChallenge getParent(FacilityChallenge item) {
        return item.getParent();
    }

    @Override
    public Integer getVisitCount(SearchNationalDTO dto, Integer startDay, Integer endDay) {
        ChallengeStatus challengeStatus = challengeStatusService.getByName("Pending");
        Date endDate = DateUtil.getDateDiffDate(startDay == 0 ? 0 : -startDay);
        Date startDate = DateUtil.getDateDiffDate(-endDay);
        if (dto.getDistrict() != null) {
            return facilityChallengeRepo.findCountByDistrictAndPeriod(dto.getDistrict(), dto.getPeriod(), Boolean.TRUE, challengeStatus, startDate, endDate);
        }
        return facilityChallengeRepo.findCountByPeriod(dto.getPeriod(), Boolean.TRUE, challengeStatus, startDate, endDate);
    }
}
