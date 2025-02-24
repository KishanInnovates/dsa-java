import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String s = "*-A/BC-/AKL";
        System.out.println(preToPost(s));
    }

    public static String preToPost(String s) {
        int n = s.length();
        Stack<String> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                stack.push(ch + "");
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String exp = op1 + op2 + ch;
                stack.push(exp);
            }
        }
        return stack.peek();
    }
}
