

class majorityElement {
  public static void main(String[] args) {
      int[] arr = {1, 1, 3, 3, 3, 4};
    int majority = bubble(arr);
    System.out.println(majority);
  }
  static int  bubble(int[] arr){
    boolean swapped;
    for(int  i = 0; i < arr.length; i++){
        swapped = false;
        for(int j = 1; j < arr.length - i; j++){
            if(arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                swapped = true;
            }
        }
        if(!swapped){
            break;
        }
    }
    return arr[arr.length / 2];
  }
}
