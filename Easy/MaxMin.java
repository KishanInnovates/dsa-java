public class MaxMin {
    public static void main(String[] args) {
        int A[] = { -2, 1, -4, 5, 3 };
        int sum = Sum(A);
        System.out.println("The sum of maximum and minimum element is: " + sum);
    }

    public static int Sum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max + min;
    }
}
