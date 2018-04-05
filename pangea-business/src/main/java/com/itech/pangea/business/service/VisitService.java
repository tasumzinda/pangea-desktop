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
package com.itech.pangea.business.service;

import java.util.Date;
import java.util.List;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.Visit;
import com.itech.pangea.business.domain.util.VisitStatus;

/**
 *
 * @author Judge Muzinda
 */
public interface VisitService extends GenericService<Visit> {
    
    public List<Visit> getByVisitStatus(VisitStatus visitStatus, Period period);
    
    public List<Visit> getByProvince(Province province, Period period);
    
    public List<Visit> getByDistrict(District district, Period period);
    
    public List<Visit> getByPeriod(Period period);
    
    public List<Visit> getByMentor(Mentor mentor, Period period);
    
    public List<Visit> getByProvinceAndMentor(Province province, Mentor mentor, Period period);
    
    public List<Visit> getByProvinceAndVisitStatus(Province province, VisitStatus visitStatus, Period period);
    
    public List<Visit> getByProvinceAndMentorAndVisitStatus(Province province, Mentor mentor, VisitStatus visitStatus, Period period);
    
    public List<Visit> getByDistrictAndMentor(District district, Mentor mentor, Period period);
    
    public List<Visit> getByDistrictAndVisitStatus(District district, VisitStatus visitStatus, Period period);
    
    public List<Visit> getByDistrictAndMentorVisitStatus(District district, Mentor mentor,VisitStatus visitStatus, Period period);
    
    public List<Visit> getByMentorAndVisitStatus(Mentor mentor, VisitStatus visitStatus, Period period);
    
    public List<Visit> getPendingVisit(Period period);
    
    public void updateStaleVisits();
    
    public Boolean getBetweenStartDateAndEndDate(Date visitDate);
}