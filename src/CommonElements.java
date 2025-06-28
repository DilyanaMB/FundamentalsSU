import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstArray = sc.nextLine().split(" ");
        String[] secondArray = sc.nextLine().split(" ");
        String commonElements = "";


        for (String element : firstArray) {
            for (int i = 0; i < secondArray.length; i++) {
                if(secondArray[i].equals(element)) {
                   commonElements = commonElements + element + " ";
                }
            }
        }
        System.out.println(commonElements);
    }
}
