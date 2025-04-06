public class MinimumPairRemoval {
    public static void main(String[] args) {

    }

    public static int minimumPairRemoval(int[] nums) {
        int operations = 0;
        while (!isNonDecreasing(nums)) {
            int minSum = Integer.MAX_VALUE, index = -1;
            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }
            nums = merge(nums, index);
            operations++;
        }
        return operations;
    }

    public static boolean isNonDecreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] merge(int[] nums, int index) {
        int[] newArr = new int[nums.length - 1];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == index) {
                newArr[k++] = nums[i] + nums[i + 1];
                i++;
            } else {
                newArr[k++] = nums[i];
            }
        }
        return newArr;
    }
}
