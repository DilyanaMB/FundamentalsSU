import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printTriangle(n);
    }

    public static void printTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        int rows = 1;
        for (int i = n; i >= 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print( rows + " ");
                rows++;
            }
            rows=1;
            System.out.println();
        }
    }
}
