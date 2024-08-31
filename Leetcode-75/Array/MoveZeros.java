class MoveZeros{
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int nu : nums) {
            System.out.print(nu + " "); //output 1 3 12 0 0
        }
    }
    public static void moveZeroes(int[] nums){
        int index = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < n) {
            nums[index++] = 0;
            
        }
    }
}