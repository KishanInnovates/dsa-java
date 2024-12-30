public class exceptionallyOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3 };
        int result = getOdd(arr);
        System.out.println(result);
    }
    // https://www.geeksforgeeks.org/problems/find-the-odd-occurence4820/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions

    public static int getOdd(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
