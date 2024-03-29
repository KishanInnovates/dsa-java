import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int[] arr) {
        int i = 0;
        if (arr.length == 1) {
            return 1;
        }
        for (int num : arr) {
            if (i < 1 || num > arr[i - 1]) {
                arr[i++] = num;
            }
        }
        return i;
    }
}
