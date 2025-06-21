import java.util.ArrayList;

public class C60_EmptyArrayList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Before emptying: " + colors);

        // Emptying the list
        colors.clear();

        System.out.println("After emptying: " + colors);
    }
}
