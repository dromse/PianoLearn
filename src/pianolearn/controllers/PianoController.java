package pianolearn.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PianoController implements Initializable {
    private MidiChannel channel;
    Synthesizer synth;
    {
        try {
            synth = MidiSystem.getSynthesizer();
        } catch (MidiUnavailableException e) {
            System.out.println("Cannot get synth.");
            e.printStackTrace();
        }
    }

    /* load sound of synthesizer: Piano */
    private void loadChannel() throws MidiUnavailableException {
            synth.open();
            synth.loadInstrument(synth.getDefaultSoundbank().getInstruments()[0]);
            channel = synth.getChannels()[0];
    }

    // when this method is called -> change scene to main menu
    public void openMainMenu(ActionEvent actionEvent) {
        try {
            synth.close();
            Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("scenes/MainMenuScene.fxml"))));
            window.show();
        } catch (IOException e) {
            System.err.println("Error: Cannot open main menu.");
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            loadChannel();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void playC1Button(ActionEvent actionEvent) {
        channel.noteOn(60, 60);
    }

    public void playCSharp1Button(ActionEvent actionEvent) {
        channel.noteOn(61, 60);
    }

    public void playD1Button(ActionEvent actionEvent) {
        channel.noteOn(62, 60);
    }

    public void playDSharp1Button(ActionEvent actionEvent) {
        channel.noteOn(63, 60);
    }

    public void playE1Button(ActionEvent actionEvent) {
        channel.noteOn(64, 60);
    }

    public void playF1Button(ActionEvent actionEvent) {
        channel.noteOn(65, 60);
    }

    public void playFSharp1Button(ActionEvent actionEvent) {
        channel.noteOn(66, 60);
    }

    public void playG1Button(ActionEvent actionEvent) {
        channel.noteOn(67, 60);
    }

    public void playGSharp1Button(ActionEvent actionEvent) {
        channel.noteOn(68, 60);
    }

    public void playA1Button(ActionEvent actionEvent) {
        channel.noteOn(69, 60);
    }

    public void playASharp1Button(ActionEvent actionEvent) {
        channel.noteOn(70, 60);
    }

    public void playB1Button(ActionEvent actionEvent) {
        channel.noteOn(71, 60);
    }

    public void playC2Button(ActionEvent actionEvent) {
        channel.noteOn(72, 60);
    }
}
