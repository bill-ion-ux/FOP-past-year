package paper2024Sem2;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        //array 3x3
        //input X or O or . (for no input)
        // input must be 3x3
        // # for separate the board
        //lets just assume there are 4 board
        Scanner scanner = new Scanner(System.in);
        int gameNumber = 1;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equals("#")) {
                continue; // Skip separator lines
            }

            // Build the 3x3 board
            char[][] board = new char[3][3];
            board[0] = line.toCharArray();
            for (int i = 1; i < 3; i++) {
                board[i] = scanner.nextLine().toCharArray();
            }

            // Print game number and board
            System.out.println("Game " + gameNumber + ":");
            System.out.println("Tic-Tac-Toe Board:");
            printBoard(board);

            // Determine and print the winner
            String winner = checkWinner(board);
            System.out.println("Winner: " + winner);

            gameNumber++;
        }
    }
    private static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static String checkWinner(char[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '.') {
                return String.valueOf(board[i][0]);
            }
        }
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '.') {
                return String.valueOf(board[0][j]);
            }
        }
        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '.') {
            return String.valueOf(board[0][0]);
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '.') {
            return String.valueOf(board[0][2]);
        }

        // Check for a draw or ongoing game
        boolean emptyCell = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '.') {
                    emptyCell = true;
                    break;
                }
            }
            if (emptyCell) break;
        }

        if (!emptyCell) {
            return "Draw";
        } else {
            return "None (on going)";
        }
    }
}
