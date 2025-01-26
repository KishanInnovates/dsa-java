public class FindKthMissing {
    public static void main(String[] args) {

    }
    //https://leetcode.com/problems/kth-missing-positive-number/submissions/1520909137/
    public static int missingK(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low + k;
    }
}
