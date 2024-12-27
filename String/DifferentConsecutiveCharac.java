public class DifferentConsecutiveCharac {
    public static void main(String[] args) {
        String str = "11";
        int result = count(str);
        System.out.println(result);
    }
    public static int count(String str){
        int operations = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                operations++;
            }
        }
        return operations;
    }
}
