import java.util.Scanner;

class areaOFCircle{
public static void main(String args[]) {

    Scanner scn = new Scanner(System.in);

    //taking inputs
    System.out.print("Enter radius of circle: ");
    double radius = scn.nextFloat();

    double area = 3.14 * radius * radius;
    //printing the result 

    System.out.print("Area : " + area);
}

}
