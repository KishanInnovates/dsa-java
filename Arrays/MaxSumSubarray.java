class MaxSumSubarray{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, -4, 3, 2, -10, 9, 1 };
        int result = maxSum(arr);
        System.out.println("The maximum sum of the subarray is: " + result); 
    }

    public static int maxSum(int[] arr) {
        int n = arr.length;
        int maxSum = 0;
        int currSum = 0;

        for(int i = 0; i < n; i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}