// 78. Write a Java program to copy all mappings from one map to another.

import java.util.HashMap;
import java.util.Map;

public class C85_CopyMap {
    public static void main(String[] args) {
        Name.info();  // Method to print name and enrollment number

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");

        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);  // Copy all mappings

        System.out.println("Original Map: " + map1);
        System.out.println("Copied Map: " + map2);
    }
}
