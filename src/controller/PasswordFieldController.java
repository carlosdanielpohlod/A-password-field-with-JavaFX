/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import resources.Validation;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class PasswordFieldController implements Initializable {

    @FXML
    private TextField tfdPassworField;
    @FXML
    private Label lblMessage;
    private Validation v = new Validation();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    @FXML
    private void tfdPasswordFieldOnAction(KeyEvent event) {
        
       if(! v.passwordIsValid(tfdPassworField.getText()))
           lblMessage.setText("Wrong or Invalid Password");
       else
           lblMessage.setText(" ");
    }
    
}
