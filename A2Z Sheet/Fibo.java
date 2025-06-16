class Fibo {
    public static void main(String[] args) {
        int n = 5;
        int result = fibonacci(n);
        System.out.print("The fibonacci number will be: " + result);
    }

    public static int fibonacci(int n) {
        if (n < 2)
            return n;
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
