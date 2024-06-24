public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int n = size;
        int row = 0;
        int col = n / 2;

        for (int num = 1; num <= n * n; num++) {
            square.placeValue(col, row, num);
            int newRow = (row - 1 + n) % n;
            int newCol = (col + 1) % n;
            if (square.readValue(newCol, newRow) != 0) {
                row = (row + 1) % n;
            } else {
                row = newRow;
                col = newCol;
            }
        }
        return square;
    }

}

