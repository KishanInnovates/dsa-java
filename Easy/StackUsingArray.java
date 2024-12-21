class StackUsingArray {
    private int[] arr;
    private int top;

    public void MyStack(){
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if (top == arr.length - 1) {
            return;
        }
        top++;
        arr[top] = x;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        int popped = arr[top];
        top--;
        return popped;
    }
    public static void main(String[] args) {

    }
    
}