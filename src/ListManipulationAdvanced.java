import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = sc.nextLine();

        while (!input.equals("end")) {
            List<String> inputValues = Arrays.stream(input.split("\\s+"))
                    .collect(Collectors.toList());
            String command = inputValues.get(0);

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(inputValues.get(1));
                    if (containsNumberInList(numbers, number)) {
                        System.out.print("Yes");
                    } else {
                        System.out.print("No such number");
                    }
                    break;
                case "Print":
                    if (inputValues.get(1).equals("even")) {
                        printEvenNumbers(numbers);
                    } else {
                        printOddNumbers(numbers);
                    }
                    break;
                case "Get":
                    printSumOfElements(numbers);
                    break;
                case "Filter":
                    String condition = inputValues.get(1);
                    number = Integer.parseInt(inputValues.get(2));
                    printAllFilteredNumbers(numbers, condition, number);
                    break;

            }
            System.out.println();
            input = sc.nextLine();
        }
    }

    public static boolean containsNumberInList(List<Integer> numbers, int number) {
        return numbers.contains(number);
    }

    public static List<Integer> separateListToEvenAndOdd(List<Integer> numbers, String evenOrOdd) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evenNumbers.add(numbers.get(i));
            } else {
                oddNumbers.add(numbers.get(i));
            }
        }

        if (evenOrOdd.equals("even")) {
            return evenNumbers;
        } else {
            return oddNumbers;
        }
    }

    public static void printEvenNumbers(List<Integer> numbers) {
        printList(separateListToEvenAndOdd(numbers, "even"));
    }

    public static void printOddNumbers(List<Integer> numbers) {
        printList(separateListToEvenAndOdd(numbers, "odd"));
    }

    public static void printSumOfElements(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.print(sum);
    }

    public static void printList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + " ");
            }
        }

    }

    public static void printAllFilteredNumbers(List<Integer> numbers, String condition, int number) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            switch (condition) {
                case "<":
                    if (numbers.get(i) < number) {
                        filteredNumbers.add(numbers.get(i));
                    }
                    break;
                case ">":
                    if (numbers.get(i) > number) {
                        filteredNumbers.add(numbers.get(i));
                    }
                    break;
                case "<=":
                    if (numbers.get(i) <= number) {
                        filteredNumbers.add(numbers.get(i));
                    }
                    break;
                case ">=":
                    if (numbers.get(i) >= number) {
                        filteredNumbers.add(numbers.get(i));
                    }
                    break;
            }
        }

        printList(filteredNumbers);
    }
}
