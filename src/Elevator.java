import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());

//first solution

       int coursesFull = (int)Math.ceil((double) people/capacity);

//second solution

//        int coursesFull = people / capacity;
//        int peopleLeft = people % capacity;
//        if (peopleLeft >= 1) {
//            coursesFull += 1;
//        }
        System.out.println(coursesFull);
    }
}
