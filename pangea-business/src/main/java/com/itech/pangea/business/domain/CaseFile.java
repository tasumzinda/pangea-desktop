package com.itech.pangea.business.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.util.DateUtil;

/**
 * Created by tdhlakama on 1/22/2016.
 */
@Entity
public class CaseFile extends BaseEntity {

    @ManyToOne
    private Facility facility;
    @ManyToOne
    private Period period;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateSubmitted;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private Date startDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    private Double latitudeCreated;
    private Double longitudeCreated;
    private Double latitudeSubmitted;
    private Double longitudeSubmitted;
    private Long serverId;
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "case_file_mentor", joinColumns = {
        @JoinColumn(name = "case_file_id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "mentor_id", nullable = false)})
    @JsonIgnore
    private Set<Mentor> mentors = new HashSet<>();
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "case_file_mentee", joinColumns = {
        @JoinColumn(name = "case_file_id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "mentee_id", nullable = false)})
    @JsonIgnore
    private Set<Mentee> mentees = new HashSet<>();
    @Transient
    private String mentorDisplay;
    @Transient
    private String menteeDisplay;
    @Transient
    private String mentorMainDisplay;
    @Transient
    private String menteeMainDisplay;
    @Transient
    private String timeSpend;
    @Transient
    private String timeCheck;
    @Transient
    private String locationCheck;
    @JsonIgnore
    @Transient
    private List<FacilityChallenge> facilityChallenges;
    @Transient
    private String facilityChallenge;

    public CaseFile() {
    }

    public CaseFile(Facility facility, Double latitudeCreated, Double longitudeCreated, Double latitudeSubmitted, Double longitudeSubmitted, Long serverId) {
        this.facility = facility;
        this.latitudeCreated = latitudeCreated;
        this.longitudeCreated = longitudeCreated;
        this.latitudeSubmitted = latitudeSubmitted;
        this.longitudeSubmitted = longitudeSubmitted;
        this.serverId = serverId;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public Double getLatitudeCreated() {
        return latitudeCreated != null ? DateUtil.round(latitudeCreated, 4) : null;
    }

    public void setLatitudeCreated(Double latitudeCreated) {
        this.latitudeCreated = latitudeCreated;
    }

    public Double getLongitudeCreated() {
        return longitudeCreated != null ? DateUtil.round(longitudeCreated, 4) : null;
    }

    public void setLongitudeCreated(Double longitudeCreated) {
        this.longitudeCreated = longitudeCreated;
    }

    public Double getLatitudeSubmitted() {
        return latitudeSubmitted != null ? DateUtil.round(latitudeSubmitted, 4) : null;
    }

    public void setLatitudeSubmitted(Double latitudeSubmitted) {
        this.latitudeSubmitted = latitudeSubmitted;
    }

    public Double getLongitudeSubmitted() {
        return longitudeSubmitted != null ? DateUtil.round(longitudeSubmitted, 4) : null;
    }

    public void setLongitudeSubmitted(Double longitudeSubmitted) {
        this.longitudeSubmitted = longitudeSubmitted;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Set<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(Set<Mentor> mentors) {
        this.mentors = mentors;
    }

    public Set<Mentee> getMentees() {
        return mentees;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setMentees(Set<Mentee> mentees) {
        this.mentees = mentees;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    @JsonIgnore
    public String getMentorDisplay() {
        String t = "";
        int count = 0;
        for (Mentor m : getMentors()) {
            String pre = count < (getMentors().size() - 1) ? ", " : " ";
            t += m.getFullName() + pre;
            count++;
        }
        return t;
    }

    @JsonIgnore
    public String getMenteeDisplay() {
        String t = "";
        int count = 0;
        for (Mentee m : getMentees()) {
            String pre = count < (getMentees().size() - 1) ? ", " : " ";
            t += m.getName() + pre;
            count++;
        }
        return t;
    }

    @JsonIgnore
    public String getMentorMainDisplay() {
        String t = "";
        int count = 0;
        for (Mentor m : getMentors()) {
            if (m.getDesignation() == null) {
                continue;
            }
            String pre = count < (getMentors().size() - 1) ? "/ " : " ";
            String desig = m.getDesignation() != null ? m.getDesignation().getName() : "";
            t += m.getFullName() + ", " + desig + ", " + sanitize(m.getMobileNumber()) + " , " + sanitize(m.getWorkStation()) + pre;
            count++;
        }
        return t;
    }

    @JsonIgnore
    public String getMenteeMainDisplay() {
        String t = "";
        int count = 0;
        for (Mentee m : getMentees()) {
            if (m.getDesignation() == null) {
                continue;
            }
            String pre = count < (getMentees().size() - 1) ? "/ " : " ";
            String desig = m.getDesignation() != null ? m.getDesignation().getName() : "";
            t += m.getName() + ", " + desig + ", " + pre;
            count++;
        }
        return t;
    }

    private String sanitize(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        return str;
    }

    public String getTimeSpend() {
        Integer time = DateUtil.getMinutes(startDate, endDate);
        Integer hours = time / 60;
        Integer minutes = time % 60;
        return hours + "hrs " + minutes + "mins";
    }

    public Integer getTime() {
        return DateUtil.getMinutes(startDate, endDate);
    }

    public String getLocationCheck() {
        Double checkIn = 0.0;
        Double checkOut = 0.0;
        if (getLatitudeCreated() != null
                && getLatitudeSubmitted() != null
                && getLongitudeCreated() != null
                && getLongitudeSubmitted() != null
                && facility.getLatitude() != null
                && facility.getLongitude() != null) {
            if (facility.getLatitude() != null && facility.getLongitude() != null) {
                Double latituteCreatedVal = facility.getLatitude() - getLatitudeCreated();
                Double longitudeCreatedVal = facility.getLongitude() - getLongitudeCreated();
                Double latituteSubmittedVal = facility.getLatitude() - getLatitudeSubmitted();
                Double longitudeSubmittedVal = facility.getLongitude() - getLongitudeSubmitted();
                checkIn = DateUtil.round(( latituteCreatedVal < 0 ? -latituteCreatedVal : latituteCreatedVal) + (longitudeCreatedVal < 0 ? -longitudeCreatedVal : longitudeCreatedVal), 3);
                checkOut = DateUtil.round((latituteSubmittedVal < 0 ? -latituteSubmittedVal : latituteSubmittedVal) + (longitudeSubmittedVal < 0 ? -longitudeSubmittedVal : longitudeSubmittedVal), 3);
                if ((checkIn >= -0.009 && checkIn <= 0.009) && (checkOut >= -0.009 && checkOut <= 0.009)) {
                    return "OK";
                } else {
                    return "Mismatch";
                }
            }

        }
        return "No GPS";
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<FacilityChallenge> getFacilityChallenges() {
        return facilityChallenges;
    }

    public void setFacilityChallenges(List<FacilityChallenge> facilityChallenges) {
        this.facilityChallenges = facilityChallenges;
    }
    
    public String getFacilityChallenge() {
        String challenge = "";
        int count = 0;
        for(FacilityChallenge item : facilityChallenges){
            if(count < facilityChallenges.size()-1){
                challenge += item.getDetail()+", ";
            }else{
                challenge += item.getDetail();
            }
            count++;
        }
        return challenge;
    }
    
    public String getCheckInCheck() {
        Double checkIn = 0.0;
        if (getLatitudeCreated() != null && getLongitudeCreated() != null) {
            if (facility.getLatitude() != null && facility.getLongitude() != null) {
                Double latituteCreatedVal = facility.getLatitude() - getLatitudeCreated();
                Double longitudeCreatedVal = facility.getLongitude() - getLongitudeCreated();
                checkIn = DateUtil.round(( latituteCreatedVal < 0 ? -latituteCreatedVal : latituteCreatedVal) + (longitudeCreatedVal < 0 ? -longitudeCreatedVal : longitudeCreatedVal), 3);
                if ((checkIn >= -0.009 && checkIn <= 0.009)) {
                    return "Y";
                } else {
                    return "N";
                }
            }

        }
        return "No GPS";
    }
    
    public String getCheckOutCheck() {
        Double checkOut = 0.0;
        if (getLatitudeSubmitted() != null && getLongitudeSubmitted() != null){
            if (facility.getLatitude() != null && facility.getLongitude() != null) {
                Double latituteSubmittedVal = facility.getLatitude() - getLatitudeSubmitted();
                Double longitudeSubmittedVal = facility.getLongitude() - getLongitudeSubmitted();
                checkOut = DateUtil.round((latituteSubmittedVal < 0 ? -latituteSubmittedVal : latituteSubmittedVal) + (longitudeSubmittedVal < 0 ? -longitudeSubmittedVal : longitudeSubmittedVal), 3);
                if ((checkOut >= -0.009 && checkOut <= 0.009)) {
                    return "Y";
                } else {
                    return "N";
                }
            }

        }
        return "No GPS";
    }
}
