 class RotateBy90 {
     public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotateby90matirx(matrix, matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]  + " ");
            }
            System.out.println();
        }
        System.out.println(matrix.length);
     }

     public static void rotateby90matirx(int[][] matrix, int n){
         //first find the transpose
         for (int i = 0; i < n; i++) {
             for (int j = i; j < n; j++) {
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp;
             }
         }
        
         for (int j = 0; j < n; j++) {
             int top = 0;
             int bottom = n - 1;
            
             while (top < bottom) {
                 int temp = matrix[top][j];
                 matrix[top][j] = matrix[bottom][j];
                 matrix[bottom][j] = temp;
                 top++;
                 bottom--;
            }
         }
    } 
}
