public class LongPressedName {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";
        boolean result = longPressed(name, typed);
        System.out.println(result);
    }

    public static boolean longPressed(String name, String typed) {
        int i = 0;

        for (int j = 0; j < typed.length(); j++) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
        }
        return i == name.length();
    }
}
