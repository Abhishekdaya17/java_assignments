// 64. Write a Java program to insert elements at the first and last positions of a linked list.

import java.util.LinkedList;

public class C71_InsertAtFirstLast {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("Audi");

        System.out.println("Original LinkedList: " + cars);

        // Insert at first and last positions
        cars.addFirst("Tesla");
        cars.addLast("Mercedes");

        System.out.println("After inserting at first and last: " + cars);
    }
}
