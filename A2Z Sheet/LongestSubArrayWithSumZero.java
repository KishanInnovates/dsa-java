import java.util.HashMap;

public class LongestSubArrayWithSumZero {
    public static void main(String[] args) {
         int[] arr1 = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLength(arr1)); // Output: 5

        int[] arr2 = {2, 10, 4};
        System.out.println(maxLength(arr2)); // Output: 0

        int[] arr3 = {1, 0, -4, 3, 1, 0};
        System.out.println(maxLength(arr3)); // Output: 5
    }

    public static int maxLength(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int length = 0;
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0) {
                length = i + 1;
            }

            if (map.containsKey(prefixSum)) {
                length = Math.max(length, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }
        return length;
    }
}
