public class BinarySort {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0, 1, 1, 1 };
        int n = arr.length;
        sort(arr, n);
        for (int num : arr) {
            System.out.print(num);
        }
    }

    public static void sort(int[] arr, int n) {
        //applying counting sort

        int count0 = 0, count1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        int index = 0;
        while (count0 > 0) {
            arr[index++] = 0;
            count0--;
        }
        while (count1 > 0) {
            arr[index++] = 1;
            count1--;
                }
    }
}
