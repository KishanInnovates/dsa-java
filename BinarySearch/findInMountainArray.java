 class findInMountainArray {
    public static void main(String args[]){
            int[] array = { 0, 1, 2, 4, 2, 1};
            int target = 3;
            int result = findInMounatin(array, target);
            System.out.println(result);
    }
    static int findInMounatin(int[] arr, int target){
        int peak = peakIndexInMounatinArray(arr);
        int firstHalf = ogbs(arr, target, 0, peak);
        if(firstHalf != -1){
            return firstHalf;
        }
        return ogbs(arr, target, peak + 1, arr.length - 1);
    }
    static int peakIndexInMounatinArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int ogbs(int[] arr, int target, int start, int end){
       

        boolean isAsc = arr[start] < arr[end]; //condition to check array is ascending or descending
            while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            

        }
        return -1;
    }
}
