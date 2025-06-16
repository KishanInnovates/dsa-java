public class WorldChessChampionship {
    public static void main(String[] args) {
        //https://www.codechef.com/practice/course/strings/STRINGS/problems/WCC
        int x = 100;
        String s = "CCCCCCCC";
        System.out.println(win(s, x));
    }

    public static int win(String s, int x) {
        int c = 0, n = 0, d = 0;
        for (int i = 0; i < s.length(); i++) {
            char outcome = s.charAt(i);
            if (outcome == 'C') {
                c++;
            } else if (outcome == 'N') {
                n++;
            } else if (outcome == 'D') {
                d++;
            }
        }
        int carlsenPoint;
        int cPoint = 2 * c + d;
        int nPoint = 2 * n + d;
        if (cPoint > nPoint) {
            carlsenPoint = 60 * x;
        } else if (cPoint < nPoint) {
            carlsenPoint = 40 * x;
        } else {
            carlsenPoint = 55 * x;
        }
        return carlsenPoint;
    }
}
