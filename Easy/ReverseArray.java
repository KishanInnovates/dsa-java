import java.util.Arrays;

class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int k = 3;
        reversefirstK(array, k);
//input
        System.out.println(Arrays.toString(array));
        reverseRemaining(array, k);
        System.out.println(Arrays.toString(array));
    }

    public static void reversefirstK(int[] arr, int k) {
        int start = 0;
        int end = k - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        
    }

    public static void reverseRemaining(int[] arr, int k) {
        int start = k;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        
    }

}