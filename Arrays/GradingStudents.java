import java.util.ArrayList;

public class GradingStudents {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> gradingStudents(ArrayList<Integer> grades) {
        int n = grades.size();
        for (int i = 0; i < n; i++) {
            if (grades.get(i) >= 38) {
                int nextmutiple = ((grades.get(i) / 5) + 1) * 5;
                if (nextmutiple - grades.get(i) < 3) {
                    grades.set(i, nextmutiple);
                }
            }
        }
        return grades;
    }
}
