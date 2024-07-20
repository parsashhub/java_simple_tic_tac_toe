import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        // game.printBoard();
        boolean play = true;

        while (play) {
            int row, col;
            System.out.println("player " + game.currentPlayer + ", enter your move (row and column): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
            // System.out.println("row:" + row + "\tcol:" + col);
            if (game.makeValidMove(row, col)) {
                game.printBoard();
                if (game.checkIfWin()) {
                    System.out.println("player " + game.currentPlayer + " wins");
                    play = false;
                } else if (game.isBoardFull()) {
                    System.out.println("tie game");
                    play = false;
                } else game.changePlayer();

            } else System.out.println("move is not valid");
        }
    }
}