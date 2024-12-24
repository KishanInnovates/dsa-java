public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = { 2, 10 };
        int result = thirdLargest(arr);
        System.out.println("The third largest element is: " + result);
    }

    public static int thirdLargest(int[] arr) {
        if (arr.length < 3)
            return -1;
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
        if (third == Integer.MIN_VALUE) {
            return -1;
        }
        return third;
    }
}
