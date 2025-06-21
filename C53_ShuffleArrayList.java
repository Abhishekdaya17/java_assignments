// 46. Write a Java program to shuffle elements in an ArrayList.

import java.util.ArrayList;
import java.util.Collections;

public class C53_ShuffleArrayList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original List: " + colors);

        // Shuffling the list
        Collections.shuffle(colors);

        System.out.println("Shuffled List: " + colors);
    }
}
