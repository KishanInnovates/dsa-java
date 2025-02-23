public class Sequence {
    public static void main(String[] args) {
        
    }

    public static boolean isSequence(int a, int b, int c) {
        return ((b - a) % c == 0 && (b - a) / c >= 0) ? 1 : 0;
    }
}
