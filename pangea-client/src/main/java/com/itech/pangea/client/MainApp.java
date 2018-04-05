package com.itech.pangea.client;

import java.sql.Connection;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 
public class MainApp extends Application {
 
   Connection connect;
   @Override
    public void start(Stage stage) throws Exception {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        FXMLLoader loader = ctx.getBean(FXMLLoaderProvider.class).getLoader("/fxml/Login.fxml");
        Parent root = loader.load();
       // Parent root = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
        LoginController loginController = (LoginController)loader.getController();
        loginController.setAcac(ctx);
        Scene scene = new Scene(root);
        //scene.getStylesheets().add("/styles/Styles.css");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/download.jpg")));
        stage.setTitle("ITECH");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
       // testSqlLite();
    }
    
    public void testSqlLite(){  
       connect = SqliteConnect.sqlConnect();
       if(connect == null){
           System.err.println("********************************");
           System.out.println("Connection failed");
           System.err.println("********************************");
       }
       else{
           System.err.println("********************************");
           System.out.println("Connection Successfull");
           System.err.println("********************************");
       }
    }
    

    public static void main(String[] args) {
        launch(args);
        
    }

}
