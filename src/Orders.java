import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ordersCount = Integer.parseInt(sc.nextLine());
        double totalPrice = 0;

        for (int i = 0; i < ordersCount; i++) {
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsulesCount = Integer.parseInt(sc.nextLine());
            double priceForCoffee = (days * capsulesCount) * pricePerCapsule;
            totalPrice += priceForCoffee;
            System.out.printf("The price for the coffee is: $%.2f\n", priceForCoffee);
        }

        System.out.printf("Total: $%.2f", totalPrice);
    }
}
