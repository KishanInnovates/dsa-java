import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ValidPathInTheGrid {
    private static final int[][] DIRECTIONS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static void main(String[] args) {

    }

    public static int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] cost = new int[m][n];
        for (int[] row : cost) Arrays.fill(row, Integer.MAX_VALUE);
        
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{0, 0, 0}); // {row, col, cost}
        cost[0][0] = 0;

        while (!deque.isEmpty()) {
            int[] curr = deque.poll();
            int r = curr[0], c = curr[1], currCost = curr[2];

            if (r == m - 1 && c == n - 1) return currCost;

            for (int i = 0; i < 4; i++) {
                int nr = r + DIRECTIONS[i][0];
                int nc = c + DIRECTIONS[i][1];
                int newCost = currCost + ((i + 1) == grid[r][c] ? 0 : 1);

                if (nr >= 0 && nr < m && nc >= 0 && nc < n && newCost < cost[nr][nc]) {
                    cost[nr][nc] = newCost;
                    if ((i + 1) == grid[r][c]) {
                        deque.addFirst(new int[]{nr, nc, newCost});
                    } else {
                        deque.addLast(new int[]{nr, nc, newCost});
                    }
                }
            }
        }
        return -1;
    }
}
