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
package com.itech.pangea.business.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.util.MentorVisitStatus;
import com.itech.pangea.business.util.DateUtil;

/**
 *
 * @author Judge Muzinda
 */
@Entity
public class MentorVisitReport extends BaseEntity {

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "visit_report_focus_area", joinColumns = {
        @JoinColumn(name = "visit_report_id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "focus_area_id", nullable = false)})
    private Set<MentorShipFocusArea> mentorShipFocusAreas = new HashSet<>();
    @Column(columnDefinition = "text")
    private String comments;
    private Integer hours;
    private Integer minutes;
    private String actionTaken;
    private String observation;
    private String others;
    private String recommendations;
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne
    private CaseFile caseFile;
    @Enumerated
    private  MentorVisitStatus mentorVisitStatus;
    @Transient
    private String timeSpend;
    @Transient
    private String timeCheck;
    @Transient
    private String mentorShipFocusArea;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    public MentorVisitReport() {
    }

    public MentorVisitReport(Set<MentorShipFocusArea> mentorShipFocusAreas, String comments, Integer hours, Integer minutes, String actionTaken, String observation, String others,String recommendations, Date startDate, Date endDate) {
        this.mentorShipFocusAreas = mentorShipFocusAreas;
        this.comments = comments;
        this.hours = hours;
        this.minutes = minutes;
        this.actionTaken = actionTaken;
        this.observation = observation;
        this.others = others;
        this.recommendations = recommendations;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public Set<MentorShipFocusArea> getMentorShipFocusAreas() {
        return mentorShipFocusAreas;
    }

    public void setMentorShipFocusAreas(Set<MentorShipFocusArea> mentorShipFocusAreas) {
        this.mentorShipFocusAreas = mentorShipFocusAreas;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public CaseFile getCaseFile() {
        return caseFile;
    }

    public void setCaseFile(CaseFile caseFile) {
        this.caseFile = caseFile;
    }

    public String getTimeSpend() {
        return hours+" hrs "+minutes+" mins";
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public MentorVisitStatus getMentorVisitStatus() {
        return mentorVisitStatus;
    }

    public void setMentorVisitStatus(MentorVisitStatus mentorVisitStatus) {
        this.mentorVisitStatus = mentorVisitStatus;
    }    

    public String getMentorShipFocusArea() {
        String focusArea = "";
        int count = 0;
        for(MentorShipFocusArea item : mentorShipFocusAreas){
            if(count < mentorShipFocusAreas.size()-1){
                focusArea += item.getName()+", ";
            }else{
                focusArea += item.getName();
            }
            count++;
        }
        return focusArea;
    }

    public String getTimeCheck() {
        long timeReported = TimeUnit.HOURS.toMillis(hours) + TimeUnit.MINUTES.toMillis(minutes);
        //long timeSpend = TimeUnit.HOURS.toMillis(DateUtil.getHours(caseFile.getStartDate(), caseFile.getEndDate()));
        long timeSpend = TimeUnit.MINUTES.toMillis(caseFile.getTime());
        long diff = timeReported - timeSpend;
        long timeCheck = TimeUnit.MILLISECONDS.toMinutes(diff);
        String result;
        if(caseFile.getStartDate() == null || caseFile.getEndDate() == null){
            result = "N/A";
        }else if(timeCheck >= 0 && timeCheck <= 20){
            result = "Ok";
        }else{
            result = "Mismatch";
        }
        
        return result;
    }
    
    public String getLocationCheck() {
        Double checkInCheck = 0.0;
        Double checkOutCheck = 0.0;
        if(caseFile.getFacility().getLatitude() != null || caseFile.getFacility().getLongitude() != null){
           checkInCheck = DateUtil.round((caseFile.getFacility().getLatitude() - caseFile.getLatitudeCreated()) + (caseFile.getFacility().getLongitude() - caseFile.getLongitudeCreated()), 3);
           checkOutCheck = DateUtil.round((caseFile.getFacility().getLatitude() - caseFile.getLatitudeSubmitted()) + (caseFile.getFacility().getLongitude() - caseFile.getLongitudeSubmitted()), 3); 
        }
        
        //Double locationCheck = DateUtil.round((latitudeCreated - latitudeSubmitted) + (longitudeCreated - longitudeSubmitted), 3);
        String result = "";
        if (caseFile.getLatitudeCreated() == null || caseFile.getLatitudeSubmitted() == null || caseFile.getLongitudeCreated() == null || caseFile.getLongitudeSubmitted() == null || caseFile.getFacility().getLatitude() == null || caseFile.getFacility().getLongitude() == null) {
            result = "N/A";
        } else if (checkInCheck <= 0.009 && checkOutCheck <= 0.009) {
            result = "Ok";
        } else {
            result = "Mismatch";
        }
        return result;
    }

    public void setTimeCheck(String timeCheck) {
        this.timeCheck = timeCheck;
    }
    
    
}