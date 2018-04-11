/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConfig;

import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.domain.HTSRegisterForm;
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
    
    
    public String changeDate(String date){
        LocalDate d  = LocalDate.parse(date);
        Date newD = DateFunctions.convertDate(d);
        return newD.toString();
    }
}
