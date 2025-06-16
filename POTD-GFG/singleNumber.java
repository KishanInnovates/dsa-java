class singleNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 2 };
        int result = getSingle(nums);
        System.out.println("The element which is not appear even time is: " + result);
    }

    public static int getSingle(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}