public class Pattern {
    public static void main(String[] args) {
        star(4, 0);
    }

    static void star(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            star(r, c+1);
        } else {
            System.out.println();
            star(r - 1, 0);
        }
    }
}
