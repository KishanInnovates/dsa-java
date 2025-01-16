public class MinimumDistance {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2};
        System.out.println(minDistance(arr1, 1, 2)); // Output: 1

        int[] arr2 = {86, 39, 90, 67, 84, 66, 62};
        System.out.println(minDistance(arr2, 42, 12)); // Output: -1

        int[] arr3 = {10, 20, 30, 40, 50};
        System.out.println(minDistance(arr3, 10, 50)); // Output: 4
    }

    public static int minDistance(int[] arr, int x, int y) {
        int xIndex = -1;
        int yIndex = -1;
        int minDis = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                xIndex = i;
            }
            if (arr[i] == y) {
                yIndex = i;
            }

            if (xIndex != -1 && yIndex != -1) {
                minDis = Math.min(minDis, Math.abs(xIndex - yIndex));
            }
        }
        return (xIndex == -1 || yIndex == -1) ? -1 : minDis;
    }
}
