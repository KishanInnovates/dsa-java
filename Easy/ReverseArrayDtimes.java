public class ReverseArrayDtimes {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2;
        int n = arr.length;
        if (n == 0) {
            return;
        }
        d = d % n; //it ensures  that d always lie in the range of array
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
