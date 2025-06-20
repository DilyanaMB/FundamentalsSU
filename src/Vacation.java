import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();
        String day = sc.nextLine();
        double price = 0;

        switch (type) {
            case "Students":
                price = switch (day) {
                    case "Friday" -> price + (8.45 * people);
                    case "Saturday" -> price + (9.8 * people);
                    case "Sunday" -> price + (10.46 * people);
                    default -> price;
                };
                break;
            case "Business":
                if (people >= 100) {
                    people -= 10;
                }
                price = switch (day) {
                    case "Friday" -> price + (10.9 * people);
                    case "Saturday" -> price + (15.6 * people);
                    case "Sunday" -> price + (16.0 * people);
                    default -> price;
                };
                break;
            case "Regular":
                price = switch (day) {
                    case "Friday" -> price + (15.0 * people);
                    case "Saturday" -> price + (20.0 * people);
                    case "Sunday" -> price + (22.5 * people);
                    default -> price;
                };
                break;
        }
        if (people >= 30 && type.equals("Students")) {
            price -= price * 0.15;
        } else if (type.equals("Regular") && ((people >= 10) && (people <= 20))) {
            price -= price * 0.05;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
