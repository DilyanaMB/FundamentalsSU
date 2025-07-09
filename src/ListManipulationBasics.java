import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = sc.nextLine();

        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];
            int number = Integer.parseInt(input.split("\\s+")[1]);
            switch (command) {
                case "Add":
                    addNumberToList(numbers, number);
                    break;
                case "Remove":
                    removeNumberFromList(numbers, number);
                    break;
                case "RemoveAt":
                    removeAtIndexFromList(numbers, number);
                    break;
                case "Insert":
                    insertAtIndexToList(numbers, number, Integer.parseInt(input.split("\\s+")[2]));
                    break;
            }
            input = sc.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void addNumberToList(List<Integer> numbers, int number) {
        numbers.add(number);
    }

    public static void removeNumberFromList(List<Integer> numbers, int number) {
        for (int i = 0; i < numbers.size(); i++) {
            if(number == numbers.get(i)){
                numbers.remove(i);
                return;
            }
        }
    }

    public static void removeAtIndexFromList(List<Integer> numbers, int index) {
        numbers.remove(index);
    }

    public static void insertAtIndexToList(List<Integer> numbers, int number, int index) {
        numbers.add(index, number);
    }
}
