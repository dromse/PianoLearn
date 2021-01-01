package pianolearn.classes;

import javafx.scene.input.KeyCode;

public class Note {
    private String name;
    private KeyCode key;
    private int number;

    public Note(String name, KeyCode key, int number) {
        this.name = name;
        this.key = key;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeyCode getKey() {
        return key;
    }

    public void setKey(KeyCode key) {
        this.key = key;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
