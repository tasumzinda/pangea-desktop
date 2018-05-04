
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
        if (info instanceof ProgressNotification) {
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
