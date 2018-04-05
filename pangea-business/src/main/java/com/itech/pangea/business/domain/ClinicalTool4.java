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
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.util.Completion;
import com.itech.pangea.business.domain.util.Knowledge;

/**
 *
 * @author Judge Muzinda
 */
@Entity
public class ClinicalTool4 extends BaseEntity {

    @ManyToOne
    private Mentee mentee;
    //score is drop down comes in two parts 1,2,3 and 
    //a,b,x and associate with mentee mentee auto search functionality
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date visit1;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date visit2;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date visit3;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date visit4;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date visit5;
    //Mentee treats patient with RESPECT
    @Enumerated
    private Knowledge treatPatientWithRespectK1, treatPatientWithRespectK2, treatPatientWithRespectK3, treatPatientWithRespectK4, treatPatientWithRespectK5;
    @Enumerated
    private Completion treatPatientWithRespectC1, treatPatientWithRespectC2, treatPatientWithRespectC3, treatPatientWithRespectC4, treatPatientWithRespectC5;
    //2.1 Performs Pre and Post-test counselling skills, following testing algorithm 					
    @Enumerated
    private Knowledge prePostCounsK1, prePostCounsK2, prePostCounsK3, prePostCounsK4, prePostCounsK5;
    @Enumerated
    private Completion prePostCounsC1, prePostCounsC2, prePostCounsC3, prePostCounsC4, prePostCounsC5;
    //2.2 Correct collection and packaging of DBS specimen 					
    @Enumerated
    private Knowledge dbsSpecimenK1, dbsSpecimenK2, dbsSpecimenK3, dbsSpecimenK4, dbsSpecimenK5;
    @Enumerated
    private Completion dbsSpecimenC1, dbsSpecimenC2, dbsSpecimenC3, dbsSpecimenC4, dbsSpecimenC5;
    //2.3 POC (Competency needed here)
    @Enumerated
    private Knowledge pocK1, pocK2, pocK3, pocK4, pocK5;
    @Enumerated
    private Completion pocC1, pocC2, pocC3, pocC4, pocC5;
    //3.1. Prepares patients for ARVs (pre- ART counseling): Adherence, disclosure, side effects/toxicity, safer sex,
    @Enumerated
    private Knowledge adherenceK1, adherenceK2, adherenceK3, adherenceK4, adherenceK5;
    @Enumerated
    private Completion adherenceC1, adherenceC2, adherenceC3, adherenceC4, adherenceC5;
    //3.2. Prescribes correct ARVs for HIV + pregnant women and HIV exposed infants according to national guidelines (ARV prophylaxis, breastfeeding, EID, retesting, safer sex for the parents/partners)
    @Enumerated
    private Knowledge correctArvInfantK1, correctArvInfantK2, correctArvInfantK3, correctArvKInfant4, correctArvInfantK5;
    @Enumerated
    private Completion correctArvInfantC1, correctArvInfantC2, correctArvInfantC3, correctArvInfantC4, correctArvInfantC5;
    //3.3. Prescribes the correct ARVs for the first line regimen in pregnant women, children and general patients according to national guidelines
    @Enumerated
    private Knowledge pregWomenArvK1, pregWomenArvK2, pregWomenArvK3, pregWomenArvK4, pregWomenArvK5;
    @Enumerated
    private Completion pregWomenArvC1, pregWomenArvC2, pregWomenArvC3, pregWomenArvC4, pregWomenArvC5;
    //3.4. Assess for common and serious side effects of each ARV and manage/ refer appropriately (asking and requesting appropriate lab investigations)
    @Enumerated
    private Knowledge arvSideEffectK1, arvSideEffectK2, arvSideEffectK3, arvSideEffectK4, arvSideEffectK5;
    @Enumerated
    private Completion arvSideEffectC1, arvSideEffectC2, arvSideEffectC3, arvSideEffectC4, arvSideEffectC5;
    //3.5. Assess for, recognize and provide appropriate therapy/ referral for incident OI/ immune reconstitution inflammatory syndrome (IRIS)
    @Enumerated
    private Knowledge therapyOIK1, therapyOIK2, therapyOIK3, therapyOIK4, therapyOIK5;
    @Enumerated
    private Completion therapyOIC1, therapyOIC2, therapyOIC3, therapyOIC4, therapyOIC5;
    //3.6. Make appropriate substitutions to alternative 1st line ARV regimens in appropriate circumstances
    @Enumerated
    private Knowledge subARVK1, subARVK2, subARVK3, subARVK4, subARVK5;
    @Enumerated
    private Completion subARVC1, subARVC2, subARVC3, subARVC4, subARVC5;
    //3.7. Monitor for treatment success (clinical, immunological and virological)
    @Enumerated
    private Knowledge monitorTreatmentK1, monitorTreatmentK2, monitorTreatmentK3, monitorTreatmentK4, monitorTreatmentK5;
    @Enumerated
    private Completion monitorTreatmentC1, monitorTreatmentC2, monitorTreatmentC3, monitorTreatmentC4, monitorTreatmentC5;
    //3.8. Appropriateness of recommended labs tests ordered and interpretation of results.
    @Enumerated
    private Knowledge labTestInterpK1, labTestInterpK2, labTestInterpK3, labTestInterpK4, labTestInterpK5;
    @Enumerated
    private Completion labTestInterpC1, labTestInterpC2, labTestInterpC3, labTestInterpC4, labTestInterpC5;
    //3.9. Explained laboratory results to patient
    @Enumerated
    private Knowledge expLabResK1, expLabResK2, expLabResK3, expLabResK4, expLabResK5;
    @Enumerated
    private Completion expLabResC1, expLabResC2, expLabResC3, expLabResC4, expLabResC5;
    //3.10. Demonstrates competency in the management of the HIV patient, including managing refill of ART prescriptions.
    @Enumerated
    private Knowledge compManHIVK1, compManHIVK2, compManHIVK3, compManHIVK4, compManHIVK5;
    @Enumerated
    private Completion compManHIVC1, compManHIVC2, compManHIVC3, compManHIVC4, compManHIVC5;
    //4.1. Educate patients on HIV disease (transmission, prevention and progression) as needed
    @Enumerated
    private Knowledge hivDiseaseK1, hivDiseaseK2, hivDiseaseK3, hivDiseaseK4, hivDiseaseK5;
    @Enumerated
    private Completion hivDiseaseC1, hivDiseaseC2, hivDiseaseC3, hivDiseaseC4, hivDiseaseC5;
    //4.2. Screens all OI/ART patients for TB using the TB screening tool
    @Enumerated
    private Knowledge oiartTBK1, oiartTBK2, oiartTBK3, oiartTBK4, oiartTBK5;
    @Enumerated
    private Completion oiartTBC1, oiartTBC2, oiartTBC3, oiartTBC4, oiartTBC5;
    //4.3. Discusses previous or ongoing treatment for current illnesses
    @Enumerated
    private Knowledge ongoingTreatmentK1, ongoingTreatmentK2, ongoingTreatmentK3, ongoingTreatmentK4, ongoingTreatmentK5;
    @Enumerated
    private Completion ongoingTreatmentC1, ongoingTreatmentC2, ongoingTreatmentC3, ongoingTreatmentC4, ongoingTreatmentC5;
    //4.4. Performs a STI risk assessment, as required in algorithm
    @Enumerated
    private Knowledge stiRiskAssK1, stiRiskAssK2, stiRiskAssK3, stiRiskAssK4, stiRiskAssK5;
    @Enumerated
    private Completion stiRiskAssC1, stiRiskAssC2, stiRiskAssC3, stiRiskAssC4, stiRiskAssC5;
    //4.5. Demonstrates competency in adherence counseling.
    @Enumerated
    private Knowledge compAddCounsK1, compAddCounsK2, compAddCounsK3, compAddCounsK4, compAddCounsK5;
    @Enumerated
    private Completion compAddCounsC1, compAddCounsC2, compAddCounsC3, compAddCounsC4, compAddCounsC5;
    //4.6. Patient education on contraceptive use, and sexual and other high risk behaviours
    @Enumerated
    private Knowledge patEduK1, patEduK2, patEduK3, patEduK4, patEduK5;
    @Enumerated
    private Completion patEduC1, patEduC2, patEduC3, patEduC4, patEduC5;
    //4.7. Psychosocial support needs / possibilities discussed, including nutritional security and linkages to care (cancer screening)
    @Enumerated
    private Knowledge psySuppK1, psySuppK2, psySuppK3, psySuppK4, psySuppK5;
    @Enumerated
    private Completion psySuppC1, psySuppC2, psySuppC3, psySuppC4, psySuppC5;
    //4.8. Counsel mother on benefits of exclusive breastfeeding for 6months and complementary feeding up to 2 years
    @Enumerated
    private Knowledge counsMomExcBreastK1, counsMomExcBreastK2, counsMomExcBreastK3, counsMomExcBreastK4, counsMomExcBreastK5;
    @Enumerated
    private Completion counsMomExcBreastC1, counsMomExcBreastC2, counsMomExcBreastC3, counsMomExcBreastC4, counsMomExcBreastC5;
    //4.9. Screens all OI/ART patients for TB using the TB screening tool
    @Enumerated
    private Knowledge screenOIK1, screenOIK2, screenOIK3, screenOIK4, screenOIK5;
    @Enumerated
    private Completion screenOIC1, screenOIC2, screenOIC3, screenOIC4, screenOIC5;
    //5.1. Documentation accuracy and completeness
    @Enumerated
    private Knowledge docAccK1, docAccK2, docAccK3, docAccK4, docAccK5;
    @Enumerated
    private Completion docAccC1, docAccC2, docAccC3, docAccC4, docAccC5;
    //MENTOR NAME 
    private String mentoName1, mentoName2, mentoName3, mentoName4, mentoName5;

