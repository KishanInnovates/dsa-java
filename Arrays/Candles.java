public class Candles {
    public static void main(String[] args) {
        int[] candles = { 4, 4, 2, 3 };
        int result = birthdayCandle(candles);
        System.out.println(result); //output : 2
    }

    public static int birthdayCandle(int[] candles) {
        int maxHeight = Integer.MIN_VALUE;
        int count = 0;
        for (int num : candles) {
            if (num > maxHeight) {
                maxHeight = num;
                count = 1;
            } else if (maxHeight == num) {
                count++;
            }
        }
        return count;
    }
}
