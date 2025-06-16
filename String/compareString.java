import java.util.Objects;

class compareString{
    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        String str = word1.toString();
        String str1 = word2.toString();
        if(!Objects.equals(str, str1)){
            System.out.println("Yes");
        }else{
            System.out.println("false");
        }

    }
}