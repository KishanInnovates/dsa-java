import java.util.PriorityQueue;

class kthlargestElement {
     public static void main(String[] args) {
         int[] arr = { 3, 2, 1, 5, 6, 4 };
         int k = 2;
         int result = kthLargest(arr, k);
         System.out.println("The " + k + " largest element in the array is: " + result);
     }

     public static int kthLargest(int[] nums, int k) {
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();

         for (int num : nums) {
             minHeap.offer(num);

             if (minHeap.size() > k) {
                 minHeap.poll();
             }
         }
         return minHeap.peek();
    }
    
}