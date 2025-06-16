import java.util.Stack;
import java.util.Stack;

class DecodeString {
    public static void main(String[] args) {
        String s = "3[b2[ca]]";
        System.out.println(decodedString(s)); // Output: "bcacabcacabcaca"
    }

    public static String decodedString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                strStack.push(currentString);
                k = 0;
                currentString = new StringBuilder();
            } else if (ch == ']') {
                int repeatTime = countStack.pop();
                StringBuilder decodedStr = strStack.pop();
                for (int i = 0; i < repeatTime; i++) {
                    decodedStr.append(currentString);
                }
                currentString = decodedStr;
            } else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
}
