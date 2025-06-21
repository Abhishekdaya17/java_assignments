// 55. Write a Java program for trimming the capacity of an ArrayList.

import java.util.ArrayList;

public class C62_TrimArrayList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>(20); // initial capacity 20
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Size before trimming: " + colors.size());

        // Trimming capacity to the current size
        colors.trimToSize();

        System.out.println("Size after trimming: " + colors.size());
    }
}
