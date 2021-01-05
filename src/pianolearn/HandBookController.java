package pianolearn;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class HandBookController implements Initializable {

    public ImageView imageView;
    public ChoiceBox<String> RootNoteChoiceBox;
    public ChoiceBox<String> AccordChoiceBox;
    IOpenScene openScene = new OpenScene();

    // Initialize notes and tonal in ChoiceBoxes
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.RootNoteChoiceBox.getItems().addAll("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "B");
        this.AccordChoiceBox.getItems().addAll("major", "minor");
    }

    // Output a image of accord when the user clicks on the button "Show accord", takes image from the folder 'img'
    // by choices of ChoiceBoxes what choice user.
    public void showAccordImage(ActionEvent actionEvent) {
        String path = "scenes/img/accords/" + AccordChoiceBox.getValue() + "/" + RootNoteChoiceBox.getValue() + ".jpg";
        imageView.setImage(new Image(getClass().getResourceAsStream(path)));
    }

    // Open scene Main menu. Nothing more.
    public void openMainMenu(ActionEvent actionEvent) {
        openScene.openMainMenu(actionEvent);
    }

}
