import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> distances = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumOfElements = 0;

        while (!distances.isEmpty()) {
            int index = Integer.parseInt(sc.nextLine());
            int removedValue;

            if (index < 0) {
                removedValue = distances.get(0);
                sumOfElements += removedValue;
                distances.remove(0);
                distances.add(0, distances.get(distances.size() - 1));
                increaseAllElements(distances, removedValue);
            } else if (index > distances.size() - 1) {
                removedValue = distances.get(distances.size() - 1);
                sumOfElements += removedValue;
                distances.remove(distances.size() - 1);
                distances.add(distances.get(0));
                increaseAllElements(distances, removedValue);
            } else {
                removedValue = distances.get(index);
                sumOfElements += removedValue;
                distances.remove(index);
                increaseAllElements(distances, removedValue);
            }
        }
        System.out.println(sumOfElements);
    }

    public static void increaseAllElements(List<Integer> distances, int value) {
        for (int i = 0; i < distances.size(); i++) {
            if (distances.get(i) <= value) {
                distances.set(i, distances.get(i) + value);
            } else {
                distances.set(i, distances.get(i) - value);
            }
        }
    }
}