import java.util.Scanner;

class IO {
    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        //string input
        System.out.print("Enter name: ");
        String name = scn.nextLine();

        //integer input in the program
        System.out.println("Enter age: ");
        int age = scn.nextInt();

        //input charachter

        System.out.print("Enter gender M/F: ");
        char g = scn.next().charAt(0);

        //input long 
        System.out.println("Enter mobile number: ");
        long mobile = scn.nextLong();

        //input double 
        System.out.println("Enter CGPA: ");
        double cgpa = scn.nextDouble();

        //outputs
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + g);
        System.out.println("Mobile: " + mobile);
        System.out.println("CGPA:" + cgpa);



    }
}