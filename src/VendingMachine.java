import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            double payment = Double.parseDouble(input);
            switch (input) {
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    sum += payment;
                    break;
                default:
                    System.out.printf("Cannot accept %.2f", payment);
                    break;
            }

            input = sc.nextLine();
        }

        input = sc.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (sum < 2) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 2;
                    System.out.println("Purchased Nuts");
                    break;
                case "Water":
                    if (sum < 0.7) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 0.7;
                    System.out.println("Purchased Water");
                    break;
                case "Crisps":
                    if (sum < 1.5) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 1.5;
                    System.out.println("Purchased Crisps");
                    break;
                case "Soda":
                    if (sum < 0.8) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 0.8;
                    System.out.println("Purchased Soda");
                    break;
                case "Coke":
                    if (sum < 1) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 1;
                    System.out.println("Purchased Coke");
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = sc.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
