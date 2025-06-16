class GoodArray {
    public static void main(String[] args) {

    }
    class Solution {
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
     public boolean isGoodArray(int[] nums) {
        int ans = nums[0];
        for (int element : nums) {
            ans = gcd(ans, element);
            if (ans == 1) {
                return true;
            }
        }
        return false;
    }
}
}