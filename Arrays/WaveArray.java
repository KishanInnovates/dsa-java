public class WaveArray {
    public static void main(String[] args) {
             int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        
        waveArray(arr);
        
        // Print the resulting wave array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void waveArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
