import java.util.Arrays;

class missMatch{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct  = arr[i] - 1;
            if( arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(int index=0; index < arr.length; index++){
            if(arr[index] != index + 1){
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}