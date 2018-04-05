/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.client;

import javafx.fxml.FXMLLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Admin
 */
@Component
public class FXMLLoaderProvider {
    private AnnotationConfigApplicationContext cxt;
    public FXMLLoader getLoader(String path){
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(param -> cxt.getBean(param));
        loader.setLocation(getClass().getResource(path));
        return loader;
    }
    @Autowired
    public void setCxt(AnnotationConfigApplicationContext cxt){
        this.cxt = cxt;
    }
    
    
}
