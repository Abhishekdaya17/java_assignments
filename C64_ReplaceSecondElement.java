// 57. Write a Java program to replace the second element of an ArrayList with the specified element.

import java.util.ArrayList;

public class C64_ReplaceSecondElement {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original List: " + colors);

        // Replacing second element (index 1)
        colors.set(1, "Yellow");

        System.out.println("List after replacement: " + colors);
    }
}
