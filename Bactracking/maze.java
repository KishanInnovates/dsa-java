 class maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path("", 3, 3);
    }

    public static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
            int left = count(row - 1, col);
            int right = count(row, col - 1);
            return left + right;
        
    }

//method 

    public static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'R', r - 1, c);
        }
        if (c > 1) {
            path(p + 'D', r, c - 1);
        }
    }
}
