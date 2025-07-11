import java.util.Scanner;

public class FitInDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Max value the data type can store
            int X = sc.nextInt(); // Value to store
            System.out.println(X % (N + 1)); // Modulo logic
        }
        sc.close();
    }
}
