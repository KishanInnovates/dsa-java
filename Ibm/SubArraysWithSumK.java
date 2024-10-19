import java.util.HashMap;

public class SubArraysWithSumK {
    public static void main(String[] args) {

    }

    public static int findSubArray(int[] arr, int k) {
        int n = arr.length;

        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);
        
        int currentSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }

            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }
        return count;

    }
}
