class TimeConversion{
    public static void main(String[] args) {
        String str = "12:01:00AM";
        System.out.println("The converted time will be: " +conversion(str));
    }
    // https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
    public static String conversion(String s) {
        String period = s.substring(s.length() - 2);
        int hour = Integer.parseInt(s.substring(0, 2));
        String minute = s.substring(3, 5);
        String second = s.substring(6, 8);

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }
        return String.format("%02d:%s:%s", hour, minute, second);
    }
}