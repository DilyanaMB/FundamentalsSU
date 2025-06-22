import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());
        int keyboardTrashedCounter = 0;
        double price = 0;

        for (int i = 1; i <= lostGames; i++) {
            boolean isHeadsetTrashed = false;
            boolean isMouseTrashed = false;

            if (i % 2 == 0) {
                isHeadsetTrashed = true;
                price += headsetPrice;
            }

            if (i % 3 == 0) {
                isMouseTrashed = true;
                price += mousePrice;
            }

            if (isMouseTrashed && isHeadsetTrashed) {
                price += keyboardPrice;
                keyboardTrashedCounter++;
            }

            if (keyboardTrashedCounter != 0 && keyboardTrashedCounter % 2 == 0) {
                keyboardTrashedCounter = 0;
                price += displayPrice;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", price);
    }
}
