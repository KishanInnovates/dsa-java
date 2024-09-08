 class SubArray {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1 };
        int result = longestSubArray(nums);
        System.out.println("the longest sum of 1 in the array is: " + result);
    }

    public static int longestSubArray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int maxLength = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}
