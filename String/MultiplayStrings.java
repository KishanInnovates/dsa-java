public class MultiplayStrings {
    public static void main(String[] args) {
        String s = "123";
        String m = "456";
        System.out.println(multiply(s, m));
    }

    public static String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();

        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int multi = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = multi + result[i + j + 1];
                result[i + j] += sum / 10;
                result[i + j + 1] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
