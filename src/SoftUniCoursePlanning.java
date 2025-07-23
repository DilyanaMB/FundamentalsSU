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
            List<String> commands = Arrays.stream(input.split(":"))
                    .collect(Collectors.toList());
            String command = commands.get(0);
            switch (command) {
                case "Add":
                    addLesson(schedules, commands.get(1));
                    break;
                case "Insert":
                    insertLesson(schedules, commands.get(1), Integer.parseInt(commands.get(2)));
                    break;
                case "Remove":
                    removeLesson(schedules, commands.get(1));
                    break;
                case "Swap":
                    swapLesson(schedules, commands.get(1), commands.get(2));
                    break;
                case "Exercise":
                    exerciseLesson(schedules, commands.get(1));
                    break;
            }
            input = sc.nextLine();
        }

        for (int i = 0; i < schedules.size(); i++) {
            System.out.println((i + 1) + "." + schedules.get(i));
        }
    }

    public static void addLesson(List<String> schedules, String lesson) {
        if (!schedules.contains(lesson)) {
            schedules.add(lesson);
        }
    }

    public static void insertLesson(List<String> schedules, String lesson, int index) {
        if (!schedules.contains(lesson)) {
            schedules.add(index, lesson);
        }
    }

    public static void removeLesson(List<String> schedules, String lesson) {
        schedules.remove(lesson);
        schedules.remove(lesson + "-Exercise");
    }

    public static void swapLesson(List<String> schedules, String lesson1, String lesson2) {
        int idx1 = schedules.indexOf(lesson1);
        int idx2 = schedules.indexOf(lesson2);

        if (idx1 != -1 && idx2 != -1) {
            // Swap lessons
            schedules.set(idx1, lesson2);
            schedules.set(idx2, lesson1);

            // Swap exercises if present
            String ex1 = lesson1 + "-Exercise";
            String ex2 = lesson2 + "-Exercise";

            boolean hasEx1 = schedules.contains(ex1);
            boolean hasEx2 = schedules.contains(ex2);

            if (hasEx1) {
                schedules.remove(ex1);
                int newIdx = schedules.indexOf(lesson1);
                schedules.add(newIdx + 1, ex1);
            }
            if (hasEx2) {
                schedules.remove(ex2);
                int newIdx = schedules.indexOf(lesson2);
                schedules.add(newIdx + 1, ex2);
            }
        }
    }

    public static void exerciseLesson(List<String> schedules, String lesson) {
        String exercise = lesson + "-Exercise";
        int idx = schedules.indexOf(lesson);
        if (idx != -1) {
            if (!schedules.contains(exercise)) {
                schedules.add(idx + 1, exercise);
            }
        } else {
            schedules.add(lesson);
            schedules.add(exercise);
        }
    }
}