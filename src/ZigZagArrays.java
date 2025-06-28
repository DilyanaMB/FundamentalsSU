import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] tempArr = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (i % 2 == 0) {
                arr1[i] = tempArr[0];
                arr2[i] = tempArr[1];
            } else {
                arr2[i] = tempArr[0];
                arr1[i] = tempArr[1];
            }
        }

        for (int number : arr1) {
            System.out.print(number + " ");
        }

        System.out.println();

        for (int number : arr2) {
            System.out.print(number + " ");
        }
    }
}
