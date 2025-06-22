import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double lightsaberPrice = Double.parseDouble(sc.nextLine());
        double robsPrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());

        int lightsabersCount = (int) Math.ceil(students * 0.1) + students;
        int beltCountWithDiscount = (int) (students - Math.floor((1.0 * students) / 6));

        double totalPrice = (lightsabersCount * lightsaberPrice) + robsPrice * students + beltCountWithDiscount * beltPrice;

        if (totalPrice <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }

    }
}
