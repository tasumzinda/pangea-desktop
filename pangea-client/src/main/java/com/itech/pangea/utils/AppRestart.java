/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.utils;

import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 *
 * @author user
 */
public class AppRestart {
   public static void restartApplication() throws IOException {
    try {
        // java binary
        String java = System.getProperty("java.home") + "/bin/java";
        // vm arguments
        List<String> vmArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
        StringBuffer vmArgsOneLine = new StringBuffer();
        for (String arg : vmArguments) {
            // if it's the agent argument : we ignore it otherwise the
            // address of the old application and the new one will be in conflict
            if (!arg.contains("-agentlib")) {
                vmArgsOneLine.append(arg);
                vmArgsOneLine.append(" ");
            }
        }
        // init the command to execute, add the vm args
        final StringBuffer cmd = new StringBuffer("\"" + java + "\" " + vmArgsOneLine);
        // program main and program arguments (be careful a sun property. might not be supported by all JVM) 
        String[] mainCommand = System.getProperty("sun.java.command").split(" ");
        // program main is a jar
        if (mainCommand[0].endsWith(".jar")) {
            // if it's a jar, add -jar mainJar
            cmd.append("-jar " + new File(mainCommand[0]).getPath());
        } else {
            // else it's a .class, add the classpath and mainClass
            cmd.append("-cp \"" + System.getProperty("java.class.path") + "\" " + mainCommand[0]);
        }
       
        for (int i = 1; i < mainCommand.length; i++) {
            cmd.append(" ");
            cmd.append(mainCommand[i]);
        }
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                try {
                    Runtime.getRuntime().exec(cmd.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        System.exit(0);
    } catch (Exception e) {
        throw new IOException("Error while trying to restart the application", e);
    }
}
    
}
