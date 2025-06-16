public class Kangaroo {
    public static void main(String[] args) {
        System.out.println(count(0, 3, 4, 2)); //output : Yes
    }

    public static String count(int x1, int v1, int x2, int v2) {
        int distance = x2 - x1;
        int velocity = v1 - v2;

        if (velocity == 0) {
            return (distance == 0) ? "Yes" : "No";
        }

        if (distance % velocity == 0 && (distance / velocity) > 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
