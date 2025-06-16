public class MyAtoi {
    public static void main(String[] args) {

    }
    public int myAtoi(String s) {
        int idx = 0, sign = 1;
        long res = 0;

        while (idx < s.length() && s.charAt(idx) == ' ') idx++;

        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            sign = (s.charAt(idx++) == '-') ? -1 : 1;
        }

        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            res = res * 10 + (s.charAt(idx++) - '0');

            if (res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int)(res * sign);
    }
}

