import java.util.HashMap;
import java.util.Map;

public class TupleSameProduct {
    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 4, 6 };
        System.out.println(countTuples(nums1));
    }

    public static int countTuples(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }
        for (int freq : map.values()) {
            if (freq > 1) {
                count += freq * (freq - 1) * 4;
            }
        }
        return count;
    }
}
