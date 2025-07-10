import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> deck1 = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> deck2 = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!deck1.isEmpty() && !deck2.isEmpty()) {
            if (deck1.get(0) > deck2.get(0)) {
                deck1.add(deck1.get(0));
                deck1.add(deck2.get(0));
                deck1.remove(0);
                deck2.remove(0);
            } else if (deck2.get(0) > deck1.get(0)) {
                deck2.add(deck2.get(0));
                deck2.add(deck1.get(0));
                deck2.remove(0);
                deck1.remove(0);
            } else {
                //when cards are the same
                deck1.remove(0);
                deck2.remove(0);
            }
        }

        if (deck1.size() != 0) {
            int sum = deck1.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum = deck2.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
