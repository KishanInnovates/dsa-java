import java.util.Arrays;

public class leftRotate {
    public static void main(String[] args) {
        int n = 7;
        int[] arr =  {-1, -2, -3, 4, 5, 6, 7};
        int d = 2;
        

        d %= n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
