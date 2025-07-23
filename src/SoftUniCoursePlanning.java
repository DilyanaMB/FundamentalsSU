import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> schedules = Arrays.stream(sc.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("course start")) {
            List<String> commands = Arrays.stream(sc.nextLine().split(":"))
                    .collect(Collectors.toList());
            String command = commands.get(0);
            switch (command) {
                case "Add":
                    addLesson(schedules, commands.get(1));
                    break;
                case "Insert":
                    insertLesson();
                    break;
                case "Remove":
                    removeLesson();
                    break;
                case "Swap":
                    swapLesson();
                    break;
                case "Exercise":
                    exerciseLesson();
                    break;
            }
            input = sc.nextLine();
        }

    }

    public static void addLesson(List<String> schedules, String lesson) {
        if (!schedules.contains(lesson)) {
            schedules.add(lesson);
        }
    }

    public static void insertLesson(List<String> schedules, String lesson,) {

    }

    public static void removeLesson() {

    }

    public static void swapLesson() {

    }

    public static void exerciseLesson() {

    }
}
