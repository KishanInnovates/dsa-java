public class Sort012 {
    public static void main(String[] args) {
         int[] arr = {0, 2, 1, 2, 0};
        int n = arr.length;
        
        sort(arr, n);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] arr, int n) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
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
        while (count2 > 0) {
            arr[index++] = 2;
            count2--;
        }
    }
}
