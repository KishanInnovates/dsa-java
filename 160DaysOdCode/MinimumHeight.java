import java.util.Arrays;

public class MinimumHeight {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 10};
        int k1 = 2;
        System.out.println(getMinDiff(arr1, k1)); // output: 5
    }

    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = arr[n - 1] - arr[0];

        for (int i = 0; i < n - 1; i++) {
            int maxHeight = Math.max(arr[i] + k, arr[n - 1] - k);
            int minHeight = Math.min(arr[0] + k, arr[i + 1] - k);
            if (minHeight >= 0) {
                minDiff = Math.min(minDiff, maxHeight - minHeight);
            }
        }
        return minDiff;
    }
}
