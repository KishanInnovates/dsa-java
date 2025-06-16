public class UniqueNumberI {
    public static void main(String[] args) {

    }
    
    public int findUnique(int[] arr) {
        // code here
        int xor = 0;
        for (int e : arr) {
            xor ^= e;
        }
        return xor;
    }
}


