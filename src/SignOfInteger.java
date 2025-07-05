import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        printSignOfInteger(num);
    }

    public static void printSignOfInteger(int num) {
        if (num == 0) {
            System.out.printf("The number %d is zero.", num);
        } else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.printf("The number %d is negative.", num);
        }
    }
}
