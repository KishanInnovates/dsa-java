public class Construct2D {
    public static void main(String[] args) {
        
    }
    public static int[][] construct2DArray(int[] arr, int m, int n){
        if (arr.length != m * n)
            return new int[0][0];
        
        int[][] result = new int[m][n];
            
            for(int i = 0; i < arr.length; i++){
                result[i / n][i % n] = arr[i];
            }
            return result;
    }
}
