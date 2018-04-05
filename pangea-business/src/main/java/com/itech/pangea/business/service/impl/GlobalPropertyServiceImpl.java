/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itech.pangea.business.service.impl;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.itech.pangea.business.service.GlobalPropertyService;
import com.itech.pangea.business.util.DateUtil;

/**
 *
 * @author slychaka
 */
@Repository("dateRangeService")
public class GlobalPropertyServiceImpl implements GlobalPropertyService {

    @Override
    public String getDateOfBirthYearRange() {
        /**
         * @param get retirement age provisionally<br/> add 10years to allow for employees <br/>who go beyond age of retirement
         */
        Calendar startYear = Calendar.getInstance();
        Calendar endYear = Calendar.getInstance();
        startYear.setTime(DateUtil.getDateFromAge(75));
        endYear.setTime(DateUtil.getDateFromAge(16));
        return startYear.get(Calendar.YEAR)+":"+endYear.get(Calendar.YEAR);
    }

    @Override
    public Map<String, String> getAllYearRanges() {
        Map<String, String> dates = new HashMap<>();
        dates.put("dateOfBirth", getDateOfBirthYearRange());
        return dates;
    }
}
