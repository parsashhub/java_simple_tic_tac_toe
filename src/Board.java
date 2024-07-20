public class Board {
    private char[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
        init();
    }

    public void init() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public boolean makeMove(int row, int col, char player) {
        if (row >= 0 && col >= 0 && row < size && col < size && board[row][col] == '-') {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public char getCell(int row, int col) {
        return board[row][col];
    }

    public int getSize() {
        return size;
    }
}
