import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 5, 6, 3, 2 };
        ArrayList<Integer> result = leader(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> leader(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[n - 1];
        result.add(max);
        for(int i = n -2; i>= 0; i--){
            if(arr[i] >= max){
                max = arr[i];
                result.add(max);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
