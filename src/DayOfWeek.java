import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(sc.nextLine());
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (day > 0 && day <= 7) {
            System.out.printf("%s",days[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
