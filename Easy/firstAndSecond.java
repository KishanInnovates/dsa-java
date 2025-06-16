import java.util.Arrays;
public class firstAndSecond {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 6 };
        int[] result = minSecond(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] minSecond(int[] arr) {
        Arrays.sort(arr);
        return new int[] { arr[0], arr[1] };
    }
}