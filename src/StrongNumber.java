import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result =result* i;
        }
    }
}
