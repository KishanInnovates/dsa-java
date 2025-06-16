public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[][] grid = { { 1, 3 },
                { 2, 2 } };
        int[] result = findMissingAndRepeating(grid);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }

    public static int[] findMissingAndRepeating(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1];

        int missing = -1, repeating = -1;

        for (int[] row : grid) {
            for (int num : row) {
                count[num]++;
            }
        }

        for (int i = 1; i <= size; i++) {
            if (count[i] == 2) {
                repeating = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }
        return new int[] { repeating, missing };
    }
}
