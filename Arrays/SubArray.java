import java.util.ArrayList;

public class SubArray {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> subArraySum(int[] arr, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0, j = 0;

        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
            while (count > s && j < arr.length) {
                count -= arr[j];
                j++;

            }
            if (count == s && j <= i) {
                result.add(j + 1);
                result.add(i + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}