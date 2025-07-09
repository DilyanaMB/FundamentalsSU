import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        List<String> products = new ArrayList<>(size);

        while(size>0){
            products.add(sc.nextLine());
            size--;
        }
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s\n", i+1, products.get(i) );
        }
    }
}
