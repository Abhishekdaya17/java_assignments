// 58. Write a Java program to print all the elements of an ArrayList using the elements' position.

import java.util.ArrayList;

public class C65_PrintElementsByPosition {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Elements in the ArrayList:");

        // Using for loop with index to print elements by position
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at position " + i + ": " + colors.get(i));
        }
    }
}
