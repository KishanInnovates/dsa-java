class searchInRange{
    public static void main(String[] args) {
        int[] arr = {12, 15, 16, 78, 85, 12, 16};
        int target = 78;
        int start = 0;
        int end = 4;
        int result = range(arr, target, start, end);
        System.out.println(result);
    }
    static int range(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i<= end; i++){
            if(arr[i] == target){
                return target;
            }
        }
        return -1;
    }
}