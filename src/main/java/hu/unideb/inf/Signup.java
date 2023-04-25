package hu.unideb.inf;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
public class Signup extends javax.swing.JFrame{

    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Login.class.getResource("/fxml/Signup.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
        /*Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");

        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();*/
    }

}
