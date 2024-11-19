public class NextPermutation {
    public static void main(String[] args) {

    }
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Step 1: Find the pivot
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the successor
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }

        // Step 3: Reverse the tail
        reverse(arr, i + 1, n - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}



