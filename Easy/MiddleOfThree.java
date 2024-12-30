public class MiddleOfThree {
    public static void main(String[] args) {
        int a = 200;
        int b = 312;
        int c = 400;
        int res = middle(a, b, c);
        System.out.println("The middle of the three will be: " +res ); //output:312 
    }
    //https://www.geeksforgeeks.org/problems/middle-of-three2926/1?page=1&difficulty=Basic&status=unsolved&sortBy=submissions
    public static int middle(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        return a + b + c - max - min;
    }
}
