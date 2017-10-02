/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolnew;

import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.stage.Screen;

/**
 *
 * @author henyge
 */
public class Schoolnew extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Locale locale = new Locale("en", "GB");
        ResourceBundle bundle = ResourceBundle.getBundle("resources/captions", locale);
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"), bundle);
        
        Scene scene = new Scene(root);
        
        // Get current screen of the stage      
        Screen screens = Screen.getPrimary();

        // Change stage properties
        Rectangle2D bounds = screens.getVisualBounds();
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());
        
        stage.setResizable(false);
        stage.setTitle("School Management System");
        stage.getIcons().add(new Image("/assets/pms_icon.png"));
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
