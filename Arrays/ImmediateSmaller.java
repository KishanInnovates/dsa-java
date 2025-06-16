import java.util.ArrayList;

public class ImmediateSmaller {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 2, 3, 1, 7 };
        ArrayList<Integer> result = nextSmaller(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> nextSmaller(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                result.add(arr[i + 1]);
            } else {
                result.add(-1);
            }
        }
        result.add(-1);
        return result;
    }
}
