public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = { 1, 22, 3, 4, 5 };
        int result = remove(arr, 5);
        System.out.print("The total number of element will be: " +result);
    }

    public static int remove(int[] arr, int value) {
        int i = 0;
        for (int num : arr) {
            if (num != value) {
                arr[i++] = num;
            }
        }
        return i;
    }
}
