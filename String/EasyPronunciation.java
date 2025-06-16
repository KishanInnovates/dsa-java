public class EasyPronunciation {
    public static void main(String[] args) {
        String s = "tryst";
        int n = 5;
        System.out.println(easyPronunciation(s, n));
    }

    public static String easyPronunciation(String s, int n) {
        int count = 0;
        if (n < 4) {
            return "Yes";
        }
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count = 0;
            } else {
                count++;
                if (count == 4) {
                    break;
                }
            }
        }
        return count >= 4 ? "No" : "Yes";
    }
}
