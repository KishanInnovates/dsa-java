import java.util.Collection;
import java.util.Collections;

public class MinimizeSumOfTheProduct {
    public static void main(String[] args) {

    }

    public static long minValue(List<Integer> arr1, List<Integer> arr2) {
        Collections.sort(arr1);
        Collections.sort(arr2, Collections.reverseOrder());

        long result = 0;
        for (int i = 0; i < arr1.size(); i++) {
            result += (long) arr1.get(i) * arr2.get(i);
        }
        return reuslt;
    }
}
