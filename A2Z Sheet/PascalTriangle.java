public class PascalTriangle {
    public static void main(String[] args) {
        int[][] triangle = pascalTriangle(6);
        for (int row = 0; row < triangle.length; row++) {
            for (int col = 0; col < triangle[row].length; col++) {
                System.out.print(triangle[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascalTriangle(int n) {
        int[][] result = new int[n][];

        for (int row = 0; row < n; row++) {
            result[row] = new int[row + 1];

            result[row][0] = 1;
            result[row][row] = 1;

            for (int col = 1; col < row; col++) {
                result[row][col] = result[row - 1][col - 1] + result[row - 1][col];
            }
        }
        return result;
    }
}
