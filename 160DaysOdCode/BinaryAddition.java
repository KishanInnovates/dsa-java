class BinaryAddition {
    public static void main(String[] args) {

         String s1 = "1101";
        String s2 = "111";
        System.out.println(addBinary(s1, s2)); // Output: 10100

        String s1_2 = "00100";
        String s2_2 = "010";
        System.out.println(addBinary(s1_2, s2_2)); // Output: 110
    }

    public static String addBinary(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }
        String binaryResult = result.reverse().toString();
        return binaryResult.replaceFirst("^0+(?!$)", "");

    }
}
