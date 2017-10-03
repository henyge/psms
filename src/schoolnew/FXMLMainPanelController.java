/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolnew;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

/**
 * FXML Controller class
 *
 * @author henyge
 */
public class FXMLMainPanelController implements Initializable {
    
    @FXML
    private VBox mainContainer, mainMenuCon, logoCon;
    
    //@FXML
    //private HBox logoCon;
    
    @FXML
    private BorderPane cols;
    
    @FXML
    private ImageView pTitle;
    
    private Rectangle2D screenBounds;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        screenBounds = Screen.getPrimary().getVisualBounds();
        double wd = screenBounds.getWidth();
        double ht = screenBounds.getHeight()-(screenBounds.getHeight()*0.0278);
        mainContainer.setPrefWidth(wd);
        mainContainer.setPrefHeight(ht);
        cols.setPrefWidth(wd);
        cols.setPrefHeight(ht);
        
        mainMenuCon.setMinWidth(wd*0.15);
        
        logoCon.setPrefWidth(wd*0.15);
        pTitle.setImage(new Image("/assets/logo.png"));
        //System.out.println("" + screenBounds.getWidth());
        
    }    
    
}
