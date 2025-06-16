class FindTriplet{
    public static void main(String[] args){

    }
    public static boolean findTriplet(int[] arr, int target){
        int n = arr.length;

        Arrays.sort(arr);
        for(int i = 0; i < n - 2; i++){
            int left = i + 1;
            int right = n - 1;
            int remainingSum = target - arr[i];
            while(left < right){
                int currentSum = arr[left] + arr[right];
                if(currentSum == remainingSum){
                    return true;
                }else if(currentSum < remainingSum){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }
}