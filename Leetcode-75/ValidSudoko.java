import java.util.HashSet;
import java.util.Set;

public class ValidSudoko {
    public static void main(String[] args) {
        char[][] board1 = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValid(board1)); // Output: true
    }
    //https://leetcode.com/problems/valid-sudoku/submissions/1497186489/?envType=study-plan-v2&envId=top-interview-150
    public static boolean isValid(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    if(!seen.add(num + "row" + i) ||
                    !seen.add(num + "col" + j) ||
                    !seen.add(num + "at box" + i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
