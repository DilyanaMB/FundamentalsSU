import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleWaiting = Integer.parseInt(sc.nextLine());
        int[] lift = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int wagonCapacity = 4;

        for (int i = 0; i < lift.length; i++) {
            int freeSpace = wagonCapacity - lift[i];
            if (peopleWaiting <= freeSpace) {
                lift[i] = lift[i] + peopleWaiting;
                peopleWaiting = 0;
            } else {
                lift[i] = lift[i] + freeSpace;
                peopleWaiting -= freeSpace;
            }

            if (peopleWaiting == 0) {
                boolean isEmptySpaces = false;
                // TODO: Can refactor this -> last iteration for finding empty spaces can be included in the previous loop
                for (int j = 0; j < lift.length; j++) {
                    if (lift[j] < 4) {
                        isEmptySpaces = true;
                        break;

                    }
                }
                if (isEmptySpaces) {
                    System.out.println("The lift has empty spots!");
                }
                for (int n : lift) {
                    System.out.print(n + " ");
                }
                return;
            }
        }
        if (peopleWaiting > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleWaiting);
            for (int n : lift) {
                System.out.print(n + " ");
            }
        }
    }
}
