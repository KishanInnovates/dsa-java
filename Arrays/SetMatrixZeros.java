public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        // Call the setZeroes method to modify the matrix in place
        setZeros(matrix);
         for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void setZeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];

        //finding the zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        //set the elements in marked rows to zero

        for (int i = 0; i < m; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        //set the elements in marked cols to zero
        for (int j = 0; j < n; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
