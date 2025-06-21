// 76. Write a Java program to retain common elements from two sets.

import java.util.HashSet;

public class C83_CommonElements {
    public static void main(String[] args) {
        Name.info();

        HashSet<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        HashSet<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");

        set1.retainAll(set2);
        System.out.println("Common elements: " + set1);
    }
}
