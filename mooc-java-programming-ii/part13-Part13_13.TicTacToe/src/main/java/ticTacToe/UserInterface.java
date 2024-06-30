package ticTacToe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public class UserInterface {
    private BorderPane layout;
    private HBox statusBar;
    private HBox resultBar;
    private Label turnTitle;
    private Label gameStateTitle;
    private GridPane cube;
    private Button[][] buttons;
    private GameLogic gameLogic;

    public UserInterface() {
        this.layout = new BorderPane();
        this.gameLogic = new GameLogic();

        // Title
        this.statusBar = new HBox();
        this.resultBar = new HBox();
        this.turnTitle = new Label("Turn: X");
        this.gameStateTitle = new Label("");
        turnTitle.setFont(new Font("Sans", 40));
        gameStateTitle.setFont(Font.font("Sans", 30));
        statusBar.getChildren().add(turnTitle);
        resultBar.getChildren().add(gameStateTitle);

        // Cube
        this.cube = new GridPane();
        this.buttons = new Button[3][3];

        for (int col = 0; col < 3; col++) {
            cube.getColumnConstraints().add(new ColumnConstraints(200));
            cube.getRowConstraints().add(new RowConstraints(200));
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button("");
                button.setMinWidth(100);
                button.setMinHeight(100);
                final int finalRow = row;
                final int finalCol = col;
                button.setOnMouseClicked((event) -> {
                    if (gameLogic.makeMove(finalRow, finalCol)) {
                        button.setText(gameLogic.isXTurn() ? "O" : "X");
                        updateTurnTitle();
                        checkGame();
                    }
                });
                cube.add(button, col, row);
                buttons[row][col] = button;
            }
        }
        layout.setTop(statusBar);
        layout.setCenter(cube);
        layout.setBottom(resultBar);
    }

    private void updateTurnTitle() {
        if (gameLogic.isXTurn()) {
            turnTitle.setText("Turn: X");
        } else {
            turnTitle.setText("Turn: O");
        }
    }

    private void checkGame() {
        String winner = gameLogic.checkWinner();
        if (winner != null) {
            gameStateTitle.setText("The end, the winner is " + winner + "!");
        } else if (gameLogic.isDraw()) {
            gameStateTitle.setText("The end, there is no winner.");
        }
    }

    public BorderPane getLayout() {
        return layout;
    }
}
