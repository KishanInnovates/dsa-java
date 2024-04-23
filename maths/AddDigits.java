public class AddDigits {
    public static void main(String[] args) {
        int n = 55;
        int result = digit(n);
        System.out.println(result);
    }

    public static int digit(int num) {
        return 1 + (num - 1) % 9;
    }
}
