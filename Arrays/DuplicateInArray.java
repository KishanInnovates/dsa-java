public class DuplicateInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        int result = findDuplicate(arr);
        System.out.print("The Duplicate Number In The Array Is : " + result);
    }

    public static int findDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            int count = 0;
            for (int num : arr) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
