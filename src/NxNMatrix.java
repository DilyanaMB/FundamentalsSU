import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        generateMatrix(n);
    }

    public static void generateMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
