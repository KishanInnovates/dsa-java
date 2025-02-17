import java.util.ArrayList;
import java.util.Arrays;

public class KLargest {
    public static void main(String[] args) {
        int[] nums = { 12, 23 };
        int k = 1;
        ArrayList<Integer> result = new ArrayList<>();
        result = kLargest(nums, k);
        System.out.println(result);
    }

    public static ArrayList<Integer> kLargest(int[] arr, int k) {

        Arrays.sort(arr);
        int n = arr.length;

        ArrayList<Integer> result = new ArrayList<>();
        if (k > n)
            return result;
        for (int i = n - 1; i >= n - k; i--) {
            result.add(arr[i]);
        }
        return result;
    }
}
