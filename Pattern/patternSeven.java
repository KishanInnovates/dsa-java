class patternSeven {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = rows; i >= 1; i--) {
            // Print spaces for the current row
            for (int j = rows - i; j > 0; j--) {
                System.out.print("  ");
            }

            // Print stars for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line after completing the row
            System.out.println();
        }
    }
}
