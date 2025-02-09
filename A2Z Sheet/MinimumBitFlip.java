public class MinimumBitFlip {
    public static void main(String[] args) {

    }

    public static int minBitFlip(int start, int goal){
        int ans = start ^ goal;
        int count = 0;
        while(ans > 0){
            count += ans & 1;
            ans >>= 1; //it is same like ans/2
        }
        return count;
    }
}