    public ClinicalTool4() {
    }

    public ClinicalTool4(Mentee mentee) {
        this.mentee = mentee;
    }

    public Mentee getMentee() {
        return mentee;
    }

    public void setMentee(Mentee mentee) {
        this.mentee = mentee;
    }

    public Date getVisit1() {
        return visit1;
    }

    public void setVisit1(Date visit1) {
        this.visit1 = visit1;
    }

    public Date getVisit2() {
        return visit2;
    }

    public void setVisit2(Date visit2) {
        this.visit2 = visit2;
    }

    public Date getVisit3() {
        return visit3;
    }

    public void setVisit3(Date visit3) {
        this.visit3 = visit3;
    }

    public Date getVisit4() {
        return visit4;
    }

    public void setVisit4(Date visit4) {
        this.visit4 = visit4;
    }

    public Date getVisit5() {
        return visit5;
    }

    public void setVisit5(Date visit5) {
        this.visit5 = visit5;
    }

    public Knowledge getTreatPatientWithRespectK1() {
        return treatPatientWithRespectK1;
    }

    public void setTreatPatientWithRespectK1(Knowledge treatPatientWithRespectK1) {
        this.treatPatientWithRespectK1 = treatPatientWithRespectK1;
    }

    public Knowledge getTreatPatientWithRespectK2() {
        return treatPatientWithRespectK2;
    }

    public void setTreatPatientWithRespectK2(Knowledge treatPatientWithRespectK2) {
        this.treatPatientWithRespectK2 = treatPatientWithRespectK2;
    }

    public Knowledge getTreatPatientWithRespectK3() {
        return treatPatientWithRespectK3;
    }

    public void setTreatPatientWithRespectK3(Knowledge treatPatientWithRespectK3) {
        this.treatPatientWithRespectK3 = treatPatientWithRespectK3;
    }

    public Knowledge getTreatPatientWithRespectK4() {
        return treatPatientWithRespectK4;
    }

    public void setTreatPatientWithRespectK4(Knowledge treatPatientWithRespectK4) {
        this.treatPatientWithRespectK4 = treatPatientWithRespectK4;
    }

    public Knowledge getTreatPatientWithRespectK5() {
        return treatPatientWithRespectK5;
    }

    public void setTreatPatientWithRespectK5(Knowledge treatPatientWithRespectK5) {
        this.treatPatientWithRespectK5 = treatPatientWithRespectK5;
    }

    public Completion getTreatPatientWithRespectC1() {
        return treatPatientWithRespectC1;
    }

    public void setTreatPatientWithRespectC1(Completion treatPatientWithRespectC1) {
        this.treatPatientWithRespectC1 = treatPatientWithRespectC1;
    }

    public Completion getTreatPatientWithRespectC2() {
        return treatPatientWithRespectC2;
    }

    public void setTreatPatientWithRespectC2(Completion treatPatientWithRespectC2) {
        this.treatPatientWithRespectC2 = treatPatientWithRespectC2;
    }

    public Completion getTreatPatientWithRespectC3() {
        return treatPatientWithRespectC3;
    }

    public void setTreatPatientWithRespectC3(Completion treatPatientWithRespectC3) {
        this.treatPatientWithRespectC3 = treatPatientWithRespectC3;
    }

    public Completion getTreatPatientWithRespectC4() {
        return treatPatientWithRespectC4;
    }

    public void setTreatPatientWithRespectC4(Completion treatPatientWithRespectC4) {
        this.treatPatientWithRespectC4 = treatPatientWithRespectC4;
    }

    public Completion getTreatPatientWithRespectC5() {
        return treatPatientWithRespectC5;
    }

    public void setTreatPatientWithRespectC5(Completion treatPatientWithRespectC5) {
        this.treatPatientWithRespectC5 = treatPatientWithRespectC5;
    }

    public Knowledge getPrePostCounsK1() {
        return prePostCounsK1;
    }

    public void setPrePostCounsK1(Knowledge prePostCounsK1) {
        this.prePostCounsK1 = prePostCounsK1;
    }

    public Knowledge getPrePostCounsK2() {
        return prePostCounsK2;
    }

    public void setPrePostCounsK2(Knowledge prePostCounsK2) {
        this.prePostCounsK2 = prePostCounsK2;
    }

    public Knowledge getPrePostCounsK3() {
        return prePostCounsK3;
    }

    public void setPrePostCounsK3(Knowledge prePostCounsK3) {
        this.prePostCounsK3 = prePostCounsK3;
    }

    public Knowledge getPrePostCounsK4() {
        return prePostCounsK4;
    }

    public void setPrePostCounsK4(Knowledge prePostCounsK4) {
        this.prePostCounsK4 = prePostCounsK4;
    }

    public Knowledge getPrePostCounsK5() {
        return prePostCounsK5;
    }

    public void setPrePostCounsK5(Knowledge prePostCounsK5) {
        this.prePostCounsK5 = prePostCounsK5;
    }

    public Completion getPrePostCounsC1() {
        return prePostCounsC1;
    }

    public void setPrePostCounsC1(Completion prePostCounsC1) {
        this.prePostCounsC1 = prePostCounsC1;
    }

    public Completion getPrePostCounsC2() {
        return prePostCounsC2;
    }

    public void setPrePostCounsC2(Completion prePostCounsC2) {
        this.prePostCounsC2 = prePostCounsC2;
    }

    public Completion getPrePostCounsC3() {
        return prePostCounsC3;
    }

    public void setPrePostCounsC3(Completion prePostCounsC3) {
        this.prePostCounsC3 = prePostCounsC3;
    }

    public Completion getPrePostCounsC4() {
        return prePostCounsC4;
    }

    public void setPrePostCounsC4(Completion prePostCounsC4) {
        this.prePostCounsC4 = prePostCounsC4;
    }

    public Completion getPrePostCounsC5() {
        return prePostCounsC5;
    }

    public void setPrePostCounsC5(Completion prePostCounsC5) {
        this.prePostCounsC5 = prePostCounsC5;
    }

    public Knowledge getDbsSpecimenK1() {
        return dbsSpecimenK1;
    }

