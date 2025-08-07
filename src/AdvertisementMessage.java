import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        while (count > 0) {
            count--;
            MessageProperty msg = new MessageProperty();
            System.out.println(msg.buildMsg());
        }
    }
}
