public class MaxProductOfArray {
    public static void main(String[] args) {
        int[] arr = { -2, 6, -3, -10, 0, 2 };
        System.out.print("The maximum product of the subarray is: " + maxProduct(arr));
    }

    public static int maxProduct(int[] arr) {
        int n = arr.length;
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            if (current < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(current, maxProduct * current);
            minProduct = Math.min(current, minProduct * current);
            result = Math.max(maxProduct, result);
        }
        return result;
    }
}
