public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int result = checkSorted(arr, n);
        System.out.println(result);
    }

    public static int checkSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return -1;
            }

        }
        return 1;
    }
}
