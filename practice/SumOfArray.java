package practice;

public class SumOfArray {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int sum = sumOfArray(nums);
        System.out.print("The sum of the given array is: " + sum);
    }
    public static int sumOfArray(int[] nums){
        if(nums.length <= 0) return -1;

        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum; 
    }
}
