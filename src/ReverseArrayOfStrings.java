import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] characters = scanner.nextLine().split(" ");


        for (int i = 0; i < characters.length/2; i++) {
            int otherIndex = characters.length - 1 - i;
            String currentNumber = characters[i];
            characters[i] = characters[otherIndex];
            characters[otherIndex] = currentNumber;
        }

        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }
    }
}
