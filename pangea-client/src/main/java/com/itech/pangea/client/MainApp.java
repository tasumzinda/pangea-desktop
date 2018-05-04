package com.itech.pangea.client;

import com.itech.pangea.preloaderClass.FXPreloader;
import com.itech.pangea.utils.AnnotationConfigApplicationContextTask;
import com.sun.javafx.application.LauncherImpl;
import java.sql.Connection;
import javafx.application.Application;
import javafx.concurrent.Task;
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
      //   Task anoTask = new AnnotationConfigApplicationContextTask();
      //   AnnotationConfigApplicationContext ctx = (AnnotationConfigApplicationContext) anoTask.getValue(); 
      //   new Thread(anoTask).start();
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
        
        Task<Connection> tas = new ServerHandler();
        
        tas.setOnSucceeded((event) -> {
            Connection con = tas.getValue();
            
                 if (con != null) {           
                    lOn = true;
                    lOff = false;
                    conStatus = "Online";       
                   }
                 else{
                    lOn = false;
                    lOff = true;
                    conStatus = "Offline";             
                   }
          });
        tas.setOnFailed((event) -> {
                     lOn = false;
                    lOff = true;
                    conStatus = "Offline";         
        });   
        new Thread(tas).start();
    } 
    

    public static void main(String[] args) {
       // launch(args);
        LauncherImpl.launchApplication(MainApp.class, FXPreloader.class, args);

    }

}
