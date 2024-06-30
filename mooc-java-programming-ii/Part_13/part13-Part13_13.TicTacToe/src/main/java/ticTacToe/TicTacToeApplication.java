package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage window) {
        UserInterface ui = new UserInterface();
        Scene scene = new Scene(ui.getLayout());
        window.setScene(scene);
        window.setTitle("Tic Tac Toe");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
