class minimum{
    public static void main(String[] args) {
        int[] arr = {1001, 255, 222, 3, 550};
        int result = max(arr);
        System.out.println(result);
    }
    static int max(int[] arr){
        int element = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < element){
                element = arr[i];
               
            }
            
        }
        return element;
    }
}