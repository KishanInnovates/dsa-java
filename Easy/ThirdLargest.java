public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = { 855, 450, 132, 359, 233, 825, 604, 481, 262, 337, 720, 525, 652, 300, 906, 219, 926, 906, 293, 864, 817, 498, 30, 639, 661 };
        int result = thirdLargest(arr);
        System.out.println("The third largest element is: " + result);
    }

    public static int thirdLargest(int[] arr) {
         if (arr.length < 3) return -1; // Return -1 for arrays smaller than 3.

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }

        // Check if a valid third-largest number exists.
        if (third == Integer.MIN_VALUE) {
            return -1;
        }
        return third;
    }
}
