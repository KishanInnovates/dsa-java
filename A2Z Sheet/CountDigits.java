
class CountDigits{
    public static void main(String[] args) {
        int n = 12;
        System.out.print("The number of digits that divide the number is: " + count(n));
    }
    public static int count(int n){
        int count = 0;
        int original = n;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}