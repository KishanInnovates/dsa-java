public class MaximumSubArrayWithProduct {
    public static void main(String[] args) {
        int[] nums = { -2, 0, -1 };
        System.out.println(maxSubArrayProduct(nums));
    }

    public static int maxSubArrayProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            suffix = (suffix == 0) ? 1 : suffix;
            prefix = (prefix == 0) ? 1 : prefix;
            prefix = prefix * nums[i];
            suffix = suffix * nums[n - i - 1];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
}
