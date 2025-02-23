import java.util.Stack;

class PrefixToInfix {
    public static void main(String[] args) {
        String prefix = "*-A/BC-/AKL";
        System.out.println(preToInfix(prefix)); // Output: ((A-(B/C))*((A/K)-L))
    }

    public static String preToInfix(String s) {
        int n = s.length();
        Stack<String> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                stack.add(ch + "");
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String exp = "(" + op1 + ch + op2 + ")";
                stack.push(exp);
            }
        }
        return stack.peek();
    }
}