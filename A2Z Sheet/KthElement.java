class KthElement{
    public static void main(String[] args) {
        
    }
    public static int findKthElement(int[] a, int[] b, int k){
        int n1 = a.length, n2 = b.length;
        if (n1 > n2)
            return findKthElement(b, a, k);
        int low = Math.max(0, k - n2), high = Math.min(k, n1);

        while (low <= high) {
            int midA = (low + high) / 2;
            int midB = k - midA;
            
            int leftA = (midA > 0) ? a[midA - 1] : Integer.MIN_VALUE;
            int leftB = (midB > 0) ? b[midB - 1] : Integer.MIN_VALUE;
            int rightA = (midA < n1) ? a[midA] : Integer.MAX_VALUE;
            int rightB = (midB < n2) ? b[midB] : Integer.MAX_VALUE;
            
            if (leftA <= rightB && leftB <= rightA) {
                return Math.max(leftA, leftB);
            } else if (leftA > rightB) {
                high = midA - 1;
            } else {
                low = midA + 1;
            }
        }
        
        return -1; // Should not reach here
    }
}