import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                System.out.printf("%s is boolean type\n", input);
            } else if (input.matches("-?([1-9]\\d*|0)")) {
                System.out.printf("%s is integer type\n", input);
            } else if (input.matches("-?((\\d+\\.\\d+)|(\\d+\\.)|(\\.\\d+))")) {
                System.out.printf("%s is floating point type\n", input);
            } else if (input.length() == 1 && !Character.isDigit(input.charAt(0))) {
                System.out.printf("%s is character type\n", input);
            } else {
                System.out.printf("%s is string type\n", input);
            }
            input = scanner.nextLine();
        }

//        while (!type.equals("END")) {
//            Scanner input = new Scanner(type);
//            if (input.hasNextBoolean()) {
//                System.out.printf("%s is boolean type%n", type);
//            } else if (input.hasNextInt()) {
//                System.out.printf("%s is integer type%n", type);
//            } else if (type.length() == 1) {
//                System.out.printf("%s is character type%n", type);
//            } else if (input.hasNextDouble()) {
//                System.out.printf("%s is floating point type%n", type);
//            } else if (input.hasNextLine()) {
//                System.out.printf("%s is string type%n", type);
//            }
//            type = scanner.nextLine();
//        }
    }
}