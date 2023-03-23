import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        // Hashmap
        HashMap<String,Integer> hm = new HashMap<>();

        // put(key,value)
        hm.put("Nitish", 100);
        hm.put("Ritesh", 100);

        // Print Hashmap
        System.out.println(hm);

        // Print Keys
        System.out.println(hm.keySet());

        // Valueset
        System.out.println(hm.values());

        
        hm.put("N", -2);
        hm.put("R", -2);
        System.out.println(hm.get("N") < 0);
        System.out.println(hm.entrySet());
    }
}
