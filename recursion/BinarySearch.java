class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1, 25, 35, 45, 65, 78, 56};
        System.out.println(seacrh(arr, 45, 0, arr.length-1));

    }
    static int seacrh(int[] arr, int target, int start, int end ){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return seacrh(arr, target, start, mid - 1);
        }
        return seacrh(arr, target, mid + 1, end);
    }
}