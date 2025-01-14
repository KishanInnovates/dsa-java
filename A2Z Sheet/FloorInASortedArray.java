public class FloorInASortedArray {
    public static void main(String[] args) {

    }

    public static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int floorIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                floorIndex = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return floorIndex;
    }
}
