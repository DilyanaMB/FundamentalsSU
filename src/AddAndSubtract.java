import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int sum = sum(a, b);
        int c = Integer.parseInt(sc.nextLine());
        System.out.println(subtract(sum, c));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
