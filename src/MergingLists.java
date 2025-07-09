import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers1 = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> combinedNumbers = new ArrayList<>();
        int iterateToBiggerSize = numbers1.size()+numbers2.size();

        if(numbers1.size()<numbers2.size()){
            iterateToBiggerSize=numbers2.size();
        } else {
            iterateToBiggerSize=numbers1.size();
        }

        for (int i = 0; i < iterateToBiggerSize; i++) {

            if(i<numbers1.size() && i<numbers2.size()) {
                combinedNumbers.add(numbers1.get(i));
                combinedNumbers.add(numbers2.get(i));
            } else if(i<numbers1.size()){
                combinedNumbers.add(numbers1.get(i));
            } else {
                combinedNumbers.add(numbers2.get(i));
            }
        }

        for (int n: combinedNumbers){
            System.out.print(n + " ");
        }
    }
}
