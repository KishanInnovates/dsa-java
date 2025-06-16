class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 71, 8, 1, 2};
        int target = 5;
        int result = pivot(arr);
        System.out.println(result);
    }   
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            //4cases
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }else if(mid >  start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }else if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    } 
    
}
