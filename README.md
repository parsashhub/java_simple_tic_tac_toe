# Tic Tac Toe in Java

This is a simple implementation of the classic Tic Tac Toe game in Java. The game is played on a 3x3 grid where two
players take turns marking the spaces in the grid. The player who succeeds in placing three of their marks in a
horizontal, vertical, or diagonal row wins the game.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- A text editor or an Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans.

### Files

- `TicTacToe.java`: Contains the main logic for the Tic Tac Toe game.
- `Main.java`: Contains the main method to run the game.

### Installation

1. Clone this repository or download the source code.
2. Open the project in your preferred IDE.
3. Ensure that both `TicTacToe.java` and `Main.java` are in the same package or directory.

## Running the Game

1. Compile the Java files:
    ```bash
    javac TicTacToe.java Main.java
    ```

2. Run the game:
    ```bash
    java Main
    ```

## Example Gameplay

```
player X, enter your move (row and column): 
1 1
X - - 
- - - 
- - - 

player O, enter your move (row and column): 
1 2
X O - 
- - - 
- - - 

player X, enter your move (row and column): 
2 2
X O - 
- X - 
- - - 

player O, enter your move (row and column): 
1 3
X O O 
- X - 
- - - 

player X, enter your move (row and column): 
3 3
X O O 
- X - 
- - X 

player X wins
```