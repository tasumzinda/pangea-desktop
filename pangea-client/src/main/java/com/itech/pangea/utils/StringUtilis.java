/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.utils;

/**
 *
 * @author Roy
 */
public class StringUtilis {
    
    public static String timeString(String time){
       if(time.length()==5){
           return time;
       }
        if(time.contains("am")){
         time = time.replace("am", "");
        }
        if(time.contains("pm")){
            time = time.replace("pm", "");
        }
        
        if(time.length()<6){
           time = "0"+time;
        }
        return time;
    }
    
}
