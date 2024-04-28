public class SearchingANumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 3, 81, 3 };
        int target = 3;
        int result = search(arr, target);
        System.out.println(result);
    }

    public static int search(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i + 1;
            }
        }
        return -1;
    }
}
