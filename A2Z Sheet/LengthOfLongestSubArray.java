import java.util.HashMap;

public class LengthOfLongestSubArray {
    public static void main(String[] args) {

    }

    public static int longestSubArrayWithSumK(int[] arr, int k) {
        HashMap<Long, Integer> map = new HashMap<>();
        Long currentSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == k) {
                maxLength = i + 1;
            }

            long requiredSum = currentSum - k;
            if (map.containsKey(requiredSum)) {
                maxLength = Math.max(maxLength, i - map.get(requiredSum));
            }

            map.putIfAbsent(currentSum, i);
        }
        return maxLength;
    }
}
