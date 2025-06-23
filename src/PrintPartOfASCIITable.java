import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int indexFirst = Integer.parseInt(sc.nextLine());
        int indexLast = Integer.parseInt(sc.nextLine());

        for (int i = indexFirst; i <= indexLast; i++) {

            //first solution
            //char c = (char) i;

            //second solution
            char c = Character.toChars(i)[0];
            System.out.print(c + " ");
        }
    }
}
