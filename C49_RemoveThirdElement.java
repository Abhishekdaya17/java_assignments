import java.util.ArrayList;

public class C49_RemoveThirdElement {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original list: " + colors);

        if (colors.size() >= 3) {
            colors.remove(2);  // Remove element at index 2 (third element)
            System.out.println("After removing third element: " + colors);
        } else {
            System.out.println("List has less than 3 elements, cannot remove third element.");
        }
    }
}
