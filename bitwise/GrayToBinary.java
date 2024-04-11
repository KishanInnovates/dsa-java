public class GrayToBinary {
    public static void main(String[] args) {
        
    }
     public static int grayToBinary(int n) {
        
        // Your code here
        int ans = 0;
        while(n > 0)
        {
            ans = ans ^ n;
            n = n >> 1;
        }
        return ans;
        
    }
}
