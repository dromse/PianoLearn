package pianolearn.controllers;

import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Piano implements IPiano {

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

    // load channel specially it opens sound stream
    @Override
    public void loadChannel() {
        try {
            synth.open();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
        synth.loadInstrument(synth.getDefaultSoundbank().getInstruments()[0]);
        channel = synth.getChannels()[0];
    }

    // unload opened sound stream
    @Override
    public void unloadChannel() {
        synth.close();
    }


    // playing on keyboard
    @Override
    public void playKeyboard(KeyEvent key) {
        if (key.getCode() == KeyCode.Q) {
            playNote(60);
        }
        if (key.getCode() == KeyCode.W) {
            playNote(61);
        }
        if (key.getCode() == KeyCode.E) {
            playNote(62);
        }
        if (key.getCode() == KeyCode.R) {
            playNote(63);
        }
        if (key.getCode() == KeyCode.T) {
            playNote(64);
        }
        if (key.getCode() == KeyCode.Y) {
            playNote(65);
        }
        if (key.getCode() == KeyCode.U) {
            playNote(66);
        }
        if (key.getCode() == KeyCode.I) {
            playNote(67);
        }
        if (key.getCode() == KeyCode.O) {
            playNote(68);
        }
        if (key.getCode() == KeyCode.P) {
            playNote(69);
        }
        if (key.getCode() == KeyCode.OPEN_BRACKET) {
            playNote(70);
        }
        if (key.getCode() == KeyCode.CLOSE_BRACKET) {
            playNote(71);
        }
    }

    @Override
    public void playNote(int note_num) {
        channel.noteOn(note_num, 60 );
    }
}
