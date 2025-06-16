public class FloorInArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 8, 10, 11, 12, 19};
        int x1 = 0;
        int result = floorInAnArray(arr1, x1);
        System.out.println(result);
    }

    public static int floorInAnArray(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int leftIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                leftIndex = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return leftIndex;
    }
}
