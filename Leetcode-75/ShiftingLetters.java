public class ShiftingLetters {
    public static void main(String[] args) {
        String str = "abc";
        int[][] shifts1 = {{0, 1, 0}, {1, 2, 1}, {0, 2, 1}};
        System.out.println(shiftingLetters(str, shifts1));
    }
    //https://leetcode.com/problems/shifting-letters-ii/description/?envType=daily-question&envId=2025-01-05
    public static String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            if (direction == 1) {
                diff[start] += 1;
                diff[end + 1] -= 1;
            } else {
                diff[start] -= 1;
                diff[end + 1] += 1;
            }
        }
        int[] commulativeShifts = new int[n];
        int currentShit = 0;
        for (int i = 0; i < n; i++) {
            currentShit += diff[i];
            commulativeShifts[i] = currentShit;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int shift = commulativeShifts[i];
            shift = (shift % 26 + 26) % 26;
            char newChar = (char) ('a' + (c - 'a' + shift) % 26);
            result.append(newChar);
        }
        return result.toString();
    }
}
