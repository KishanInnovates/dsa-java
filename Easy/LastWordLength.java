public class LastWordLength {
    public static void main(String[] args) {
        String s = " kishan gupta ";
        System.out.println(s.trim());
        System.out.println(length(s));
    }
    public static int length(String s){
        s = s.trim();

        int lastSpaceIndex = s.lastIndexOf(' ');

        String lastWord = s.substring(lastSpaceIndex + 1);
        return lastWord.length();
    }
}
