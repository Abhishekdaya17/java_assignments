// 65. Write a Java program to add all elements from one TreeSet to another TreeSet.

import java.util.TreeSet;

public class C72_AddTreeSets {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");

        TreeSet<String> set2 = new TreeSet<>();
        set2.addAll(set1);

        System.out.println("First TreeSet: " + set1);
        System.out.println("Second TreeSet after adding: " + set2);
    }
}
