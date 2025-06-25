import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        //TODO: Fix this task it doesn't work correctly
        for (int i = 0; i < lines; i++) {
            String input = sc.nextLine();
            int firstSpaceIndex = input.indexOf(' ');
            long firstNumber = Long.parseLong(input.substring(0, firstSpaceIndex));
            long secondNumber = Long.parseLong(input.substring(firstSpaceIndex + 1));
            long sumOfRightDigits = 0;
            long sumOfLeftDigits = 0;
            long firstNumberOriginal = firstNumber;
            long secondNumberOriginal = secondNumber;

            for (int j = 0; j < firstSpaceIndex; j++) {
                long temp = firstNumber % 10;
                sumOfRightDigits += temp;
                firstNumber /= 10;
            }

            for (int j = firstSpaceIndex; j < input.length(); j++) {
                long temp = secondNumber % 10;
                sumOfLeftDigits += temp;
                secondNumber /= 10;
            }

            if (firstNumberOriginal > secondNumberOriginal) {
                System.out.println(sumOfRightDigits);
            } else {
                System.out.println(sumOfLeftDigits);
            }

        }
    }
}
