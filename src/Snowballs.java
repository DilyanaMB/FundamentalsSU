import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int snowballs = Integer.parseInt(sc.nextLine());
        double highestValue = 0;
        int highestTime = 0;
        int highestQuality = 0;
        int highestSnow = 0;

        for (int i = 0; i < snowballs; i++) {
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (highestValue < snowballValue) {
                highestValue = snowballValue;
                highestQuality = snowballQuality;
                highestTime = snowballTime;
                highestSnow = snowballSnow;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", highestSnow, highestTime, highestValue, highestQuality);
    }
}
