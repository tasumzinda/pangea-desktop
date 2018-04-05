package com.itech.pangea.business.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.util.YesNo;

/**
 * Created by tdhla on 10/25/2016.
 */
@Entity
public class SupplementaryIndicatorForm extends BaseEntity {

    @ManyToOne
    private Facility facility;
    @Transient
    private String datec;
    private String name;
    @ManyToOne
    private Period period;
    private Long estFacCatchmentPopulation;
    private Long numOfActivePreARTPatients;
    private Long numberOfCLFsDeployed;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateCLFsDeployed;
    @Transient
    private String dateCLFS;
    private Long numberOfActiveCARGs;
    private Long numberOfActiveCARGMembers;
    private Long numberOfCARGsFormedThisMonth;
    private Long numberOfCARGsFormedToDate;
    private Long numberOfCATSSupportersDeployed;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateCATSDeployed;
    @Transient
    private String dateCATS;
    private Long numberOfActiveAdolescentSupportGroups;
    private Long numberOfActiveAdolescentSupportGroupMembers;
    private YesNo areYouImplementingDefaulterTracking;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateDefaulterTrackingImplemented;
    @Transient
    private String dateDefaulter;
    private YesNo areYouImplementingIndexTesting;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateIndexTestingImplemented;
    @Transient
    private String dateIndex;
    private YesNo areYouImplementingRetestPriorToARTInitiation;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateRetestPriorToARTInitiationImplemented;
    @Transient
    private String dateRetest;
    private YesNo doesFacilityHaveStaticHTSHRH;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateStaticHTSHRSDeployed;
    @Transient
    private String dateHTS;
    private YesNo doesFacilityHaveStaticTXNEWHRH;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateStaticTXNEWHRHDeployed;
    @Transient
    private String dateTXNEW;
    private YesNo doesFacilityProvideMultiMonthDrugDispensing;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateMultiMonthDrugDispensingStarted;
    @Transient
    private String dateMulti;
    private YesNo doesFacilityHaveFunctionalHealthCentreCommittee;
    private YesNo doesFacilityHaveFunctionalQualityImprovementCommittee;
    private YesNo doesFacilityHaveQualityImprovementProject;
    private Long opdNumOfPatientsInPastMonth;
    private Long opdNumOfPatWithKnownHIVPosStatusOnEntry;
    private Long opdNumOfPatTestedForHIVInPastMonth;
    private Long opdNumOfPatTestedPositiveInPastMonth;
    private Long stiNumberOfPatientsInPastMonth;
    private Long stiNumOfPatWithKnownHIVPosStatusOnEntry;
    private Long stiNumOfPatTestedForHIVInPastMonth;
    private Long stiNumOfPatTestedPosInPastMonth;
    private Long inPatNumOfPatientsInPastMonth;
    private Long inPatNumOfPatientsWithKnownHIVPosStatusOnEntry;
    private Long inPatNumOfPatTestedForHIVInPastMonth;
    private Long inPatNumOfPatientsTestedPositiveInPastMonth;
    private Long numClientsWithDocumentedCompletedReferralCycle;
    private Long numberOfClientsFromFacilityToCommunity;
    private Long numberOfClientsFromCommunityToFacility;
    private Long numberOfClientsWhoDefaultedART;
    private Long numberOfClientsWhoWereFollowed;
    private Long numberOfEIDResultsReceived;
    private Long numberOfHIVInfectedInfantsTracked;
    private Long numberOfVillageHealthWorkers;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateSubmitted;

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String getDatec() {
        return datec;
    }

