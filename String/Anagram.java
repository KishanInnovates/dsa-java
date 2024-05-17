import java.util.Arrays;

class Anagram{
    public static void main(String[] args) {
        String name = "kishan";
        String name1 = "khan";
        boolean result = isAnagram(name, name1);
        System.out.println(result);
    }
    public static boolean isAnagram(String a, String b){
        if (a.length() != b.length())
            return false;
        
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        return Arrays.equals(charArrayA, charArrayB);
    }
}