public class transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
    int[][] result = tranposeMatrix(matrix);
    
    for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[i].length; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
    }

    public static int[][] tranposeMatrix(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}
