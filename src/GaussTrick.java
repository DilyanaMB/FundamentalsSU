import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        sumAndArrangeNumbers(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void sumAndArrangeNumbers(List<Integer> numbers) {
        int indexToRemove = numbers.size() - 1;
        int size = numbers.size();
        for (int i = 0; i <= numbers.size() / 2; i++) {
            if (size % 2 != 0 && i == numbers.size() / 2) {
                break;
            }
            int a = numbers.get(i);
            int b = numbers.get(indexToRemove);
            numbers.set(i, a + b);
            numbers.remove(indexToRemove);
            indexToRemove--;
        }
    }
}
