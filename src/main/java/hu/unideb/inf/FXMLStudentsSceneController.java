package hu.unideb.inf;

import hu.unideb.inf.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import static com.sun.glass.ui.Cursor.setVisible;

public class FXMLStudentsSceneController {

    @FXML
    private Label helloLabel;



    @FXML
    void handleButtonPushed(){
        helloLabel.setText("Button pushed");
        System.out.println("Hello world!!!");
    }

}
