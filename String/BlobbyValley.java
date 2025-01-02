public class BlobbyValley {

    public static void main(String[] args) {
        String s = "A";
        scoreCalculate(s);
        
    }

    public static void scoreCalculate(String s) {
        int aliceScore = 0;
        int bobScore = 0;
        char currentSurver = 'A';

        for (char winner : s.toCharArray()) {
            if(winner == currentSurver){
                if (currentSurver == 'A') {
                    aliceScore++;
                } else {
                    bobScore++;
                }
            } else {
                currentSurver = winner;
            }
        }
        System.out.print(aliceScore + " " + bobScore);
    }
}