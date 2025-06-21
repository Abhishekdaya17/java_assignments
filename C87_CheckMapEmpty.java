// 80. Write a Java program to check if a map is empty or contains key-value mappings.

import java.util.HashMap;
import java.util.Map;

public class C87_CheckMapEmpty {
    public static void main(String[] args) {
        Name.info();

        Map<String, String> map = new HashMap<>();

        if (map.isEmpty()) {
            System.out.println("Map is empty.");
        } else {
            System.out.println("Map contains: " + map);
        }

        map.put("Key1", "Value1");

        if (!map.isEmpty()) {
            System.out.println("Map now contains: " + map);
        }
    }
}
