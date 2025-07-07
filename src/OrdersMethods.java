import java.util.Scanner;

public class OrdersMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        double price = calculatePrice(product,quantity);
        System.out.printf("%.2f",  price);
    }

    public static double calculatePrice(String product, int quantity) {
        double price = 0.0;
        switch (product) {
            case "coffee":
                price = 1.50 * quantity;
                break;
            case "water":
                price = 1.00 * quantity;
                break;
            case "coke":
                price = 1.40 * quantity;
                break;
            case "snacks":
                price = 2.00 * quantity;
                break;
            default:
                System.out.println("Invalid product");
                return -1;
        }
        return price;
    }
}
