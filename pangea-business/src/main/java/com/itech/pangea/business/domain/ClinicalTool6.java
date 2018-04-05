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
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Judge Muzinda
 */
@Entity
public class ClinicalTool6 extends BaseEntity {
    
    @ManyToOne
    private Mentee mentee;
    String mentorName;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date entryDate;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date AssDateI;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date AssDateF;
    private Integer childEligToArtI, childEligToArtF;
    private String childEligToArtComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date artInitiationI, artInitiationF;
    private Integer artInitiationScoreI, artInitiationScoreF;
    private String artInitiationComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date artAdolescentI, artAdolescentF;
    private Integer artAdolescenScoreI, artAdolescenScoreF;
    private String artAdolescentComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date artMonitoringChildrenI, artMonitoringChildrenF;
    private Integer artMonitoringChildrenScoreI, artMonitoringChildrenScoreF;
    private String artMonitoringChildrenComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date artEligibilityAdultI, artEligibilityAdultF;
    private Integer artEligibilityAdultScoreI, artEligibilityAdultScoreF;
    private String artEligibilityAdultComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date artMonitoringAdultI, artMonitoringAdultF;
    private Integer artMonitoringAdultScoreI, artMonitoringAdultScoreF;
    private String artMonitoringAdultComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date artPregWomenI, artPregWomenF;
    private Integer artPregWomenScoreI, artPregWomenScoreF;
    private String artPregWomenComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date tbHIVI, tbHIVF;
    private Integer tbHIVScoreI, tbHIVScoreF;
    private String tbHIVComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date stiI, stiF;
    private Integer stiScoreI, stiScoreF;
    private String stiComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date patientArtAdherenceI, patientArtAdherenceF;
    private Integer patientArtAdherenceScoreI, patientArtAdherenceScoreF;
    private String patientArtAdherenceComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date medicineSideEffectsI, medicineSideEffectsF;
    private Integer medicineSideEffectsScoreI, medicineSideEffectsScoreF;
    private String medicineSideEffectsComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date treatmentFailureI, treatmentFailureF;
    private Integer treatmentFailureScoreI, treatmentFailureScoreF;
    private String treatmentFailureComments;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date adverseReactionI, adverseReactionF;
    private Integer adverseReactionScoreI, adverseReactionScoreF;
    private String adverseReactionComments;

    public ClinicalTool6() {
    }

    public ClinicalTool6(Mentee mentee) {
        this.mentee = mentee;
    }

    public Mentee getMentee() {
        return mentee;
    }