    public void setDbsSpecimenK1(Knowledge dbsSpecimenK1) {
        this.dbsSpecimenK1 = dbsSpecimenK1;
    }

    public Knowledge getDbsSpecimenK2() {
        return dbsSpecimenK2;
    }

    public void setDbsSpecimenK2(Knowledge dbsSpecimenK2) {
        this.dbsSpecimenK2 = dbsSpecimenK2;
    }

    public Knowledge getDbsSpecimenK3() {
        return dbsSpecimenK3;
    }

    public void setDbsSpecimenK3(Knowledge dbsSpecimenK3) {
        this.dbsSpecimenK3 = dbsSpecimenK3;
    }

    public Knowledge getDbsSpecimenK4() {
        return dbsSpecimenK4;
    }

    public void setDbsSpecimenK4(Knowledge dbsSpecimenK4) {
        this.dbsSpecimenK4 = dbsSpecimenK4;
    }

    public Knowledge getDbsSpecimenK5() {
        return dbsSpecimenK5;
    }

    public void setDbsSpecimenK5(Knowledge dbsSpecimenK5) {
        this.dbsSpecimenK5 = dbsSpecimenK5;
    }

    public Completion getDbsSpecimenC1() {
        return dbsSpecimenC1;
    }

    public void setDbsSpecimenC1(Completion dbsSpecimenC1) {
        this.dbsSpecimenC1 = dbsSpecimenC1;
    }

    public Completion getDbsSpecimenC2() {
        return dbsSpecimenC2;
    }

    public void setDbsSpecimenC2(Completion dbsSpecimenC2) {
        this.dbsSpecimenC2 = dbsSpecimenC2;
    }

    public Completion getDbsSpecimenC3() {
        return dbsSpecimenC3;
    }

    public void setDbsSpecimenC3(Completion dbsSpecimenC3) {
        this.dbsSpecimenC3 = dbsSpecimenC3;
    }

    public Completion getDbsSpecimenC4() {
        return dbsSpecimenC4;
    }

    public void setDbsSpecimenC4(Completion dbsSpecimenC4) {
        this.dbsSpecimenC4 = dbsSpecimenC4;
    }

    public Completion getDbsSpecimenC5() {
        return dbsSpecimenC5;
    }

    public void setDbsSpecimenC5(Completion dbsSpecimenC5) {
        this.dbsSpecimenC5 = dbsSpecimenC5;
    }

    public Knowledge getPocK1() {
        return pocK1;
    }

    public void setPocK1(Knowledge pocK1) {
        this.pocK1 = pocK1;
    }

    public Knowledge getPocK2() {
        return pocK2;
    }

    public void setPocK2(Knowledge pocK2) {
        this.pocK2 = pocK2;
    }

    public Knowledge getPocK3() {
        return pocK3;
    }

    public void setPocK3(Knowledge pocK3) {
        this.pocK3 = pocK3;
    }

    public Knowledge getPocK4() {
        return pocK4;
    }

    public void setPocK4(Knowledge pocK4) {
        this.pocK4 = pocK4;
    }

    public Knowledge getPocK5() {
        return pocK5;
    }

    public void setPocK5(Knowledge pocK5) {
        this.pocK5 = pocK5;
    }

    public Completion getPocC1() {
        return pocC1;
    }

    public void setPocC1(Completion pocC1) {
        this.pocC1 = pocC1;
    }

    public Completion getPocC2() {
        return pocC2;
    }

    public void setPocC2(Completion pocC2) {
        this.pocC2 = pocC2;
    }

    public Completion getPocC3() {
        return pocC3;
    }

    public void setPocC3(Completion pocC3) {
        this.pocC3 = pocC3;
    }

    public Completion getPocC4() {
        return pocC4;
    }

    public void setPocC4(Completion pocC4) {
        this.pocC4 = pocC4;
    }

    public Completion getPocC5() {
        return pocC5;
    }

    public void setPocC5(Completion pocC5) {
        this.pocC5 = pocC5;
    }

    public Knowledge getAdherenceK1() {
        return adherenceK1;
    }

    public void setAdherenceK1(Knowledge adherenceK1) {
        this.adherenceK1 = adherenceK1;
    }

    public Knowledge getAdherenceK2() {
        return adherenceK2;
    }

    public void setAdherenceK2(Knowledge adherenceK2) {
        this.adherenceK2 = adherenceK2;
    }

    public Knowledge getAdherenceK3() {
        return adherenceK3;
    }

    public void setAdherenceK3(Knowledge adherenceK3) {
        this.adherenceK3 = adherenceK3;
    }

    public Knowledge getAdherenceK4() {
        return adherenceK4;
    }

    public void setAdherenceK4(Knowledge adherenceK4) {
        this.adherenceK4 = adherenceK4;
    }

    public Knowledge getAdherenceK5() {
        return adherenceK5;
    }

    public void setAdherenceK5(Knowledge adherenceK5) {
        this.adherenceK5 = adherenceK5;
    }

    public Completion getAdherenceC1() {
        return adherenceC1;
    }

    public void setAdherenceC1(Completion adherenceC1) {
        this.adherenceC1 = adherenceC1;
    }

    public Completion getAdherenceC2() {
        return adherenceC2;
    }

    public void setAdherenceC2(Completion adherenceC2) {
        this.adherenceC2 = adherenceC2;
    }

    public Completion getAdherenceC3() {
        return adherenceC3;
    }

    public void setAdherenceC3(Completion adherenceC3) {
        this.adherenceC3 = adherenceC3;
    }

    public Completion getAdherenceC4() {
        return adherenceC4;
    }

    public void setAdherenceC4(Completion adherenceC4) {
        this.adherenceC4 = adherenceC4;
    }

    public Completion getAdherenceC5() {
        return adherenceC5;
    }

    public void setAdherenceC5(Completion adherenceC5) {
        this.adherenceC5 = adherenceC5;
    }

    public Knowledge getCorrectArvInfantK1() {
        return correctArvInfantK1;
    }

    public void setCorrectArvInfantK1(Knowledge correctArvInfantK1) {
        this.correctArvInfantK1 = correctArvInfantK1;
    }

    public Knowledge getCorrectArvInfantK2() {
        return correctArvInfantK2;
    }

    public void setCorrectArvInfantK2(Knowledge correctArvInfantK2) {
        this.correctArvInfantK2 = correctArvInfantK2;
    }

    public Knowledge getCorrectArvInfantK3() {
        return correctArvInfantK3;
    }

    public void setCorrectArvInfantK3(Knowledge correctArvInfantK3) {
        this.correctArvInfantK3 = correctArvInfantK3;
    }

    public Knowledge getCorrectArvKInfant4() {
        return correctArvKInfant4;
    }

    public void setCorrectArvKInfant4(Knowledge correctArvKInfant4) {
        this.correctArvKInfant4 = correctArvKInfant4;
    }

    public Knowledge getCorrectArvInfantK5() {
        return correctArvInfantK5;
    }

    public void setCorrectArvInfantK5(Knowledge correctArvInfantK5) {
        this.correctArvInfantK5 = correctArvInfantK5;
    }

    public Completion getCorrectArvInfantC1() {
        return correctArvInfantC1;
    }

    public void setCorrectArvInfantC1(Completion correctArvInfantC1) {
        this.correctArvInfantC1 = correctArvInfantC1;
    }

    public Completion getCorrectArvInfantC2() {
        return correctArvInfantC2;
    }

    public void setCorrectArvInfantC2(Completion correctArvInfantC2) {
        this.correctArvInfantC2 = correctArvInfantC2;
    }

    public Completion getCorrectArvInfantC3() {
        return correctArvInfantC3;
    }

    public void setCorrectArvInfantC3(Completion correctArvInfantC3) {
        this.correctArvInfantC3 = correctArvInfantC3;
    }

    public Completion getCorrectArvInfantC4() {
        return correctArvInfantC4;
    }

    public void setCorrectArvInfantC4(Completion correctArvInfantC4) {
        this.correctArvInfantC4 = correctArvInfantC4;
    }

