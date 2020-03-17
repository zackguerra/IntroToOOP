/**package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    //HashMap<Key, Value>: A set of key-value pairs
    public static void main(String[] args) {
        Map<String, String> acronyms = new HashMap<>();
        acronyms.put("Lol", "Laughing out loud");
        acronyms.put("Yolo", "You only live once");
        acronyms.put("Smh", "Shake my head");
        acronyms.put("Lmk", "Let me know");
        acronyms.put("Brb", "Be right back");
        acronyms.put("Lmao", "Laughin my ass off");
        acronyms.put("Stfu", "Shut the fxxx up");
        acronyms.put("Afk", "Away from keyboard");
        acronyms.put("Rofl", "Rolling on the floor laughing");
        acronyms.put("Idk", "I don't know");

        System.out.println(acronyms.get("Stfu"));
        System.out.println(acronyms.containsKey("Idk"));
        System.out.println(acronyms.containsKey("fyi"));
        System.out.println(acronyms.size());

        // loop through the map key-value pairs
        // map is not sorted (no order)

         // Iterate by keys - no order preserved
        for(String key: acronyms.keySet()) {
            System.out.println(key);
            System.out.println(acronyms.get(key));  // value
        }
        // Iterate by values - no order preserved
        for(String value: acronyms.values()) System.out.println(value);



        public static int hash(String acronyms) {
            int h = 0;
            for (char ch : acronyms.toCharArray()){
                h += ch;
            }
            return;
        }







}
}*/