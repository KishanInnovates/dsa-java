package Array;

class MaxAltitude {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int result = largestAltitude(gain);
        System.out.println("The highest altitude is: " + result); //output
    }

    public static int largestAltitude(int[] nums) {
        int curr = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            max = Math.max(max, curr);
        }
        return max;
    }
}
