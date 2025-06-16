public class MaximumCount {
    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 0, 1, 1, 1 };
         System.out.println(findMaxConsecutiveOnes(nums1));
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : arr) {
            if (num == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        maxCount = Math.max(maxCount, currentCount);
        return maxCount;
    }
}
