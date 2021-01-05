package pianolearn;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class MainMenuController extends Application {
    IMainMenu mainMenu = new MainMenu();
    IOpenScene openScene = new OpenScene();

    // this method start main scene
    @Override
    public void start(Stage stage) {
        mainMenu.init(stage);
    }

    // use on action button "Piano" on main menu
    public void openPiano(ActionEvent actionEvent) {
        openScene.openPiano(actionEvent);
    }

    // using on action button "HandBook" on main menu
    public void openHandBook(ActionEvent actionEvent) {
        openScene.openHandBook(actionEvent);
    }
}
