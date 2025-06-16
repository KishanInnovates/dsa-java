public class Print1toN {
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
    }

    public static void printNos(int n) {
        if (n == 0)
            return;
        printNos(n - 1);
        System.out.print(n + " ");
    }
}
