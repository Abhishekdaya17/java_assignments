// 82. Write a Java program to test whether a specified key exists in the map.

import java.util.HashMap;
/*  */
public class C89_KeyExistsInMap {
    public static void main(String[] args) {
        Name.info();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Math", 90);
        map.put("Science", 85);
        map.put("English", 95);

        String keyToCheck = "Science";

        if (map.containsKey(keyToCheck)) {
            System.out.println("Key \"" + keyToCheck + "\" exists with value: " + map.get(keyToCheck));
        } else {
            System.out.println("Key \"" + keyToCheck + "\" does not exist.");
        }
    }
}
