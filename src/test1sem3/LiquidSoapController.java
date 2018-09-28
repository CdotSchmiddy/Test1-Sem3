/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1sem3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 *
 * @author Calum
 */
public class LiquidSoapController implements Initializable{
    
        @FXML private Label brandLabel;
        @FXML private ComboBox comboBox;
        @FXML private Label useLabel;
        @FXML private Label volumeLabel;
        @FXML private ImageView photo;
        

        @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox.getItems().addAll("Palmolive  (887 ml)","Dawn  (8000 ml)","Meyers  (370 ml)", "Soft Soap  (236 ml)", "Murphys  (473 ml)");
        comboBox.setVisibleRowCount(3);
        comboBox.setEditable(true);
        comboBox.setPromptText("Choose Soap");
        brandLabel.setText("");
        useLabel.setText("");
        volumeLabel.setText("");
        
    }
    
}
