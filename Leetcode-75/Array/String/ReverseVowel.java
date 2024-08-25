class ReverseVowel{
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!isVowel(chars[left])) {
                left++;
                continue;
            }
            if (!isVowel(chars[right])) {
                right--;
                continue;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}