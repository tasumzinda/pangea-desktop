/*
 * Copyright 2014 Judge Muzinda.
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
package com.itech.pangea.business.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;

/**
 *
 * @author Judge Muzinda
 */
public class DateUtil {

    private static final Integer startDate = getMonthStartDate();
    private static final Integer startMonth = 0;
    private static final Integer endDate = getMonthEndDate();
    private static final Integer endMonth = 11;
    public static final Integer INITIAL_YEAR = 2014;
    public static final Integer CURRENT_YEAR = getCurrentYear();
    public static final Integer CURRENT_MONTH = getCurrentMonth();
    public static final Integer CURRENT_DATE = getCurrentDate();
    public static final List<Integer> YEAR_RANGE = getInitialDateRange(INITIAL_YEAR);
    public static final SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat fileFmt = new SimpleDateFormat("dd-MM-yyyy");
    public static final SimpleDateFormat restFmt = new SimpleDateFormat("dd/MM/yyyy");
    public static final SimpleDateFormat timeFmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private DateUtil() {
        throw new IllegalStateException("Class not intended to be instantiated");
    }

    public static Date getDateFromString(String date) {
        try {
            return fmt.parse(date);
        } catch (ParseException ex) {
            System.out.println("Error occurred");
        }
        throw new IllegalArgumentException("Un expected parameter provided :" + date);
    }

    public static Date getDateDiffDate(int factor) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, factor);
        return cal.getTime();
    }

    private static Integer getMonthEndDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static Integer getMonthStartDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.getActualMinimum(Calendar.DAY_OF_MONTH);
    }

    private static Integer getCurrentYear() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.get(Calendar.YEAR);
    }

    private static Integer getCurrentMonth() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.get(Calendar.MONTH);
    }

    private static Integer getCurrentDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.get(Calendar.DATE);
    }

    public static List<Integer> getInitialDateRange(Integer initialYear) {
        List<Integer> items = new ArrayList<>();
        for (int x = initialYear; x <= CURRENT_YEAR + 1; x++) {
            if (x <= CURRENT_YEAR) {
                items.add(x);
            } else {
                /**
                 * TODO make comparizon month editable
                 *
                 * @param comparizon month
                 */
                if (CURRENT_MONTH >= 8) {
                    items.add(x);
                }

            }
        }
        return items;
    }

    public static Date getPeriodStart(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, getMonthStartDate(date));
        return cal.getTime();
    }

    public static Date getPeriodEnd(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, getMonthEndDate(date));
        return cal.getTime();
    }

    public static Integer getMonthStartDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.getActualMinimum(Calendar.DAY_OF_MONTH);
    }

    private static Integer getMonthEndDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static Date getDate(Integer year, Boolean start) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, start ? startMonth : endMonth, start ? startDate : endDate);
        return cal.getTime();
    }

    public static Integer getYearFromDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.YEAR);
    }

    public static Integer getMonthFromDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.MONTH);
    }

    public static String getFriendlyFileName(String name) {
        int month = getCurrentMonth() + 1;
        return name + "_" + getCurrentDate() + "_" + month + "_" + getCurrentYear();
    }

    public static String getHeader(String name) {
        return name + " " + restFmt.format(new Date());
    }

    public static String getPrintName(String name) {
        final String searchExp = "_";
        StringBuilder builder = new StringBuilder();
        String[] args = name.split(searchExp);
        int pos = 0;
        for (String s : args) {
            if (pos < args.length) {
                builder.append(s);
                builder.append(" ");
                pos++;
            }
        }
        return builder.toString();
    }

    public static Date getDateFromAge(Integer age) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, -age);
        return cal.getTime();
    }

    public static String getYearMonthName(Date date) {
        return getMonthNameFromDate(date) + " " + getYearFromDate(date);
    }

    private static String getMonthNameFromDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
    }

    public static String getFooterText(String name) {
        final String searchExp = "_";
        String[] args = name.split(searchExp);
        return args[args.length - 1];
    }

    public static Integer[] hex2Rgb(String colorStr) {
        return new Integer[]{Integer.valueOf(colorStr.substring(1, 3), 16),
            Integer.valueOf(colorStr.substring(3, 5), 16),
            Integer.valueOf(colorStr.substring(5, 7), 16)};
    }

    public static Integer getDays(Date start, Date today) {
        return Days.daysBetween(new DateTime(start), new DateTime(today)).getDays();
    }
    
    public static Integer getHours(Date startDate, Date endDate){
        return Hours.hoursBetween(new DateTime(startDate), new DateTime(endDate)).getHours();
    }
    
    public static Integer getMinutes(Date startDate, Date endDate){
        return Minutes.minutesBetween(new DateTime(startDate), new DateTime(endDate)).getMinutes();
    }

    public static String getStringFromDate(Date date) {
        return restFmt.format(date);
    }

    public static Double round(Double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
