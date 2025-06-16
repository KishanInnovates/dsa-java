import java.util.HashMap;
import java.util.Map;

public class FirstCompletelyPainted {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 2};
        int[][] mat1 = {{1, 4}, {2, 3}};
        System.out.println(firstCompleteIndex( mat1, arr1)); // Output: 2

        int[] arr2 = {2, 8, 7, 4, 1, 3, 5, 6, 9};
        int[][] mat2 = {{3, 2, 5}, {1, 4, 6}, {8, 7, 9}};
        System.out.println(firstCompleteIndex(mat2, arr2)); // Output: 3
    }

    public static int firstCompleteIndex(int[][] mat, int[] arr) {
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer, int[]> positionMap = new HashMap<>();

        //store position of each number in mat
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                positionMap.put(mat[i][j], new int[] { i, j });
            }
        }

        int[] rowPoints = new int[m];
        int[] colPoints = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int[] pos = positionMap.get(arr[i]);
            int row = pos[0], col = pos[1];

            rowPoints[row]++;
            colPoints[col]++;

            if (rowPoints[row] == n || colPoints[col] == m) {
                return i;
            }

        }
        return -1;
    }
}