    public Completion getCorrectArvInfantC5() {
        return correctArvInfantC5;
    }

    public void setCorrectArvInfantC5(Completion correctArvInfantC5) {
        this.correctArvInfantC5 = correctArvInfantC5;
    }

    public Knowledge getPregWomenArvK1() {
        return pregWomenArvK1;
    }

    public void setPregWomenArvK1(Knowledge pregWomenArvK1) {
        this.pregWomenArvK1 = pregWomenArvK1;
    }

    public Knowledge getPregWomenArvK2() {
        return pregWomenArvK2;
    }

    public void setPregWomenArvK2(Knowledge pregWomenArvK2) {
        this.pregWomenArvK2 = pregWomenArvK2;
    }

    public Knowledge getPregWomenArvK3() {
        return pregWomenArvK3;
    }

    public void setPregWomenArvK3(Knowledge pregWomenArvK3) {
        this.pregWomenArvK3 = pregWomenArvK3;
    }

    public Knowledge getPregWomenArvK4() {
        return pregWomenArvK4;
    }

    public void setPregWomenArvK4(Knowledge pregWomenArvK4) {
        this.pregWomenArvK4 = pregWomenArvK4;
    }

    public Knowledge getPregWomenArvK5() {
        return pregWomenArvK5;
    }

    public void setPregWomenArvK5(Knowledge pregWomenArvK5) {
        this.pregWomenArvK5 = pregWomenArvK5;
    }

    public Completion getPregWomenArvC1() {
        return pregWomenArvC1;
    }

    public void setPregWomenArvC1(Completion pregWomenArvC1) {
        this.pregWomenArvC1 = pregWomenArvC1;
    }

    public Completion getPregWomenArvC2() {
        return pregWomenArvC2;
    }

    public void setPregWomenArvC2(Completion pregWomenArvC2) {
        this.pregWomenArvC2 = pregWomenArvC2;
    }

    public Completion getPregWomenArvC3() {
        return pregWomenArvC3;
    }

    public void setPregWomenArvC3(Completion pregWomenArvC3) {
        this.pregWomenArvC3 = pregWomenArvC3;
    }

    public Completion getPregWomenArvC4() {
        return pregWomenArvC4;
    }

    public void setPregWomenArvC4(Completion pregWomenArvC4) {
        this.pregWomenArvC4 = pregWomenArvC4;
    }

    public Completion getPregWomenArvC5() {
        return pregWomenArvC5;
    }

    public void setPregWomenArvC5(Completion pregWomenArvC5) {
        this.pregWomenArvC5 = pregWomenArvC5;
    }

    public Knowledge getArvSideEffectK1() {
        return arvSideEffectK1;
    }

    public void setArvSideEffectK1(Knowledge arvSideEffectK1) {
        this.arvSideEffectK1 = arvSideEffectK1;
    }

    public Knowledge getArvSideEffectK2() {
        return arvSideEffectK2;
    }

    public void setArvSideEffectK2(Knowledge arvSideEffectK2) {
        this.arvSideEffectK2 = arvSideEffectK2;
    }

    public Knowledge getArvSideEffectK3() {
        return arvSideEffectK3;
    }

    public void setArvSideEffectK3(Knowledge arvSideEffectK3) {
        this.arvSideEffectK3 = arvSideEffectK3;
    }

    public Knowledge getArvSideEffectK4() {
        return arvSideEffectK4;
    }

    public void setArvSideEffectK4(Knowledge arvSideEffectK4) {
        this.arvSideEffectK4 = arvSideEffectK4;
    }

    public Knowledge getArvSideEffectK5() {
        return arvSideEffectK5;
    }

    public void setArvSideEffectK5(Knowledge arvSideEffectK5) {
        this.arvSideEffectK5 = arvSideEffectK5;
    }

    public Completion getArvSideEffectC1() {
        return arvSideEffectC1;
    }

    public void setArvSideEffectC1(Completion arvSideEffectC1) {
        this.arvSideEffectC1 = arvSideEffectC1;
    }

    public Completion getArvSideEffectC2() {
        return arvSideEffectC2;
    }

    public void setArvSideEffectC2(Completion arvSideEffectC2) {
        this.arvSideEffectC2 = arvSideEffectC2;
    }

    public Completion getArvSideEffectC3() {
        return arvSideEffectC3;
    }

    public void setArvSideEffectC3(Completion arvSideEffectC3) {
        this.arvSideEffectC3 = arvSideEffectC3;
    }

    public Completion getArvSideEffectC4() {
        return arvSideEffectC4;
    }

    public void setArvSideEffectC4(Completion arvSideEffectC4) {
        this.arvSideEffectC4 = arvSideEffectC4;
    }

    public Completion getArvSideEffectC5() {
        return arvSideEffectC5;
    }

    public void setArvSideEffectC5(Completion arvSideEffectC5) {
        this.arvSideEffectC5 = arvSideEffectC5;
    }

    public Knowledge getTherapyOIK1() {
        return therapyOIK1;
    }

    public void setTherapyOIK1(Knowledge therapyOIK1) {
        this.therapyOIK1 = therapyOIK1;
    }

    public Knowledge getTherapyOIK2() {
        return therapyOIK2;
    }

    public void setTherapyOIK2(Knowledge therapyOIK2) {
        this.therapyOIK2 = therapyOIK2;
    }

    public Knowledge getTherapyOIK3() {
        return therapyOIK3;
    }

    public void setTherapyOIK3(Knowledge therapyOIK3) {
        this.therapyOIK3 = therapyOIK3;
    }

    public Knowledge getTherapyOIK4() {
        return therapyOIK4;
    }

    public void setTherapyOIK4(Knowledge therapyOIK4) {
        this.therapyOIK4 = therapyOIK4;
    }

    public Knowledge getTherapyOIK5() {
        return therapyOIK5;
    }

    public void setTherapyOIK5(Knowledge therapyOIK5) {
        this.therapyOIK5 = therapyOIK5;
    }

    public Completion getTherapyOIC1() {
        return therapyOIC1;
    }

    public void setTherapyOIC1(Completion therapyOIC1) {
        this.therapyOIC1 = therapyOIC1;
    }

    public Completion getTherapyOIC2() {
        return therapyOIC2;
    }

    public void setTherapyOIC2(Completion therapyOIC2) {
        this.therapyOIC2 = therapyOIC2;
    }

    public Completion getTherapyOIC3() {
        return therapyOIC3;
    }

    public void setTherapyOIC3(Completion therapyOIC3) {
        this.therapyOIC3 = therapyOIC3;
    }

    public Completion getTherapyOIC4() {
        return therapyOIC4;
    }

    public void setTherapyOIC4(Completion therapyOIC4) {
        this.therapyOIC4 = therapyOIC4;
    }

    public Completion getTherapyOIC5() {
        return therapyOIC5;
    }

    public void setTherapyOIC5(Completion therapyOIC5) {
        this.therapyOIC5 = therapyOIC5;
    }

    public Knowledge getSubARVK1() {
        return subARVK1;
    }

    public void setSubARVK1(Knowledge subARVK1) {
        this.subARVK1 = subARVK1;
    }

    public Knowledge getSubARVK2() {
        return subARVK2;
    }

    public void setSubARVK2(Knowledge subARVK2) {
        this.subARVK2 = subARVK2;
    }

    public Knowledge getSubARVK3() {
        return subARVK3;
    }

    public void setSubARVK3(Knowledge subARVK3) {
        this.subARVK3 = subARVK3;
    }

    public Knowledge getSubARVK4() {
        return subARVK4;
    }

    public void setSubARVK4(Knowledge subARVK4) {
        this.subARVK4 = subARVK4;
    }

    public Knowledge getSubARVK5() {
        return subARVK5;
    }

    public void setSubARVK5(Knowledge subARVK5) {
        this.subARVK5 = subARVK5;
    }

    public Completion getSubARVC1() {
        return subARVC1;
    }

