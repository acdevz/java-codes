package Assignments;

import java.util.ArrayList;
import java.util.List;

public class P12c {
    public static void main(String[] args) {
        int n = 8; // Example for 8-queens problem
        List<List<String>> solutions = NQueens.solveNQueens(n); // Get all solutions

        System.out.println("Total number of solutions: " + solutions.size());
        for (int i = 0; i < solutions.size(); i++) {
            System.out.println("Solution " + (i + 1) + ":");
            for (String row : solutions.get(i)) {
                System.out.println(row); // Print the board row by row
            }
            System.out.println(); // New line between solutions
        }
    }
}

class NQueens {

    // Method to find all solutions to the N-Queens problem for a given board size
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>(); // List to store all solutions
        int[] board = new int[n]; // Array.java to represent the column position of queens in each row
        solveNQueensHelper(0, n, board, solutions); // Start solving with the first row
        return solutions; // Return all found solutions
    }

    // Recursive helper method to solve the N-Queens problem
    private static void solveNQueensHelper(int row, int n, int[] board, List<List<String>> solutions) {
        if (row == n) { // If all queens are placed, add the solution
            solutions.add(generateBoard(board, n)); // Generate the solution as a list of strings
            return; // Exit recursion
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) { // Check if it's safe to place the queen
                board[row] = col; // Place the queen
                solveNQueensHelper(row + 1, n, board, solutions); // Recur for the next row
                board[row] = -1; // Backtrack by resetting the column position
            }
        }
    }

    // Method to check if it's safe to place a queen at the given row and column
    private static boolean isSafe(int row, int col, int[] board) {
        for (int i = 0; i < row; i++) { // Check previous rows for conflicts
            int queenCol = board[i]; // Get the column position of the queen in the previous row
            if (queenCol == col || // Same column
                    Math.abs(queenCol - col) == Math.abs(i - row)) { // Same diagonal
                return false; // Not safe
            }
        }
        return true; // No conflicts found
    }

    // Method to generate the board representation from the array of column positions
    private static List<String> generateBoard(int[] board, int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            for (int j = 0; j < n; j++) {
                row[j] = (board[i] == j) ? 'Q' : '_'; // Place a queen or a dot
            }
            result.add(new String(row)); // Convert the row to a string and add to the result
        }
        return result;
    }
}
