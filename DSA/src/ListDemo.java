import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) throws Exception {

        // Arraylist
        // List list = new ArrayList();

        // // Get Size
        // System.out.println(list.size());

        // // Add elements 
        // list.add(20);
        // list.add(30);
        // list.add(40);

        // // Print list
        // System.out.println(list);

        // // Insert at  given pos
        // list.add(1,25);
        // list.add("Nitish");
        // System.out.println(list);

        LinkedList list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.remove());

        System.out.println(list);

    }

}
