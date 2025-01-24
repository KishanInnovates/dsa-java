class FindNthRootOfM {
    public static void main(String[] args) {
        int n = 2;
        int m = 9;
        System.out.println(nthRoot(n, m));
    }

    public static int nthRoot(int n, int m) {
        int low = 1;
        int high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = func(mid, n, m);
            if (midValue == 1)
                return mid;
            else if (midValue == 0)
                low = mid + 1;
            else
                high = mid + 1;

        }
        return -1;
    }

    public static int func(int mid, int n, int m) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m)
                return 2;

        }
        if (ans == m)
            return 1;
        return 0;
    }
}