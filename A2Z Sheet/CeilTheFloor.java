public class CeilTheFloor {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 8, 9, 6, 5, 5, 6};
        int x1 = 7;
        int[] res1 = floorAndCeil(arr1, x1);
        System.out.println(res1[0] + ", " + res1[1]); // Output: 6, 8

        int[] arr2 = {5, 6, 8, 8, 6, 5, 5, 6};
        int x2 = 10;
        int[] res2 = floorAndCeil(arr2, x2);
        System.out.println(res2[0] + ", " + res2[1]); // Output: 8, -1
    }

    public static int[] floorAndCeil(int[] arr, int x) {
        int floor = -1, ceil = -1;
        for (int num : arr) {
            if (num <= x) {
                floor = Math.max(floor, num);
            }
            if (num >= x) {
                ceil = (ceil == -1) ? num : Math.min(num, ceil);
            }
        }
        return new int[] { floor, ceil };
    }
}
