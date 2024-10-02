import java.util.ArrayList;
import java.util.Arrays;

class RotateAndDelete {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println(rotateDelete(arr1)); //output : 3 
    }
        //time complexity : O(N^2) and space complexity : O(1)
    public static int rotateDelete(ArrayList<Integer> arr) {
        int sz = arr.size();
        int operations = sz / 2;

        for (int k = 1; k <= operations; k++) {
            int lastElement = arr.get(arr.size() - 1);
            arr.add(0, lastElement);
            arr.remove(arr.size() - 1);
            int n = arr.size();
            int removeIndex = n - k;
            arr.remove(removeIndex);
        }
        return arr.get(0);
    }
}