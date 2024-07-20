import java.util.Scanner;

public class Game {
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;
    private GameRule gameRule;

    public Game(int size) {
        board = new Board(size);
        playerX = new Player('X');
        playerO = new Player('O');
        currentPlayer = playerX;
        gameRule = new GameRule();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;

        while (play) {
            int row, col;
            System.out.println("player " + currentPlayer.getSymbol() + ", enter your move (row and column): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;

            if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                board.printBoard();
                if (gameRule.checkWin(board, currentPlayer)) {
                    System.out.println("player " + currentPlayer.getSymbol() + " wins");
                    play = false;
                } else if (board.isFull()) {
                    System.out.println("tie game");
                    play = false;
                } else {
                    changePlayer();
                }
            } else {
                System.out.println("move is not valid");
            }
        }
        scanner.close();
    }

    private void changePlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }
}
