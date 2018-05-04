/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.utils;

import com.itech.pangea.client.SpringConfig;
import javafx.concurrent.Task;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author user
 */
public class AnnotationConfigApplicationContextTask extends Task<AnnotationConfigApplicationContext>{

    @Override
    protected AnnotationConfigApplicationContext call() throws Exception {
          AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
          return ctx;
    }
    
}
