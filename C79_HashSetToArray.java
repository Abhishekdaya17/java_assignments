// 72. Write a Java program to convert a HashSet into an array.

import java.util.HashSet;

public class C79_HashSetToArray {
    public static void main(String[] args) {
        Name.info();

        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        String[] array = new String[set.size()];
        set.toArray(array);

        System.out.println("Array elements:");
        for (String color : array) {
            System.out.println(color);
        }
    }
}
