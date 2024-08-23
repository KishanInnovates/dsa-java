import java.util.ArrayList;

public class ExtraCandy {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        ArrayList<Boolean> result = kidsWithCandis(candies, extraCandies);
        for (Boolean i : result) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Boolean> kidsWithCandis(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }
}
