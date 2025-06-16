import java.util.Arrays;

public class KeyPair {
    public static void main(String[] args) {
         int[] arr1 = {1, 4, 45, 6, 10, 8};
        int x1 = 16;
        System.out.println(isKeyPair(arr1, x1));  // Output: true

        int[] arr2 = {1, 2, 4, 3, 6};
        int x2 = 11;
        System.out.println(isKeyPair(arr2, x2));//output false
    }

    public static boolean isKeyPair(int[] arr, int x) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == x) {
                return true;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
