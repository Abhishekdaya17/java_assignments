// 52. Write a Java program to clone an ArrayList to another ArrayList.

import java.util.ArrayList;

public class C59_CloneArrayList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Blue");

        // Cloning the ArrayList
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);
    }
}
