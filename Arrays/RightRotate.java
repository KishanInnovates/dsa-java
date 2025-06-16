import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5,6,7};
       int d = 3;
       int n = nums.length;
       d %= n;
       reverse(nums, 0, n - 1);
       reverse(nums, 0, d - 1);
       reverse(nums, d, n - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
}
