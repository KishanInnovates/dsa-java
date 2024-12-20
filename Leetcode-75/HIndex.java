import java.util.Arrays;
public class HIndex {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 6, 1, 5 };
        int citations = hIndex(arr);
        System.out.print("The number of citation is: " + citations);
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }
}
