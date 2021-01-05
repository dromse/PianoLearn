package pianolearn;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OpenScene implements IOpenScene {

    // when this method is called -> change scene to main menu
    @Override
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

    // when this method is called -> change scene to piano
    @Override
    public void openPiano(ActionEvent actionEvent) {
        try {
            Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("scenes/PianoScene.fxml"))));
            window.show();
        } catch (IOException e) {
            System.err.println("Error: Cannot open piano.");
            e.printStackTrace();
        }
    }

    // when this method is called -> change scene to handbook
    @Override
    public void openHandBook(ActionEvent actionEvent) {
        try {
            Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("scenes/HandBookScene.fxml"))));
            window.show();
        } catch (IOException e) {
            System.err.println("Error: Cannot open handbook.");
            e.printStackTrace();
        }
    }
}

