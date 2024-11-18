import java.util.PriorityQueue;

public class NearlySorted {
    public static void main(String[] args) {
         int[] arr1 = {6, 5, 3, 2, 8, 10, 9};
         int k1 = 3;
         System.out.print("The input array is: ");
         for (int num : arr1) {
             System.out.print(num + " ");
         }
         System.out.println();
         nearlySortedArray(arr1, k1);
        System.out.print("The sorted array is: ");
         for (int num : arr1) {
            System.out.print(num + " ");
         }
    }

    public static void nearlySortedArray(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.add(arr[i]);
        }
        int index = 0;

        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = minHeap.poll();
            minHeap.add(arr[i]);
        }

        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }
}
