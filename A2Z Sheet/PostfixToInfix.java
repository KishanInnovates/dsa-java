import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String s = "ab*c+";
        System.out.println(postToInfix(s));
    }

    public static String postToInfix(String s) {
        int n = s.length();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                stack.push(ch + "");
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String exp = "(" + op2 + ch + op1 + ")";
                stack.push(exp);
            }
        }
        return stack.peek();
    }
}
