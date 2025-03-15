import java.util.Arrays;
class ProductArrayPuzzle{
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(productExceptSelf(arr)));

        int[] arr2 = {12, 0};
        System.out.println(Arrays.toString(productExceptSelf(arr2))); 
        //tc : O(N)
    }
    public static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }

        int suffixProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffixProd;
            suffixProd *= arr[i];
        }
        return res;
    }
}