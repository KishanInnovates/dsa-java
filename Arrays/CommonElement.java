import java.util.ArrayList;
import java.util.Arrays;

class CommonElement {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
       
        
        // Find common elements in the arrays
        System.out.println(common(A, B, C));
        
    }

    public static ArrayList<Integer> common(int[] arr1, int[] arr2, int[] arr3) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr3.length;

        int i = 0, j = 0, k = 0;

        ArrayList<Integer> result = new ArrayList<>();
        while (i < n1 && j < n2 && k < n3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {

                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
                k++;

            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
            
        }
        return result;
    }
    
}