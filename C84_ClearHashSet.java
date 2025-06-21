// 77. Write a Java program to remove all elements from a HashSet.

import java.util.HashSet;

public class C84_ClearHashSet {
    public static void main(String[] args) {
        Name.info();

        HashSet<String> colors = new HashSet<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Grey");

        System.out.println("Before clearing: " + colors);
        colors.clear();
        System.out.println("After clearing: " + colors);
    }
}

