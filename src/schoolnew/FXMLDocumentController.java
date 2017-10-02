/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolnew;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author henyge
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ImageView pTitle;
    
    @FXML
    private Schoolnew sn;
    
    @FXML
    private Button btnLogin;
    
    private Stage stage;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        String id = ((Button)event.getSource()).getId();
        
        if(id.equals("btnLogin")){
            stage = (Stage) btnLogin.getScene().getWindow();
            AnchorPane root;
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLMainPanel.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pTitle.setImage(new Image("/assets/soft_name.png"));
    }

}
