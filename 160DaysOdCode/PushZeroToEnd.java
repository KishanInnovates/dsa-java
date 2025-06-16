class PushZeroToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        pushZerosToEnd(arr);
        System.out.print("The modified array will be: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void pushZerosToEnd(int[] arr){
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
