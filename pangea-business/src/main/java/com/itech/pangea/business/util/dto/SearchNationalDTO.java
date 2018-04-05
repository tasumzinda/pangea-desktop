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
package com.itech.pangea.business.util.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.ChallengeStatus;
import com.itech.pangea.business.domain.Designation;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.MentorShipFocusArea;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.VisitFailReason;
import com.itech.pangea.business.domain.util.CallOutcome;
import com.itech.pangea.business.domain.util.HIVResult;
import com.itech.pangea.business.domain.util.ReasonForIneligibilityForTesting;
import com.itech.pangea.business.domain.util.VisitStatus;
import com.itech.pangea.business.domain.util.YesNo;
import com.itech.pangea.business.util.DateUtil;

/**
 *
 * @author Judge Muzinda
 */
public class SearchNationalDTO extends SearchProvinceDTO {

    private Province province;
    private Mentor mentor;
    private VisitStatus visitStatus;
    private VisitFailReason visitFailReason;
    private ChallengeStatus challengeStatus;
    private Set<MentorShipFocusArea> mentorShipFocusAreas = new HashSet<>();
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    private Integer reportType;
    private Designation designation;
    private ReasonForIneligibilityForTesting hivStatusEntry;
    private HIVResult hivResult;
    private YesNo initiatedOnART;
    private CallOutcome callOutcome;
    private String reason;

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }
    
    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public SearchNationalDTO() {
    }

    public SearchNationalDTO(Period period) {
        super(period);
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public VisitStatus getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(VisitStatus visitStatus) {
        this.visitStatus = visitStatus;
    }

    public VisitFailReason getVisitFailReason() {
        return visitFailReason;
    }

    public void setVisitFailReason(VisitFailReason visitFailReason) {
        this.visitFailReason = visitFailReason;
    }

    public ChallengeStatus getChallengeStatus() {
        return challengeStatus;
    }

    public void setChallengeStatus(ChallengeStatus challengeStatus) {
        this.challengeStatus = challengeStatus;
    }

    public Set<MentorShipFocusArea> getMentorShipFocusAreas() {
        return mentorShipFocusAreas;
    }

    public void setMentorShipFocusAreas(Set<MentorShipFocusArea> mentorShipFocusAreas) {
        this.mentorShipFocusAreas = mentorShipFocusAreas;
    }

    public ReasonForIneligibilityForTesting getHivStatusEntry() {
        return hivStatusEntry;
    }

    public void setHivStatusEntry(ReasonForIneligibilityForTesting hivStatusEntry) {
        this.hivStatusEntry = hivStatusEntry;
    }

    public HIVResult getHivResult() {
        return hivResult;
    }

    public void setHivResult(HIVResult hivResult) {
        this.hivResult = hivResult;
    }

    public YesNo getInitiatedOnART() {
        return initiatedOnART;
    }

    public void setInitiatedOnART(YesNo initiatedOnART) {
        this.initiatedOnART = initiatedOnART;
    }

    public CallOutcome getCallOutcome() {
        return callOutcome;
    }

    public void setCallOutcome(CallOutcome callOutcome) {
        this.callOutcome = callOutcome;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public static SearchNationalDTO getInstance(SearchNationalDTO dto) {
        SearchNationalDTO search = new SearchNationalDTO(dto.getPeriod());
        search.setProvince(dto.getProvince());
        search.setDistrict(dto.getDistrict());
        search.setMentor(dto.getMentor());
        search.setVisitStatus(dto.getVisitStatus());
        search.setVisitFailReason(dto.getVisitFailReason());
        search.setChallengeStatus(dto.getChallengeStatus());
        search.setMentorShipFocusAreas(dto.getMentorShipFocusAreas());
        search.setFacility(dto.getFacility());
        search.setStartDate(dto.getStartDate());
        search.setEndDate(dto.getEndDate());
        search.setReportType(dto.getReportType());
        search.setDesignation(dto.getDesignation());
        search.setHivResult(dto.getHivResult());
        search.setHivStatusEntry(dto.getHivStatusEntry());
        search.setInitiatedOnART(dto.getInitiatedOnART());
        search.setCallOutcome(dto.getCallOutcome());
        search.setReason(dto.getReason());
        return search;
    }
    
    private static void sanitizeDTO(SearchNationalDTO dto){
        if(dto.getFacility() != null){
            dto.setDistrict(null);
            dto.setProvince(null);
        } else if(dto.getDistrict() != null){
            dto.setProvince(null);
        }
    }

    public String getQueryString(SearchNationalDTO dto) {
        StringBuilder query = new StringBuilder("");
        String buffer = null;
        query.append("?period=");
        if (dto.getPeriod() == null) {
            query.append(buffer);
        } else {
            query.append(dto.getPeriod().getId());
        }
        if (dto.getFacility()!= null) {
            query.append("&facility=");
            query.append(dto.getFacility().getId());
        }
        if (dto.getProvince() != null) {
            query.append("&province=");
            query.append(dto.getProvince().getId());
        }
        if (dto.getDistrict() != null) {
            query.append("&district=");
            query.append(dto.getDistrict().getId());
        }
        if (dto.getMentor() != null) {
            query.append("&mentor=");
            query.append(dto.getMentor().getId());
        }
        if (dto.getVisitStatus() != null) {
            query.append("&visitStatus=");
            query.append(dto.getVisitStatus().getCode());
        }
        if (dto.getVisitFailReason() != null) {
            query.append("&visitFailReason=");
            query.append(dto.getVisitFailReason().getId());
        }
        if (dto.getChallengeStatus() != null) {
            query.append("&challengeStatus=");
            query.append(dto.getChallengeStatus().getId());
        }
        if (dto.getEndDate() != null && dto.getStartDate() != null) {
                query.append("&startDate=");
                query.append(DateUtil.getStringFromDate(dto.getStartDate()));
                query.append("&endDate=");
                query.append(DateUtil.getStringFromDate(dto.getEndDate()));
        }
        if(dto.getReportType() != null){
            query.append("&reportType=");
            query.append(dto.getReportType());
        }
        if(dto.getDesignation() != null){
            query.append("&designation=");
            query.append(dto.getDesignation());
        }
        if(dto.getHivResult() != null){
            query.append("&hivResult=");
            query.append(dto.getHivResult());
        }
        if(dto.getHivStatusEntry()!= null){
            query.append("&hivStatusEntry=");
            query.append(dto.getHivStatusEntry());
        }
        if(dto.getInitiatedOnART()!= null){
            query.append("&initiatedOnART=");
            query.append(dto.getInitiatedOnART());
        }
        if(dto.getCallOutcome() != null){
            query.append("&finalOutcome=");
            query.append(dto.getCallOutcome());
        }
        if(dto.getReason() != null){
            query.append("&reason=");
            query.append(dto.getReason());
        }
        return query.toString();
    }    
    
    public Boolean focusAreas(){
        if(mentorShipFocusAreas == null || mentorShipFocusAreas.isEmpty()){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}