// 45. Write a Java program to copy one ArrayList into another.

import java.util.ArrayList;
import java.util.Collections;

public class C52_CopyArrayList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        // Source ArrayList
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Red");
        sourceList.add("Green");
        sourceList.add("Blue");

        // Destination ArrayList (should be at least the same size as sourceList)
        ArrayList<String> destinationList = new ArrayList<>();
        destinationList.add("White");
        destinationList.add("Black");
        destinationList.add("Gray");

        System.out.println("Source List: " + sourceList);
        System.out.println("Destination List (before copy): " + destinationList);

        // Copy sourceList into destinationList
        Collections.copy(destinationList, sourceList);

        System.out.println("Destination List (after copy): " + destinationList);
    }
}
