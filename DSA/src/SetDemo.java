import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // Declare Set : It store unordered collection of unique values
        Set  hs = new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(35);
        hs.add(40);
        hs.add(20);
        hs.add(35);
        hs.add(30);
        hs.add(45);
        hs.add(1);
        hs.add("Nitish");


        // Set Size
        System.out.println(hs.size());
        // Print set
        System.out.println(hs);

        // Search in Set
        System.out.println(hs.contains("Nitish"));


        // LinkedHashSet : Ordered Set
        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(120);
        lhs.add(130);

        System.out.println(lhs);
    }
}
