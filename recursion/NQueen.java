import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {

    }
    class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        solveNQueensHelper(board, 0, result);
        return result;
    }
    
    private void solveNQueensHelper(boolean[][] board, int row, List<List<String>> result) {
        int n = board.length;
        if (row == n) {
            result.add(constructBoard(board));
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                solveNQueensHelper(board, row + 1, result);
                board[row][col] = false;
            }
        }
    }
    
    private boolean isSafe(boolean[][] board, int row, int col) {
        int n = board.length;
        
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        
        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        
        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        
        return true;
    }
    
    private List<String> constructBoard(boolean[][] board) {
        List<String> solution = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? "Q" : ".");
            }
            solution.add(sb.toString());
        }
        return solution;
    }
}
}
