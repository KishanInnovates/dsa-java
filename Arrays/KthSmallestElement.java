import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
         int[] arr1 = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("K-th smallest element is " + smallestElement(arr1, k)); // Output: 7
    }

    public static int smallestElement(int[] arr, int k) {
        int n = arr.length;

        Arrays.sort(arr);
        return arr[k - 1];
    }
}
