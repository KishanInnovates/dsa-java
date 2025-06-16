class MissingNumber{
    public static void main(String[] args) {

    }
    public int missingNumber(int[] arr) {
        int n = arr.length;
        for(int i = 0;i < n; i++){
            while(arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]){
                int correctIndex = arr[i] - 1;
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] != i + 1){
                return i + 1;
            }
        }
        return n + 1;
    }
}