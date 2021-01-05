package pianolearn.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenu implements IMainMenu {
    @Override
    public void init(Stage stage) {
        try {
            Parent menu = FXMLLoader.load(getClass().getResource("scenes/MainMenuScene.fxml"));
            Scene menuScene = new Scene(menu);
            stage.setTitle("PianoLearn");

            stage.setScene(menuScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
