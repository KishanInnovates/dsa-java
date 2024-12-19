import java.util.Arrays;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println("Inversion Count: " + inversion(arr)); // Output: 3
    }

    public static int inversion(int[] arr) {
        int n = arr.length;
        return mergeSortAndCount(arr, 0, n - 1);
    }

    public static int mergeSortAndCount(int[] arr, int start, int end) {
        int count = 0;

        while (start < end) {
            int mid = start + (end - start) / 2;

            count += mergeSortAndCount(arr, start, mid);

            count += mergeSortAndCount(arr, mid + 1, end);

            count += mergeAndCount(arr, start, mid, end);
        }
        return count;
    }

    public static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left, swaps = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
                swaps += (leftArray.length - i); // Count inversions
            }
        }

        // Copy remaining elements
        while (i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }

        return swaps;
    }
}
