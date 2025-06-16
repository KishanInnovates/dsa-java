import java.nio.channels.Pipe.SourceChannel;

public class DifferenceOfDiagonal {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 4, 5, 6, 5 }, { 9, 8, 9, 9 } };
        int result = diagonalDiff(matrix);
        System.out.println("The difference is: " + result);
    }

    public static int diagonalDiff(int[][] matrix) {
        int n = matrix.length;
        System.out.println("The length is: " + n);
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][n - 1 - i];
        }
        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }
    
}