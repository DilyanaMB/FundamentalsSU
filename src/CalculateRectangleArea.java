import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());

        System.out.println(calculateArea(length, width));
    }

    public static int calculateArea(int length, int width) {
        return length * width;
    }
}
