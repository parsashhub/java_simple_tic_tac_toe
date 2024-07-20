public class GameRule {
    public boolean checkWin(Board board, Player player) {
        return checkRows(board, player) || checkColumns(board, player) || checkDiagonals(board, player);
    }

    private boolean checkRows(Board board, Player player) {
        int size = board.getSize();
        char symbol = player.getSymbol();
        for (int i = 0; i < size; i++) {
            boolean win = true;
            for (int j = 0; j < size; j++) {
                if (board.getCell(i, j) != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }
        return false;
    }

    private boolean checkColumns(Board board, Player player) {
        int size = board.getSize();
        char symbol = player.getSymbol();
        for (int i = 0; i < size; i++) {
            boolean win = true;
            for (int j = 0; j < size; j++) {
                if (board.getCell(j, i) != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }
        return false;
    }

    private boolean checkDiagonals(Board board, Player player) {
        int size = board.getSize();
        char symbol = player.getSymbol();
        boolean win = true;
        for (int i = 0; i < size; i++) {
            if (board.getCell(i, i) != symbol) {
                win = false;
                break;
            }
        }
        if (win) return true;

        win = true;
        for (int i = 0; i < size; i++) {
            if (board.getCell(i, size - 1 - i) != symbol) {
                win = false;
                break;
            }
        }
        return win;
    }
}
