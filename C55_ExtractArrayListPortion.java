// 48. Write a Java program to extract a portion of an ArrayList.

import java.util.ArrayList;
import java.util.List;

public class C55_ExtractArrayListPortion {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original List: " + colors);

        // Extracting a portion (from index 1 to 4, exclusive of 4)
        List<String> subList = colors.subList(1, 4);

        System.out.println("Extracted Portion (index 1 to 3): " + subList);
    }
}
