import java.util.List;
public class ApplesAndOranges {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
        int countApples = 0;
        int countOranges = 0;

        for (int apple : apples) {
            int landing = apple + a;
            if (landing >= s && landing <= t) {
                countApples++;
            }
        }

        for (int orange : oranges) {
            int landing = orange + b;
            if (landing >= s && landing <= t) {
                countOranges++;
            }
        }
        System.out.println(countApples);
        System.out.println(countOranges);
    }
}
