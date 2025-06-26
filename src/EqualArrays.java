import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers1 = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[] numbers2 = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        boolean arraysAreEqual;
        int sum = 0;
        int indexOfDifference = -1;

        if (numbers1.length != numbers2.length) {
            arraysAreEqual = false;
        } else {
            arraysAreEqual = true;
            for (int i = 0; i < numbers1.length; i++) {
                sum += numbers1[i];
                if (numbers1[i] != numbers2[i]) {
                    arraysAreEqual = false;
                    indexOfDifference = i;
                    break;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", indexOfDifference);
        }
    }
}
