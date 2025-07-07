import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printTopNumber(n);
    }

    public static void printTopNumber(int n) {
        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            boolean isHavingOddDigit = false;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 != 0) {
                    isHavingOddDigit = true;
                }
                sumOfDigits += digit;
                temp /= 10;
            }
            if (sumOfDigits % 8 == 0 && isHavingOddDigit) {
                System.out.println(i);
            }
        }
    }
}