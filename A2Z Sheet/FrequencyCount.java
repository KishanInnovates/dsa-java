public class FrequencyCount {
    public static void main(String[] args) {
        
    }

    public static void frequency(int[] arr, int n, int p) {
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (num >= 1 && num <= n) {
                freq[num]++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = freq[i + 1];
        }
    }
}
