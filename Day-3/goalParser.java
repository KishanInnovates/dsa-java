import java.util.Scanner;

public class goalParser {
    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                result.append('G');
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result.append('o');
                i += 2;
            } else if (command.startsWith("(al)", i)) {
                result.append("al");
                i += 4;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        // String command1 = "G()(al)";
        // System.out.println(interpret(command1));  // Output: "Goal"

        // String command2 = "G()()()()(al)";
        // System.out.println(interpret(command2));  // Output: "Gooooal"

        // String command3 = "(al)G(al)()()G";
        // System.out.println(interpret(command3));  // Output: "alGalooG"
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scn.nextLine();
        System.out.println(interpret(name));
    }
}
