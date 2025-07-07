import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(countVowels(input));
    }

    public static int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.toLowerCase().charAt(i) == 'a' || input.toLowerCase().charAt(i) == 'e' ||
                    input.toLowerCase().charAt(i) == 'i' || input.toLowerCase().charAt(i) == 'o' || input.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
