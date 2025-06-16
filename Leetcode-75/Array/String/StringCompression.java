public class StringCompression {
    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c','c','c' };
        int result = compress(chars);
        System.out.println(result);

    }

    public static int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                for (char ch : Integer.toString(count).toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}
