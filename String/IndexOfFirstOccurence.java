public class IndexOfFirstOccurence {
    public static void main(String[] args) {
            
    }
    public static int index(String haystack, String needle){
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= (haystackLength - needleLength); i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
