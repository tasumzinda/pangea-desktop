/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConfig;

import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.domain.HTSRegisterForm;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.utils.DateFunctions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author user
 */
public class ReceiveData {
    SqliteDatabaseHandler handler;

    public ReceiveData() {
        handler = SqliteDatabaseHandler.getInstance();
    }
    public void saveHtsRemote(HTSRegisterForm h) throws SQLException{
        Connection con = handler.connect();
        String query = "Insert Into htsregister_form(hid, active, date_created, date_modified, deleted, uuid, version, age, card_number,"
                       + "date_of_initiation, entry_stream, final_result, first_name, gender, in_pre_art, initiated_on_art, last_name, m_date, m_time,"
                       + "oi_art_number, reason_forhivtest, registered_in_pre_art, test, created_by, modified_by, district, facility, province, date_client_registered_inart,"
                       + "htsmodel, hiv_testing_referral_slip_number, hts_number, pregnant_or_lactating_woman, test_if_pregnant_or_lactating_woman, stat)"
                       + " Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, h.getId());
            ps.setString(2, h.getActive().toString());           
            ps.setString(3, h.getDateCreated() == null ? null : changeDate(h.getDateCreated().toString()));
            ps.setString(4, h.getDateModified() == null ? null : changeDate(h.getDateModified().toString()));
            ps.setString(5, h.getDeleted() == null ? null : h.getDeleted().toString());
            ps.setString(6, h.getUuid());
            ps.setLong(7, h.getVersion()==null ? 0 : h.getVersion());
            ps.setInt(8, h.getAge()== null ? 0 : h.getAge());
            ps.setNull(9, java.sql.Types.INTEGER);
            ps.setString(10, h.getDateOfInitiation() == null ? "null" : changeDate(h.getDateOfInitiation().toString()));
            ps.setString(11, h.getEntryStream());
            ps.setString(12, h.getFinalResult()==null ? "null" : h.getFinalResult().getCode().toString());
            ps.setString(13, h.getFirstName());
            ps.setInt(14, h.getGender() == null ? 1 : h.getGender().getCode());
            ps.setInt(15, h.getInPreArt() == null ? 11 : h.getInPreArt().getCode());
            ps.setInt(16, h.getInitiatedOnArt() == null ? 11 : h.getInitiatedOnArt().getCode());
            ps.setString(17, h.getLastName());
            ps.setString(18, h.getmDate() == null ? "null" : changeDate(h.getmDate().toString()));
            ps.setString(19, h.getmTime());
            ps.setString(20, h.getOiArtNumber());
            ps.setInt(21, h.getReasonForHIVTest()==null ? 11 : h.getReasonForHIVTest().getCode());
            ps.setString(22, h.getRegisteredInPreArt()==null? "null" : changeDate(h.getRegisteredInPreArt().toString()));
            ps.setString(23, h.getTest() == null ? "null" : h.getTest().getCode().toString());
            ps.setLong(24, h.getCreatedBy().getId());
            ps.setLong(25, h.getModifiedBy().getId());
            ps.setLong(26, h.getDistrict() == null ? 0 : h.getDistrict().getId());
            ps.setLong(27, h.getFacility() == null ? 0 : h.getFacility().getId());
            ps.setLong(28, h.getProvince() == null ? 0 : h.getProvince().getId());
            ps.setString(29, "");
            ps.setInt(30, h.gethTSModel() == null ? 11 : h.gethTSModel().getCode());
            ps.setString(31, h.getHivTestingReferralSlipNumber());
            ps.setString(32, h.getHtsNumber());
            ps.setInt(33, h.getPregnantOrLactatingWoman()==null ? 11 : h.getPregnantOrLactatingWoman().getCode());//int
            ps.setString(34, "");
            ps.setInt(35, 2);
            ps.executeUpdate();
            
    }
    public void saveDefaulterRemote(DefaulterTrackingForm d) throws SQLException{
           String query = " Insert Into defaulter_tracking_form(did, active, date_created, date_modified, deleted, uuid, version, appointment_date_if_linked_back_to_care, appointment_date_if_linked_to_care,"
                      + "appointment_date_if_linked_to_care1, appointment_deemed_defaulter, call1outcome, call2outcome, call3outcome, contact_details, "
                      + "date_art_initiation, date_client_visited_facility, date_of_call1, date_of_call2, date_of_call3, date_of_visit, date_visit_done, first_name_of_index,"
                      + "last_name_of_index, oiartnumber, physical_address, reason_for_tracking, review_date, visit_done_outcome, visit_outcome, created_by, modified_by, district, facility, province,"
                      + "appointment_date_if_linked_to_care2, appointment_date_if_linked_to_care3, final_outcome, stat)"
                      + " Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           Connection conn = handler.connect();
           PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, d.getId());
            ps.setString(2, d.getActive().toString());           
            ps.setString(3, d.getDateCreated() == null ? null : changeDate(d.getDateCreated().toString()));
            ps.setString(4, d.getDateModified() == null ? null : changeDate(d.getDateModified().toString()));
            ps.setString(5, d.getDeleted() == null ? null : d.getDeleted().toString());
            ps.setString(6, d.getUuid());
            ps.setLong(7, d.getVersion()==null ? 0 : d.getVersion());
            ps.setString(8, d.getAppointmentDateIfLinkedToCare()==null ? "null" : changeDate(d.getAppointmentDateIfLinkedToCare().toString()));
            ps.setString(9, d.getAppointmentDateIfLinkedToCare()==null ? "null" : changeDate(d.getAppointmentDateIfLinkedToCare().toString()));
            ps.setString(10, d.getAppointmentDateIfLinkedToCare1()==null ? "null" : changeDate(d.getAppointmentDateIfLinkedToCare1().toString()));
            ps.setString(11, d.getAppointmentDeemedDefaulter()==null ? "null" : changeDate(d.getAppointmentDeemedDefaulter().toString()));
            ps.setInt(12, d.getCall1Outcome() == null ? 11 : d.getCall1Outcome().getCode());
            ps.setInt(13, d.getCall2Outcome() == null ? 11 : d.getCall2Outcome().getCode());
            ps.setInt(14, d.getCall3Outcome() == null ? 11 : d.getCall3Outcome().getCode());
            ps.setString(15,d.getContactDetails());
            ps.setString(16, d.getDateArtInitiation() == null ? "null" : changeDate(d.getDateArtInitiation().toString()));
            ps.setString(17, d.getDateClientVisitedFacility() == null ? "null" : changeDate(d.getDateClientVisitedFacility().toString()));
            ps.setString(18, d.getDateOfCall1() == null ? "null" : changeDate(d.getDateOfCall1().toString()));
            ps.setString(19, d.getDateOfCall2() == null ? "null" : changeDate(d.getDateOfCall2().toString()));
            ps.setString(20, d.getDateOfCall3() == null ? "null" : changeDate(d.getDateOfCall3().toString()));
            ps.setString(21, d.getDateOfVisit() == null ? "null" : changeDate(d.getDateOfVisit().toString()));
            ps.setString(22, d.getDateOfVisit() == null ? "null" : changeDate(d.getDateOfVisit().toString()));
            ps.setString(23, d.getFirstNameOfIndex());
            ps.setString(24, d.getLastNameOfIndex());
            ps.setString(25, d.getoIARTNumber());
            ps.setString(26, d.getPhysicalAddress());
            ps.setString(27, "");
            ps.setString(28, d.getReviewDate() == null ? "null" : changeDate(d.getReviewDate().toString()));
            ps.setInt(29, d.getVisitOutcome() == null ? 11 : d.getVisitOutcome().getCode());
            ps.setInt(30, d.getVisitOutcome() == null ? 11 : d.getVisitOutcome().getCode());
            ps.setLong(31, d.getCreatedBy().getId());
            ps.setLong(32, d.getModifiedBy().getId());
            ps.setLong(33, d.getDistrict() == null ? 0 : d.getDistrict().getId());
            ps.setLong(34, d.getFacility() == null ? 0 : d.getFacility().getId());
            ps.setLong(35, d.getProvince() == null ? 0 : d.getProvince().getId());
            ps.setString(36, d.getAppointmentDateIfLinkedToCare2()==null ? "null" : changeDate(d.getAppointmentDateIfLinkedToCare2().toString()));
            ps.setString(37, d.getAppointmentDateIfLinkedToCare3()==null ? "null" : changeDate(d.getAppointmentDateIfLinkedToCare3().toString()));
            ps.setInt(38, d.getFinalOutcome() == null ? 11 : d.getFinalOutcome().getCode());
            ps.setInt(39, 2);
            ps.executeUpdate();
    }
    
    public void saveIndexCaseTest(IndexCaseTestingForm i) throws SQLException{
         String query = "Insert Into index_case_testing_form(iid, active, date_created, date_modified, deleted, uuid, version, age, appointment_date_for_contact,"
                           + "call_outcome, consent_for_listed_contacts, contact_address, contact_tested_date,date_called,"
                           + " date_visited, enrolled_into_care, first_name_of_index, gender, hiv_result,"
                           + "index_contact_number, indexoiartnumber, initiated_onart, last_name_of_index, location_of_test, name_of_contact,"
                           + "preferred_place_for_contacts_to_be_tested, reason_for_not_being_initiated, relation_ship_to_index, visit_outcome,"
                           + "created_by, modified_by, district, facility, province, art_number, date_index_tested_or_diagnosed, hiv_status_entry,"
                           + " if_tested_date_contact_tested, onart, referral_slip_number, referral_slip_returned,"
                           + "second_appointment_date_for_contact,sequential_number_of_contacts, sequential_number_of_index, third_appointment_date_for_contact, stat)"
                           + " Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";//46
           Connection connec = handler.connect();
           PreparedStatement ps = connec.prepareStatement(query);
            ps.setLong(1, i.getId());
            ps.setString(2, i.getActive().toString());           
            ps.setString(3, i.getDateCreated() == null ? null : changeDate(i.getDateCreated().toString()));
            ps.setString(4, i.getDateModified() == null ? null : changeDate(i.getDateModified().toString()));
            ps.setString(5, i.getDeleted() == null ? null : i.getDeleted().toString());
            ps.setString(6, i.getUuid());
            ps.setLong(7, i.getVersion()==null ? 0 : i.getVersion());
            ps.setNull(8, java.sql.Types.INTEGER);
            ps.setString(9, null);
            ps.setString(10, null);
            ps.setInt(11, i.getConsentForListedContacts() == null ? 11 : i.getConsentForListedContacts().getCode());
            ps.setString(12, null);
            ps.setString(13, null);
            ps.setString(14, null);
            ps.setString(15, null);
            ps.setNull(16, java.sql.Types.INTEGER);
            ps.setString(17, i.getFirstNameOfIndex());
            ps.setString(18, null);
            ps.setString(19, null);
            ps.setString(20, i.getIndexContactNumber().toString());
            ps.setString(21, i.getIndexOIARTNumber());
            ps.setInt(22, i.getInitiatedOnART() == null ? 11 : i.getInitiatedOnART().getCode());
            ps.setString(23, i.getLastNameOfIndex());
            ps.setString(24, null);
            ps.setString(25, null);
            ps.setString(26, null);
            ps.setString(27, i.getReasonForNotBeingInitiated());
            ps.setString(28, null);
            ps.setString(29, null);
            ps.setLong(30, i.getCreatedBy().getId());
            ps.setLong(31, i.getModifiedBy().getId());
            ps.setLong(32, i.getDistrict() == null ? 0 : i.getDistrict().getId());
            ps.setLong(33, i.getFacility() == null ? 0 : i.getFacility().getId());
            ps.setLong(34, i.getProvince() == null ? 0 : i.getProvince().getId());
            ps.setString(35, null);
            ps.setString(36, i.getDateIndexTestedOrDiagnosed() == null ? "null" : changeDate(i.getDateIndexTestedOrDiagnosed().toString()));
            ps.setString(37, null);
            ps.setString(38, null);
            ps.setString(39, null);
            ps.setString(40, null);
            ps.setString(41, null);
            ps.setString(42, null);
            ps.setString(43, null);
            ps.setString(44, i.getSequentialNumberOfIndex());
            ps.setString(45, null);
            ps.setInt(46, 2);
            ps.executeUpdate();
   
    }
    public void saveContact(Contact c) throws SQLException{
        
        String query = "Insert Into Contact(cid, active, date_created, date_modified, deleted, uuid, version, age, appointment_date_for_contact, art_number,"
                         + "call_outcome, contact_address, contact_tested_date, date_called, date_visited, enrolled_into_care, gender,"
                         + "hiv_result, hiv_status_entry, if_tested_date_contact_tested, location_of_test, name_of_contact, onart,"
                         + "preferred_place_for_contacts_to_be_tested, referral_slip_number, referral_slip_returned, relation_ship_to_index,"
                         + "second_appointment_date_for_contact, sequential_number_of_contacts, third_appointment_date_for_contact, visit_outcome,"
                         + "created_by, modified_by, index_case_testing_form, stat) Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           Connection connec = handler.connect();
           PreparedStatement ps = connec.prepareStatement(query);
            ps.setLong(1, c.getId());
            ps.setString(2, c.getActive().toString());           
            ps.setString(3, c.getDateCreated() == null ? null : changeDate(c.getDateCreated().toString()));
            ps.setString(4, c.getDateModified() == null ? null : changeDate(c.getDateModified().toString()));
            ps.setString(5, c.getDeleted() == null ? null : c.getDeleted().toString());
            ps.setString(6, c.getUuid());
            ps.setLong(7, c.getVersion()==null ? 0 : c.getVersion());
            ps.setInt(8, c.getAge());
            ps.setString(9, c.getAppointmentDateForContact() == null ? "null" : changeDate(c.getAppointmentDateForContact().toString()));
            ps.setString(10, c.getArtNumber());
            ps.setInt(11, c.getCallOutcome() == null ? 11 : c.getCallOutcome().getCode());
            ps.setString(12, c.getContactAddress());
            ps.setString(13, c.getContactTestedDate() == null ? "null" : changeDate(c.getContactTestedDate().toString()));
            ps.setString(14, c.getDateCalled() == null ? "null" : changeDate(c.getDateCalled().toString()));
            ps.setString(15, c.getDateVisited() == null ? "null" : changeDate(c.getDateVisited().toString()));
            ps.setInt(16, c.getEnrolledIntoCare() == null ? 11 : c.getEnrolledIntoCare().getCode());
            ps.setInt(17, c.getGender()== null ? 11 : c.getGender().getCode());
            ps.setInt(18, c.getHivResult() == null ? 11 : c.getHivResult().getCode());
            ps.setInt(19, c.getHivStatusEntry() == null ? 11 : c.getHivStatusEntry().getCode());
            ps.setString(20, c.getIfTestedDateContactTested() == null ? "null" : changeDate( c.getIfTestedDateContactTested().toString()));
            ps.setInt(21, c.getLocationOfTest() == null ? 11 : c.getLocationOfTest().getCode());
            ps.setString(22, c.getNameOfContact());
            ps.setInt(23, c.getOnART() == null ? 11 : c.getOnART().getCode());
            ps.setInt(24, c.getPreferredPlaceForContactsToBeTested() == null ? 11 : c.getPreferredPlaceForContactsToBeTested().getCode());
            ps.setString(25, c.getReferralSlipNumber());
            ps.setInt(26, c.getReferralSlipReturned() == null ? 11 : c.getReferralSlipReturned().getCode());
            ps.setString(27, c.getRelationShipToIndex());
            ps.setString(28, c.getSecondAppointmentDateForContact()==null ? "null" : changeDate(c.getSecondAppointmentDateForContact().toString()));
            ps.setInt(29, c.getSequentialNumberOfContacts() == null ? 0 : c.getSequentialNumberOfContacts());
            ps.setString(30, c.getThirdAppointmentDateForContact() == null ? "null" : changeDate(c.getThirdAppointmentDateForContact().toString()));
            ps.setInt(31, c.getVisitOutcome()==null ? 11 : c.getVisitOutcome().getCode());
            ps.setLong(32, c.getCreatedBy().getId());
            ps.setLong(33, c.getModifiedBy().getId());
            ps.setLong(34, c.getIndexCaseTestingForm().getId());
            ps.setInt(35, 2);
            ps.executeUpdate();        
    }
    
    public String changeDate(String date){
        LocalDate d  = LocalDate.parse(date);
        Date newD = DateFunctions.convertDate(d);
        return newD.toString();
    }
}
