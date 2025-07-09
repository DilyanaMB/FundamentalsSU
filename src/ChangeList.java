import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = sc.nextLine();

        while (!input.equals("end")) {
            List<String> commands = Arrays.stream(input.split("\\s+"))
                    .collect(Collectors.toList());

            switch (commands.get(0)) {
                case "Delete":
                    int element = Integer.parseInt(commands.get(1));
                    deleteElement(numbers, element);
                    break;
                case "Insert":
                    element = Integer.parseInt(commands.get(1));
                    int index = Integer.parseInt(commands.get(2));
                    insertAtIndex(numbers, element, index);
                    break;
            }
            input = sc.nextLine();
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }

    public static void deleteElement(List<Integer> numbers, int element) {
        int i=0;
        while(numbers.contains(element)){
            int index = numbers.indexOf(element);
            numbers.remove(index);
        }
    }

    public static void insertAtIndex(List<Integer> numbers, int element, int index) {
        numbers.add(index, element);
    }
}
