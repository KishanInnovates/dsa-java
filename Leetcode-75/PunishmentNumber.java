public class PunishmentNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(punishmentNumber(n));
    }

    public static int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(String.valueOf(square), 0, i)) {
                sum += square;
            }
        }
        return sum;
    }

    public static boolean canPartition(String s, int index, int target) {
        if (index == s.length()) {
            return target == 0;
        }
        int num = 0;
        for (int i = index; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num > target) {
                return false;
            }
            if (canPartition(s, i + 1, target - num)) {
                return true;
            }
        }
        return false;
    }
}