    public void setSubARVC1(Completion subARVC1) {
        this.subARVC1 = subARVC1;
    }

    public Completion getSubARVC2() {
        return subARVC2;
    }

    public void setSubARVC2(Completion subARVC2) {
        this.subARVC2 = subARVC2;
    }

    public Completion getSubARVC3() {
        return subARVC3;
    }

    public void setSubARVC3(Completion subARVC3) {
        this.subARVC3 = subARVC3;
    }

    public Completion getSubARVC4() {
        return subARVC4;
    }

    public void setSubARVC4(Completion subARVC4) {
        this.subARVC4 = subARVC4;
    }

    public Completion getSubARVC5() {
        return subARVC5;
    }

    public void setSubARVC5(Completion subARVC5) {
        this.subARVC5 = subARVC5;
    }

    public Knowledge getMonitorTreatmentK1() {
        return monitorTreatmentK1;
    }

    public void setMonitorTreatmentK1(Knowledge monitorTreatmentK1) {
        this.monitorTreatmentK1 = monitorTreatmentK1;
    }

    public Knowledge getMonitorTreatmentK2() {
        return monitorTreatmentK2;
    }

    public void setMonitorTreatmentK2(Knowledge monitorTreatmentK2) {
        this.monitorTreatmentK2 = monitorTreatmentK2;
    }

    public Knowledge getMonitorTreatmentK3() {
        return monitorTreatmentK3;
    }

    public void setMonitorTreatmentK3(Knowledge monitorTreatmentK3) {
        this.monitorTreatmentK3 = monitorTreatmentK3;
    }

    public Knowledge getMonitorTreatmentK4() {
        return monitorTreatmentK4;
    }

    public void setMonitorTreatmentK4(Knowledge monitorTreatmentK4) {
        this.monitorTreatmentK4 = monitorTreatmentK4;
    }

    public Knowledge getMonitorTreatmentK5() {
        return monitorTreatmentK5;
    }

    public void setMonitorTreatmentK5(Knowledge monitorTreatmentK5) {
        this.monitorTreatmentK5 = monitorTreatmentK5;
    }

    public Completion getMonitorTreatmentC1() {
        return monitorTreatmentC1;
    }

    public void setMonitorTreatmentC1(Completion monitorTreatmentC1) {
        this.monitorTreatmentC1 = monitorTreatmentC1;
    }

    public Completion getMonitorTreatmentC2() {
        return monitorTreatmentC2;
    }

    public void setMonitorTreatmentC2(Completion monitorTreatmentC2) {
        this.monitorTreatmentC2 = monitorTreatmentC2;
    }

    public Completion getMonitorTreatmentC3() {
        return monitorTreatmentC3;
    }

    public void setMonitorTreatmentC3(Completion monitorTreatmentC3) {
        this.monitorTreatmentC3 = monitorTreatmentC3;
    }

    public Completion getMonitorTreatmentC4() {
        return monitorTreatmentC4;
    }

    public void setMonitorTreatmentC4(Completion monitorTreatmentC4) {
        this.monitorTreatmentC4 = monitorTreatmentC4;
    }

    public Completion getMonitorTreatmentC5() {
        return monitorTreatmentC5;
    }

    public void setMonitorTreatmentC5(Completion monitorTreatmentC5) {
        this.monitorTreatmentC5 = monitorTreatmentC5;
    }

    public Knowledge getLabTestInterpK1() {
        return labTestInterpK1;
    }

    public void setLabTestInterpK1(Knowledge labTestInterpK1) {
        this.labTestInterpK1 = labTestInterpK1;
    }

    public Knowledge getLabTestInterpK2() {
        return labTestInterpK2;
    }

    public void setLabTestInterpK2(Knowledge labTestInterpK2) {
        this.labTestInterpK2 = labTestInterpK2;
    }

    public Knowledge getLabTestInterpK3() {
        return labTestInterpK3;
    }

    public void setLabTestInterpK3(Knowledge labTestInterpK3) {
        this.labTestInterpK3 = labTestInterpK3;
    }

    public Knowledge getLabTestInterpK4() {
        return labTestInterpK4;
    }

    public void setLabTestInterpK4(Knowledge labTestInterpK4) {
        this.labTestInterpK4 = labTestInterpK4;
    }

    public Knowledge getLabTestInterpK5() {
        return labTestInterpK5;
    }

    public void setLabTestInterpK5(Knowledge labTestInterpK5) {
        this.labTestInterpK5 = labTestInterpK5;
    }

    public Completion getLabTestInterpC1() {
        return labTestInterpC1;
    }

    public void setLabTestInterpC1(Completion labTestInterpC1) {
        this.labTestInterpC1 = labTestInterpC1;
    }

    public Completion getLabTestInterpC2() {
        return labTestInterpC2;
    }

    public void setLabTestInterpC2(Completion labTestInterpC2) {
        this.labTestInterpC2 = labTestInterpC2;
    }

    public Completion getLabTestInterpC3() {
        return labTestInterpC3;
    }

    public void setLabTestInterpC3(Completion labTestInterpC3) {
        this.labTestInterpC3 = labTestInterpC3;
    }

    public Completion getLabTestInterpC4() {
        return labTestInterpC4;
    }

    public void setLabTestInterpC4(Completion labTestInterpC4) {
        this.labTestInterpC4 = labTestInterpC4;
    }

    public Completion getLabTestInterpC5() {
        return labTestInterpC5;
    }

    public void setLabTestInterpC5(Completion labTestInterpC5) {
        this.labTestInterpC5 = labTestInterpC5;
    }

    public Knowledge getExpLabResK1() {
        return expLabResK1;
    }

    public void setExpLabResK1(Knowledge expLabResK1) {
        this.expLabResK1 = expLabResK1;
    }

    public Knowledge getExpLabResK2() {
        return expLabResK2;
    }

    public void setExpLabResK2(Knowledge expLabResK2) {
        this.expLabResK2 = expLabResK2;
    }

    public Knowledge getExpLabResK3() {
        return expLabResK3;
    }

    public void setExpLabResK3(Knowledge expLabResK3) {
        this.expLabResK3 = expLabResK3;
    }

    public Knowledge getExpLabResK4() {
        return expLabResK4;
    }

    public void setExpLabResK4(Knowledge expLabResK4) {
        this.expLabResK4 = expLabResK4;
    }

    public Knowledge getExpLabResK5() {
        return expLabResK5;
    }

    public void setExpLabResK5(Knowledge expLabResK5) {
        this.expLabResK5 = expLabResK5;
    }

    public Completion getExpLabResC1() {
        return expLabResC1;
    }

    public void setExpLabResC1(Completion expLabResC1) {
        this.expLabResC1 = expLabResC1;
    }

    public Completion getExpLabResC2() {
        return expLabResC2;
    }

    public void setExpLabResC2(Completion expLabResC2) {
        this.expLabResC2 = expLabResC2;
    }

    public Completion getExpLabResC3() {
        return expLabResC3;
    }

    public void setExpLabResC3(Completion expLabResC3) {
        this.expLabResC3 = expLabResC3;
    }

    public Completion getExpLabResC4() {
        return expLabResC4;
    }

    public void setExpLabResC4(Completion expLabResC4) {
        this.expLabResC4 = expLabResC4;
    }

    public Completion getExpLabResC5() {
        return expLabResC5;
    }

    public void setExpLabResC5(Completion expLabResC5) {
        this.expLabResC5 = expLabResC5;
    }

    public Knowledge getCompManHIVK1() {
        return compManHIVK1;
    }

    public void setCompManHIVK1(Knowledge compManHIVK1) {
        this.compManHIVK1 = compManHIVK1;
    }

    public Knowledge getCompManHIVK2() {
        return compManHIVK2;
    }

    public void setCompManHIVK2(Knowledge compManHIVK2) {
        this.compManHIVK2 = compManHIVK2;
    }

    public Knowledge getCompManHIVK3() {
        return compManHIVK3;
    }

