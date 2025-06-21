import java.util.ArrayList;
import java.util.Scanner;

public class C47_RetrieveElement {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index to retrieve element: ");
        int index = sc.nextInt();

        if (index >= 0 && index < colors.size()) {
            String element = colors.get(index);
            System.out.println("Element at index " + index + " is: " + element);
        } else {
            System.out.println("Invalid index! Please enter index between 0 and " + (colors.size() - 1));
        }

        sc.close();
    }
}
