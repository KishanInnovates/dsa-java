public class TransitionPoint {
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 1, 1};
        int[] arr2 = {0, 0, 0, 0, 0};
        int[] arr3 = { 1, 1, 1, 1, 1 };
        System.out.println(findTransition(arr1, 5));
        System.out.println(findTransition(arr2, 5));
        System.out.println(findTransition(arr3, 5));
    }

    public static int findTransition(int[] arr, int n) {
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == 1) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if (arr[start] == 1) {
            return start;
        } else {
            return -1;
        }
    }
}
