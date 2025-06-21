// 59. Write a Java program to append a specified element to the end of a linked list.

import java.util.LinkedList;

public class C66_AppendToLinkedList {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original LinkedList: " + colors);

        // Append element at end
        colors.addLast("Yellow");

        System.out.println("After appending: " + colors);
    }
}
