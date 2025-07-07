import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        String operator = sc.nextLine();
        double b = Double.parseDouble(sc.nextLine());
        DecimalFormat df = new DecimalFormat("#.##");

        switch (operator) {
            case "/":
                System.out.printf(df.format(divide(a, b)));
                break;
            case "*":
                System.out.printf(df.format(multiply(a, b)));
                break;
            case "-":
                System.out.printf(df.format(subtract(a, b)));
                break;
            case "+":
                System.out.printf(df.format(add(a, b)));
                break;
        }
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
