import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yield = Integer.parseInt(sc.nextLine());
        int miningCrewConsumptionPerDay = 26;
        int daysInOperation = 0;
        int totalYield = 0;
        int yieldPerDay = yield;

        while (yield >= 100) {
            daysInOperation++;
            yieldPerDay -= 26;
            totalYield += yieldPerDay;
            yield -=10;
            yieldPerDay=yield;

        }
        if (totalYield >= 26) {
            totalYield -= 26;
        }
        System.out.println(daysInOperation);
        System.out.println(totalYield);
    }
}
