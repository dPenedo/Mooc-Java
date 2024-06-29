package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        UserInterface ui = new UserInterface();
        Scene scene = new Scene(ui.getLayout(), 400, 300);
        stage.setScene(scene);
        stage.show();

    }

}
