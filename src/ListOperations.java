import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("End")) {
            List<String> commandSet = Arrays.stream(input.split("\\s+"))
                    .collect(Collectors.toList());
            String command = commandSet.get(0);

            switch (command) {
                case "Add":
                    int number = Integer.parseInt(commandSet.get(1));
                    addNumberToList(numbers, number);
                    break;
                case "Insert":
                    number = Integer.parseInt(commandSet.get(1));
                    int index = Integer.parseInt(commandSet.get(2));
                    insertNumberToList(numbers, number, index);
                    break;
                case "Remove":
                    number = Integer.parseInt(commandSet.get(1));
                    removeNumberFromList(numbers, number);
                    break;
                case "Shift":
                    String position = commandSet.get(1);
                    number = Integer.parseInt(commandSet.get(2));
                    shiftNumberInList(numbers, position, number);
                    break;
            }

            input = sc.nextLine();
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }

    }

    public static void addNumberToList(List<Integer> numbers, int number) {
        numbers.add(number);
    }

    public static void insertNumberToList(List<Integer> numbers, int number, int index) {
        if(index>=0 && index<=numbers.size()-1) {
            numbers.add(index, number);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void removeNumberFromList(List<Integer> numbers, int index) {
        if (numbers.size() > index && index>=0) {
            numbers.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void shiftNumberInList(List<Integer> numbers, String position, int number) {
        if (position.equals("left")) {
            while (number > 0) {
                int temp = numbers.get(0);
                numbers.remove(0);
                numbers.add(temp);
                number--;
            }
        } else {
            while (number > 0) {
                int temp = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(0, temp);
                number--;
            }
        }
    }
}
