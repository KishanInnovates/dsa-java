
import java.util.Scanner;

class exclude{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Get the value of n from the user
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        
        // Initialize a counter for numbers not containing '3'
        int count = 0;
        
        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the number contains '3'
            if (!String.valueOf(i).contains("3")) {
                count++;  // Increment the count if it doesn't contain '3'
            }
        }
        
        // Output the count
        System.out.println("Count of numbers from 1 to " + n + " excluding those containing '3': " + count);
        
        // Close the scanner
        scanner.close();
    }
}