public class CountingSort {
    public static void main(String[] args) {
             String str1 = "edsab";
        System.out.println(countSort(str1));
    }

    public static String countSort(String arr) {
        int[] count = new int[26];

        for (char ch : arr.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sortedString.append((char) (i + 'a'));
                count[i]--;

            }
        }
        return sortedString.toString();
    }
}
