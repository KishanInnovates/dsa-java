public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "kishan";
        boolean result = isPalindrome(s);
        boolean result1 = isPalindrome(s1);
        System.out.println(result);
        System.out.println(result1);
    }

    public static boolean isPalindrome(String s) {
        String cleaString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = cleaString.length() - 1;
        while (left < right) {
            if (cleaString.charAt(left) != cleaString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
