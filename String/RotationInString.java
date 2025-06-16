public class RotationInString {
    public static void main(String[] args) {
         String a = "amazon";
        String b1 = "azonam"; // Anti-clockwise rotation
        String b2 = "onamaz"; // Clockwise rotation

        System.out.println(isRotated(a, b1)); // Output: 1
        System.out.println(isRotated(a, b2)); // Output: 1
        System.out.println(isRotated(a, "mazona")); // Output: 0
    }

    public static boolean isRotated(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String clockwiseRotated = str1.substring(str1.length() - 2) + str1.substring(0, str1.length() - 2);

        String anticolckwiseRotated = str1.substring(2) + str1.substring(0, 2);

        if (str2.equals(anticolckwiseRotated) || str2.equals(clockwiseRotated)) {
            return true;
        } else {
            return false;
        }
    }
}
