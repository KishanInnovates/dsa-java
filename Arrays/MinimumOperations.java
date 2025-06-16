public class MinimumOperations {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 4 };
        int m = arr[0];
        for (int i = 0; i < arr.length; i++) {
            m = Math.min(m, arr[i]);
        }

        int operations = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                operations++;
            }
        }
        System.out.println(operations);
    }
}
