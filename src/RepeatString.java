import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int repetitions = Integer.parseInt(sc.nextLine());

        repeatString(input, repetitions);
    }

    public static void repeatString(String input, int repetitions){
        for (int i = 0; i < repetitions; i++) {
            System.out.print(input);
        }
    }
}
