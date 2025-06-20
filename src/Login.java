import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        StringBuilder password = new StringBuilder();
        boolean isBlocked = false;

        for (int i = username.length() - 1; i >= 0; i--) {
            password.append(username.charAt(i));
        }

        String input = sc.nextLine();
        int wrongAttempts = 0;

        while (!input.equals(password.toString())) {
            wrongAttempts++;
            if (wrongAttempts > 3) {
                System.out.printf("User %s blocked!", username);
                isBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = sc.nextLine();
        }
        if (!isBlocked) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
