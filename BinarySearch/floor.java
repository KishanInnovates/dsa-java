 class floor {
    public static void main(String[] args) {
        int[] arr = { -18, -12, 0, 1, 2, 5, 6, 18, 19, 22, 58, 68 };
        int target = -19;
        int ans = floorOf(arr, target);
        System.out.println(ans);
    }
    static int floorOf(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return start;
            }
        }
        return end;
    }
}
