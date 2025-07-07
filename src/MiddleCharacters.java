import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getMiddleCharacters(str));
    }

    public static String getMiddleCharacters(String str) {
        String middleCharacters = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.length() % 2 == 0) {
                if (i == str.length() / 2 - 1 || i == str.length() / 2) {
                    middleCharacters = middleCharacters + str.charAt(i);
                }
            } else if (i == (str.length() - 1) / 2) {
                middleCharacters = middleCharacters + str.charAt(i);

            }
        }
        return middleCharacters;
    }
}