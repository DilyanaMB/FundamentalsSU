import java.text.DecimalFormat;
import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(getFactorialDivision(a, b)));
    }

    public static double getFactorialDivision(int a, int b) {
        return factorial(a) / factorial(b);
    }

    public static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
