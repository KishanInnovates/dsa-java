import java.util.ArrayList;
import java.util.List;

public class popCups {
    public static void main(String[] args) {
        List<String> cups = new ArrayList<>();
        cups.add("Red");
        cups.add("Blue");
        cups.add("Green");
        cups.add("Yellow");

        String choice = "Green";

        pop(cups, choice);
    }

    public static void pop(List<String> cups, String choice) {
        if(cups.contains(choice)){
            int position = cups.indexOf(choice);
            System.out.println(position);

            for (int i = 0; i <= position; i++) {
                cups.remove(0);
            }
            System.out.println(cups.size());
        } else {
            System.out.println(0);
            System.out.println(0);
        }
    }
}
