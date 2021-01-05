package pianolearn;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    /* this method run the whole application, specifically open main menu */
    @Override
    public void start(Stage primaryStage) {
        MainMenuController menu = new MainMenuController();
        menu.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
