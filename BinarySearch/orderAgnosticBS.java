class orderAgnosticBS{
    public static void main(String[] args) {
        // int[] arr = { -18, -12, 0, 1, 2, 5, 6, 18, 19, 22, 58, 68 };
        int[] arr = { 85, 84, 52, 15, 12, 11, 10, 9, 8, 5 };
        int target = 52;
        int ans = ogbs(arr, target);
        System.out.println(ans);
    }

    static int ogbs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
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