    public void setMentee(Mentee mentee) {
        this.mentee = mentee;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getAssDateI() {
        return AssDateI;
    }

    public void setAssDateI(Date AssDateI) {
        this.AssDateI = AssDateI;
    }

    public Date getAssDateF() {
        return AssDateF;
    }

    public void setAssDateF(Date AssDateF) {
        this.AssDateF = AssDateF;
    }

    public Integer getChildEligToArtI() {
        return childEligToArtI;
    }

    public void setChildEligToArtI(Integer childEligToArtI) {
        this.childEligToArtI = childEligToArtI;
    }

    public Integer getChildEligToArtF() {
        return childEligToArtF;
    }

    public void setChildEligToArtF(Integer childEligToArtF) {
        this.childEligToArtF = childEligToArtF;
    }

    public String getChildEligToArtComments() {
        return childEligToArtComments;
    }

    public void setChildEligToArtComments(String childEligToArtComments) {
        this.childEligToArtComments = childEligToArtComments;
    }

    public Date getArtInitiationI() {
        return artInitiationI;
    }

    public void setArtInitiationI(Date artInitiationI) {
        this.artInitiationI = artInitiationI;
    }

    public Date getArtInitiationF() {
        return artInitiationF;
    }

    public void setArtInitiationF(Date artInitiationF) {
        this.artInitiationF = artInitiationF;
    }

    public Integer getArtInitiationScoreI() {
        return artInitiationScoreI;
    }

    public void setArtInitiationScoreI(Integer artInitiationScoreI) {
        this.artInitiationScoreI = artInitiationScoreI;
    }

    public Integer getArtInitiationScoreF() {
        return artInitiationScoreF;
    }

    public void setArtInitiationScoreF(Integer artInitiationScoreF) {
        this.artInitiationScoreF = artInitiationScoreF;
    }

    public String getArtInitiationComments() {
        return artInitiationComments;
    }

    public void setArtInitiationComments(String artInitiationComments) {
        this.artInitiationComments = artInitiationComments;
    }

    public Date getArtAdolescentI() {
        return artAdolescentI;
    }

    public void setArtAdolescentI(Date artAdolescentI) {
        this.artAdolescentI = artAdolescentI;
    }

    public Date getArtAdolescentF() {
        return artAdolescentF;
    }

    public void setArtAdolescentF(Date artAdolescentF) {
        this.artAdolescentF = artAdolescentF;
    }

    public Integer getArtAdolescenScoreI() {
        return artAdolescenScoreI;
    }

    public void setArtAdolescenScoreI(Integer artAdolescenScoreI) {
        this.artAdolescenScoreI = artAdolescenScoreI;
    }

    public Integer getArtAdolescenScoreF() {
        return artAdolescenScoreF;
    }

    public void setArtAdolescenScoreF(Integer artAdolescenScoreF) {
        this.artAdolescenScoreF = artAdolescenScoreF;
    }

    public String getArtAdolescentComments() {
        return artAdolescentComments;
    }

    public void setArtAdolescentComments(String artAdolescentComments) {
        this.artAdolescentComments = artAdolescentComments;
    }

    public Date getArtMonitoringChildrenI() {
        return artMonitoringChildrenI;
    }

    public void setArtMonitoringChildrenI(Date artMonitoringChildrenI) {
        this.artMonitoringChildrenI = artMonitoringChildrenI;
    }

    public Date getArtMonitoringChildrenF() {
        return artMonitoringChildrenF;
    }

    public void setArtMonitoringChildrenF(Date artMonitoringChildrenF) {
        this.artMonitoringChildrenF = artMonitoringChildrenF;
    }

    public Integer getArtMonitoringChildrenScoreI() {
        return artMonitoringChildrenScoreI;
    }

    public void setArtMonitoringChildrenScoreI(Integer artMonitoringChildrenScoreI) {
        this.artMonitoringChildrenScoreI = artMonitoringChildrenScoreI;
    }

    public Integer getArtMonitoringChildrenScoreF() {
        return artMonitoringChildrenScoreF;
    }

    public void setArtMonitoringChildrenScoreF(Integer artMonitoringChildrenScoreF) {
        this.artMonitoringChildrenScoreF = artMonitoringChildrenScoreF;
    }

    public String getArtMonitoringChildrenComments() {
        return artMonitoringChildrenComments;
    }

    public void setArtMonitoringChildrenComments(String artMonitoringChildrenComments) {
        this.artMonitoringChildrenComments = artMonitoringChildrenComments;
    }

    public Date getArtEligibilityAdultI() {
        return artEligibilityAdultI;
    }

    public void setArtEligibilityAdultI(Date artEligibilityAdultI) {
        this.artEligibilityAdultI = artEligibilityAdultI;
    }

    public Date getArtEligibilityAdultF() {
        return artEligibilityAdultF;
    }

    public void setArtEligibilityAdultF(Date artEligibilityAdultF) {
        this.artEligibilityAdultF = artEligibilityAdultF;
    }

    public Integer getArtEligibilityAdultScoreI() {
        return artEligibilityAdultScoreI;
    }

    public void setArtEligibilityAdultScoreI(Integer artEligibilityAdultScoreI) {
        this.artEligibilityAdultScoreI = artEligibilityAdultScoreI;
    }

    public Integer getArtEligibilityAdultScoreF() {
        return artEligibilityAdultScoreF;
    }

    public void setArtEligibilityAdultScoreF(Integer artEligibilityAdultScoreF) {
        this.artEligibilityAdultScoreF = artEligibilityAdultScoreF;
    }

    public String getArtEligibilityAdultComments() {
        return artEligibilityAdultComments;
    }

    public void setArtEligibilityAdultComments(String artEligibilityAdultComments) {
        this.artEligibilityAdultComments = artEligibilityAdultComments;
    }

    public Date getArtMonitoringAdultI() {
        return artMonitoringAdultI;
    }

    public void setArtMonitoringAdultI(Date artMonitoringAdultI) {
        this.artMonitoringAdultI = artMonitoringAdultI;
    }

    public Date getArtMonitoringAdultF() {
        return artMonitoringAdultF;
    }

    public void setArtMonitoringAdultF(Date artMonitoringAdultF) {
        this.artMonitoringAdultF = artMonitoringAdultF;
    }

    public Integer getArtMonitoringAdultScoreI() {
        return artMonitoringAdultScoreI;
    }

    public void setArtMonitoringAdultScoreI(Integer artMonitoringAdultScoreI) {
        this.artMonitoringAdultScoreI = artMonitoringAdultScoreI;
    }

    public Integer getArtMonitoringAdultScoreF() {
        return artMonitoringAdultScoreF;
    }

    public void setArtMonitoringAdultScoreF(Integer artMonitoringAdultScoreF) {
        this.artMonitoringAdultScoreF = artMonitoringAdultScoreF;
    }

    public String getArtMonitoringAdultComments() {
        return artMonitoringAdultComments;
    }

    public void setArtMonitoringAdultComments(String artMonitoringAdultComments) {
        this.artMonitoringAdultComments = artMonitoringAdultComments;
    }

    public Date getArtPregWomenI() {
        return artPregWomenI;
    }

    public void setArtPregWomenI(Date artPregWomenI) {
        this.artPregWomenI = artPregWomenI;
    }

    public Date getArtPregWomenF() {
        return artPregWomenF;
    }

    public void setArtPregWomenF(Date artPregWomenF) {
        this.artPregWomenF = artPregWomenF;
    }

    public Integer getArtPregWomenScoreI() {
        return artPregWomenScoreI;
    }

    public void setArtPregWomenScoreI(Integer artPregWomenScoreI) {
        this.artPregWomenScoreI = artPregWomenScoreI;
    }

    public Integer getArtPregWomenScoreF() {
        return artPregWomenScoreF;
    }

    public void setArtPregWomenScoreF(Integer artPregWomenScoreF) {
        this.artPregWomenScoreF = artPregWomenScoreF;
    }

    public String getArtPregWomenComments() {
        return artPregWomenComments;
    }

    public void setArtPregWomenComments(String artPregWomenComments) {
        this.artPregWomenComments = artPregWomenComments;
    }

    public Date getTbHIVI() {
        return tbHIVI;
    }

    public void setTbHIVI(Date tbHIVI) {
        this.tbHIVI = tbHIVI;
    }

    public Date getTbHIVF() {
        return tbHIVF;
    }

    public void setTbHIVF(Date tbHIVF) {
        this.tbHIVF = tbHIVF;
    }

    public Integer getTbHIVScoreI() {
        return tbHIVScoreI;
    }

    public void setTbHIVScoreI(Integer tbHIVScoreI) {
        this.tbHIVScoreI = tbHIVScoreI;
    }

    public Integer getTbHIVScoreF() {
        return tbHIVScoreF;
    }

    public void setTbHIVScoreF(Integer tbHIVScoreF) {
        this.tbHIVScoreF = tbHIVScoreF;
    }

    public String getTbHIVComments() {
        return tbHIVComments;
    }

    public void setTbHIVComments(String tbHIVComments) {
        this.tbHIVComments = tbHIVComments;
    }

    public Date getStiI() {
        return stiI;
    }

    public void setStiI(Date stiI) {
        this.stiI = stiI;
    }

    public Date getStiF() {
        return stiF;
    }

    public void setStiF(Date stiF) {
        this.stiF = stiF;
    }

    public Integer getStiScoreI() {
        return stiScoreI;
    }

    public void setStiScoreI(Integer stiScoreI) {
        this.stiScoreI = stiScoreI;
    }

    public Integer getStiScoreF() {
        return stiScoreF;
    }

    public void setStiScoreF(Integer stiScoreF) {
        this.stiScoreF = stiScoreF;
    }

    public String getStiComments() {
        return stiComments;
    }

    public void setStiComments(String stiComments) {
        this.stiComments = stiComments;
    }

    public Date getPatientArtAdherenceI() {
        return patientArtAdherenceI;
    }

    public void setPatientArtAdherenceI(Date patientArtAdherenceI) {
        this.patientArtAdherenceI = patientArtAdherenceI;
    }

    public Date getPatientArtAdherenceF() {
        return patientArtAdherenceF;
    }

    public void setPatientArtAdherenceF(Date patientArtAdherenceF) {
        this.patientArtAdherenceF = patientArtAdherenceF;
    }

    public Integer getPatientArtAdherenceScoreI() {
        return patientArtAdherenceScoreI;
    }

    public void setPatientArtAdherenceScoreI(Integer patientArtAdherenceScoreI) {
        this.patientArtAdherenceScoreI = patientArtAdherenceScoreI;
    }

    public Integer getPatientArtAdherenceScoreF() {
        return patientArtAdherenceScoreF;
    }

    public void setPatientArtAdherenceScoreF(Integer patientArtAdherenceScoreF) {
        this.patientArtAdherenceScoreF = patientArtAdherenceScoreF;
    }

    public String getPatientArtAdherenceComments() {
        return patientArtAdherenceComments;
    }

    public void setPatientArtAdherenceComments(String patientArtAdherenceComments) {
        this.patientArtAdherenceComments = patientArtAdherenceComments;
    }

    public Date getMedicineSideEffectsI() {
        return medicineSideEffectsI;
    }

    public void setMedicineSideEffectsI(Date medicineSideEffectsI) {
        this.medicineSideEffectsI = medicineSideEffectsI;
    }

    public Date getMedicineSideEffectsF() {
        return medicineSideEffectsF;
    }

    public void setMedicineSideEffectsF(Date medicineSideEffectsF) {
        this.medicineSideEffectsF = medicineSideEffectsF;
    }

    public Integer getMedicineSideEffectsScoreI() {
        return medicineSideEffectsScoreI;
    }

    public void setMedicineSideEffectsScoreI(Integer medicineSideEffectsScoreI) {
        this.medicineSideEffectsScoreI = medicineSideEffectsScoreI;
    }

    public Integer getMedicineSideEffectsScoreF() {
        return medicineSideEffectsScoreF;
    }

    public void setMedicineSideEffectsScoreF(Integer medicineSideEffectsScoreF) {
        this.medicineSideEffectsScoreF = medicineSideEffectsScoreF;
    }

    public String getMedicineSideEffectsComments() {
        return medicineSideEffectsComments;
    }

    public void setMedicineSideEffectsComments(String medicineSideEffectsComments) {
        this.medicineSideEffectsComments = medicineSideEffectsComments;
    }

    public Date getTreatmentFailureI() {
        return treatmentFailureI;
    }

    public void setTreatmentFailureI(Date treatmentFailureI) {
        this.treatmentFailureI = treatmentFailureI;
    }

    public Date getTreatmentFailureF() {
        return treatmentFailureF;
    }

    public void setTreatmentFailureF(Date treatmentFailureF) {
        this.treatmentFailureF = treatmentFailureF;
    }

    public Integer getTreatmentFailureScoreI() {
        return treatmentFailureScoreI;
    }

    public void setTreatmentFailureScoreI(Integer treatmentFailureScoreI) {
        this.treatmentFailureScoreI = treatmentFailureScoreI;
    }

    public Integer getTreatmentFailureScoreF() {
        return treatmentFailureScoreF;
    }

    public void setTreatmentFailureScoreF(Integer treatmentFailureScoreF) {
        this.treatmentFailureScoreF = treatmentFailureScoreF;
    }

    public String getTreatmentFailureComments() {
        return treatmentFailureComments;
    }

    public void setTreatmentFailureComments(String treatmentFailureComments) {
        this.treatmentFailureComments = treatmentFailureComments;
    }

    public Date getAdverseReactionI() {
        return adverseReactionI;
    }

    public void setAdverseReactionI(Date adverseReactionI) {
        this.adverseReactionI = adverseReactionI;
    }

    public Date getAdverseReactionF() {
        return adverseReactionF;
    }

    public void setAdverseReactionF(Date adverseReactionF) {
        this.adverseReactionF = adverseReactionF;
    }

    public Integer getAdverseReactionScoreI() {
        return adverseReactionScoreI;
    }

    public void setAdverseReactionScoreI(Integer adverseReactionScoreI) {
        this.adverseReactionScoreI = adverseReactionScoreI;
    }

    public Integer getAdverseReactionScoreF() {
        return adverseReactionScoreF;
    }

    public void setAdverseReactionScoreF(Integer adverseReactionScoreF) {
        this.adverseReactionScoreF = adverseReactionScoreF;
    }

    public String getAdverseReactionComments() {
        return adverseReactionComments;
    }

    public void setAdverseReactionComments(String adverseReactionComments) {
        this.adverseReactionComments = adverseReactionComments;
    }
}