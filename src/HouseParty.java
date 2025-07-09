import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commandsCount = Integer.parseInt(sc.nextLine());
        List<String> people = new ArrayList<>();

        for (int i = 0; i < commandsCount; i++) {
            List<String> commands = Arrays.stream(sc.nextLine().split("\\s+"))
                    .collect(Collectors.toList());
            String name = commands.get(0);

            if (commands.get(2).equals("not")) {
                if (people.contains(name)) {
                    people.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            } else {
                if (!people.contains(name)) {
                    people.add(name);
                } else {
                    System.out.println(name + " is already in the list!");
                }
            }
        }
        for (String p : people) {
            System.out.println(p);
        }
    }
}
