import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int topIntegersCount = 0;
        boolean isTopInteger = false;

        for (int i =0; i <numbers.length; i++) {
            for (int restOfNum = i+1; restOfNum <numbers.length ; restOfNum++) {
                if(numbers[i]<=numbers[restOfNum]){
                   isTopInteger =false;
                   break;
                } else {
                    isTopInteger=true;
                }
            }
            if(isTopInteger||i==numbers.length-1){
                topIntegersCount++;
            }
        }

        int[] topIntegers = new int[topIntegersCount];
        topIntegersCount=0;
        for (int i =0; i <numbers.length; i++) {
            for (int restOfNum = i+1; restOfNum <numbers.length ; restOfNum++) {
                if(numbers[i]<=numbers[restOfNum]){
                    isTopInteger =false;
                    break;
                } else {
                    isTopInteger=true;
                }
            }
            if(isTopInteger|| i==numbers.length-1){
                topIntegers[topIntegersCount] = numbers[i];
                topIntegersCount++;
            }
        }

        for(int n: topIntegers) {
            System.out.print(n + " ");
        }
    }
}