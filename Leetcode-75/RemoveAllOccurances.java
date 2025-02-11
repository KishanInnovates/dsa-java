public class RemoveAllOccurances {
    public static void main(String[] args) {
        String s = "daabcbaabcbc", part = "abc";
        System.out.println(removeOccurances(s, part));
    }

    public static String removeOccurances(String s, String part) {
        StringBuilder result = new StringBuilder(s);
        int partLength = part.length();

        while (result.indexOf(part) != -1) {
            int index = result.indexOf(part);
            result.delete(index, index + partLength);
        }
        return result.toString();
    }
}
