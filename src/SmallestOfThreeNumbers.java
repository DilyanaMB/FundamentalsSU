import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());

        printSamllerstOfThree(num1, num2, num3);
    }
    public static void printSamllerstOfThree(int num1, int num2, int num3) {
        int smallest = Math.min(num1, Math.min(num2, num3));
        System.out.println(smallest);
    }
}
