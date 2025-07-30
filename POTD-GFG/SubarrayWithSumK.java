import java.util.HashMap;

public class SubarrayWithSumK {
    public static void main(String[] args) {

    }

    public static int countSubarrays(int[] arr, int k) {
        int count = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
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
