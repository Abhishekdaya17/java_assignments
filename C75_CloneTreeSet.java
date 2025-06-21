// 68. Write a Java program to clone a TreeSet into another TreeSet.

import java.util.TreeSet;

public class C75_CloneTreeSet {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        TreeSet<String> original = new TreeSet<>();
        original.add("One");
        original.add("Two");
        original.add("Three");

        TreeSet<String> cloned = (TreeSet<String>) original.clone();

        System.out.println("Original TreeSet: " + original);
        System.out.println("Cloned TreeSet: " + cloned);
    }
}
