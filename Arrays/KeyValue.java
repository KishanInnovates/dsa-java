import java.util.Arrays;

public class KeyValue {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5};
        int key1 = 5;
        int[] result = keyValue(arr1, key1);
        System.out.println(Arrays.toString(result));
    }
    public static int[] keyValue(int[] arr, int key){
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (startIndex == -1) {
                    startIndex = i;
                }
                endIndex = i;
            }
        }
        return new int[] { startIndex, endIndex };
    }
}
