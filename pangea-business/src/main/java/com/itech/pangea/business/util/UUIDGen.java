/*
 * Copyright 2018 tasu.
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

import com.itech.pangea.business.domain.BaseEstaForm;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.service.EstaFormService;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author tasu
 */
public class UUIDGen {
    
    public static final SimpleDateFormat restFmt = new SimpleDateFormat("yyyy/MM/dd");
    
    public static String getFacilityCode(Facility facility){
        String name = String.valueOf(facility.getId());
        return name;
    }
    
    public static String getDate(Date date){
        String stringDate = getStringFromDate(date);
        return stringDate.replace("/", "").substring(2, 8);
    }
    
    public static String getStringFromDate(Date date) {
        return restFmt.format(date);
    }
    
    public static String generateUUID(Integer facility, Date date, User mentor, String seqNumber){
        return facility + 
                getDate(date) + 
                mentor.getId() + 
                seqNumber;
    }
    
    public static String getSequentialNumber(EstaFormService service, User createdBy, BaseEstaForm form, Facility facility){
        Long id = service.findLastInserIdByUser(createdBy, facility);
        String sequentialNumber = "";
        if(id == null){
            sequentialNumber = "001";
        }else{
            form = (BaseEstaForm) service.get(id);
            String dateCreated = DateUtil.getStringFromDate(form.getDateCreated());
            String today = DateUtil.getStringFromDate(new Date());
            if(dateCreated.equals(today)){
                String lastSequentialNumber = form.getSequentialNumber();
                int lastIndex = lastSequentialNumber.lastIndexOf("0");
                String firstPart = lastSequentialNumber.substring(0, lastIndex + 1);
                String lastPart = lastSequentialNumber.substring(lastIndex + 1, lastSequentialNumber.length());
                Integer numSequentialNumber = Integer.valueOf(lastPart);
                numSequentialNumber++;
                sequentialNumber = firstPart + String.valueOf(numSequentialNumber);
            }else{
                sequentialNumber = "001";
            }
        }
        return sequentialNumber;
    }
}
