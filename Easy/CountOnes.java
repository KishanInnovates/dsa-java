public class CountOnes {
    public static void main(String[] args) {
        String str = "1111";
        System.out.println("The number of substring is: " + countOnes(str));
    }
    // https://www.geeksforgeeks.org/problems/binary-string-1587115620/1?page=1&difficulty=Basic&status=unsolved&sortBy=submission
    public static int countOnes(String str) {
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        return (count * (count - 1))/2;
    }
}
