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

        int sumOfElements=0;
        for (int i = 0; i < distances.size(); i++) {
            int index = Integer.parseInt(sc.nextLine());
            if(distances.isEmpty()){
                System.out.println(sumOfElements);
                break;
            }
            if (index < 0) {
                int lastElement = distances.get(distances.size() - 1);
                sumOfElements+=distances.get(0);
                distances.remove(0);
                distances.add(0, lastElement);
            } else if (index > distances.size() - 1) {
                int firstElement = distances.get(0);
                sumOfElements+=distances.get(distances.size()-1);
                distances.remove(distances.size()-1);
                distances.add(distances.size()-1,firstElement);
            } else {
                int valueToAdd = distances.get(index);
                sumOfElements+=distances.get(index);
                distances.remove(index);
                increaseAllElements(distances, valueToAdd);
            }
        }

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
