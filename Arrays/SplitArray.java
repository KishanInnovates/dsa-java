public class SplitArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5 };
        boolean result = canSplit(arr);
        System.out.println(result);
    }

    public static boolean canSplit(int[] arr) {
        int totalSum = 0;
        for (int a : arr) {
            totalSum += a;
        }

        int rightSum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rightSum += arr[i];
            if (rightSum * 2 == totalSum) {
                return true;
            }
        }
        return false;
    }
}
