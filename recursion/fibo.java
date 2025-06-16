 class fibo {
     public static void main(String[] args) {

     }

     static int fib(int n) {
         if (n < 2) {
             return n;
         }
         return fib(n - 1) + fib(n - 2);
    }
}
