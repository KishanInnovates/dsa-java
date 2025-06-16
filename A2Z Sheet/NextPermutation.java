public class NextPermutation {
    public static void main(String[] args) {
        
    }

    public static void nextPermuatation(int[] arr) {
        int n = arr.length;

        //find the break point in the array
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(arr, 0, n - 1);
        }
        for (int j = n - 1; j >= ind; j--) {
            if (arr[j] > arr[ind]) {
                swap(arr, j, ind);
                break;
            }
        }
        reverse(arr, ind + 1, n - 1);
    }
     public static void reverse(int[] nums, int l, int r) {
    while (l < r)
      swap(nums, l++, r--);
  }

  public static void swap(int[] nums, int i, int j) {
    final int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
