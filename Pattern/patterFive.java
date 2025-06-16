class patterFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for(int j = 1; j<=4-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
