public class MaxScoreFromAPair {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 1, 5, 6 };
        int result = maxSumFromAPair(arr);
        System.out.println(result);
    }

    // https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays
    public static int maxSumFromAPair(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            maxSum = Math.max(maxSum, arr[i] + arr[i + 1]);
        }
        return maxSum;
    }
}
