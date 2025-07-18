import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = 255;
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(sc.nextLine());
            if (sum + liters > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                sum += liters;
            }
        }
        System.out.println(sum);
    }
}
