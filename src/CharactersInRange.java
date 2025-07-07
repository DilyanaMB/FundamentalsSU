import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

      printAllCharsInRange(a, b);
    }

    public static void printAllCharsInRange(char a,char b){
        if(a <b) {
            for (int i = a + 1; i < b; i++) {
                System.out.print((char) i + " ");
            }
        }else {
            for (int i = b + 1; i < a; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
