import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kegs = Integer.parseInt(sc.nextLine());
        String biggestKeg = "";
        double biggestVolume = 0;

        for (int i = 0; i < kegs; i++) {
            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());
            double volume = Math.PI * radius * radius * height;
            if (volume >= biggestVolume) {
                biggestVolume = volume;
                biggestKeg = model;
            }

        }
        System.out.println(biggestKeg);

    }
}
