import java.util.HashMap;

public class CountBadPairs {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 3, 3 };
        long res = countBadPair(nums);
        System.out.println(res);

    }

    public static long countBadPair(int[] nums) {
        int n = nums.length;
        long totalPairs = (long) n * (n - 1) / 2;
        long goodPairs = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = nums[i] - i;
            goodPairs += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return totalPairs - goodPairs;
    }
}
