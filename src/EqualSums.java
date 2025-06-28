import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int lefSum = 0;
        int rightSum = 0;
        boolean isSumsEqual = false;

        //TODO: To fix that
//        if (numbers.length > 2) {
//            for (int i = 0; i < numbers.length - 1; i++) {
//                for (int j = i + 1; j < numbers.length; j++) {
//                    rightSum += numbers[j];
//                }
//                if (i != 0) {
//                    lefSum += numbers[i - 1];
//                }
//                if (lefSum == rightSum) {
//                    isSumsEqual = true;
//                    System.out.println(i);
//                    break;
//                }
//                rightSum = 0;
//            }
//            if (!isSumsEqual) {
//                System.out.println("no");
//            }
//        } else if (numbers.length == 2) {
//            if (numbers[0] == 0 || numbers[1] == 0) {
//                System.out.println(0);
//            } else {
//                System.out.println("no");
//            }
//        } else if (numbers.length == 1) {
//            System.out.println(0);
//        }

//      second solution


        int sumRight = 0;
        for (int number : numbers) {
            sumRight += number;
        }

        int sumLeft = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumRight -= numbers[i];
            if(sumLeft == sumRight) {
                System.out.println(i);
                return;
            }
            sumLeft += numbers[i];
        }

        System.out.println("no");

        //TODO: To fix that
//        for (int i = 0; i < numbers.length; i++) {
//            if (i == 0) {
//                lefSum = 0;
//            } else {
//                lefSum += numbers[i - 1];
//            }
//            if(i== numbers.length - 1) {
//                rightSum = 0;
//            }
//            for (int j = 0; j < numbers.length - 1; j++) {
//                    rightSum += numbers[j + 1];
//
//                if (lefSum > rightSum) {
//                    break;
//                }
//                if (lefSum == rightSum) {
//                    isSumsEqual = true;
//                    System.out.println(i);
//                    break;
//                }
//            }
//            if (lefSum == rightSum) {
//                isSumsEqual = true;
//                System.out.println(i);
//                break;
//            }
//            rightSum = 0;
//        }
//        if (!isSumsEqual) {
//            System.out.println("no");
//        }
    }
}
