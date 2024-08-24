public class FlowerBed {
    public static void main(String[] args) {
        int[] flowerbed = { 1, 0, 0, 0, 1 };
        int n = 1;
        boolean result = canPlaceFlower(flowerbed, n);
        System.out.println(result);
    }

    public static boolean canPlaceFlower(int[] flowerbed, int n) {
        int length = flowerbed.length;

        for (int i = 0; i < length && n > 0; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == length - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                    i++; //skip because we can't place flower next to it
                }
            }
        }
        return n == 0;
    }
}
