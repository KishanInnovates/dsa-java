class IncreasingTriplet {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        boolean result = isIncreasingTriplet(nums);
        System.out.println(result);
        
    }

//https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

    public static boolean isIncreasingTriplet(int[] nums) {
        if (nums.length < 3)
            return false;

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstSmallest) {
                firstSmallest = num;
            } else if (num <= secondSmallest) {
                secondSmallest = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
