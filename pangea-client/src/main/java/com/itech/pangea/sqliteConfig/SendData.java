/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConfig;

import com.itech.pangea.business.domain.Contact;
import com.itech.pangea.business.domain.DefaulterTrackingForm;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.HTSRegisterForm;
import com.itech.pangea.business.domain.IndexCaseTestingForm;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.util.Gender;
import com.itech.pangea.utils.ConvertItems;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.springframework.stereotype.Component;

/**
 *
 * @author kanaz
 */
@Component
public class SendData {

    SqliteDatabaseHandler handler;

    public SendData() {
        handler = SqliteDatabaseHandler.getInstance();
    }

    public Date convertString(String curDate) throws ParseException {
        if (curDate.equals("null") || curDate.isEmpty()) {
            return null;
        } else {
            DateFormat dateFormat = new SimpleDateFormat(
                    "EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
            Date date = dateFormat.parse(curDate);
            return date;
        }

    }

    public HTSRegisterForm htsFormQuery(Long id, String callType) throws SQLException, ParseException {
        ConvertItems ci = new ConvertItems();
        HTSRegisterForm hts = new HTSRegisterForm();
        String query = callType.equals("edit") ? "Select * From htsregister_form where id='"+id+"'" : "Select * From htsregister_form where id='"+id+"' and stat='0'";
     
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {           
            hts.setId(rs.getLong("hid")== 0 ? 0 : rs.getLong("hid"));
            hts.setHivTestingReferralSlipNumber(rs.getString("hiv_testing_referral_slip_number"));
            hts.setmDate(convertString(rs.getString("m_date")));
            hts.setReasonForHIVTest(ci.valDb(rs.getInt("reason_forhivtest")));
            hts.setTest(ci.testVal(rs.getString("test")));
            hts.setUuid(rs.getString("uuid"));
            hts.setSequentialNumber(rs.getString("sequential_number"));
            hts.setEntryStream(rs.getString("entry_stream").equals("null") ? null : rs.getString("entry_stream"));
            hts.setOther1("");
            hts.setHtsNumber(rs.getString("hts_number"));
            hts.setmTime(rs.getString("m_time").equals("null") ? null : rs.getString("m_time"));
            hts.sethTSModel(ci.htVal(rs.getInt("htsmodel")));
            hts.setPregnantOrLactatingWoman(ci.yesNo(rs.getInt("pregnant_or_lactating_woman")));
            hts.setFinalResult(ci.finalVal(rs.getString("final_result")));
            hts.setInPreArt(ci.yesNo(rs.getInt("in_pre_art")));
            hts.setRegisteredInPreArt(convertString(rs.getString("registered_in_pre_art")));
            hts.setInitiatedOnArt(ci.yesNo(rs.getInt("initiated_on_art")));
            hts.setDateOfInitiation(convertString(rs.getString("date_of_initiation")));
            hts.setOiArtNumber(rs.getString("oi_art_number"));

            Province prov = getByIdProvince(rs.getLong("province"));
            hts.setProvince(prov);
            District dis = getByIdDistrict(rs.getLong("district"));
            hts.setDistrict(dis);
            Facility fac = getByIdFacility(rs.getLong("facility"));
            hts.setFacility(fac);

            hts.setFirstName(rs.getString("first_name"));
            hts.setLastName(rs.getString("last_name"));
            hts.setAge(rs.getInt("age"));
            hts.setGender(Gender.get(rs.getInt("gender")));
            hts.setCreatedBy(createdby(rs.getLong("created_by")));
            hts.setModifiedBy(modifiedby(rs.getLong("modified_by")));
           
        }
        return hts;
    }

    public DefaulterTrackingForm dtfFormQuery(Long id, String callType) throws SQLException, ParseException {
        DefaulterTrackingForm dtf = new DefaulterTrackingForm();
        ConvertItems ci = new ConvertItems();
        String query = callType.equals("edit") ? "Select * From defaulter_tracking_form where id='"+id+"'" : "Select * From defaulter_tracking_form where id='"+id+"' and stat='0'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            dtf.setId(rs.getLong("did") == 0 ? 0 : rs.getLong("did"));
            dtf.setUuid(rs.getString("uuid"));
            dtf.setSequentialNumber(rs.getString("sequential_number"));
            dtf.setFirstNameOfIndex(rs.getString("first_name_of_index"));
            dtf.setLastNameOfIndex(rs.getString("last_name_of_index"));
            dtf.setPhysicalAddress(rs.getString("physical_address"));
            dtf.setContactDetails(rs.getString("contact_details"));
            dtf.setoIARTNumber(rs.getString("oiartnumber"));
            // dtf.setoIARTNumber(null);
            dtf.setDateArtInitiation(convertString(rs.getString("date_art_initiation")));
            dtf.setReviewDate(convertString(rs.getString("review_date")));
            dtf.setAppointmentDeemedDefaulter(convertString(rs.getString("appointment_deemed_defaulter")));
            dtf.setDateOfCall1(convertString(rs.getString("date_of_call1")));
            dtf.setCall1Outcome(ci.callOut(rs.getString("call1outcome")));
            dtf.setAppointmentDateIfLinkedToCare1(convertString(rs.getString("appointment_date_if_linked_to_care1")));

            dtf.setDateOfCall2(convertString(rs.getString("date_of_call2")));
            dtf.setCall2Outcome(ci.callOut(rs.getString("call2outcome")));
            dtf.setAppointmentDateIfLinkedToCare2(convertString(rs.getString("appointment_date_if_linked_to_care2")));

            dtf.setDateOfCall3(convertString(rs.getString("date_of_call3")));
            dtf.setCall3Outcome(ci.callOut(rs.getString("call3outcome")));
            dtf.setAppointmentDateIfLinkedToCare3(convertString(rs.getString("appointment_date_if_linked_to_care3")));

            dtf.setDateOfVisit(convertString(rs.getString("date_of_visit")));
            dtf.setVisitOutcome(ci.callOut(rs.getString("visit_outcome")));
            dtf.setAppointmentDateIfLinkedToCare(convertString(rs.getString("appointment_date_if_linked_to_care")));
            dtf.setFinalOutcome(ci.callOut(rs.getString("final_outcome")));
            dtf.setDateClientVisitedFacility(convertString(rs.getString("date_client_visited_facility")));

            Province prov = getByIdProvince(rs.getLong("province"));
            dtf.setProvince(prov);
            District dis = getByIdDistrict(rs.getLong("district"));
            dtf.setDistrict(dis);
            Facility fac = getByIdFacility(rs.getLong("facility"));
            dtf.setFacility(fac);
            dtf.setCreatedBy(createdby(rs.getLong("created_by")));
            dtf.setModifiedBy(modifiedby(rs.getLong("modified_by")));
        }
        return dtf;
    }

