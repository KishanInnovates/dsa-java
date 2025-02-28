import java.util.Stack;

class EvaluateRPN {
    public static void main(String[] args) {
        String[] arr = { "2", "3", "1", "*", "+", "9", "-" };
        int res = evaluate(arr);
        System.out.println(res);
    }

    public static int evaluate(String[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (String s : arr) {
            if (isOperator(s)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(calculate(a, b, s));
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public static int calculate(int a, int b, String s) {
        switch (s) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}