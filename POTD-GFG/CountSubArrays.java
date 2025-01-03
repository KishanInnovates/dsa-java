import java.util.HashMap;
public class CountSubArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 2, -2, -20, 10};
        int k1 = -10;
        System.out.println(countSubArray(arr1, k1)); // Output: 3
        //https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1
    }

    public static int countSubArray(int[] arr, int k) {
        int count = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : arr) {
            currentSum += num;

            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}
