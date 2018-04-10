package com.itech.pangea.client;

import com.itech.pangea.preloaderClass.FXPreloader;
import com.sun.javafx.application.LauncherImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 
public class MainApp extends Application {
 
   Connection connect;
   Stage primaryStage;
   
   
   

    private static final double WIDTH = 800;
    private static final double HEIGHT = 600;

    // Just a counter to create some delay while showing preloader.
    private static final int COUNT_LIMIT = 50000;

    private static int stepCount = 1;
    private static String conStatus;
    private static Boolean lOff;
    private static Boolean lOn;
    public static  AnnotationConfigApplicationContext annoConfig;

    public MainApp() {
        // Constructor is called after BEFORE_LOAD.
        System.out.println(MainApp.STEP() + "MyApplication constructor called, thread: " + Thread.currentThread().getName());
    }
    public AnnotationConfigApplicationContext getCtx(){
       
         AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
         return ctx;
    }

    // Used to demonstrate step couns.
    public static String STEP() {
        return stepCount++ + ". ";
    }
    @Override
    public void init() throws Exception {
        System.out.println(MainApp.STEP() + "MyApplication#init (doing some heavy lifting), thread: " + Thread.currentThread().getName());

        // Perform some heavy lifting (i.e. database start, check for application updates, etc. )
        conStatus();
        MainApp.annoConfig = getCtx();
        
        for (int i = 0; i < COUNT_LIMIT; i++) {
            double progress = (100 * i) / COUNT_LIMIT;
            LauncherImpl.notifyPreloader(this, new FXPreloader.ProgressNotification(progress));
        }
    }

   
   @Override
    public void start(Stage stage) throws Exception {
        this.primaryStage = stage;
        
        System.out.println(MainApp.STEP() + "MyApplication#start (initialize and show primary application stage), thread: " + Thread.currentThread().getName());

      // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AnnotationConfigApplicationContext ctx = annoConfig;
        FXMLLoader loader = ctx.getBean(FXMLLoaderProvider.class).getLoader("/fxml/Login.fxml");
        Parent root = loader.load();
        LoginController loginController = (LoginController)loader.getController();
        loginController.setAcac(ctx, lOn, lOff, conStatus);
      // loginController.setAcac(ctx);
        Scene scene = new Scene(root);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
        stage.setTitle("ITECH");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
       
    }
    
    public void conStatus() {
       try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           String jdbcUrl = "jdbc:mysql://localhost:3306/itechdb";
            String user = "root";
            String pass ="";
         // String user = "itechadmin";
        // String pass = "itech2017";
           Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
           if (con != null) {
               
               lOn = true;
               lOff = false;
               conStatus = "Online";
               
           } else if (con == null) {
               lOn = false;
               lOff = true;
               conStatus = "Offline";
               
           }
       } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
               lOn = false;
               lOff = true;
               conStatus = "Offline";
           Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
       } 
        
    } 
    

    public static void main(String[] args) {
       // launch(args);
        LauncherImpl.launchApplication(MainApp.class, FXPreloader.class, args);

    }

}
