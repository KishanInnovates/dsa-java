import java.util.Scanner;
import java.lang.Math;

class areaOfTriangle {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        //taking inputs 
        System.out.print("Enter side a: " );
        int a = scn.nextInt();

        System.out.print("Enter side b: ");
        int b = scn.nextInt();

        System.out.print("Enter side c: ");
        int c = scn.nextInt();

        int s = (a+b+c)/2;

        double area =Math.sqrt(s*(s - a)*(s - b)*(s - c));

        System.out.print("Area: " + area);
    }
}