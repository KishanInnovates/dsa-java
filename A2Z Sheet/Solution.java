class Solution {
    //https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n > threshold) return -1;
        int low = 1; 
        int high = max(nums);
        while(low <= high){
            int mid = (low + high)/2;
            if(sumByD(nums, mid) <= threshold){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        } 
        return low;

    }
    public static int sumByD(int[] nums, int d){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += Math.ceil((double)nums[i]/(double)d);
        }
        return sum;
    }
    public static int max(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(arr[i], max);
        }
        return max;
    }
}