package pianolearn.controllers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import pianolearn.classes.Note;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class PianoController implements Initializable {

    private MidiChannel channel;

    private final List<Note> notes = Arrays.asList(
            new Note("C1", KeyCode.Q, 60),
            new Note("CSharp1", KeyCode.W, 61),
            new Note("D1", KeyCode.E, 62),
            new Note("DSharp1", KeyCode.R, 63),
            new Note("E1", KeyCode.T, 64),
            new Note("F1", KeyCode.Y, 65),
            new Note("FSharp1", KeyCode.U, 66),
            new Note("G1", KeyCode.I, 67),
            new Note("GSharp1", KeyCode.O, 68),
            new Note("A1", KeyCode.P, 69),
            new Note("ASharp1", KeyCode.OPEN_BRACKET, 70),
            new Note("C2", KeyCode.CLOSE_BRACKET, 71)
    );

    /* load sound of synthesizer: Piano */
    private void loadChannel() {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            synth.loadInstrument(synth.getDefaultSoundbank().getInstruments()[0]);

            channel = synth.getChannels()[0];

        } catch (MidiUnavailableException e) {
            System.out.println("Cannot get synth.");
            e.printStackTrace();
        }
    }

    // when this method is called -> change scene to main menu
    public void openMainMenu(ActionEvent actionEvent) {
        try {
            Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../scenes/MainMenuScene.fxml"))));
            window.show();
        } catch (IOException e) {
            System.err.println("Error: Cannot open main menu.");
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
