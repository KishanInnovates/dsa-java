public class EqilibiriumPoint {
    public static void main(String[] args) {
         int[] arr1 = {1, 2, 0, 3};
        System.out.println(findEquilibrium(arr1)); // Output: 2

        int[] arr2 = {1, 1, 1, 1};
        System.out.println(findEquilibrium(arr2)); // Output: -1

        int[] arr3 = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibrium(arr3)); // Output: 3
    }

    public static int findEquilibrium(int[] arr) {
        int n = arr.length;
        //brute force solution O(N2) time complexity 
        for (int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static int findEquili(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        int leftSum = 0;
        //o(N)
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;

    }
}
