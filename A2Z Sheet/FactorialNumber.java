import java.util.ArrayList;

public class FactorialNumber {
    public static void main(String[] args) {

    }

    public static ArrayList<Long> factorial(long n) {
        ArrayList<Long> result = new ArrayList<>();
        long factorial = 1;
        int i = 1;
        while (factorial <= n) {
            result.add(factorial);
            i++;
            factorial *= i;
        }
        return result;
    }
}
