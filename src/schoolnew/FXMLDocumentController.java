/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolnew;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javax.swing.JOptionPane;

/**
 *
 * @author henyge
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ImageView pTitle;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        //System.out.println(((Button)event.getSource()).getText());
        //System.out.println(((Button)event.getSource()).getId());
        JOptionPane.showMessageDialog(null, ((Button)event.getSource()).getId(), "Button id clicked", JOptionPane.INFORMATION_MESSAGE);
        //label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pTitle.setImage(new Image("/assets/soft_name.png"));

        
    }

}
