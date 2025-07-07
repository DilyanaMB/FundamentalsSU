import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (!input.equals("END")) {
            System.out.println(isPalindrome(input));
            input = sc.nextLine();
        }
    }

    public static boolean isPalindrome(String str) {
        int indexOfOppositeSide = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(indexOfOppositeSide)) {
                if (i >= str.length() / 2) {
                    break;
                }
                indexOfOppositeSide--;
            } else {
                return false;
            }

        }
        return true;
    }
}
