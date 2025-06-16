public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int result = getSecondLargest(arr);
        System.out.print("The second largest element in the array is: " + result);
    }

    public static int getSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2)
            return -1;
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        } else {
            return secondLargest;
        }
    }
}
