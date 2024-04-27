public class CountSquare {
    public static void main(String[] args) {

    }

    public static int count(int n) {
        int a = (int) Math.sqrt(n);
        if (a * a == n)
            return a - 1;
        else
            return a;
    }
}
