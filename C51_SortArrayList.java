// 44. Write a Java program to sort a given ArrayList.

import java.util.ArrayList;
import java.util.Collections;

public class C51_SortArrayList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original list: " + colors);

        // Sorting the ArrayList
        Collections.sort(colors);

        System.out.println("Sorted list: " + colors);
    }
}
