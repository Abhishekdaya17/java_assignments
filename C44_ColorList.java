import java.util.ArrayList;

public class C44_ColorList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        // Create an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print the ArrayList
        System.out.println("Colors in the list: " + colors);
    }
}
