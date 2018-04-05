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
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.Visit;
import com.itech.pangea.business.domain.util.VisitStatus;
import com.itech.pangea.business.repo.VisitRepo;
import com.itech.pangea.business.repo.VisitReportRepo;
import com.itech.pangea.business.service.VisitReportService;
import com.itech.pangea.business.service.VisitService;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class VisitReportServiceImpl implements VisitReportService {
    
    @Resource
    private VisitService visitService;
    @Resource
    private VisitRepo visitRepo;
    @Resource
    private VisitReportRepo visitReportRepo;
    
    @Override
    public List<Visit> get(SearchNationalDTO dto) {
        if (dto.getProvince() != null && dto.getDistrict() == null && dto.getMentor() == null && dto.getVisitStatus() == null && dto.getPeriod() != null) {
            return visitService.getByProvince(dto.getProvince(), dto.getPeriod());
        } else if (dto.getDistrict() != null && dto.getMentor() == null && dto.getVisitStatus() == null && dto.getPeriod() != null) {
            return visitService.getByDistrict(dto.getDistrict(), dto.getPeriod());
        } else if (dto.getMentor() != null && dto.getProvince() == null && dto.getDistrict() == null && dto.getVisitStatus() == null && dto.getPeriod() != null) {
            return visitService.getByMentor(dto.getMentor(), dto.getPeriod());
        } else if (dto.getVisitStatus() != null && dto.getMentor() == null && dto.getProvince() == null && dto.getDistrict() == null && dto.getPeriod() != null) {
            return visitService.getByVisitStatus(dto.getVisitStatus(), dto.getPeriod());
        } else if (dto.getProvince() != null && dto.getDistrict() == null && dto.getMentor() != null && dto.getVisitStatus() == null && dto.getPeriod() != null) {
            return visitService.getByProvinceAndMentor(dto.getProvince(), dto.getMentor(), dto.getPeriod());
        } else if (dto.getProvince() != null && dto.getDistrict() == null && dto.getMentor() != null && dto.getVisitStatus() != null && dto.getPeriod() != null) {
            return visitService.getByProvinceAndMentorAndVisitStatus(dto.getProvince(), dto.getMentor(), dto.getVisitStatus(), dto.getPeriod());
        } else if (dto.getDistrict() != null && dto.getMentor() != null && dto.getVisitStatus() == null && dto.getPeriod() != null) {
            return visitService.getByDistrictAndMentor(dto.getDistrict(), dto.getMentor(), dto.getPeriod());
        } else if (dto.getDistrict() != null && dto.getMentor() != null && dto.getVisitStatus() != null && dto.getPeriod() != null) {
            return visitService.getByDistrictAndMentorVisitStatus(dto.getDistrict(), dto.getMentor(), dto.getVisitStatus(), dto.getPeriod());
        } else if (dto.getDistrict() != null && dto.getMentor() == null && dto.getVisitStatus() != null && dto.getPeriod() != null) {
            return visitService.getByDistrictAndVisitStatus(dto.getDistrict(), dto.getVisitStatus(), dto.getPeriod());
        } else if (dto.getMentor() != null && dto.getVisitStatus() != null && dto.getDistrict() == null && dto.getProvince() == null && dto.getPeriod() != null) {
            return visitService.getByMentorAndVisitStatus(dto.getMentor(), dto.getVisitStatus(), dto.getPeriod());
        } else if (dto.getProvince() != null && dto.getMentor() == null && dto.getDistrict() == null && dto.getVisitStatus() == null && dto.getPeriod() == null) {
            return visitRepo.findByFacility_District_Province(dto.getProvince());
        } else if (dto.getProvince() != null && dto.getMentor() != null && dto.getDistrict() == null && dto.getVisitStatus() == null && dto.getPeriod() == null) {
            return visitRepo.findByFacility_District_ProvinceAndMentor(dto.getProvince(), dto.getMentor());
        } else if (dto.getProvince() != null && dto.getVisitStatus() != null && dto.getDistrict() == null && dto.getMentor() == null && dto.getPeriod() == null) {
            return visitRepo.findByFacility_District_ProvinceAndVisitStatus(dto.getProvince(), dto.getVisitStatus());
        } else if (dto.getProvince() != null && dto.getMentor() != null && dto.getVisitStatus() != null && dto.getDistrict() == null && dto.getPeriod() == null) {
            return visitRepo.findByFacility_District_ProvinceAndMentorAndVisitStatus(dto.getProvince(), dto.getMentor(), dto.getVisitStatus());
        } else if (dto.getDistrict() != null && dto.getMentor() == null && dto.getVisitStatus() == null && dto.getPeriod() == null) {
            return visitRepo.findByFacility_District(dto.getDistrict());
        } else if (dto.getDistrict() != null && dto.getMentor() != null && dto.getVisitStatus() == null && dto.getPeriod() == null) {
            return visitRepo.findByFacility_DistrictAndMentor(dto.getDistrict(), dto.getMentor());
        } else if (dto.getDistrict() != null && dto.getVisitStatus() != null && dto.getMentor() == null && dto.getPeriod() == null) {
            return visitRepo.findByFacility_DistrictAndVisitStatus(dto.getDistrict(), dto.getVisitStatus());
        } else if (dto.getDistrict() != null && dto.getMentor() != null && dto.getVisitStatus() != null && dto.getPeriod() == null) {
            return visitRepo.findByFacility_DistrictAndMentorAndVisitStatus(dto.getDistrict(), dto.getMentor(), dto.getVisitStatus());
        } else if (dto.getMentor() != null && dto.getProvince() == null && dto.getDistrict() == null && dto.getVisitStatus() == null && dto.getPeriod() == null) {
            return visitRepo.findByMentor(dto.getMentor());
        } else if (dto.getMentor() != null && dto.getVisitStatus() != null && dto.getDistrict() == null && dto.getProvince() == null && dto.getPeriod() == null) {
            return visitRepo.findByMentorAndVisitStatus(dto.getMentor(), dto.getVisitStatus());
        } else if (dto.getVisitStatus() != null && dto.getProvince() == null && dto.getDistrict() == null && dto.getPeriod() == null) {
            return visitRepo.findByVisitStatus(dto.getVisitStatus());
        } else if (dto.getVisitStatus() == null && dto.getProvince() == null && dto.getDistrict() == null && dto.getPeriod() != null) {
            return visitRepo.findByPeriod(dto.getPeriod());
        }
        return visitService.getAll();
    }
    
    @Override
    public Integer get(SearchNationalDTO dto, VisitStatus t) {
        if (dto.getDistrict() != null && dto.getMentor() == null) {
            return visitReportRepo.getByDistrictAndVisitStatusAndPeriod(dto.getDistrict(), dto.getPeriod(), t);
        } else if (dto.getProvince() != null && dto.getMentor() == null) {
            return visitReportRepo.getByProvinceAndVisitStatusAndPeriod(dto.getProvince(), dto.getPeriod(), t);
        } else if (dto.getMentor() != null && dto.getProvince() == null && dto.getDistrict() == null) {
            //return visitReportRepo.getByMentorAndVisitStatusAndPeriod(dto.getMentor(), dto.getPeriod(), t);
            return 0;
        } else if (dto.getDistrict() != null && dto.getMentor() != null) {
            //return visitReportRepo.getByDistrictAndMentorVisitStatusAndPeriod(dto.getDistrict(), dto.getMentor(), dto.getPeriod(), t);
            return 0;
        } else if (dto.getProvince() != null && dto.getMentor() != null) {
            //return visitReportRepo.getByProvinceAndMentorAndVisitStatusAndPeriod(dto.getProvince(), dto.getMentor(), dto.getPeriod(), t);
            return 0;
        }
        return visitReportRepo.getByVisitStatusAndPeriod(dto.getPeriod(), t);
    }
    
}
