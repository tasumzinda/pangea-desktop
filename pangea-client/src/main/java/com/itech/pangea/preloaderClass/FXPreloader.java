/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package com.itech.pangea.preloaderClass;

import javafx.application.Preloader;
import javafx.application.Preloader.ProgressNotification;
import javafx.application.Preloader.StateChangeNotification;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author Admin
 
public class FXPreloader extends Preloader {
    
    ProgressBar bar;
    Stage stage;
    
    private Scene createPreloaderScene() {
        bar = new ProgressBar();
        BorderPane p = new BorderPane();
        p.setCenter(bar);
        return new Scene(p, 300, 150);        
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setScene(createPreloaderScene());        
        stage.show();
    }
    
    @Override
    public void handleStateChangeNotification(StateChangeNotification scn) {
        if (scn.getType() == StateChangeNotification.Type.BEFORE_START) {
            stage.hide();
        }
    }
    
    @Override
    public void handleProgressNotification(ProgressNotification pn) {
        bar.setProgress(pn.getProgress());
    }    
    
}
*/
package com.itech.pangea.preloaderClass;

import com.itech.pangea.client.MainApp;
import javafx.application.Platform;
import javafx.application.Preloader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXPreloader extends Preloader {

    private static final double WIDTH = 400;
    private static final double HEIGHT = 400;

    private Stage preloaderStage;
    private Scene scene;
    ProgressBar bar;
    Stage stage;

    private Label progress;

    public FXPreloader() {
        // Constructor is called before everything.
        System.out.println(MainApp.STEP() + "MyPreloader constructor called, thread: " + Thread.currentThread().getName());
    }

    @Override
    public void init() throws Exception {
        System.out.println(MainApp.STEP() + "MyPreloader#init (could be used to initialize preloader view), thread: " + Thread.currentThread().getName());

        // If preloader has complex UI it's initialization can be done in MyPreloader#init
        Platform.runLater(() -> {
            Label title = new Label("WELCOME ITECH ESTA FORMS!");
            title.setStyle("-fx-text-fill:#276696;-fx-font: 18 arial;");
            Label lod = new Label("Loading, please wait... ");
           
            VBox root = new VBox(title, lod);
            root.setPadding(new Insets(50, 50, 50, 50));
            
            root.setAlignment(Pos.CENTER);
            root.setSpacing(10);
            Image im = new Image(getClass().getResourceAsStream("/Images/download.jpg"));
            ImageView iv = new ImageView();
            iv.setImage(im);
            VBox foote = new VBox(iv);
            foote.setAlignment(Pos.CENTER);
            bar = new ProgressBar();
           
            BorderPane p = new BorderPane();
            p.setTop(root);
            p.setCenter(bar);
            p.setBottom(foote);
           
            scene =  new Scene(p, 600, 500);   
            
            
            
          /*  Label title = new Label("Itech Esta Forms!\nLoading, please wait...");
            title.setTextAlignment(TextAlignment.CENTER);
            progress = new Label("0%");

            VBox root = new VBox(title, progress);
            root.setAlignment(Pos.CENTER);

            scene = new Scene(root, WIDTH, HEIGHT);*/
        });
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(MainApp.STEP() + "MyPreloader#start (showing preloader stage), thread: " + Thread.currentThread().getName());

        this.preloaderStage = primaryStage;

        // Set preloader scene and show stage.
        preloaderStage.setScene(scene);
        preloaderStage.setTitle("Itech Esta Forms");
        preloaderStage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
        preloaderStage.show();
    }

    @Override
    public void handleApplicationNotification(PreloaderNotification info) {
        // Handle application notification in this point (see MainApp#init).
        if (info instanceof ProgressNotification) {
          //  progress.setText(((ProgressNotification) info).getProgress() + "%");
          bar.setProgress(((ProgressNotification) info).getProgress());
          
        }
    }

    @Override
    public void handleStateChangeNotification(StateChangeNotification info) {
        // Handle state change notifications.
        StateChangeNotification.Type type = info.getType();
        switch (type) {
            case BEFORE_LOAD:
                // Called after MyPreloader#start is called.
                System.out.println(MainApp.STEP() + "BEFORE_LOAD");
                break;
            case BEFORE_INIT:
                // Called before MainApp#init is called.
                System.out.println(MainApp.STEP() + "BEFORE_INIT");
                break;
            case BEFORE_START:
                // Called after MainApp#init and before MainApp#start is called.
                System.out.println(MainApp.STEP() + "BEFORE_START");

                preloaderStage.hide();
                break;
        }
    }
   
}
