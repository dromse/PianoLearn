package pianolearn;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PianoController implements Initializable {
    IPiano piano = new Piano();
    IOpenScene openScene = new OpenScene();

    // when this method is called -> change scene to main menu
    public void openMainMenu(ActionEvent actionEvent) {
        piano.unloadChannel();
        openScene.openMainMenu(actionEvent);
    }

    /* When the scene is loaded start channel */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        piano.loadChannel();
    }

    /* Playing on keyboard */
    public void handleKeyPressed(KeyEvent key){
        piano.playKeyboard(key);
    }

    /* Playing by clicking on buttons*/
    public void playC1Button(ActionEvent actionEvent) { 
        piano.playNote(60); 
    }
    public void playCSharp1Button(ActionEvent actionEvent) {
        piano.playNote(61);
    }
    public void playD1Button(ActionEvent actionEvent) {
        piano.playNote(62);
    }
    public void playDSharp1Button(ActionEvent actionEvent) {
        piano.playNote(63);
    }
    public void playE1Button(ActionEvent actionEvent) {
        piano.playNote(64);
    }
    public void playF1Button(ActionEvent actionEvent) {
        piano.playNote(65);
    }
    public void playFSharp1Button(ActionEvent actionEvent) {
        piano.playNote(66);
    }
    public void playG1Button(ActionEvent actionEvent) {
        piano.playNote(67);
    }
    public void playGSharp1Button(ActionEvent actionEvent) {
        piano.playNote(68);
    }
    public void playA1Button(ActionEvent actionEvent) {
        piano.playNote(69);
    }
    public void playASharp1Button(ActionEvent actionEvent) {
        piano.playNote(70);
    }
    public void playB1Button(ActionEvent actionEvent) {
        piano.playNote(71);
    }
    public void playC2Button(ActionEvent actionEvent) {
        piano.playNote(72);
    }

}
