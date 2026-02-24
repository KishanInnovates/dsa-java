package Arrays.SlidingWindow;

public class MaximumAverageSubarray {
    public static void main(String args[]) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(maxAvearge(nums, k));
    }

    public static double maxAvearge(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        return (double) maxSum / k;
    }
}
