public class REmoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
        int n = arr.length;
        int result = removeDuplicates(arr, n);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
}
