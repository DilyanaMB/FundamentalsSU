import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal input = new BigDecimal(sc.nextLine());
            sum = sum.add(input);
        }
        System.out.println(sum);
    }
}
