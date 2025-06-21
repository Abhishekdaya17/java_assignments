// 51. Write a Java program to join two ArrayLists.

import java.util.ArrayList;

public class C58_JoinArrayLists {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        // First ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        // Second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Orange");
        list2.add("Purple");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Joining list2 into list1
        list1.addAll(list2);

        System.out.println("Joined List: " + list1);
    }
}
