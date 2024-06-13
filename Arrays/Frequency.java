

class Frequency{
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {2, 3, 2, 3, 5};
        int P = 5;
        frequecnyCount(arr, N, P);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void frequecnyCount(int[] arr, int N, int P) {
        int[] freq = new int[N + 1];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num >= 1 && num <= N) {
                freq[num]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = freq[i + 1];
        }
    }
}