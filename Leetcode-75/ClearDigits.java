public class ClearDigits {
    public static void main(String[] args) {
        String s = "cb34";
        System.out.println(removeDigits(s));
    }

    public static String removeDigits(String s) {
        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(ch);
            }
        }
        return stack.toString();
    }
}
