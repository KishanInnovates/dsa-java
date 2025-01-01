import java.util.List;
class SwapKthElement{
    public static void main(String[] args) {
        
    }
    public static void swapKth(int k, List<Integer> arr){
        int n = arr.size();
        int firstIndex = k - 1;
        int lastIndex = n - k;

        int temp = arr.get(firstIndex);
        arr.set(firstIndex, arr.get(lastIndex));
        arr.set(lastIndex, temp);
    }
}