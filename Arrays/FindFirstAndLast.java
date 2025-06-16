class FindFirstAndLast {
    public static void main(String[] args) {
        
    }

    public static int[] serachRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirstPosition(nums, target);
        result[1] = findLastPosition(nums, target);
        return result;
    }

    public static int findFirstPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int firstPos = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (nums[mid] == target) {
                firstPos = mid;
            }
        }
        return firstPos;
    }
     public static int findLastPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lastPos = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if (nums[mid] == target) {
                lastPos = mid;
            }
        }
        return lastPos;
    }
}