public class Rotate {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(isRotated(s, goal));

    }

    public static boolean isRotated(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String concatenated = s + s;

        return concatenated.contains(goal);
    }
}
