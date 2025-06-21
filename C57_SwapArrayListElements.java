// 50. Write a Java program that swaps two elements in an ArrayList.

import java.util.ArrayList;
import java.util.Collections;

public class C57_SwapArrayListElements {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original List: " + colors);

        // Swapping elements at index 1 and 3
        Collections.swap(colors, 1, 3);

        System.out.println("List after swapping index 1 and 3: " + colors);
    }
}
