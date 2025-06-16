public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 5;
        int result = search(arr, key);
        //ouput
        System.out.println(result);
    }
    

    public static int search(int[] arr, int key){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
