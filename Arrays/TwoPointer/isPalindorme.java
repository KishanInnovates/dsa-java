class isPalindorme {
    public static void main(String[] args) {

    }
    //O(n) space because of the string i created, and O(n) time for single pass
    public static boolean isPalindorme(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0, right = s.length();
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }
    
}
