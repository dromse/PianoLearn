package pianolearn.controllers;

import javafx.scene.input.KeyEvent;

public interface IPiano {
    void loadChannel();
    void unloadChannel();
    void playKeyboard(KeyEvent key);
    void playNote(int note_num);
}
