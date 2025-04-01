public class WayTooLong {
    public static void main(String[] args) {
        String s = "localization";
        wayTooLong(s);
    }

    public static void wayTooLong(String s) {
        if (s.length() > 10) {
            int len = s.length() - 2;
            System.out.println(s.charAt(0) + s.valueOf(len) + s.charAt(s.length() - 1));
        } else {
            System.out.println(s);
        }
    }
}
