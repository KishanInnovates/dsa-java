import java.util.ArrayList;
import java.util.List;
class BreakingRecord {
    public static void main(String[] args) {
        
    }
    //https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
    public static List<Integer> breaking(List<Integer> scores) {
        int maxScore = scores.get(0);
        int minScore = scores.get(0);
        int minCount = 0, maxCount = 0;

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > maxScore) {
                maxScore = scores.get(i);
                maxCount++;
            } else if (scores.get(i) < minScore) {
                minScore = scores.get(i);
                minCount++;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(maxCount);
        result.add(minCount);
        return result;
    }
}
