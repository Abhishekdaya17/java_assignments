// 79. Write a Java program to remove all key-value pairs from a map.

import java.util.HashMap;
import java.util.Map;

public class C86_ClearMap {
    public static void main(String[] args) {
        Name.info();

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);

        System.out.println("Before clearing: " + map);
        map.clear();
        System.out.println("After clearing: " + map);
    }
}
