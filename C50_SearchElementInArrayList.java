import java.util.ArrayList;
import java.util.Scanner;

public class C50_SearchElementInArrayList {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color to search: ");
        String searchColor = sc.nextLine();

        if (colors.contains(searchColor)) {
            System.out.println(searchColor + " is found in the list.");
        } else {
            System.out.println(searchColor + " is NOT found in the list.");
        }

        sc.close();
    }
}
