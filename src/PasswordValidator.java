import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        checkIfValidPassword(password);
    }

    public static void checkIfValidPassword(String password) {
        boolean isBetween6And10Chars = false;
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        } else {
            isBetween6And10Chars = true;
        }
        int digitCount = 0;
        boolean isOnlyLettersAndDigits = true;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("Password must consist only of letters and digits");
                isOnlyLettersAndDigits = false;
                break;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount >= 2 && isOnlyLettersAndDigits && isBetween6And10Chars) {
            System.out.println("Password is valid");
        } else if (digitCount < 2) {
            System.out.println("Password must have at least 2 digits");

        }
    }
}
