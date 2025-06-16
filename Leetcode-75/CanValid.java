public class CanValid {
    public static void main(String[] args) {
        String s = "()";
        String locked = "11";
        System.out.println(canValid(s, locked));
    }

    public static boolean canValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0)
            return false;
        
        int unlocked = 0, opening = 0, closing = 0;
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0')
                unlocked++;
            else if (s.charAt(i) == '(')
                opening++;
            else
                closing++;

            if (closing > opening + unlocked)
                return false;
        }

        unlocked = 0;
        opening = 0;
        closing = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0')
                unlocked++;
            else if (s.charAt(i) == '(')
                opening++;
            else
                closing++;

            if (opening > opening + unlocked)
                return false;
        }
        return true;
    }
}
