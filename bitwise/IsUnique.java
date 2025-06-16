 class IsUnique {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 3, 3, 5, 5, 6};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num;
        }

        return unique;
    }
}
