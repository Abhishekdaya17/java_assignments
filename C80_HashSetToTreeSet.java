// 73. Write a Java program to convert a HashSet into a TreeSet.

import java.util.HashSet;
import java.util.TreeSet;

public class C80_HashSetToTreeSet {
    public static void main(String[] args) {
        Name.info();

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Orange");
        hashSet.add("Mango");
        hashSet.add("Apple");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet elements: " + treeSet);
    }
}
