public class ClimbingStairs {
    public static void main(String[] args) {

    }

    public static int climbStairs(int n) {
        // using recursion t.c : O(2^n)
        if (n <= 2)
            return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int topDownApproach(int n, int[] dp) {
        // tc:O(N) sc:O(2N)
        if (n <= 2) {
            dp[n] = n;
            return dp[n];
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return dp[n];
    }

    public static int bottomUP(int n) {
        if (n <= 2) {
            return n;
        }
        int prev2 = 1;
        int prev1 = 2;
        int ans = 0;
        for (int i = 3; i <= n; i++) {
            ans = prev1 + prev2;
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
        // tc : On sc: O(1)
    }
}