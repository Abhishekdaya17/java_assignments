// 75. Write a Java program to compare two HashSets.

import java.util.HashSet;

public class C82_CompareHashSets {
    public static void main(String[] args) {
        Name.info();

        HashSet<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Python");
        set2.add("C++");
        set2.add("Java");

        if (set1.equals(set2)) {
            System.out.println("HashSets are equal.");
        } else {
            System.out.println("HashSets are not equal.");
        }
    }
}
