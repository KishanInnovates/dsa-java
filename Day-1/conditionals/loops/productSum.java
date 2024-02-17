import java.util.Scanner;

 class productSum {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = scn.nextInt();
        int sum = 0;
        int product = 1;
        while( n > 0){
            int digit = n % 10;
            sum = sum  + digit;
            product = product * digit;
            n = n / 10;

        }
        System.out.print("Subtraction of prodduct and sum of digit: " + (product - sum));
    }
    
}
