import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String s = "ABC/-AK/L-*";
        System.out.println(postToPre(s));
    }

    public static String postToPre(String s) {
        int n = s.length();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                stack.push(ch + "");
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String exp = ch + op2 + op1;
                stack.push(exp);
            }
        }
        return stack.peek();
    }
}
