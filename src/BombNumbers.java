import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> bombsSettings = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int bomb = bombsSettings.get(0);
        int power = bombsSettings.get(1);

        while (numbers.contains(bomb)) {
            int bombIndex = numbers.indexOf(bomb);
            int left = Math.max(0, bombIndex - power);
            int right = Math.min(numbers.size() - 1, bombIndex + power);
            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}