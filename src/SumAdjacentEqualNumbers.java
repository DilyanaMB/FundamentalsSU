import java.text.DecimalFormat;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        DecimalFormat df = new DecimalFormat("0.##");

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i)+numbers.get(i));
                numbers.remove(numbers.get(i + 1));
                i--;
            }
        }

        for (Double number : numbers) {
            System.out.print(df.format(number) + " ");
        }
    }
}