class PlusMinus{
    public static void main(String[] args) {

    }
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
     int n = arr.size();
        int positives = 0, negatives = 0, zeros = 0;
        for(int i = 0; i < n; i++){
             if (arr.get(i) > 0) {
                positives++;
            } else if (arr.get(i) < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }
        double positiveRatio = (double) positives / n;
        double negativeRatio = (double) negatives / n;
        double zeroRatio = (double) zeros / n;

        // Print ratios with six decimal places
        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);
        
    }

}