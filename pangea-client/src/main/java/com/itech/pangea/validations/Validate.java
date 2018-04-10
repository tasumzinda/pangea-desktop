/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.validations;

import com.google.common.net.InetAddresses;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Validate {
    
    
   public boolean validateNumber(String artNum){
              
        if(artNum.length()==0 || artNum.isEmpty()){
           // artNum = "0";
           return true;
        }
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(artNum);
        if(matcher.find() && matcher.group().equals(artNum)){
            return true;
        }
        else{
           return false;
        }
    }
    public boolean validateIpAddress(String ipAddress){
        if(ipAddress.equalsIgnoreCase("localhost")){
            return true;
        }
        String[] tokens = ipAddress.split("\\.");
        if(tokens.length !=4){
            return false;
        }
        for(String str : tokens){
            int i = Integer.parseInt(str);
            if((i<0) || (i>255)){
                return false;
            }
        }
        return true;
    }
    public boolean validateFullname(String fullName){
           // String regx = "[a-zA-Z]+";
     //     String regx = "^[a-zA-Z ]+$";
            String regx = "^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$";
            Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(fullName);
            return matcher.find();
    }
    public boolean validateTextOnly(String text){
            String regx = "[a-zA-Z]+";
            Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);
            return matcher.find();
    }
    
  
 
}
