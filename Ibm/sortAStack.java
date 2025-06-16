import java.util.Stack;

class sortAStack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack before sorting: " + stack);

        sortStack(stack);

        System.out.println("Stack after sorting: " + stack);
    }

    public static void sortStack(Stack<Integer> stack) {
        //if stack is not empty
        if (!stack.isEmpty()) {
            int top = stack.pop();

            //sort the remaining stack recursively

            sortStack(stack);

            //insert the top element back in sorted order
            insertSorted(stack, top);
        }
    }

    public static void insertSorted(Stack<Integer> stack, int element) {
        //base case : if stack is empty or top of stack is smaller than element 
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }
        //remove the top element
        int top = stack.pop();

        //recursively insert the element in the sorted stack
        insertSorted(stack, element);

        stack.push(top);
    }
}