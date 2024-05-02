public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = count(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] count(int[] arr) {
        int odd = 0, even = 0;
        int n = arr.length;
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        result[0] = odd;
        result[1] = even;
        return result;
    }
}