    public void setCompManHIVK3(Knowledge compManHIVK3) {
        this.compManHIVK3 = compManHIVK3;
    }

    public Knowledge getCompManHIVK4() {
        return compManHIVK4;
    }

    public void setCompManHIVK4(Knowledge compManHIVK4) {
        this.compManHIVK4 = compManHIVK4;
    }

    public Knowledge getCompManHIVK5() {
        return compManHIVK5;
    }

    public void setCompManHIVK5(Knowledge compManHIVK5) {
        this.compManHIVK5 = compManHIVK5;
    }

    public Completion getCompManHIVC1() {
        return compManHIVC1;
    }

    public void setCompManHIVC1(Completion compManHIVC1) {
        this.compManHIVC1 = compManHIVC1;
    }

    public Completion getCompManHIVC2() {
        return compManHIVC2;
    }

    public void setCompManHIVC2(Completion compManHIVC2) {
        this.compManHIVC2 = compManHIVC2;
    }

    public Completion getCompManHIVC3() {
        return compManHIVC3;
    }

    public void setCompManHIVC3(Completion compManHIVC3) {
        this.compManHIVC3 = compManHIVC3;
    }

    public Completion getCompManHIVC4() {
        return compManHIVC4;
    }

    public void setCompManHIVC4(Completion compManHIVC4) {
        this.compManHIVC4 = compManHIVC4;
    }

    public Completion getCompManHIVC5() {
        return compManHIVC5;
    }

    public void setCompManHIVC5(Completion compManHIVC5) {
        this.compManHIVC5 = compManHIVC5;
    }

    public Knowledge getHivDiseaseK1() {
        return hivDiseaseK1;
    }

    public void setHivDiseaseK1(Knowledge hivDiseaseK1) {
        this.hivDiseaseK1 = hivDiseaseK1;
    }

    public Knowledge getHivDiseaseK2() {
        return hivDiseaseK2;
    }

    public void setHivDiseaseK2(Knowledge hivDiseaseK2) {
        this.hivDiseaseK2 = hivDiseaseK2;
    }

    public Knowledge getHivDiseaseK3() {
        return hivDiseaseK3;
    }

    public void setHivDiseaseK3(Knowledge hivDiseaseK3) {
        this.hivDiseaseK3 = hivDiseaseK3;
    }

    public Knowledge getHivDiseaseK4() {
        return hivDiseaseK4;
    }

    public void setHivDiseaseK4(Knowledge hivDiseaseK4) {
        this.hivDiseaseK4 = hivDiseaseK4;
    }

    public Knowledge getHivDiseaseK5() {
        return hivDiseaseK5;
    }

    public void setHivDiseaseK5(Knowledge hivDiseaseK5) {
        this.hivDiseaseK5 = hivDiseaseK5;
    }

    public Completion getHivDiseaseC1() {
        return hivDiseaseC1;
    }

    public void setHivDiseaseC1(Completion hivDiseaseC1) {
        this.hivDiseaseC1 = hivDiseaseC1;
    }

    public Completion getHivDiseaseC2() {
        return hivDiseaseC2;
    }

    public void setHivDiseaseC2(Completion hivDiseaseC2) {
        this.hivDiseaseC2 = hivDiseaseC2;
    }

    public Completion getHivDiseaseC3() {
        return hivDiseaseC3;
    }

    public void setHivDiseaseC3(Completion hivDiseaseC3) {
        this.hivDiseaseC3 = hivDiseaseC3;
    }

    public Completion getHivDiseaseC4() {
        return hivDiseaseC4;
    }

    public void setHivDiseaseC4(Completion hivDiseaseC4) {
        this.hivDiseaseC4 = hivDiseaseC4;
    }

    public Completion getHivDiseaseC5() {
        return hivDiseaseC5;
    }

    public void setHivDiseaseC5(Completion hivDiseaseC5) {
        this.hivDiseaseC5 = hivDiseaseC5;
    }

    public Knowledge getOiartTBK1() {
        return oiartTBK1;
    }

    public void setOiartTBK1(Knowledge oiartTBK1) {
        this.oiartTBK1 = oiartTBK1;
    }

    public Knowledge getOiartTBK2() {
        return oiartTBK2;
    }

    public void setOiartTBK2(Knowledge oiartTBK2) {
        this.oiartTBK2 = oiartTBK2;
    }

    public Knowledge getOiartTBK3() {
        return oiartTBK3;
    }

    public void setOiartTBK3(Knowledge oiartTBK3) {
        this.oiartTBK3 = oiartTBK3;
    }

    public Knowledge getOiartTBK4() {
        return oiartTBK4;
    }

    public void setOiartTBK4(Knowledge oiartTBK4) {
        this.oiartTBK4 = oiartTBK4;
    }

    public Knowledge getOiartTBK5() {
        return oiartTBK5;
    }

    public void setOiartTBK5(Knowledge oiartTBK5) {
        this.oiartTBK5 = oiartTBK5;
    }

    public Completion getOiartTBC1() {
        return oiartTBC1;
    }

    public void setOiartTBC1(Completion oiartTBC1) {
        this.oiartTBC1 = oiartTBC1;
    }

    public Completion getOiartTBC2() {
        return oiartTBC2;
    }

    public void setOiartTBC2(Completion oiartTBC2) {
        this.oiartTBC2 = oiartTBC2;
    }

    public Completion getOiartTBC3() {
        return oiartTBC3;
    }

    public void setOiartTBC3(Completion oiartTBC3) {
        this.oiartTBC3 = oiartTBC3;
    }

    public Completion getOiartTBC4() {
        return oiartTBC4;
    }

    public void setOiartTBC4(Completion oiartTBC4) {
        this.oiartTBC4 = oiartTBC4;
    }

    public Completion getOiartTBC5() {
        return oiartTBC5;
    }

    public void setOiartTBC5(Completion oiartTBC5) {
        this.oiartTBC5 = oiartTBC5;
    }

    public Knowledge getOngoingTreatmentK1() {
        return ongoingTreatmentK1;
    }

    public void setOngoingTreatmentK1(Knowledge ongoingTreatmentK1) {
        this.ongoingTreatmentK1 = ongoingTreatmentK1;
    }

    public Knowledge getOngoingTreatmentK2() {
        return ongoingTreatmentK2;
    }

    public void setOngoingTreatmentK2(Knowledge ongoingTreatmentK2) {
        this.ongoingTreatmentK2 = ongoingTreatmentK2;
    }

    public Knowledge getOngoingTreatmentK3() {
        return ongoingTreatmentK3;
    }

    public void setOngoingTreatmentK3(Knowledge ongoingTreatmentK3) {
        this.ongoingTreatmentK3 = ongoingTreatmentK3;
    }

    public Knowledge getOngoingTreatmentK4() {
        return ongoingTreatmentK4;
    }

    public void setOngoingTreatmentK4(Knowledge ongoingTreatmentK4) {
        this.ongoingTreatmentK4 = ongoingTreatmentK4;
    }

    public Knowledge getOngoingTreatmentK5() {
        return ongoingTreatmentK5;
    }

    public void setOngoingTreatmentK5(Knowledge ongoingTreatmentK5) {
        this.ongoingTreatmentK5 = ongoingTreatmentK5;
    }

    public Completion getOngoingTreatmentC1() {
        return ongoingTreatmentC1;
    }

    public void setOngoingTreatmentC1(Completion ongoingTreatmentC1) {
        this.ongoingTreatmentC1 = ongoingTreatmentC1;
    }

    public Completion getOngoingTreatmentC2() {
        return ongoingTreatmentC2;
    }

    public void setOngoingTreatmentC2(Completion ongoingTreatmentC2) {
        this.ongoingTreatmentC2 = ongoingTreatmentC2;
    }

    public Completion getOngoingTreatmentC3() {
        return ongoingTreatmentC3;
    }

    public void setOngoingTreatmentC3(Completion ongoingTreatmentC3) {
        this.ongoingTreatmentC3 = ongoingTreatmentC3;
    }

