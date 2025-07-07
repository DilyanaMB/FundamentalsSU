import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        //Todo: make int sum and assign the sum to it and then print only once after the switch

        switch (command) {
            case "add":
                System.out.println(addNumbers(a, b));
                break;
            case "subtract":
                System.out.println(subtractNumbers(a, b));
                break;
            case "multiply":
                System.out.println(multiplyNumbers(a, b));
                break;
            case "divide":
                System.out.println(divideNumbers(a, b));
                break;
        }
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static int subtractNumbers(int a, int b) {
        return a - b;
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
