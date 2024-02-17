import java.util.Arrays;

class findMissing{
    public static void main(String[] args) {
         int[] arr = { 1, 2, 4, 4, 5 };
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int cycle(int[] nums){
        int i = 0;
        while(i < nums.length){
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}