import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();

        // Get Size
        System.out.println(list.size());

        // Add elements 
        list.add(20);
        list.add(30);
        list.add(40);

        // Print list
        System.out.println(list);

        // Insert at  given pos
        list.add(1,25);
        System.out.println(list);
    }

}
