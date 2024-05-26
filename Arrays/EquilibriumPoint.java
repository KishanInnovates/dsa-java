public class EquilibriumPoint {
    public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 2, 2};
        int n1 = arr1.length;

        System.out.println("Equilibrium Point (Example 1): " + point(arr1, n1));
    }

    public static int point(int[] arr, int n) {
        if (n == 1) {
            return 1;

        }

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i + 1;
            }
            leftSum += arr[i];

        }
        return -1;
    }
}
