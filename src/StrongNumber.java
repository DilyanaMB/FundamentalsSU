import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sumOfFactorials = 0;
        String digit = "" + n;

        for (int a = 0; a < digit.length(); a++) {
            int result = 1;
            int digitAsNum = Integer.parseInt(String.valueOf(digit.charAt(a)));
            for (int i = 1; i <= n; i++) {
                result = result * i;
                if (i == digitAsNum) {
                    sumOfFactorials += result;
                }
            }
        }

        if (sumOfFactorials == n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