    public Completion getOngoingTreatmentC4() {
        return ongoingTreatmentC4;
    }

    public void setOngoingTreatmentC4(Completion ongoingTreatmentC4) {
        this.ongoingTreatmentC4 = ongoingTreatmentC4;
    }

    public Completion getOngoingTreatmentC5() {
        return ongoingTreatmentC5;
    }

    public void setOngoingTreatmentC5(Completion ongoingTreatmentC5) {
        this.ongoingTreatmentC5 = ongoingTreatmentC5;
    }

    public Knowledge getStiRiskAssK1() {
        return stiRiskAssK1;
    }

    public void setStiRiskAssK1(Knowledge stiRiskAssK1) {
        this.stiRiskAssK1 = stiRiskAssK1;
    }

    public Knowledge getStiRiskAssK2() {
        return stiRiskAssK2;
    }

    public void setStiRiskAssK2(Knowledge stiRiskAssK2) {
        this.stiRiskAssK2 = stiRiskAssK2;
    }

    public Knowledge getStiRiskAssK3() {
        return stiRiskAssK3;
    }

    public void setStiRiskAssK3(Knowledge stiRiskAssK3) {
        this.stiRiskAssK3 = stiRiskAssK3;
    }

    public Knowledge getStiRiskAssK4() {
        return stiRiskAssK4;
    }

    public void setStiRiskAssK4(Knowledge stiRiskAssK4) {
        this.stiRiskAssK4 = stiRiskAssK4;
    }

    public Knowledge getStiRiskAssK5() {
        return stiRiskAssK5;
    }

    public void setStiRiskAssK5(Knowledge stiRiskAssK5) {
        this.stiRiskAssK5 = stiRiskAssK5;
    }

    public Completion getStiRiskAssC1() {
        return stiRiskAssC1;
    }

    public void setStiRiskAssC1(Completion stiRiskAssC1) {
        this.stiRiskAssC1 = stiRiskAssC1;
    }

    public Completion getStiRiskAssC2() {
        return stiRiskAssC2;
    }

    public void setStiRiskAssC2(Completion stiRiskAssC2) {
        this.stiRiskAssC2 = stiRiskAssC2;
    }

    public Completion getStiRiskAssC3() {
        return stiRiskAssC3;
    }

    public void setStiRiskAssC3(Completion stiRiskAssC3) {
        this.stiRiskAssC3 = stiRiskAssC3;
    }

    public Completion getStiRiskAssC4() {
        return stiRiskAssC4;
    }

    public void setStiRiskAssC4(Completion stiRiskAssC4) {
        this.stiRiskAssC4 = stiRiskAssC4;
    }

    public Completion getStiRiskAssC5() {
        return stiRiskAssC5;
    }

    public void setStiRiskAssC5(Completion stiRiskAssC5) {
        this.stiRiskAssC5 = stiRiskAssC5;
    }

    public Knowledge getCompAddCounsK1() {
        return compAddCounsK1;
    }

    public void setCompAddCounsK1(Knowledge compAddCounsK1) {
        this.compAddCounsK1 = compAddCounsK1;
    }

    public Knowledge getCompAddCounsK2() {
        return compAddCounsK2;
    }

    public void setCompAddCounsK2(Knowledge compAddCounsK2) {
        this.compAddCounsK2 = compAddCounsK2;
    }

    public Knowledge getCompAddCounsK3() {
        return compAddCounsK3;
    }

    public void setCompAddCounsK3(Knowledge compAddCounsK3) {
        this.compAddCounsK3 = compAddCounsK3;
    }

    public Knowledge getCompAddCounsK4() {
        return compAddCounsK4;
    }

    public void setCompAddCounsK4(Knowledge compAddCounsK4) {
        this.compAddCounsK4 = compAddCounsK4;
    }

    public Knowledge getCompAddCounsK5() {
        return compAddCounsK5;
    }

    public void setCompAddCounsK5(Knowledge compAddCounsK5) {
        this.compAddCounsK5 = compAddCounsK5;
    }

    public Completion getCompAddCounsC1() {
        return compAddCounsC1;
    }

    public void setCompAddCounsC1(Completion compAddCounsC1) {
        this.compAddCounsC1 = compAddCounsC1;
    }

    public Completion getCompAddCounsC2() {
        return compAddCounsC2;
    }

    public void setCompAddCounsC2(Completion compAddCounsC2) {
        this.compAddCounsC2 = compAddCounsC2;
    }

    public Completion getCompAddCounsC3() {
        return compAddCounsC3;
    }

    public void setCompAddCounsC3(Completion compAddCounsC3) {
        this.compAddCounsC3 = compAddCounsC3;
    }

    public Completion getCompAddCounsC4() {
        return compAddCounsC4;
    }

    public void setCompAddCounsC4(Completion compAddCounsC4) {
        this.compAddCounsC4 = compAddCounsC4;
    }

    public Completion getCompAddCounsC5() {
        return compAddCounsC5;
    }

    public void setCompAddCounsC5(Completion compAddCounsC5) {
        this.compAddCounsC5 = compAddCounsC5;
    }

    public Knowledge getPatEduK1() {
        return patEduK1;
    }

    public void setPatEduK1(Knowledge patEduK1) {
        this.patEduK1 = patEduK1;
    }

    public Knowledge getPatEduK2() {
        return patEduK2;
    }

    public void setPatEduK2(Knowledge patEduK2) {
        this.patEduK2 = patEduK2;
    }

    public Knowledge getPatEduK3() {
        return patEduK3;
    }

    public void setPatEduK3(Knowledge patEduK3) {
        this.patEduK3 = patEduK3;
    }

    public Knowledge getPatEduK4() {
        return patEduK4;
    }

    public void setPatEduK4(Knowledge patEduK4) {
        this.patEduK4 = patEduK4;
    }

    public Knowledge getPatEduK5() {
        return patEduK5;
    }

    public void setPatEduK5(Knowledge patEduK5) {
        this.patEduK5 = patEduK5;
    }

    public Completion getPatEduC1() {
        return patEduC1;
    }

    public void setPatEduC1(Completion patEduC1) {
        this.patEduC1 = patEduC1;
    }

    public Completion getPatEduC2() {
        return patEduC2;
    }

    public void setPatEduC2(Completion patEduC2) {
        this.patEduC2 = patEduC2;
    }

    public Completion getPatEduC3() {
        return patEduC3;
    }

    public void setPatEduC3(Completion patEduC3) {
        this.patEduC3 = patEduC3;
    }

    public Completion getPatEduC4() {
        return patEduC4;
    }

    public void setPatEduC4(Completion patEduC4) {
        this.patEduC4 = patEduC4;
    }

    public Completion getPatEduC5() {
        return patEduC5;
    }

    public void setPatEduC5(Completion patEduC5) {
        this.patEduC5 = patEduC5;
    }

    public Knowledge getPsySuppK1() {
        return psySuppK1;
    }

    public void setPsySuppK1(Knowledge psySuppK1) {
        this.psySuppK1 = psySuppK1;
    }

    public Knowledge getPsySuppK2() {
        return psySuppK2;
    }

    public void setPsySuppK2(Knowledge psySuppK2) {
        this.psySuppK2 = psySuppK2;
    }

    public Knowledge getPsySuppK3() {
        return psySuppK3;
    }

    public void setPsySuppK3(Knowledge psySuppK3) {
        this.psySuppK3 = psySuppK3;
    }

    public Knowledge getPsySuppK4() {
        return psySuppK4;
    }

    public void setPsySuppK4(Knowledge psySuppK4) {
        this.psySuppK4 = psySuppK4;
    }

    public Knowledge getPsySuppK5() {
        return psySuppK5;
    }

    public void setPsySuppK5(Knowledge psySuppK5) {
        this.psySuppK5 = psySuppK5;
    }

    public Completion getPsySuppC1() {
        return psySuppC1;
    }

