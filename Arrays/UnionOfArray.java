import java.util.ArrayList;

class UnionOfArray {
    public static void main(String[] args) {
        int[] arr1 = { -8, -3, -3, -2, 0, 1, 2, 2, 6 };
        int[] arr2 = { -9, -9, 0 };
        ArrayList<Integer> result = findUnion(arr1, arr2);
        System.out.println(result);
    }
    
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int lastAdded = Integer.MIN_VALUE;
        //code doesn't copy the same elements

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (arr1[i] != lastAdded) {
                    union.add(arr1[i]);
                    lastAdded = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (arr2[j] != lastAdded) {
                    union.add(arr2[j]);
                    lastAdded = arr2[j];
                }
                j++;
            } else { //for equal to elements
                if (arr1[i] != lastAdded) {
                    union.add(arr1[i]);
                    lastAdded = arr1[i];
                }
                i++;
                j++;
            }

        }
         while (i < arr1.length) {
                if (arr1[i] != lastAdded) {
                    union.add(arr1[i]);
                    lastAdded = arr1[i];
                }
                i++;
            }
            while (j < arr2.length) {
                if (arr2[j] != lastAdded) {
                    union.add(arr2[j]);
                    lastAdded = arr2[j];

                }
                j++;
            }
            return union;
        
    }
}