import java.util.HashMap;

public class CountSubArrayWithXor {
    public static void main(String[] args) {
        int[] nums = { 4, 2, 2, 6, 4 };
        int k = 6;
        int res = subarrayxor(nums, k);
        System.out.println(res);
    }
    // https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/1
    public static int subarrayxor(int[] nums, int k) {
        int xor = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            xor ^= num;

            if (map.containsKey(xor ^ k)) {
                count += map.get(xor ^ k);
            }

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}
