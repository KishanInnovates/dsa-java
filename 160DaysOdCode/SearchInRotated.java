public class SearchInRotated {
    public static void main(String[] args) {
        
    }
    public static int search(int[] arr, int key) {
        // Complete this function
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
