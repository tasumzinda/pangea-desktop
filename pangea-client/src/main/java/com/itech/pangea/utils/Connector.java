/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.utils;

import com.itech.pangea.client.HomeController;

/**
 *
 * @author user
 */
public class Connector {
    
   
    private HomeController controller ;

    public void setController(HomeController controller) {
        this.controller = controller ;
    }
    
    
    public void updateLabel() {
        System.out.println("Connector.Connecting(): Called");
        controller.countNewRecords();
    }

}
