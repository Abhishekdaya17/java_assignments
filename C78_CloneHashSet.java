// 71. Write a Java program to clone one HashSet into another.

import java.util.HashSet;

public class C78_CloneHashSet {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        HashSet<String> original = new HashSet<>();
        original.add("Apple");
        original.add("Banana");
        original.add("Cherry");

        HashSet<String> clone = (HashSet<String>) original.clone();

        System.out.println("Original HashSet: " + original);
        System.out.println("Cloned HashSet: " + clone);
    }
}
