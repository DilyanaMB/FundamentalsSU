import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        removeAllNegativeNumbers(numbers);

        printInReverseList(numbers);
    }

    public static void removeAllNegativeNumbers(List<Integer> numbers) {
        int index = numbers.size() - 1;
        while (index >= 0) {
            if (numbers.get(index) < 0) {
                numbers.remove(index);
            }
            index--;
        }
    }

    public static void printInReverseList(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("empty");
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers.get(i) + " ");
            } else {
                System.out.println(numbers.get(i));
            }
        }
    }
}
