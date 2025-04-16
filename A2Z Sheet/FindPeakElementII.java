public class FindPeakElementII {
    public static void main(String[] args) {

    }

    public static int[] findPeakGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int low = 0, high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int maxRowIndex = findMaxIndex(grid, n, m, mid);
            int left = mid - 1 >= 0 ? grid[maxRowIndex][mid - 1] : -1;
            int right = mid + 1 < m ? grid[maxRowIndex][mid + 1] : -1;

            if (grid[maxRowIndex][mid] > left && grid[maxRowIndex][mid] > right) {
                return new int[] { maxRowIndex, mid };
            } else if (grid[maxRowIndex][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static int findMaxIndex(int[][] grid, int n, int m, int col) {
        int maxValue = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (grid[i][col] > maxValue) {
                maxValue = grid[i][col];
                index = i;
            }
        }
        return index;
    }
}
