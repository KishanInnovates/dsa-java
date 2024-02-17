package conditionals.loops;

import java.util.Scanner;

class fibonacci{
    public static void main(String args[]){
        int a = 0, b = 1, c = 0, n, i = 1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = scn.nextInt();
        System.out.print("Fibonacci Series: ");
        
        while(i <= n){
            System.out.print(a + " ");
            c = a + b; 
            a = b;
            b = c;
            i++;
        }
    }
}