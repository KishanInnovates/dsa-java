 class evenDigits {
    public static void main(String[] args) {
        //1295. Find Numbers with Even Number of Digits
        int[] num = {12,1556, 1552, 17, 16, 1888};
        int result = findNumber(num);
        System.out.println(result);
    }
    static int findNumber(int[] nums){
        int count = 0;
        for(int num : nums){
            if ((even(num))) {
                count++;
                
            }
        }
        return count;
    }
    private static boolean even(int num) {
            int count = 0;
            while(num>0){
                int ld = num % 10;
                count++;
                num/=10;
            }
        if(count % 2 == 0){
            return true;
        }
        return false;
    }
}
