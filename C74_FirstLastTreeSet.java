// 67. Write a Java program to retrieve the first and last elements from a TreeSet.

import java.util.TreeSet;

public class C74_FirstLastTreeSet {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        TreeSet<String> names = new TreeSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("First Element: " + names.first());
        System.out.println("Last Element: " + names.last());
    }
}
