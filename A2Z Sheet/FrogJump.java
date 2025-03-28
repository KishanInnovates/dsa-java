public class FrogJump {
    public static void main(String[] args) {

    }

    // time complexity : O(2^n) space complexity: O(N)
    public static int recursionSolution(int n, int[] heights) {
        if (n == 0)
            return 0;
        if (n == 1) {
            return Math.abs(heights[1] - heights[0]);
        }
        int oneStep = recursionSolution(n - 1, heights) + Math.abs(heights[n] - heights[n - 1]);
        int twoStep = recursionSolution(n - 2, heights) + Math.abs(heights[n] - heights[n - 2]);

        return Math.min(oneStep, twoStep);
    }

    // top down(memoization) tc:O(N) sc:O(N)
    public static int memoizationSolution(int n, int[] heights, int[] dp) {
        if (n == 0)
            return 0;
        if (dp[n] != -1) {
            return dp[n];
        }
        int oneStep = memoizationSolution(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]);
        int twoStep = (n > 1) ? memoizationSolution(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2])
                : Integer.MAX_VALUE;

        return dp[n] = Math.min(oneStep, twoStep);
    }

    // bottom up approach Tabulation tc:O(n) sc:O(n)
    public static int tabulationSolution(int[] heights) {
        int n = heights.length;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(heights[0] - heights[1]);

        for (int i = 2; i < n; i++) {
            int oneStep = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int twoStep = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            dp[i] = Math.min(oneStep, twoStep);
        }
        return dp[n - 1];
    }

    // bottom up approach space optimized solution
    public static int spaceOptimizedSolution(int[] heights) {
        int n = heights.length;
        if (n == 1)
            return 0;
        int prev2 = 0;
        int prev1 = Math.abs(heights[1] - heights[0]);
        for (int i = 2; i < n; i++) {
            int current = Math.min(prev1 + Math.abs(heights[i] - heights[i - 1]),
                    prev2 + Math.abs(heights[i] - heights[i - 2]));
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
