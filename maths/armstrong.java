 class armstrong {
    public static void main(String[] args) {
        System.out.println(arm(153));
    }

    public static String arm(int n) {
        int sum = 0;
        int original = n;
        while (n > 0) {
            int ld = n % 10;
            sum = sum + (ld * ld * ld);
            n /= 10;
        }
        if (sum == original) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
