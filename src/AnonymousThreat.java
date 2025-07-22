import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arrays = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("3:1")) {
            List<String> commands = Arrays.stream(input.split("\\s+"))
                    .collect(Collectors.toList());
            String command = commands.get(0);

            switch (command) {
                case "merge":
                    int startIndex = Integer.parseInt(commands.get(1));
                    int endIndex = Integer.parseInt(commands.get(2));
                    mergeValues(arrays, startIndex, endIndex);
                    break;
                case "divide":
                    int index = Integer.parseInt(commands.get(1));
                    int partitions = Integer.parseInt(commands.get(2));
                    divideValues(arrays, index, partitions);
                    break;
            }

            input = sc.nextLine();
        }
        for (String a : arrays) {
            System.out.print(a + " ");
        }
    }

    public static void mergeValues(List<String> array, int start, int end) {
        start = returnValidInex(array, start);
        end = returnValidInex(array, end);

        for (int i = end; i >start; i--) {
            array.set(i-1, array.get(i-1).concat(array.get(i)));
            array.remove(i);
        }
    }

   /* public static void divideValues(List<String> array, int index, int partitions) {
       // TODO: fix the divide part (doesn't work')
        String word = array.get(index);
        int indexToAddOn = returnValidInex(array, index);
        String wordToAdd = "";
        array.remove(index);
        for (int i = 1; i <= word.length()-1; i++) {
            wordToAdd=wordToAdd.concat(String.valueOf(word.charAt(i)));
            if(word.length()/partitions==i || i==word.length()-1){
                array.add(indexToAddOn,wordToAdd);
                wordToAdd="";
                indexToAddOn++;

            }
        }
    }*/
   public static void divideValues(List<String> array, int index, int partitions) {
       String word = array.remove(index);
       int partLength = word.length() / partitions;
       int remainder = word.length() % partitions;
       List<String> parts = new ArrayList<>();

       int start = 0;
       for (int i = 0; i < partitions; i++) {
           int end = start + partLength + (i == partitions - 1 ? remainder : 0);
           parts.add(word.substring(start, end));
           start = end;
       }
       array.addAll(index, parts);
   }

    public static int returnValidInex(List<String> array, int index) {
        if (index < 0) {
            return 0;
        } else if (index >= array.size()) {
            return array.size() - 1;
        }
        return index;
    }
}
