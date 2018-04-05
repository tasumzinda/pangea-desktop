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
package com.itech.pangea.business.service;

import java.util.List;
import com.itech.pangea.business.domain.MentorVisitReport;
import com.itech.pangea.business.domain.util.MentorVisitStatus;
import com.itech.pangea.business.util.dto.SearchNationalDTO;
import com.itech.pangea.business.util.dto.VisitReportSearchDTO;

/**
 *
 * @author Judge Muzinda
 */
public interface MentorVisitReportService extends GenericService<MentorVisitReport> {
    
    public List<MentorVisitReport> get(SearchNationalDTO dto);
    
    public List<MentorVisitReport> get(VisitReportSearchDTO dto);
    
    public Integer getVisitCount(SearchNationalDTO dto);
    
    public Integer getVisitPeriodCount(SearchNationalDTO dto,  MentorVisitStatus status);
    
    public List<MentorVisitReport> getUnProcessedVisits();
    public List<MentorVisitReport> getMentorVisits(SearchNationalDTO dto);
    public List<MentorVisitReport> getTeamMemberExcelReport(SearchNationalDTO dto);
    public List<MentorVisitReport> getCheckInCheckOutMonthlySummaryReport(VisitReportSearchDTO dto);
}