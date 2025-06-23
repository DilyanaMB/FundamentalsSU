import java.util.Scanner;

public class RefactorSpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbersToIterate = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= numbersToIterate; i++) {
            int number = 0;
            int digit = i;
            while (i > 0) {
                number += i % 10;
                i /= 10;
            }
            boolean isSpecial = number == 5 || number == 7 || number == 11;
            if (isSpecial) {
                System.out.printf("%d -> True%n", digit, isSpecial);
            } else {
                System.out.printf("%d -> False%n", digit, isSpecial);
            }
            i = digit;
        }
    }
}
