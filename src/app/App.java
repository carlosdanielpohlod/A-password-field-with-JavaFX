/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class App extends Application{
    public AnchorPane root = new AnchorPane();
    @Override
    public void start(Stage primaryStage) {
        try{
            root = FXMLLoader.load(getClass().getResource("/view/PasswordField.fxml"));
        }catch(Exception e){
            System.out.println("Error at on load the fxml");
        }
        Scene scene = new Scene(root, 236, 49);
        
        primaryStage.setTitle("PasswordField");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
