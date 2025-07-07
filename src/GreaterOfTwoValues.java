import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        String greaterValue = "";

        switch (type) {
            case "int":
                int a = Integer.parseInt(sc.nextLine());
                int b = Integer.parseInt(sc.nextLine());
                greaterValue = getMaxInt(a, b);
                break;
            case "string":
                String str1 = sc.nextLine();
                String str2 = sc.nextLine();
                greaterValue = getMaxString(str1, str2);
                break;
            case "char":
                char c1 = sc.nextLine().charAt(0);
                char c2 = sc.nextLine().charAt(0);
                greaterValue = getMaxChar(c1, c2);
                break;
        }
        System.out.println(greaterValue);
    }

    public static String getMaxInt(int a, int b) {
        if (a > b) {
            return a + "";
        }
        return b + "";
    }

    public static String getMaxString(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }

    public static String getMaxChar(char a, char b) {
        if (a > b) {
            return a + "";
        }
        return b + "";
    }
}
