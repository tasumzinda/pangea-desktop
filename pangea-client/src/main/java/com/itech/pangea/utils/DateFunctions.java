/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class DateFunctions {
     public static  Date convertDate(LocalDate localDate){
        Date dateCon = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return dateCon;
    }
    public static LocalDate localDate(Date date){
        if(date == null){
            return null;
        }
        else{
          return  date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
    }
   
}
