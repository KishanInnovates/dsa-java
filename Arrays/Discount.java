import java.util.Scanner;

class Discount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        System.out.println();
        System.out.print("Enter the cost of the coupon and discount per item: ");
        int x = scn.nextInt();
        int y = scn.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();
        }

        //original cost
        int originalCost = 0;
        for (int num : prices) {
            originalCost += num;
        }

        //calculte discount
        int discountedCost = x;
        for (int price : prices) {
            if (price > y) {
                discountedCost += (price - y);
            }
        }

        if (discountedCost < originalCost) {
            System.out.println("COUPON");
        } else {
            System.out.println("NO COUPON");
        }

    }
    // https://www.codechef.com/practice/course/arrays/ARRAYS/problems/DISCOUNTT

    
}