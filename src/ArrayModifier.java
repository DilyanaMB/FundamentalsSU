import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] commandParts = input.split("\\s+");
            switch (commandParts[0]) {
                case "swap":
                    int numberAtIndex1 = 0;
                    int numberAtIndex2 = 0;

                    for (int i = 0; i < numbers.length; i++) {
                        if (i == Integer.parseInt(commandParts[1])) {
                            numberAtIndex1 = numbers[i];
                        } else if (i == Integer.parseInt(commandParts[2])) {
                            numberAtIndex2 = numbers[i];
                        }
                    }
                    for (int i = 0; i < numbers.length; i++) {
                        if (i == Integer.parseInt(commandParts[1])) {
                            numbers[i] = numberAtIndex2;
                        } else if (i == Integer.parseInt(commandParts[2])) {
                            numbers[i] = numberAtIndex1;
                        }
                    }
                    break;
                case "multiply":
                    int number1 = 0;
                    int number2 = 0;

                    for (int i = 0; i < numbers.length; i++) {
                        if (i == Integer.parseInt(commandParts[1])) {
                            number1 = numbers[i];
                        } else if (i == Integer.parseInt(commandParts[2])) {
                            number2 = numbers[i];
                        }
                    }
                    int sum = number1 * number2;

                    for (int i = 0; i < numbers.length; i++) {
                        if (i == Integer.parseInt(commandParts[1])) {
                            numbers[i] = sum;
                        }
                    }
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] - 1;
                    }
                    break;
            }
            input = sc.nextLine();
        }

        for (int i = 0; i <numbers.length-1 ; i++) {
            System.out.print(numbers[i] + ", ");
        }
            System.out.print(numbers[numbers.length-1]);
    }
}
