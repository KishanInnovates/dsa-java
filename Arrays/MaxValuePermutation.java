import java.util.Arrays;

public class MaxValuePermutation {
    public static void main(String[] args) {
        int[] nums = { 5, 3, 2, 4, 1 };
        System.out.println(maxValue(nums));
    }

    public static int maxValue(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i] * i;
        }
        return result;
    }
}
