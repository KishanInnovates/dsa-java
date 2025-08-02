public class MinimumNumberOfOperations {
    public static void main(String[] args) {
        int[] nums = { 1, 10, 2, 9 };
        int ops = 0;
        int median = nums[nums.length / 2];
        for (int num : nums) {
            ops += Math.abs(median - num);
        }
        System.out.println("the minimum number of operation is: " + ops);
    }
}
