import java.util.ArrayList;

public class C46_InsertAtFirstPosition {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();

        // Add some initial colors
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Before insertion: " + colors);

        // Insert an element at the first position (index 0)
        colors.add(0, "Red");

        System.out.println("After insertion at first position: " + colors);
    }
}
