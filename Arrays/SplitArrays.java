public class SplitArrays {
    public static void main(String[] args) {
        //https://leetcode.com/problems/number-of-ways-to-split-array/description/?envType=daily-question&envId=2025-01-03
        int[] nums = { 10, 4, -8, 7 };
        int res = waysToSplitArray(nums);
        System.out.println(res); //output : 2
    }

    public static int waysToSplitArray(int[] nums) {
        int sum = 0;
        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            prefixSum += nums[i];
            if (prefixSum >= sum - prefixSum) {
                count++;
            }
        }
        return count;
    }
}
