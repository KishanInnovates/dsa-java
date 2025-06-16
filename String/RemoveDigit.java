public class RemoveDigit {
    public static void main(String[] args) {
        String number = "1231";
        char digit = '1';
        String result = removeDigit(number, digit);
        System.out.println("The answer will be: " + result);
    }
    //https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/description/

    public static String removeDigit(String number, char digit) {
        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) == digit && number.charAt(i) < number.charAt(i + 1)) {
                return number.substring(0, i) + number.substring(i + 1);
            }
        }
        int index = number.lastIndexOf(digit);
        return number.substring(0, index) + number.substring(index + 1);
    }
}
