public class TrianglePattern {
    public static void main(String[] args) {
        star(4, 0);
    }

    static void star(int r, int c) {
        
        if (r == 0) {
            return;
        }
        if (c < r) {
            star(r, c + 1);
            System.out.print("* ");
        } else {
            star(r - 1, 0);
            System.out.println();
        }
    }
}