    public void setPsySuppC1(Completion psySuppC1) {
        this.psySuppC1 = psySuppC1;
    }

    public Completion getPsySuppC2() {
        return psySuppC2;
    }

    public void setPsySuppC2(Completion psySuppC2) {
        this.psySuppC2 = psySuppC2;
    }

    public Completion getPsySuppC3() {
        return psySuppC3;
    }

    public void setPsySuppC3(Completion psySuppC3) {
        this.psySuppC3 = psySuppC3;
    }

    public Completion getPsySuppC4() {
        return psySuppC4;
    }

    public void setPsySuppC4(Completion psySuppC4) {
        this.psySuppC4 = psySuppC4;
    }

    public Completion getPsySuppC5() {
        return psySuppC5;
    }

    public void setPsySuppC5(Completion psySuppC5) {
        this.psySuppC5 = psySuppC5;
    }

    public Knowledge getCounsMomExcBreastK1() {
        return counsMomExcBreastK1;
    }

    public void setCounsMomExcBreastK1(Knowledge counsMomExcBreastK1) {
        this.counsMomExcBreastK1 = counsMomExcBreastK1;
    }

    public Knowledge getCounsMomExcBreastK2() {
        return counsMomExcBreastK2;
    }

    public void setCounsMomExcBreastK2(Knowledge counsMomExcBreastK2) {
        this.counsMomExcBreastK2 = counsMomExcBreastK2;
    }

    public Knowledge getCounsMomExcBreastK3() {
        return counsMomExcBreastK3;
    }

    public void setCounsMomExcBreastK3(Knowledge counsMomExcBreastK3) {
        this.counsMomExcBreastK3 = counsMomExcBreastK3;
    }

    public Knowledge getCounsMomExcBreastK4() {
        return counsMomExcBreastK4;
    }

    public void setCounsMomExcBreastK4(Knowledge counsMomExcBreastK4) {
        this.counsMomExcBreastK4 = counsMomExcBreastK4;
    }

    public Knowledge getCounsMomExcBreastK5() {
        return counsMomExcBreastK5;
    }

    public void setCounsMomExcBreastK5(Knowledge counsMomExcBreastK5) {
        this.counsMomExcBreastK5 = counsMomExcBreastK5;
    }

    public Completion getCounsMomExcBreastC1() {
        return counsMomExcBreastC1;
    }

    public void setCounsMomExcBreastC1(Completion counsMomExcBreastC1) {
        this.counsMomExcBreastC1 = counsMomExcBreastC1;
    }

    public Completion getCounsMomExcBreastC2() {
        return counsMomExcBreastC2;
    }

    public void setCounsMomExcBreastC2(Completion counsMomExcBreastC2) {
        this.counsMomExcBreastC2 = counsMomExcBreastC2;
    }

    public Completion getCounsMomExcBreastC3() {
        return counsMomExcBreastC3;
    }

    public void setCounsMomExcBreastC3(Completion counsMomExcBreastC3) {
        this.counsMomExcBreastC3 = counsMomExcBreastC3;
    }

    public Completion getCounsMomExcBreastC4() {
        return counsMomExcBreastC4;
    }

    public void setCounsMomExcBreastC4(Completion counsMomExcBreastC4) {
        this.counsMomExcBreastC4 = counsMomExcBreastC4;
    }

    public Completion getCounsMomExcBreastC5() {
        return counsMomExcBreastC5;
    }

    public void setCounsMomExcBreastC5(Completion counsMomExcBreastC5) {
        this.counsMomExcBreastC5 = counsMomExcBreastC5;
    }

    public Knowledge getScreenOIK1() {
        return screenOIK1;
    }

    public void setScreenOIK1(Knowledge screenOIK1) {
        this.screenOIK1 = screenOIK1;
    }

    public Knowledge getScreenOIK2() {
        return screenOIK2;
    }

    public void setScreenOIK2(Knowledge screenOIK2) {
        this.screenOIK2 = screenOIK2;
    }

    public Knowledge getScreenOIK3() {
        return screenOIK3;
    }

    public void setScreenOIK3(Knowledge screenOIK3) {
        this.screenOIK3 = screenOIK3;
    }

    public Knowledge getScreenOIK4() {
        return screenOIK4;
    }

    public void setScreenOIK4(Knowledge screenOIK4) {
        this.screenOIK4 = screenOIK4;
    }

    public Knowledge getScreenOIK5() {
        return screenOIK5;
    }

    public void setScreenOIK5(Knowledge screenOIK5) {
        this.screenOIK5 = screenOIK5;
    }

    public Completion getScreenOIC1() {
        return screenOIC1;
    }

    public void setScreenOIC1(Completion screenOIC1) {
        this.screenOIC1 = screenOIC1;
    }

    public Completion getScreenOIC2() {
        return screenOIC2;
    }

    public void setScreenOIC2(Completion screenOIC2) {
        this.screenOIC2 = screenOIC2;
    }

    public Completion getScreenOIC3() {
        return screenOIC3;
    }

    public void setScreenOIC3(Completion screenOIC3) {
        this.screenOIC3 = screenOIC3;
    }

    public Completion getScreenOIC4() {
        return screenOIC4;
    }

    public void setScreenOIC4(Completion screenOIC4) {
        this.screenOIC4 = screenOIC4;
    }

    public Completion getScreenOIC5() {
        return screenOIC5;
    }

    public void setScreenOIC5(Completion screenOIC5) {
        this.screenOIC5 = screenOIC5;
    }

    public Knowledge getDocAccK1() {
        return docAccK1;
    }

    public void setDocAccK1(Knowledge docAccK1) {
        this.docAccK1 = docAccK1;
    }

    public Knowledge getDocAccK2() {
        return docAccK2;
    }

    public void setDocAccK2(Knowledge docAccK2) {
        this.docAccK2 = docAccK2;
    }

    public Knowledge getDocAccK3() {
        return docAccK3;
    }

    public void setDocAccK3(Knowledge docAccK3) {
        this.docAccK3 = docAccK3;
    }

    public Knowledge getDocAccK4() {
        return docAccK4;
    }

    public void setDocAccK4(Knowledge docAccK4) {
        this.docAccK4 = docAccK4;
    }

    public Knowledge getDocAccK5() {
        return docAccK5;
    }

    public void setDocAccK5(Knowledge docAccK5) {
        this.docAccK5 = docAccK5;
    }

    public Completion getDocAccC1() {
        return docAccC1;
    }

    public void setDocAccC1(Completion docAccC1) {
        this.docAccC1 = docAccC1;
    }

    public Completion getDocAccC2() {
        return docAccC2;
    }

    public void setDocAccC2(Completion docAccC2) {
        this.docAccC2 = docAccC2;
    }

    public Completion getDocAccC3() {
        return docAccC3;
    }

    public void setDocAccC3(Completion docAccC3) {
        this.docAccC3 = docAccC3;
    }

    public Completion getDocAccC4() {
        return docAccC4;
    }

    public void setDocAccC4(Completion docAccC4) {
        this.docAccC4 = docAccC4;
    }

    public Completion getDocAccC5() {
        return docAccC5;
    }

    public void setDocAccC5(Completion docAccC5) {
        this.docAccC5 = docAccC5;
    }

    public String getMentoName1() {
        return mentoName1;
    }

    public void setMentoName1(String mentoName1) {
        this.mentoName1 = mentoName1;
    }

    public String getMentoName2() {
        return mentoName2;
    }

    public void setMentoName2(String mentoName2) {
        this.mentoName2 = mentoName2;
    }

    public String getMentoName3() {
        return mentoName3;
    }

    public void setMentoName3(String mentoName3) {
        this.mentoName3 = mentoName3;
    }

    public String getMentoName4() {
        return mentoName4;
    }

    public void setMentoName4(String mentoName4) {
        this.mentoName4 = mentoName4;
    }

    public String getMentoName5() {
        return mentoName5;
    }

    public void setMentoName5(String mentoName5) {
        this.mentoName5 = mentoName5;
    }
    
}
