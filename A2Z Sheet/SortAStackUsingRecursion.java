import java.util.Stack;

public class SortAStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(2);
        stack.push(32);
        stack.push(3);
        stack.push(41);

        sortStack(stack);

        // Print sorted stack
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;
        int top = stack.pop();
        sortStack(stack);
        insertSortedOrder(stack, top);
    }

    public static void insertSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() >= element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertSortedOrder(stack, element);
        stack.push(top);
    }
}
