import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        Random rnd = new Random();
        for (int i = 0; i < words.size(); i++) {
            int pos2 = rnd.nextInt(words.size());
            String tempWord = words.get(i);
            words.set(i,words.get(pos2));
            words.set(pos2, tempWord);
        }

        System.out.println(String.join(System.lineSeparator(),words));
    }
}