public class CountZero {
    public static void main(String[] args) {
         int[] arr1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int[] arr2 = {0, 0, 0, 0, 0};

        System.out.println(countZeros(arr1)); // Output: 3
        System.out.println(countZeros(arr2)); // Output: 5
    }

    public static int countZeros(int[] arr) {
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
