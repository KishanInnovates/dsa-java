import java.util.Arrays;

class searchIn2d {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 44, 55},
            {22, 11, 10, 1},
            {2, 3, 35, 45}
        };   
        int target = 45;
        int[] ans = search(arr, target); 
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{ -1, -1};
    }
}
