package ticTacToe;

public class GameLogic {
    private String[][] board;
    private boolean xTurn;
    private boolean gameFinished;

    public GameLogic() {
        this.board = new String[3][3];
        this.xTurn = true;
        this.gameFinished = false;
    }

    public boolean isXTurn() {
        return xTurn;
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    public String getCell(int row, int col) {
        return board[row][col];
    }

    public boolean makeMove(int row, int col) {
        if (board[row][col] == null && !gameFinished) {
            board[row][col] = xTurn ? "X" : "O";
            xTurn = !xTurn;
            return true;
        }
        return false;
    }

    public String checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != null && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                gameFinished = true;
                return board[i][0];
            }
            if (board[0][i] != null && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                gameFinished = true;
                return board[0][i];
            }
        }
        if (board[0][0] != null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            gameFinished = true;
            return board[0][0];
        }
        if (board[0][2] != null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            gameFinished = true;
            return board[0][2];
        }
        return null;
    }

    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        gameFinished = true;
        return true;
    }
}
