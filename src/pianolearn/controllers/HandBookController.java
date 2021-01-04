package pianolearn.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class HandBookController implements Initializable {

    public ImageView imageView;
    public ChoiceBox<String> RootNoteChoiceBox;
    public ChoiceBox<String> AccordChoiceBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        RootNoteChoiceBox.getItems().addAll("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "B");
        AccordChoiceBox.getItems().addAll("major", "minor");
    }

    // when this method is called -> change scene to main menu
    public void openMainMenu(ActionEvent actionEvent) {
        try {
            Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("scenes/MainMenuScene.fxml"))));
            window.show();
        } catch (IOException e) {
            System.err.println("Error: Cannot open piano.");
            e.printStackTrace();
        }
    }

    public void showAccordImage(ActionEvent actionEvent) {
        String path = "scenes/img/accords/" + AccordChoiceBox.getValue() + "/" + RootNoteChoiceBox.getValue() + ".jpg";
        imageView.setImage(new Image(getClass().getResourceAsStream(path)));
    }
}
