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
    private boolean xTurn;
    private boolean gameFinished;

    public UserInterface() {
        this.layout = new BorderPane();
        // Title
        this.statusBar = new HBox();
        this.resultBar = new HBox();
        this.turnTitle = new Label("Turn: X");
        this.gameStateTitle = new Label("");
        turnTitle.setFont(new Font("Sans", 40));
        gameStateTitle.setFont(Font.font("Sans", 30));
        this.xTurn = true;
        this.gameFinished = false;
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
                button.setOnMouseClicked((event) -> {
                    if (button.getText().equals("")) {
                        if (xTurn) {
                            button.setText("X");
                        } else {
                            button.setText("O");
                        }
                        this.toggleTurn();
                        this.checkGame();
                    }
                });
                cube.add(button, col, row);
                buttons[col][row] = button;
            }
        }
        layout.setTop(statusBar);
        layout.setCenter(cube);
        layout.setBottom(resultBar);
    }

    // Lógica
    // TODO: ver cómo separarla
    private void toggleTurn() {
        if (this.xTurn) {
            this.xTurn = false;
            turnTitle.setText("Turn: O");
        } else {
            this.xTurn = true;
            turnTitle.setText("Turn: X");
        }
    }

    private void checkGame() {
        boolean finished = true;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[col][row].getText().equals("")) {
                    finished = false;
                }
            }
        }
        if (finished) {
            this.gameFinished = true;
        }
        if (gameFinished) {
            if (checkWinner().equals("x")) {
                gameStateTitle.setText("The end, the winner is X!");
            } else if (checkWinner().equals("o")) {
                gameStateTitle.setText("The end, the winner is O!");

            } else {
                gameStateTitle.setText("The end, there is no winner.");
            }
        }
    }

    private String checkWinner() {
        // TODO: lógica para comprobar igualdad
        String[][] rows = new String[3][3];
        String[][] cols = new String[3][3];
        String[][] diags = new String[2][3];
        // Row winner
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[col][row].getText();
            }
        }
        return "none";
    }

    // Getters & setters
    public BorderPane getLayout() {
        return layout;
    }

    public void setLayout(BorderPane layout) {
        this.layout = layout;
    }

    public HBox getStatusBar() {
        return statusBar;
    }

    public void setStatusBar(HBox statusBar) {
        this.statusBar = statusBar;
    }

    public Label getTurnTitle() {
        return turnTitle;
    }

    public void setTurnTitle(Label turnTitle) {
        this.turnTitle = turnTitle;
    }

    public GridPane getCube() {
        return cube;
    }

    public void setCube(GridPane cube) {
        this.cube = cube;
    }
}
