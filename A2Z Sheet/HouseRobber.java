import java.util.Arrays;

public class HouseRobber {
    public static void main(String args[]) {
        
    }

    public static int robRecursive(int[] nums) {
        return recursiveHelper(nums, 0);
        //tc: O(2^n); 
    }

    public static int recursiveHelper(int[] nums, int i) {
        if (i >= nums.length)
            return 0;
        int rob = nums[i] + recursiveHelper(nums, i + 2);
        int skip = recursiveHelper(nums, i + 1);

        return Math.max(skip, rob);
    }

    public static int memoization(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return memoizationHelper(nums, 0, dp);
    }

    public static int memoizationHelper(int[] nums, int i, int[] dp) {
        if (i >= nums.length)
            return 0;
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = nums[i] + memoizationHelper(nums, i + 2, dp);
        int skip = memoizationHelper(nums, i + 1, dp);

        return dp[i] = Math.max(skip, rob);
    }

    public static int tabulation(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int[] dp = new int[n];
        dp[n - 1] = nums[n - 1];
        if (n > 1) {
            dp[n - 2] = Math.max(nums[n - 2], nums[n - 1]);

        }
        for (int i = n - 3; i >= 0; i--) {
            dp[i] = Math.max(nums[i] + dp[i + 2], dp[i + 1]);
        }
        return dp[0];
    }
    
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];

        int prev2 = 0; 
        int prev1 = nums[n - 1]; 

        for (int i = n - 2; i >= 0; i--) {
            int current = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
