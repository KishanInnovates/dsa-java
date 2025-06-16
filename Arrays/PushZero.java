public class PushZero {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 0, 0, 0, 5, 6 };
        pushZeroToEnd(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void pushZeroToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }
}
