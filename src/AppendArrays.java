import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arrays = Arrays.stream(sc.nextLine().split("\\|"))
                .collect(Collectors.toList());
        List<Integer> orderedList = new ArrayList<>();

        for (int i = arrays.size() - 1; i >= 0; i--) {
            String input =arrays.get(i).trim();
            if(input.isEmpty()){
                continue;
            }
            List<Integer> valuesInArray = Arrays.stream(arrays.get(i).trim().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            for (int j = 0; j < valuesInArray.size(); j++) {
                orderedList.add(valuesInArray.get(j));
            }
        }

        for (int o : orderedList) {
            System.out.print(o + " ");
        }
    }
}
