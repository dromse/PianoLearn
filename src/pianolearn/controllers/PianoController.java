package pianolearn.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PianoController implements Initializable {
    public Button C1Button;
    public Button CSharp1Button;
    public Button D1Button;
    public Button DSharp1Button;
    public Button E1Button;
    public Button F1Button;
    public Button FSharp1Button;
    public Button G1Button;
    public Button GSharp1Button;
    public Button A1Button;
    public Button ASharp1Button;
    public Button B1Button;
    public Button C2Button;

    private MidiChannel channel;

    /* Create synth. */
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

    /* When the scene is loaded start channel */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            loadChannel();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    /* Playing on keyboard */
    public void handleKeyPressed(KeyEvent ke){
        if (ke.getCode() == KeyCode.Q) {
            C1Button.fire();
        }
        if (ke.getCode() == KeyCode.W) {
            CSharp1Button.fire();
        }
        if (ke.getCode() == KeyCode.E) {
            D1Button.fire();
        }
        if (ke.getCode() == KeyCode.R) {
            DSharp1Button.fire();
        }
        if (ke.getCode() == KeyCode.T) {
            E1Button.fire();
        }
        if (ke.getCode() == KeyCode.Y) {
            F1Button.fire();
        }
        if (ke.getCode() == KeyCode.U) {
            FSharp1Button.fire();
        }
        if (ke.getCode() == KeyCode.I) {
            G1Button.fire();
        }
        if (ke.getCode() == KeyCode.O) {
            GSharp1Button.fire();
        }
        if (ke.getCode() == KeyCode.P) {
            A1Button.fire();
        }
        if (ke.getCode() == KeyCode.OPEN_BRACKET) {
            ASharp1Button.fire();
        }
        if (ke.getCode() == KeyCode.CLOSE_BRACKET) {
            B1Button.fire();
        }
    }

    /* Playing by clicking on buttons*/
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
