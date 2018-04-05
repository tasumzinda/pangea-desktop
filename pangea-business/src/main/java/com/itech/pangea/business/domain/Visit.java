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
package com.itech.pangea.business.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
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
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.util.VisitStatus;
import com.itech.pangea.business.util.DateUtil;
import static com.itech.pangea.business.util.DateUtil.getYearMonthName;

/**
 *
 * @author Judge Muzinda
 */
@Entity
public class Visit extends BaseEntity {
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDate;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDate;
    @ManyToOne
    private Facility facility;
    @Enumerated
    private VisitStatus visitStatus;
    private Long distance;
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(name = "visit_mentor", joinColumns = {
        @JoinColumn(name = "visit_id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "mentor_id", nullable = false)})
    private Set<Mentor> mentors = new HashSet<>();
    @ManyToOne
    private VisitFailReason visitFailReason;
    private String comment;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date doneDate;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date rescheduleDate;
    @ManyToOne
    private Period period;
    @Transient
    private Province province;
    @Transient
    private District district;
    @Transient
    private String status;
    @Transient
    private Integer mentorCount;
    @Transient
    private String name;
    @Transient
    private Integer daysLapsed;

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

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public VisitStatus getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(VisitStatus visitStatus) {
        this.visitStatus = visitStatus;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Set<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(Set<Mentor> mentors) {
        this.mentors = mentors;
    }

    public VisitFailReason getVisitFailReason() {
        return visitFailReason;
    }

    public void setVisitFailReason(VisitFailReason visitFailReason) {
        this.visitFailReason = visitFailReason;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }

    public Date getRescheduleDate() {
        return rescheduleDate;
    }

    public void setRescheduleDate(Date rescheduleDate) {
        this.rescheduleDate = rescheduleDate;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getStatus() {
        if(visitStatus != null) {
            if(visitStatus.equals(VisitStatus.DONE)) return "/resources/images/green.png";
            else if(visitStatus.equals(VisitStatus.PENDING)) return "/resources/images/yellow.png";
            else if(visitStatus.equals(VisitStatus.NOT_DONE) || visitStatus.equals(VisitStatus.OVERDUE)) return "/resources/images/red.png";
        }
        return "/resources/images/yellow.png";
    }

    public Integer getMentorCount() {
        return mentors.size();
    }
    
    public String getName() {
        return getYearMonthName(startDate);
    }

    public Integer getDaysLapsed() {
        return DateUtil.getDays(startDate, new Date());
    }   
}