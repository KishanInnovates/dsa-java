class JumpGameII {
    public static void main(String[] args) {
         int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(jump(nums1)); // Output: 2
        
        int[] nums2 = {2, 3, 0, 1, 4};
        System.out.println(jump(nums2)); // Output: 2
    }

    public static int jump(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return 0;

        int jump = 0;
        int nextReach = 0;
        int currentReach = 0;

        for (int i = 0; i < n - 1; i++) {
            nextReach = Math.max(nextReach, i + arr[i]);
            if (i == currentReach) {
                jump++;
                currentReach = nextReach;
                if (currentReach >= n - 1) {
                    break;
                }
            }
        }
        return jump;
    }
}