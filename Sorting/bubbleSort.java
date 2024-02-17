import java.util.Arrays;

class bubbleSort{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] num){
        boolean swapped;
        for(int i=0; i < num.length; i++){
            swapped = false;
            for(int j=1; j<num.length - i; j++){
                //swap elements
                if(num[j] < num[j - 1]){
                    //swap
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}