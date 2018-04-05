/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.utils;

import com.itech.pangea.business.domain.util.CallOutcome;
import com.itech.pangea.business.domain.util.ClientServices;
import com.itech.pangea.business.domain.util.HIVResult;
import com.itech.pangea.business.domain.util.HTSModel;
import com.itech.pangea.business.domain.util.ReasonForHIVTest;
import com.itech.pangea.business.domain.util.Test;
import com.itech.pangea.business.domain.util.YesNo;

/**
 *
 * @author kanaz
 */
public class ConvertItems {
    /*HTS Register */
    public ReasonForHIVTest valDb(int val){
        if(val==11){
            return null;
        }
        else{
            return ReasonForHIVTest.get(val);
        }   
        
    }
    public Test testVal(String val){
        if(val.equals("null")){
            return null;
        }
        else{
            return Test.get(Integer.parseInt(val));
        }   
        
    }
     public ClientServices csVal(String val){
        if(val.equals("null")){
            return null;
        }
        else{
            return ClientServices.get(Integer.parseInt(val));
        }   
        
    }
     public HTSModel htVal(int val){
        if(val==11){
            return null;
        }
        else{
            return HTSModel.get(val);
        }   
        
    }
     public YesNo yesNo(int val){
        if(val==11){
            return null;
        }
        else{
            return YesNo.get(val);
        }   
        
    }
     public HIVResult finalVal(String val){
        if(val.equals("null")){
            return null;
        }
        else{
            return HIVResult.get(Integer.parseInt(val));
        }   
        
    }
     /*Defaulter Tracking Form*/
     public CallOutcome callOut(String val){
        if(val.equals("11")){
            return null;
        }
        else{
            return CallOutcome.get(Integer.parseInt(val));
        }   
        
    }
}
