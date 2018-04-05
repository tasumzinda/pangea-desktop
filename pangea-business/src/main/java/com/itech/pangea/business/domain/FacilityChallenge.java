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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.util.DateUtil;

/**
 *
 * @author Judge Muzinda
 */
@Entity
public class FacilityChallenge extends BaseEntity {

    @Column(columnDefinition = "text", name = "details")
    private String detail;
    @ManyToOne
    private Challenge challenge;
    private String expectedOutcome;
    private String actionTaken;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date expectedCompletionDate;
    private String realistic;
    private String achievable;
    private String measurementMethod;
    private String specificDetail;
    private String others;
    @ManyToOne
    private ChallengeStatus challengeStatus;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date followUpDate;
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne
    private CaseFile caseFile;
    @ManyToOne
    private FacilityChallenge parent;
    private Integer review = 0;
    private String statusCode;
    @ManyToOne
    private ActionTaken actionCategory;
    private String specify;
    @Transient
    private List<FacilityChallenge> children = new ArrayList<>();

    public FacilityChallenge() {
    }

    public FacilityChallenge(String detail, Challenge challenge, String expectedOutcome, String actionTaken, ChallengeStatus challengeStatus, String realistic,String achievable,String measurementMethod,String specificDetail,String others, ActionTaken actionCategory,String specify) {
        this.detail = detail;
        this.challenge = challenge;
        this.expectedOutcome = expectedOutcome;
        this.actionTaken = actionTaken;
        this.challengeStatus = challengeStatus;
        this.realistic = realistic;
        this.achievable = achievable;
        this.measurementMethod = measurementMethod;
        this.specificDetail = specificDetail;
        this.others = others;
        this.actionCategory = actionCategory;
        this.specify = specify;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSpecify() {
        return specify;
    }

    public void setSpecify(String specify) {
        this.specify = specify;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public String getExpectedOutcome() {
        return expectedOutcome;
    }

    public void setExpectedOutcome(String expectedOutcome) {
        this.expectedOutcome = expectedOutcome;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public ChallengeStatus getChallengeStatus() {
        return challengeStatus;
    }

    public void setChallengeStatus(ChallengeStatus challengeStatus) {
        this.challengeStatus = challengeStatus;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    public CaseFile getCaseFile() {
        return caseFile;
    }

    public void setCaseFile(CaseFile caseFile) {
        this.caseFile = caseFile;
    }

    public FacilityChallenge getParent() {
        return parent;
    }

    public void setParent(FacilityChallenge parent) {
        this.parent = parent;
    }

    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    public Date getExpectedCompletionDate() {
        return expectedCompletionDate;
    }

    public void setExpectedCompletionDate(Date expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
    }

    public String getRealistic() {
        return realistic;
    }

    public void setRealistic(String realistic) {
        this.realistic = realistic;
    }

    public String getAchievable() {
        return achievable;
    }

    public void setAchievable(String achievable) {
        this.achievable = achievable;
    }

    public String getMeasurementMethod() {
        return measurementMethod;
    }

    public void setMeasurementMethod(String measurementMethod) {
        this.measurementMethod = measurementMethod;
    }

    public String getSpecificDetail() {
        return specificDetail;
    }

    public void setSpecificDetail(String specificDetail) {
        this.specificDetail = specificDetail;
    }

    public ActionTaken getActionCategory() {
        return actionCategory;
    }

    public void setActionCategory(ActionTaken actionCategory) {
        this.actionCategory = actionCategory;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public List<FacilityChallenge> getChildren() {
        return children;
    }

    public void setChildren(List<FacilityChallenge> children) {
        this.children = children;
    }

    public String getStatusCode() {
        //if ((challengeStatus != null && !challengeStatus.getName().equalsIgnoreCase("Pending")) || challengeStatus == null) {
        if ((challengeStatus != null && !challengeStatus.getName().equalsIgnoreCase("Pending")) || challengeStatus == null) {
            return "";
        }
        //expected resolution date TODO
        Integer numDays = DateUtil.getDays(getExpectedCompletionDate(), new Date());
        if (numDays <= 30) {
            return "/resources/images/green.png";
        } else if (numDays >= 31 && numDays <= 90) {
            return "/resources/images/yellow.png";
        }
        return "/resources/images/red.png";
    }

}
