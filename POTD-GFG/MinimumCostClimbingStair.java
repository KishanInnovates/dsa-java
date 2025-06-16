public class MinimumCostClimbingStair {
    public static void main(String[] args) {

    }

    public static int minCost(int[] cost) {
        int n = cost.length;
        int prev2 = cost[0]; // Equivalent to dp[i-2]
        int prev1 = cost[1]; // Equivalent to dp[i-1]

        for (int i = 2; i < n; i++) {
            int curr = Math.min(prev1, prev2) + cost[i];
            prev2 = prev1;
            prev1 = curr;
        }
        return Math.min(prev1, prev2);
    }
}
