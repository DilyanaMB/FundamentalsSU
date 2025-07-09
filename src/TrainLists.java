import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int capacity = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();

        while (!input.equals("end")) {
            List<String> inputValues = Arrays.stream(input.split("\\s+"))
                    .collect(Collectors.toList());

            if (inputValues.size() > 1) {
                wagons.add(Integer.parseInt(inputValues.get(1)));
            } else {
                int passengers = Integer.parseInt(input);

                for (int i = 0; i < wagons.size(); i++) {
                    if (passengers + wagons.get(i) <= capacity) {
                        wagons.set(i, wagons.get(i)+passengers);
                        break;
                    }
                }

            }
            input = sc.nextLine();
        }

        for (int w : wagons) {
            System.out.print(w + " ");
        }
    }
}
