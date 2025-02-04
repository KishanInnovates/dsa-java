package Array;

class MaximumAscendingSum {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 5, 10, 50 };

        int result = maxAscSum(nums);
        System.out.println(result);
    }

    public static int maxAscSum(int[] arr) {
        int sum = 0, currSum = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                currSum += arr[i];
            }
            sum = Math.max(currSum, sum);
        }
        return sum;
    }
}
