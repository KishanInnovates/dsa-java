
public class decimalToBinary {
    public static void main(String[] args) {

    }

    public static String conversion(int decimal) {
        if (decimal == 0)
            return "0";

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal = decimal / 2;
        }
        return binary.reverse().toString();
    }

    public static String bitManipulation(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(decimal & 1);
            decimal >>= 1;
        }
        return binary.reverse().toString();
    }
}
