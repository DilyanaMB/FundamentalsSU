import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kilometer = Integer.parseInt(sc.nextLine());
        double meters = kilometer / 1000.0;
        System.out.printf("%.2f", meters);
    }
}
