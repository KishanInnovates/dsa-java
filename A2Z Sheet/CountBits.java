public class CountBits {
    public static void main(String[] args) {

    }

    public static int[] countBits(int n) {
        // using dp
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }
        return dp;
    }
}
