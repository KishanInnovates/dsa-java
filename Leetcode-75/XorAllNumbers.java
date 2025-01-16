public class XorAllNumbers {
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 3};
        int[] nums2 = {10, 2, 5, 0};
        System.out.println(xorAllNums(nums1, nums2)); // Output: 13

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(xorAllNums(nums3, nums4)); // Output: 0
    }

    public static int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0, xor2 = 0;

        for (int num : nums1) {
            xor1 ^= num;
        }

        for (int num : nums2) {
            xor2 ^= num;
        }

        return ((nums1.length % 2 == 0) ? 0 : xor2) ^ ((nums2.length % 2 == 0) ? 0 : xor1);
    }
}
