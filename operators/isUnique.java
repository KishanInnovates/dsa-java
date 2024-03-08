class isUnique {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 3, 3, 5};
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
