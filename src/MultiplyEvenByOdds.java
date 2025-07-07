import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(sc.nextLine()));

        System.out.println(getMultiplyEvenByOdds(number));
    }

    public static int getMultiplyEvenByOdds(int number){
        int sumEven = getSumOfEvenDigits(number);
        int sumOdd = getSumOfOddDigits(number);
        return sumOdd*sumEven;
    }

    public static int getSumOfEvenDigits(int number) {
       int sum =0;
       while(number>0){
           int digit = number % 10;
           if (digit%2==0) {
               sum += digit;
           }
           number/=10;
       }
       return sum;
    }

    public static int getSumOfOddDigits(int number) {
        int sum =0;
        while(number>0){
            int digit = number % 10;
            if (digit%2!=0) {
                sum += digit;
            }
            number/=10;
        }
        return sum;
    }
}
