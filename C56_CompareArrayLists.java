// 49. Write a Java program to compare two ArrayLists.

import java.util.ArrayList;

public class C56_CompareArrayLists {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Blue");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Green");
        list3.add("Red");
        list3.add("Blue");

        // Compare list1 and list2
        boolean isEqual12 = list1.equals(list2);
        System.out.println("list1 equals list2: " + isEqual12);

        // Compare list1 and list3
        boolean isEqual13 = list1.equals(list3);
        System.out.println("list1 equals list3: " + isEqual13);
    }
}
