import java.util.Scanner;

class shuffledString {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String ab = scn.nextLine();
        System.out.print("Enter the size of array as same of string: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        char[] shuffled = new char[ab.length()];
        for (int i = 0; i < ab.length(); i++) {
            shuffled[arr[i]] = ab.charAt(i);
        }
        System.out.print(new String(shuffled));
    }
}