public class KadaneAlgorithm {
    public static void main(String[] args) {
        
    }
    public long maxSubarraySum(int[] arr) {
        long maxh = 0, maxf = Long.MIN_VALUE;
        for (int num : arr) {
            maxh = Math.max(num, maxh + num);
            maxf = Math.max(maxf, maxh);
        }
        return maxf;
    }
}
