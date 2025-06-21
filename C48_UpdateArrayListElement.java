import java.util.ArrayList;
import java.util.Scanner;

public class C48_UpdateArrayListElement {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        Scanner sc = new Scanner(System.in);

        System.out.println("Original list: " + colors);

        System.out.print("Enter the index of element to update: ");
        int index = sc.nextInt();
        sc.nextLine();  // consume newline

        if (index >= 0 && index < colors.size()) {
            System.out.print("Enter new color to update: ");
            String newColor = sc.nextLine();

            colors.set(index, newColor);  // Update element

            System.out.println("Updated list: " + colors);
        } else {
            System.out.println("Invalid index! Please enter index between 0 and " + (colors.size() - 1));
        }

        sc.close();
    }
}
