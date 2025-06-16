 class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 55, 25, 35, 40};
        int result = linearsearch(arr, 1);
        System.out.println(result);
    }

    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
                return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(target == element){
                return i;
            }
        }
        return -1;
    }
}
