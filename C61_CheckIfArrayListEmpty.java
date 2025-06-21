// 54. Write a Java program to test whether an ArrayList is empty or not.

import java.util.ArrayList;

public class C61_CheckIfArrayListEmpty {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();

        // Check if list is empty
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
