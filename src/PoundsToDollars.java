import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pounds = Double.parseDouble(sc.nextLine());
        double dollars = 1.36 * pounds;
        System.out.printf("%.3f", dollars);
    }
}
