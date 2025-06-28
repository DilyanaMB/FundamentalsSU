import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wagonsCount = Integer.parseInt(sc.nextLine());
        int[] peopleInWagons = new int[wagonsCount];
        int sum = 0;

        for (int i = 0; i < wagonsCount; i++) {
            peopleInWagons[i] = Integer.parseInt(sc.nextLine());
            sum += peopleInWagons[i];
        }

        for (int i = 0; i < wagonsCount; i++) {
            System.out.print(peopleInWagons[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