    public void setDatec(String datec) {
        this.datec = datec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Long getEstFacCatchmentPopulation() {
        return estFacCatchmentPopulation;
    }

    public void setEstFacCatchmentPopulation(Long estFacCatchmentPopulation) {
        this.estFacCatchmentPopulation = estFacCatchmentPopulation;
    }

    public Long getNumOfActivePreARTPatients() {
        return numOfActivePreARTPatients;
    }

    public void setNumOfActivePreARTPatients(Long numOfActivePreARTPatients) {
        this.numOfActivePreARTPatients = numOfActivePreARTPatients;
    }

    public Long getNumberOfCLFsDeployed() {
        return numberOfCLFsDeployed;
    }

    public void setNumberOfCLFsDeployed(Long numberOfCLFsDeployed) {
        this.numberOfCLFsDeployed = numberOfCLFsDeployed;
    }

    public Date getDateCLFsDeployed() {
        return dateCLFsDeployed;
    }

    public void setDateCLFsDeployed(Date dateCLFsDeployed) {
        this.dateCLFsDeployed = dateCLFsDeployed;
    }

    public Long getNumberOfActiveCARGs() {
        return numberOfActiveCARGs;
    }

    public void setNumberOfActiveCARGs(Long numberOfActiveCARGs) {
        this.numberOfActiveCARGs = numberOfActiveCARGs;
    }

    public Long getNumberOfActiveCARGMembers() {
        return numberOfActiveCARGMembers;
    }

    public void setNumberOfActiveCARGMembers(Long numberOfActiveCARGMembers) {
        this.numberOfActiveCARGMembers = numberOfActiveCARGMembers;
    }

    public Long getNumberOfCARGsFormedThisMonth() {
        return numberOfCARGsFormedThisMonth;
    }

    public void setNumberOfCARGsFormedThisMonth(Long numberOfCARGsFormedThisMonth) {
        this.numberOfCARGsFormedThisMonth = numberOfCARGsFormedThisMonth;
    }

    public Long getNumberOfCARGsFormedToDate() {
        return numberOfCARGsFormedToDate;
    }

    public void setNumberOfCARGsFormedToDate(Long numberOfCARGsFormedToDate) {
        this.numberOfCARGsFormedToDate = numberOfCARGsFormedToDate;
    }

    public Long getNumberOfCATSSupportersDeployed() {
        return numberOfCATSSupportersDeployed;
    }

    public void setNumberOfCATSSupportersDeployed(Long numberOfCATSSupportersDeployed) {
        this.numberOfCATSSupportersDeployed = numberOfCATSSupportersDeployed;
    }

    public Date getDateCATSDeployed() {
        return dateCATSDeployed;
    }

    public void setDateCATSDeployed(Date dateCATSDeployed) {
        this.dateCATSDeployed = dateCATSDeployed;
    }

    public Long getNumberOfActiveAdolescentSupportGroups() {
        return numberOfActiveAdolescentSupportGroups;
    }

    public void setNumberOfActiveAdolescentSupportGroups(Long numberOfActiveAdolescentSupportGroups) {
        this.numberOfActiveAdolescentSupportGroups = numberOfActiveAdolescentSupportGroups;
    }

    public Long getNumberOfActiveAdolescentSupportGroupMembers() {
        return numberOfActiveAdolescentSupportGroupMembers;
    }

    public void setNumberOfActiveAdolescentSupportGroupMembers(Long numberOfActiveAdolescentSupportGroupMembers) {
        this.numberOfActiveAdolescentSupportGroupMembers = numberOfActiveAdolescentSupportGroupMembers;
    }

    public YesNo getAreYouImplementingDefaulterTracking() {
        return areYouImplementingDefaulterTracking;
    }

    public void setAreYouImplementingDefaulterTracking(YesNo areYouImplementingDefaulterTracking) {
        this.areYouImplementingDefaulterTracking = areYouImplementingDefaulterTracking;
    }

    public Date getDateDefaulterTrackingImplemented() {
        return dateDefaulterTrackingImplemented;
    }

    public void setDateDefaulterTrackingImplemented(Date dateDefaulterTrackingImplemented) {
        this.dateDefaulterTrackingImplemented = dateDefaulterTrackingImplemented;
    }

    public YesNo getAreYouImplementingIndexTesting() {
        return areYouImplementingIndexTesting;
    }

    public void setAreYouImplementingIndexTesting(YesNo areYouImplementingIndexTesting) {
        this.areYouImplementingIndexTesting = areYouImplementingIndexTesting;
    }

    public Date getDateIndexTestingImplemented() {
        return dateIndexTestingImplemented;
    }

    public void setDateIndexTestingImplemented(Date dateIndexTestingImplemented) {
        this.dateIndexTestingImplemented = dateIndexTestingImplemented;
    }

    public YesNo getAreYouImplementingRetestPriorToARTInitiation() {
        return areYouImplementingRetestPriorToARTInitiation;
    }

    public void setAreYouImplementingRetestPriorToARTInitiation(YesNo areYouImplementingRetestPriorToARTInitiation) {
        this.areYouImplementingRetestPriorToARTInitiation = areYouImplementingRetestPriorToARTInitiation;
    }

    public Date getDateRetestPriorToARTInitiationImplemented() {
        return dateRetestPriorToARTInitiationImplemented;
    }

    public void setDateRetestPriorToARTInitiationImplemented(Date dateRetestPriorToARTInitiationImplemented) {
        this.dateRetestPriorToARTInitiationImplemented = dateRetestPriorToARTInitiationImplemented;
    }

    public YesNo getDoesFacilityHaveStaticHTSHRH() {
        return doesFacilityHaveStaticHTSHRH;
    }

    public void setDoesFacilityHaveStaticHTSHRH(YesNo doesFacilityHaveStaticHTSHRH) {
        this.doesFacilityHaveStaticHTSHRH = doesFacilityHaveStaticHTSHRH;
    }

    public Date getDateStaticHTSHRSDeployed() {
        return dateStaticHTSHRSDeployed;
    }

    public void setDateStaticHTSHRSDeployed(Date dateStaticHTSHRSDeployed) {
        this.dateStaticHTSHRSDeployed = dateStaticHTSHRSDeployed;
    }

    public YesNo getDoesFacilityHaveStaticTXNEWHRH() {
        return doesFacilityHaveStaticTXNEWHRH;
    }

    public void setDoesFacilityHaveStaticTXNEWHRH(YesNo doesFacilityHaveStaticTXNEWHRH) {
        this.doesFacilityHaveStaticTXNEWHRH = doesFacilityHaveStaticTXNEWHRH;
    }

    public Date getDateStaticTXNEWHRHDeployed() {
        return dateStaticTXNEWHRHDeployed;
    }

    public void setDateStaticTXNEWHRHDeployed(Date dateStaticTXNEWHRHDeployed) {
        this.dateStaticTXNEWHRHDeployed = dateStaticTXNEWHRHDeployed;
    }

    public YesNo getDoesFacilityProvideMultiMonthDrugDispensing() {
        return doesFacilityProvideMultiMonthDrugDispensing;
    }

    public void setDoesFacilityProvideMultiMonthDrugDispensing(YesNo doesFacilityProvideMultiMonthDrugDispensing) {
        this.doesFacilityProvideMultiMonthDrugDispensing = doesFacilityProvideMultiMonthDrugDispensing;
    }

    public Date getDateMultiMonthDrugDispensingStarted() {
        return dateMultiMonthDrugDispensingStarted;
    }

    public void setDateMultiMonthDrugDispensingStarted(Date dateMultiMonthDrugDispensingStarted) {
        this.dateMultiMonthDrugDispensingStarted = dateMultiMonthDrugDispensingStarted;
    }

    public YesNo getDoesFacilityHaveFunctionalHealthCentreCommittee() {
        return doesFacilityHaveFunctionalHealthCentreCommittee;
    }

    public void setDoesFacilityHaveFunctionalHealthCentreCommittee(YesNo doesFacilityHaveFunctionalHealthCentreCommittee) {
        this.doesFacilityHaveFunctionalHealthCentreCommittee = doesFacilityHaveFunctionalHealthCentreCommittee;
    }

    public YesNo getDoesFacilityHaveFunctionalQualityImprovementCommittee() {
        return doesFacilityHaveFunctionalQualityImprovementCommittee;
    }

    public void setDoesFacilityHaveFunctionalQualityImprovementCommittee(YesNo doesFacilityHaveFunctionalQualityImprovementCommittee) {
        this.doesFacilityHaveFunctionalQualityImprovementCommittee = doesFacilityHaveFunctionalQualityImprovementCommittee;
    }

    public YesNo getDoesFacilityHaveQualityImprovementProject() {
        return doesFacilityHaveQualityImprovementProject;
    }

    public void setDoesFacilityHaveQualityImprovementProject(YesNo doesFacilityHaveQualityImprovementProject) {
        this.doesFacilityHaveQualityImprovementProject = doesFacilityHaveQualityImprovementProject;
    }

    public Long getOpdNumOfPatientsInPastMonth() {
        return opdNumOfPatientsInPastMonth;
    }

    public void setOpdNumOfPatientsInPastMonth(Long opdNumOfPatientsInPastMonth) {
        this.opdNumOfPatientsInPastMonth = opdNumOfPatientsInPastMonth;
    }

    public Long getOpdNumOfPatWithKnownHIVPosStatusOnEntry() {
        return opdNumOfPatWithKnownHIVPosStatusOnEntry;
    }

    public void setOpdNumOfPatWithKnownHIVPosStatusOnEntry(Long opdNumOfPatWithKnownHIVPosStatusOnEntry) {
        this.opdNumOfPatWithKnownHIVPosStatusOnEntry = opdNumOfPatWithKnownHIVPosStatusOnEntry;
    }

    public Long getOpdNumOfPatTestedForHIVInPastMonth() {
        return opdNumOfPatTestedForHIVInPastMonth;
    }

    public void setOpdNumOfPatTestedForHIVInPastMonth(Long opdNumOfPatTestedForHIVInPastMonth) {
        this.opdNumOfPatTestedForHIVInPastMonth = opdNumOfPatTestedForHIVInPastMonth;
    }

    public Long getOpdNumOfPatTestedPositiveInPastMonth() {
        return opdNumOfPatTestedPositiveInPastMonth;
    }

    public void setOpdNumOfPatTestedPositiveInPastMonth(Long opdNumOfPatTestedPositiveInPastMonth) {
        this.opdNumOfPatTestedPositiveInPastMonth = opdNumOfPatTestedPositiveInPastMonth;
    }

    public Long getStiNumberOfPatientsInPastMonth() {
        return stiNumberOfPatientsInPastMonth;
    }

    public void setStiNumberOfPatientsInPastMonth(Long stiNumberOfPatientsInPastMonth) {
        this.stiNumberOfPatientsInPastMonth = stiNumberOfPatientsInPastMonth;
    }

    public Long getStiNumOfPatWithKnownHIVPosStatusOnEntry() {
        return stiNumOfPatWithKnownHIVPosStatusOnEntry;
    }

    public void setStiNumOfPatWithKnownHIVPosStatusOnEntry(Long stiNumOfPatWithKnownHIVPosStatusOnEntry) {
        this.stiNumOfPatWithKnownHIVPosStatusOnEntry = stiNumOfPatWithKnownHIVPosStatusOnEntry;
    }

    public Long getStiNumOfPatTestedForHIVInPastMonth() {
        return stiNumOfPatTestedForHIVInPastMonth;
    }

    public void setStiNumOfPatTestedForHIVInPastMonth(Long stiNumOfPatTestedForHIVInPastMonth) {
        this.stiNumOfPatTestedForHIVInPastMonth = stiNumOfPatTestedForHIVInPastMonth;
    }

    public Long getStiNumOfPatTestedPosInPastMonth() {
        return stiNumOfPatTestedPosInPastMonth;
    }

    public void setStiNumOfPatTestedPosInPastMonth(Long stiNumOfPatTestedPosInPastMonth) {
        this.stiNumOfPatTestedPosInPastMonth = stiNumOfPatTestedPosInPastMonth;
    }

    public Long getInPatNumOfPatientsInPastMonth() {
        return inPatNumOfPatientsInPastMonth;
    }

    public void setInPatNumOfPatientsInPastMonth(Long inPatNumOfPatientsInPastMonth) {
        this.inPatNumOfPatientsInPastMonth = inPatNumOfPatientsInPastMonth;
    }

    public Long getInPatNumOfPatientsWithKnownHIVPosStatusOnEntry() {
        return inPatNumOfPatientsWithKnownHIVPosStatusOnEntry;
    }

    public void setInPatNumOfPatientsWithKnownHIVPosStatusOnEntry(Long inPatNumOfPatientsWithKnownHIVPosStatusOnEntry) {
        this.inPatNumOfPatientsWithKnownHIVPosStatusOnEntry = inPatNumOfPatientsWithKnownHIVPosStatusOnEntry;
    }

    public Long getInPatNumOfPatTestedForHIVInPastMonth() {
        return inPatNumOfPatTestedForHIVInPastMonth;
    }

    public void setInPatNumOfPatTestedForHIVInPastMonth(Long inPatNumOfPatTestedForHIVInPastMonth) {
        this.inPatNumOfPatTestedForHIVInPastMonth = inPatNumOfPatTestedForHIVInPastMonth;
    }

    public Long getInPatNumOfPatientsTestedPositiveInPastMonth() {
        return inPatNumOfPatientsTestedPositiveInPastMonth;
    }

    public void setInPatNumOfPatientsTestedPositiveInPastMonth(Long inPatNumOfPatientsTestedPositiveInPastMonth) {
        this.inPatNumOfPatientsTestedPositiveInPastMonth = inPatNumOfPatientsTestedPositiveInPastMonth;
    }

    public Long getNumberOfClientsWhoDefaultedART() {
        return numberOfClientsWhoDefaultedART;
    }

    public void setNumberOfClientsWhoDefaultedART(Long numberOfClientsWhoDefaultedART) {
        this.numberOfClientsWhoDefaultedART = numberOfClientsWhoDefaultedART;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public String getDateCLFS() {
        return dateCLFS;
    }

    public void setDateCLFS(String dateCLFS) {
        this.dateCLFS = dateCLFS;
    }

    public String getDateCATS() {
        return dateCATS;
    }

    public void setDateCATS(String dateCATS) {
        this.dateCATS = dateCATS;
    }

    public String getDateDefaulter() {
        return dateDefaulter;
    }

    public void setDateDefaulter(String dateDefaulter) {
        this.dateDefaulter = dateDefaulter;
    }

    public String getDateIndex() {
        return dateIndex;
    }

    public void setDateIndex(String dateIndex) {
        this.dateIndex = dateIndex;
    }

    public String getDateRetest() {
        return dateRetest;
    }

    public void setDateRetest(String dateRetest) {
        this.dateRetest = dateRetest;
    }

    public String getDateHTS() {
        return dateHTS;
    }

    public void setDateHTS(String dateHTS) {
        this.dateHTS = dateHTS;
    }

    public String getDateTXNEW() {
        return dateTXNEW;
    }

    public void setDateTXNEW(String dateTXNEW) {
        this.dateTXNEW = dateTXNEW;
    }

    public String getDateMulti() {
        return dateMulti;
    }

    public void setDateMulti(String dateMulti) {
        this.dateMulti = dateMulti;
    }

    public Long getNumberOfClientsFromFacilityToCommunity() {
        return numberOfClientsFromFacilityToCommunity;
    }

    public void setNumberOfClientsFromFacilityToCommunity(Long numberOfClientsFromFacilityToCommunity) {
        this.numberOfClientsFromFacilityToCommunity = numberOfClientsFromFacilityToCommunity;
    }

    public Long getNumberOfClientsFromCommunityToFacility() {
        return numberOfClientsFromCommunityToFacility;
    }

    public void setNumberOfClientsFromCommunityToFacility(Long numberOfClientsFromCommunityToFacility) {
        this.numberOfClientsFromCommunityToFacility = numberOfClientsFromCommunityToFacility;
    }

    public Long getNumClientsWithDocumentedCompletedReferralCycle() {
        return numClientsWithDocumentedCompletedReferralCycle;
    }

    public void setNumClientsWithDocumentedCompletedReferralCycle(Long numClientsWithDocumentedCompletedReferralCycle) {
        this.numClientsWithDocumentedCompletedReferralCycle = numClientsWithDocumentedCompletedReferralCycle;
    }

    public Long getNumberOfClientsWhoWereFollowed() {
        return numberOfClientsWhoWereFollowed;
    }

    public void setNumberOfClientsWhoWereFollowed(Long numberOfClientsWhoWereFollowed) {
        this.numberOfClientsWhoWereFollowed = numberOfClientsWhoWereFollowed;
    }

    public Long getNumberOfEIDResultsReceived() {
        return numberOfEIDResultsReceived;
    }

    public void setNumberOfEIDResultsReceived(Long numberOfEIDResultsReceived) {
        this.numberOfEIDResultsReceived = numberOfEIDResultsReceived;
    }

    public Long getNumberOfHIVInfectedInfantsTracked() {
        return numberOfHIVInfectedInfantsTracked;
    }

    public void setNumberOfHIVInfectedInfantsTracked(Long numberOfHIVInfectedInfantsTracked) {
        this.numberOfHIVInfectedInfantsTracked = numberOfHIVInfectedInfantsTracked;
    }

    public Long getNumberOfVillageHealthWorkers() {
        return numberOfVillageHealthWorkers;
    }

    public void setNumberOfVillageHealthWorkers(Long numberOfVillageHealthWorkers) {
        this.numberOfVillageHealthWorkers = numberOfVillageHealthWorkers;
    }
    
    
}