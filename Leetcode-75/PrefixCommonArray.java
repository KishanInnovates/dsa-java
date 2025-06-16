import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class PrefixCommonArray {
    public static void main(String[] args) {
        int[] A1 = {1, 3, 2, 4};
        int[] B1 = {3, 1, 2, 4};
        System.out.println(Arrays.toString(findPrefixCommonArray(A1, B1))); // Output: [0, 2, 3, 4]

        int[] A2 = {2, 3, 1};
        int[] B2 = {3, 1, 2};
        System.out.println(Arrays.toString(findPrefixCommonArray(A2, B2))); // Output: [0, 1, 3]
    }

    public static int[] findPrefixCommonArray(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[n];
        Set<Integer> seenA = new HashSet<>();
        Set<Integer> seenB = new HashSet<>();
        for (int i = 0; i < n; i++) {
            seenA.add(a[i]);
            seenB.add(b[i]);

            int commonCount = 0;
            for (int num : seenA) {
                if (seenB.contains(num)) {
                    commonCount++;
                }
            }
            c[i] = commonCount;
        }
        return c;
    }
}
