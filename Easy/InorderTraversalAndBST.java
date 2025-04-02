

public class InorderTraversalAndBST {
    public static void main(String[] args) {

    }

    public static int isRepresentingBST(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}