    public IndexCaseTestingForm ictFormQuery(Long id, String callType) throws SQLException, ParseException {
        ConvertItems ci = new ConvertItems();
        IndexCaseTestingForm ict = new IndexCaseTestingForm();
        String query = callType.equals("edit") ? "Select * From index_case_testing_form where id='" + id + "'" : "Select * From index_case_testing_form where id='" + id + "' and stat='0'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            ict.setId(rs.getLong("iid")== 0 ? 0 : rs.getLong("iid"));
            ict.setUuid(rs.getString("uuid"));
            ict.setSequentialNumber(rs.getString("sequential_number"));
            ict.setFirstNameOfIndex(rs.getString("first_name_of_index"));
            ict.setLastNameOfIndex(rs.getString("last_name_of_index"));
            ict.setSequentialNumberOfIndex(rs.getString("sequential_number_of_index"));
            ict.setDateIndexTestedOrDiagnosed(convertString(rs.getString("date_index_tested_or_diagnosed")));
            ict.setIndexOIARTNumber(rs.getString("indexoiartnumber"));
            //ict.setIndexOIARTNumber(null);
            ict.setIndexContactNumber(rs.getLong("index_contact_number"));
            //  ict.setIndexContactNumber(null);
            ict.setInitiatedOnART(ci.yesNo(rs.getInt("initiated_onart")));
            ict.setReasonForNotBeingInitiated(rs.getString("reason_for_not_being_initiated"));
            ict.setConsentForListedContacts(ci.yesNo(rs.getInt("consent_for_listed_contacts")));
            Province prov = getByIdProvince(rs.getLong("province"));
            ict.setProvince(prov);
            District dis = getByIdDistrict(rs.getLong("district"));
            ict.setDistrict(dis);
            Facility fac = getByIdFacility(rs.getLong("facility"));
            ict.setFacility(fac);
            ict.setCreatedBy(createdby(rs.getLong("created_by")));
            ict.setModifiedBy(modifiedby(rs.getLong("modified_by")));
        }
        return ict;
    }
    public Contact contactFormQuery(Long id, Long idx) throws SQLException, ParseException{
        Contact c = new Contact();
        ConvertItems ci = new ConvertItems();
        String query = "Select * From contact where id = '"+id+"' and index_case_testing_form = '"+idx+"'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
           c.setId(rs.getLong("cid") == 0 ? 0 : rs.getLong("cid"));
           c.setUuid(rs.getString("uuid"));
           c.setSequentialNumber(rs.getLong("sequential_number"));
            c.setDateCalled(convertString(rs.getString("date_called")));
             c.setDateVisited(convertString(rs.getString("date_visited")));
           c.setNameOfContact(rs.getString("name_of_contact"));
           c.setAge(rs.getInt("age"));
           c.setGender(ci.sex(rs.getInt("gender")));
           c.setContactAddress(rs.getString("contact_address"));
           c.setRelationShipToIndex(rs.getString("relation_ship_to_index"));
           c.setRelationshipOther(null);
           c.setReferralSlipNumber(rs.getString("referral_slip_number"));
           c.setHivStatusEntry(ci.reasonForIn(rs.getInt("hiv_status_entry")));
           c.setIfTestedDateContactTested(convertString(rs.getString("if_tested_date_contact_tested")));
           c.setPreferredPlaceForContactsToBeTested(ci.htVal(rs.getInt("preferred_place_for_contacts_to_be_tested")));
           c.setAppointmentDateForContact(convertString(rs.getString("appointment_date_for_contact")));
           c.setCallOutcome(ci.callOut(rs.getInt("call_outcome")));
           c.setSecondAppointmentDateForContact(convertString(rs.getString("second_appointment_date_for_contact")));
           c.setThirdAppointmentDateForContact(convertString(rs.getString("third_appointment_date_for_contact")));
           c.setVisitOutcome(ci.callOut(rs.getInt("visit_outcome")));
           c.setSequentialNumberOfContacts(rs.getInt("sequential_number_of_contacts"));
           c.setContactTestedDate(convertString(rs.getString("contact_tested_date")));
           c.setLocationOfTest(ci.htVal(rs.getInt("location_of_test")));
           c.setHivResult(ci.finalVal(rs.getInt("hiv_result")));
           c.setEnrolledIntoCare(ci.yesNo(rs.getInt("enrolled_into_care")));
           c.setOnART(ci.yesNo(rs.getInt("onart")));
           c.setArtNumber(rs.getString("art_number").equals("null") ? null : rs.getString("art_number"));
           c.setReferralSlipReturned(ci.yesNo(rs.getInt("referral_slip_returned")));
           
           c.setCreatedBy(createdby(rs.getLong("created_by")));
           c.setModifiedBy(modifiedby(rs.getLong("modified_by")));
          // c.setIndexCaseTestingForm(in);
        }
        return c;
    }
    public Contact contactFormQueryNewContact(Long id, Long idx) throws SQLException, ParseException{
        Contact c = new Contact();
        ConvertItems ci = new ConvertItems();
        String query = "Select * From contact where id = '"+id+"' and index_case_testing_form = '"+idx+"' and stat ='0'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
           c.setId(rs.getLong("cid") == 0 ? 0 : rs.getLong("cid"));
           c.setUuid(rs.getString("uuid"));
           c.setSequentialNumber(rs.getLong("sequential_number"));
           
           c.setDateCalled(convertString(rs.getString("date_called")));
             c.setDateVisited(convertString(rs.getString("date_visited")));
           c.setNameOfContact(rs.getString("name_of_contact"));
           c.setAge(rs.getInt("age"));
           c.setGender(ci.sex(rs.getInt("gender")));
           c.setContactAddress(rs.getString("contact_address"));
           c.setRelationShipToIndex(rs.getString("relation_ship_to_index"));
           c.setRelationshipOther(null);
           c.setReferralSlipNumber(rs.getString("referral_slip_number"));
           c.setHivStatusEntry(ci.reasonForIn(rs.getInt("hiv_status_entry")));
           c.setIfTestedDateContactTested(convertString(rs.getString("if_tested_date_contact_tested")));
           c.setPreferredPlaceForContactsToBeTested(ci.htVal(rs.getInt("preferred_place_for_contacts_to_be_tested")));
           c.setAppointmentDateForContact(convertString(rs.getString("appointment_date_for_contact")));
           c.setCallOutcome(ci.callOut(rs.getInt("call_outcome")));
           c.setSecondAppointmentDateForContact(convertString(rs.getString("second_appointment_date_for_contact")));
           c.setThirdAppointmentDateForContact(convertString(rs.getString("third_appointment_date_for_contact")));
           c.setVisitOutcome(ci.callOut(rs.getInt("visit_outcome")));
           c.setSequentialNumberOfContacts(rs.getInt("sequential_number_of_contacts"));
           c.setContactTestedDate(convertString(rs.getString("contact_tested_date")));
           c.setLocationOfTest(ci.htVal(rs.getInt("location_of_test")));
           c.setHivResult(ci.finalVal(rs.getInt("hiv_result")));
           c.setEnrolledIntoCare(ci.yesNo(rs.getInt("enrolled_into_care")));
           c.setOnART(ci.yesNo(rs.getInt("onart")));
           c.setArtNumber(rs.getString("art_number").equals("null") ? null : rs.getString("art_number"));
           c.setReferralSlipReturned(ci.yesNo(rs.getInt("referral_slip_returned")));
           
        //   c.setCreatedBy(createdby(rs.getLong("created_by")));
        //   c.setModifiedBy(modifiedby(rs.getLong("modified_by")));
          // c.setIndexCaseTestingForm(in);
        }
        return c;
    }
    public Contact contactFormQueryUpdate(Long id) throws SQLException, ParseException{
        Contact c = new Contact();
        ConvertItems ci = new ConvertItems();
        String query = "Select * From contact where id = '"+id+"'";
        ResultSet rs = handler.execQuery(query);
        while(rs.next()){
           c.setId(rs.getLong("cid") == 0 ? 0 : rs.getLong("cid"));
           c.setUuid(rs.getString("uuid"));
           c.setSequentialNumber(rs.getLong("sequential_number"));
           
           c.setDateCalled(convertString(rs.getString("date_called")));
             c.setDateVisited(convertString(rs.getString("date_visited")));
           c.setNameOfContact(rs.getString("name_of_contact"));
           c.setAge(rs.getInt("age"));
           c.setGender(ci.sex(rs.getInt("gender")));
           c.setContactAddress(rs.getString("contact_address"));
           c.setRelationShipToIndex(rs.getString("relation_ship_to_index"));
           c.setRelationshipOther(null);
           c.setReferralSlipNumber(rs.getString("referral_slip_number"));
           c.setHivStatusEntry(ci.reasonForIn(rs.getInt("hiv_status_entry")));
           c.setIfTestedDateContactTested(convertString(rs.getString("if_tested_date_contact_tested")));
           c.setPreferredPlaceForContactsToBeTested(ci.htVal(rs.getInt("preferred_place_for_contacts_to_be_tested")));
           c.setAppointmentDateForContact(convertString(rs.getString("appointment_date_for_contact")));
           c.setCallOutcome(ci.callOut(rs.getInt("call_outcome")));
           c.setSecondAppointmentDateForContact(convertString(rs.getString("second_appointment_date_for_contact")));
           c.setThirdAppointmentDateForContact(convertString(rs.getString("third_appointment_date_for_contact")));
           c.setVisitOutcome(ci.callOut(rs.getInt("visit_outcome")));
           c.setSequentialNumberOfContacts(rs.getInt("sequential_number_of_contacts"));
           c.setContactTestedDate(convertString(rs.getString("contact_tested_date")));
           c.setLocationOfTest(ci.htVal(rs.getInt("location_of_test")));
           c.setHivResult(ci.finalVal(rs.getInt("hiv_result")));
           c.setEnrolledIntoCare(ci.yesNo(rs.getInt("enrolled_into_care")));
           c.setOnART(ci.yesNo(rs.getInt("onart")));
           c.setArtNumber(rs.getString("art_number").equals("null") ? null : rs.getString("art_number"));
           c.setReferralSlipReturned(ci.yesNo(rs.getInt("referral_slip_returned")));
           
        //   c.setCreatedBy(createdby(rs.getLong("created_by")));
        //   c.setModifiedBy(modifiedby(rs.getLong("modified_by")));
          // c.setIndexCaseTestingForm(in);
        }
        return c;
    }

    public List<Long> htsIds() throws SQLException {
        List<Long> list = new ArrayList<>();
        String query = "Select id From htsregister_form where stat='0'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            Long ids = rs.getLong(1);
            list.add(ids);
            System.out.println(list);

        }
        return list;
    }

    public List<Long> dtfIds() throws SQLException {
        List<Long> listd = new ArrayList<>();
        String query = "Select id From defaulter_tracking_form where stat='0'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            Long idz = rs.getLong(1);
            listd.add(idz);
            System.out.println(listd);

        }
        return listd;
    }

    public List<Long> ictIds() throws SQLException {
        List<Long> listIct = new ArrayList<>();
        String query = "Select id From index_case_testing_form where stat='0'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            Long idz = rs.getLong(1);
            listIct.add(idz);
            System.out.println(listIct);

        }
        return listIct;
    }
    public List<Long> allContactsOfThisIndex(Long id) throws SQLException{
        List<Long> listContacts = new ArrayList<>(); 
        String query = "Select id From contact where index_case_testing_form = '"+id+"' and stat='0'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
           Long ids = rs.getLong(1);
           listContacts.add(ids);
        }
        return listContacts;
    }
    public List<Long> allContactsNewWithExistingindex() throws SQLException{
        List<Long> listContactsNew = new ArrayList<>(); 
        String query = "Select id From contact where cid='0' and stat='0'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
           Long ids = rs.getLong(1);
           listContactsNew.add(ids);
        }
        return listContactsNew;
    }
    public List<Long> allContactsForUpdate() throws SQLException{//
        List<Long> listContactsForU = new ArrayList<>(); 
        String query = "Select id From contact where cid<>'0' and stat='0'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
           Long ids = rs.getLong(1);
           listContactsForU.add(ids);
        }
        return listContactsForU;
    }
    
   /* public Long countNumberOfContacts(Long id){
        long total = 0L;
        String query  = 
    }
*/
    public Province getByIdProvince(Long id) throws SQLException {
        Province pp = new Province();

        String query = "Select * From Province where pid='" + id + "'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            pp.setId(rs.getLong("pid"));
            pp.setActive(null);
            pp.setDateCreated(null);
            pp.setDateModified(null);
            pp.setDeleted(Boolean.FALSE);
            pp.setUuid(null);
            pp.setVersion(null);
            pp.setDescription(rs.getString("description"));
            pp.setName(rs.getString("name"));
            pp.setCreatedBy(null);
            pp.setModifiedBy(null);
        }

        return pp;
    }

    public District getByIdDistrict(Long id) throws SQLException {
        District pp = new District();
        String query = "Select * From District where did='" + id + "'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            pp.setId(rs.getLong("did"));

            pp.setActive(null);
            pp.setDateCreated(null);
            pp.setDateModified(null);
            pp.setDeleted(Boolean.FALSE);
            pp.setUuid(null);
            pp.setVersion(null);
            pp.setDescription(rs.getString("description"));
            pp.setName(rs.getString("name"));
            pp.setCreatedBy(null);
            pp.setModifiedBy(null);
            pp.setProvince(null);

        }
        return pp;
    }

    public Facility getByIdFacility(Long id) throws SQLException {
        Facility pp = new Facility();
        String query = "Select * From Facility where fid='" + id + "'";
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            pp.setId(rs.getLong("fid"));
            pp.setActive(null);
            pp.setDateCreated(null);
            pp.setDateModified(null);
            pp.setDeleted(Boolean.FALSE);
            pp.setUuid(null);
            pp.setVersion(null);
            pp.setDescription(rs.getString("description"));
            pp.setName(rs.getString("name"));
            pp.setCreatedBy(null);
            pp.setModifiedBy(null);
            pp.setProvince(null);
        }
        return pp;
    }

    public List<Long> getByMentorDistrict(Long id) throws SQLException {
        String query = "Select * from mentor_district where mentor_id='" + id + "'";
        List<Long> district = new ArrayList<>();
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            district.add(rs.getLong("district_id"));
        }
        return district;
    }

    public List<Facility> getByDistrict(Long id) throws SQLException {
        String query = "Select * from facility where district='" + id + "'";
        List<Facility> facilitys = new ArrayList<>();
        Facility pp = new Facility();
        ResultSet rs = handler.execQuery(query);
        while (rs.next()) {
            pp.setId(rs.getLong("id"));
            pp.setActive(null);
            pp.setDateCreated(null);
            pp.setDateModified(null);
            pp.setDeleted(Boolean.FALSE);
            pp.setUuid(null);
            pp.setVersion(null);
            pp.setDescription(rs.getString("description"));
            pp.setName(rs.getString("name"));
            pp.setCreatedBy(null);
            pp.setModifiedBy(null);
            pp.setProvince(null);
            facilitys.add(pp);
        }
        return facilitys;
    }

    
    public User createdby(long id){
        User user = new User();
        user.setId(id);
        return user;
    }
    public User modifiedby(long id){
        User user = new User();
        user.setId(id);
        return user;
    }
    
}
