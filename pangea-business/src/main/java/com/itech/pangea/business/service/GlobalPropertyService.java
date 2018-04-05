/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itech.pangea.business.service;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author slychaka
 */
public interface GlobalPropertyService extends Serializable {
    
    public String getDateOfBirthYearRange();
    
    public Map<String, String> getAllYearRanges();
    
}
