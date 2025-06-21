// 70. Write a Java program to compare two TreeSets.

import java.util.TreeSet;

public class C77_CompareTreeSets {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        TreeSet<String> set1 = new TreeSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");

        for (String element : set1) {
            if (set2.contains(element)) {
                System.out.println(element + " is present in both sets.");
            } else {
                System.out.println(element + " is not present in both sets.");
            }
        }
    }
}
