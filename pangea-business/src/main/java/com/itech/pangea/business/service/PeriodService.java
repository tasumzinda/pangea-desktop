/*
 * Copyright 2014 Edward Zengeni.
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

package com.itech.pangea.business.service;

import java.util.Date;
import java.util.List;
import com.itech.pangea.business.domain.Period;


/**
 *
 * @author Edward Zengeni
 */
public interface PeriodService extends GenericService<Period> {
    
    public Period getCurrentPeriod(Date currentDate);
    
    public List<Period> getActivePeriods();
    
    public Period getLatestPeriod();
    
    public Period getByStartAndEndDate(Date startDate, Date endDate);
    
    public List<Period> getLastTwelveMonths();
    
    public List<Period> getPastPeriod(int monthsPast);
    
    public void updateRenewalPeriod();
    
    public void deActivateStalePeriods();
    
    public Period getPeriodByYear(Integer year);
    
    public Period getByStartDate(Date startDate);
    
    public Period constructPeriod(Date startDate);
}