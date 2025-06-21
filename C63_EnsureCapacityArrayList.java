// 56. Write a Java program to increase an ArrayList size.

import java.util.ArrayList;

public class C63_EnsureCapacityArrayList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");

        // Increasing the capacity to store at least 10 elements
        colors.ensureCapacity(10);

        System.out.println("ArrayList capacity increased using ensureCapacity().");
        System.out.println("Current size: " + colors.size());
    }
}
