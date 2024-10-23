import java.util.Scanner;

public class FibonacciTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");

        int rows = sc.nextInt();

        int first = 0;
        int second = 1;
        int next;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(first + " ");

                next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
