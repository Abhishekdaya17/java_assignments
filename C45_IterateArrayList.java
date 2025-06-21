import java.util.ArrayList;
import java.util.Iterator;

public class C45_IterateArrayList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        // Create an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Iterating using for-each loop:");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nIterating using for loop with index:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
