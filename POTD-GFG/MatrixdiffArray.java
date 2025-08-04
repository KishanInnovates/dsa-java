import java.util.ArrayList;

public class MatrixdiffArray {
    public static void main(String[] args) {
            //gfg potd
    }
    public ArrayList<ArrayList<Integer>> applyDiff2D(int[][] mat, int[][] opr) {
        // code here
        int m = mat[0].length;
        int n = mat.length;
        
        int[][] diff = new int[n + 1][m + 1];
        for(int[] op : opr){
            int v = op[0];
            int r1 = op[1], c1 = op[2];
            int r2 = op[3], c2 = op[4];
            diff[r1][c1] += v;
            if (c2 + 1 < m) diff[r1][c2 + 1] -= v;
            if (r2 + 1 < n) diff[r2 + 1][c1] -= v;
            if (r2 + 1 < n && c2 + 1 < m) diff[r2 + 1][c2 + 1] += v;
        }

        // Step 3: Row-wise prefix sum
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                diff[i][j] += diff[i][j - 1];
            }
        }

        // Step 4: Column-wise prefix sum
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                diff[i][j] += diff[i - 1][j];
            }
        }

        // Step 5: Add diff to original matrix
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(mat[i][j] + diff[i][j]);
            }
            result.add(row);
        }

        return result;
        
    }
}
