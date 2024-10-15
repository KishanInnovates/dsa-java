

class HCf {
     public static void main(String[] args) {
          int num1 = 56;
        int num2 = 98;

        
        System.out.println("HCF (using recursion): " + hcfrecursive(num1, num2));

      
        System.out.println("HCF (using iteration): " + hcf(num1, num2));
     }

     public static int hcfrecursive(int a, int b) {
         if (b == 0)
             return a;

         return hcfrecursive(b, a % b);
     }

     public static int hcf(int a, int b) {
        
         while (b != 0) {
             int temp = b;
             b = a % b;
             a = temp;
         }
         return a;
    }
    
}