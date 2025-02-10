public class TwoOddNumbers {
    public static void main(String[] args) {
        
    }
    public static int[] twoOddNum(int[] arr){
        int xor = 0;
        for (int n : arr) {
            xor = xor ^ n;
        }
        int rightSetBit = xor & -xor;
        int b1 = 0, b2 = 0;
        for (int num : arr) {
            if ((num & rightSetBit) == 0) {
                b1 ^= num;
            } else {
                b2 ^= num;
            }
        }
        int[] result = new int[] { Math.max(b1, b2), Math.min(b1, b2) };
        return result;
    }
}
