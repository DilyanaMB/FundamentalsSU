import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);

        if (c >= 'A' && c <= 'Z') {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
