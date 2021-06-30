// A hash map is used whenever data is stored in key value pairs
// Values added \, retrieved and deleted using keys

import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("Crystal", "Mom");
        hashmap.put("Aaron", "Honey");
        hashmap.put("Lily", "toothless");

        System.out.println("Crystal's nickname is " + hashmap.get("Crystal"));
        System.out.println("Crystal's nickname is " + hashmap.get("Aaron"));
        System.out.println("Crystal's nickname is " + hashmap.get("Lily"));
    }
}
