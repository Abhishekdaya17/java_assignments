// 81. Write a Java program to create a shallow copy of a HashMap instance.

import java.util.HashMap;

public class C88_ShallowCopyMap {
    public static void main(String[] args) {
        Name.info();

        HashMap<Integer, String> original = new HashMap<>();
        original.put(1, "Java");
        original.put(2, "Python");

        HashMap<Integer, String> shallowCopy = (HashMap<Integer, String>) original.clone();

        System.out.println("Original Map: " + original);
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}
