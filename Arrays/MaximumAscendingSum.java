public class MaximumAscendingSum {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 5, 10, 50 };

        int result = maxAscendingSum(nums);
        System.out.println(result);
    }

    public static int maxAscendingSum(int[] nums) {
        int maxSum = 0, currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currSum += nums[i];
            } else {
                maxSum = Math.max(maxSum, currSum);
                currSum = nums[i]; // Start new subarray
            }
        }

        return Math.max(maxSum, currSum); // Check last subarray
    }
}
