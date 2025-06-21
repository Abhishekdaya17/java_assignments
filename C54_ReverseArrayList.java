// 47. Write a Java program to reverse elements in an ArrayList.

import java.util.ArrayList;
import java.util.Collections;

public class C54_ReverseArrayList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original List: " + colors);

        // Reversing the list
        Collections.reverse(colors);

        System.out.println("Reversed List: " + colors);
    }
}
